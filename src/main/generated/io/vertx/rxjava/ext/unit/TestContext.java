/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.unit;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.rxjava.core.Vertx;

/**
 * The test context is used for performing test assertions and manage the completion of the test. This context
 * is provided by <i>vertx-unit</i> as argument of the test case.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 *
 * NOTE: This class has been automatically generated from the original non RX-ified interface using Vert.x codegen.
 */

public class TestContext {

  final io.vertx.ext.unit.TestContext delegate;

  public TestContext(io.vertx.ext.unit.TestContext delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Get some data from the context.
   *
   * @param key  the key of the data
   * @param <T>  the type of the data
   * @return the data
   */
  public <T> T get(String key) {
    T ret = (T) this.delegate.get(key);
    return ret;
  }

  /**
   * Put some data in the context.
   * <p>
   * This can be used to share data between different tests and before/after phases.
   *
   * @param key  the key of the data
   * @param value  the data
   * @return the previous object when it exists
   */
  public <T> T put(String key, Object value) {
    T ret = (T) this.delegate.put(key, value);
    return ret;
  }

  /**
   * Remove some data from the context.
   *
   * @param key  the key to remove
   * @return the removed object when it exists
   */
  public <T> T remove(String key) {
    T ret = (T) this.delegate.remove(key);
    return ret;
  }

  /**
   * Assert the specified {@code condition} is {@code true}. If the condition is {@code false}, an assertion error is thrown
   * otherwise the execution continue.
   *
   * @param condition the condition to assert
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertTrue(boolean condition) {
    this.delegate.assertTrue(condition);
    return this;
  }

  /**
   * Assert the specified {@code condition} is {@code true}. If the condition is {@code false}, an assertion error is thrown
   * otherwise the execution continue.
   *
   * @param condition the condition to assert
   * @param message the failure message
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertTrue(boolean condition, String message) {
    this.delegate.assertTrue(condition, message);
    return this;
  }

  /**
   * Assert the specified {@code condition} is {@code false}. If the condition is {@code true}, an assertion error is thrown
   * otherwise the execution continue.
   *
   * @param condition the condition to assert
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertFalse(boolean condition) {
    this.delegate.assertFalse(condition);
    return this;
  }

  /**
   * Assert the specified {@code condition} is {@code false}. If the condition is {@code true}, an assertion error is thrown
   * otherwise the execution continue.
   *
   * @param condition the condition to assert
   * @param message the failure message
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertFalse(boolean condition, String message) {
    this.delegate.assertFalse(condition, message);
    return this;
  }

  /**
   * Assert the {@code expected} argument is equals to the {@code actual} argument. If the arguments are not equals
   * an assertion error is thrown otherwise the execution continue.
   *
   * @param expected the object the actual object is supposedly equals to
   * @param actual the actual object to test
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertEquals(Object expected, Object actual) {
    this.delegate.assertEquals(expected, actual);
    return this;
  }

  /**
   * Assert the {@code expected} argument is equals to the {@code actual} argument. If the arguments are not equals
   * an assertion error is thrown otherwise the execution continue.
   *
   * @param expected the object the actual object is supposedly equals to
   * @param actual the actual object to test
   * @param message the failure message
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertEquals(Object expected, Object actual, String message) {
    this.delegate.assertEquals(expected, actual, message);
    return this;
  }

  /**
   * Asserts that the {@code expected} double argument is equals to the {@code actual} double argument
   * within a positive delta. If the arguments do not satisfy this, an assertion error is thrown otherwise
   * the execution continue.
   *
   * @param expected the object the actual object is supposedly equals to
   * @param actual the actual object to test
   * @param delta the maximum delta
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertInRange(double expected, double actual, double delta) {
    this.delegate.assertInRange(expected, actual, delta);
    return this;
  }

  /**
   * Asserts that the {@code expected} double argument is equals to the {@code actual} double argument
   * within a positive delta. If the arguments do not satisfy this, an assertion error is thrown otherwise
   * the execution continue.
   *
   * @param expected the object the actual object is supposedly equals to
   * @param actual the actual object to test
   * @param delta the maximum delta
   * @param message the failure message
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertInRange(double expected, double actual, double delta, String message) {
    this.delegate.assertInRange(expected, actual, delta, message);
    return this;
  }

  /**
   * Assert the {@code first} argument is not equals to the {@code second} argument. If the arguments are equals
   * an assertion error is thrown otherwise the execution continue.
   *
   * @param first the first object to test
   * @param second the second object to test
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertNotEquals(Object first, Object second) {
    this.delegate.assertNotEquals(first, second);
    return this;
  }

  /**
   * Assert the {@code first} argument is not equals to the {@code second} argument. If the arguments are equals
   * an assertion error is thrown otherwise the execution continue.
   *
   * @param first the first object to test
   * @param second the second object to test
   * @param message the failure message
   * @return a reference to this, so the API can be used fluently
   */
  public TestContext assertNotEquals(Object first, Object second, String message) {
    this.delegate.assertNotEquals(first, second, message);
    return this;
  }

  /**
   * Throw a failure.
   */
  public void fail() {
    this.delegate.fail();
  }

  /**
   * Throw a failure with the specified failure {@code message}.
   *
   * @param message the failure message
   */
  public void fail(String message) {
    this.delegate.fail(message);
  }

  /**
   * Returns the vertx instance associated with this test. The value may be null if no vertx instance was
   * specified when running the test suite.
   *
   * @return the vertx instance
   */
  public Vertx vertx() {
    if (cached_0 != null) {
      return cached_0;
    }
    Vertx ret= Vertx.newInstance(this.delegate.vertx());
    cached_0 = ret;
    return ret;
  }

  /**
   * Create and returns a new async object, the returned async controls the completion of the test. The test case
   * will complete when all the async objects have their {@link io.vertx.ext.unit.Async#complete()} method called
   * at least once.<p/>
   *
   * This method shall be used for creating asynchronous exit points for the executed test.
   *
   * @return the async instance
   */
  public Async async() {
    Async ret= Async.newInstance(this.delegate.async());
    return ret;
  }

  private Vertx cached_0;

  public static TestContext newInstance(io.vertx.ext.unit.TestContext arg) {
    return new TestContext(arg);
  }
}
