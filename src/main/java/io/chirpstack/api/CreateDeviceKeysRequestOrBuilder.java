// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

public interface CreateDeviceKeysRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.CreateDeviceKeysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return Whether the deviceKeys field is set.
   */
  boolean hasDeviceKeys();
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return The deviceKeys.
   */
  DeviceKeys getDeviceKeys();
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   */
  DeviceKeysOrBuilder getDeviceKeysOrBuilder();
}