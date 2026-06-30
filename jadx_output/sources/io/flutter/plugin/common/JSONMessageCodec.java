package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public final class JSONMessageCodec implements io.flutter.plugin.common.MessageCodec<java.lang.Object> {
    public static final io.flutter.plugin.common.JSONMessageCodec INSTANCE = new io.flutter.plugin.common.JSONMessageCodec();

    private JSONMessageCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.lang.Object decodeMessage(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            org.json.JSONTokener jSONTokener = new org.json.JSONTokener(io.flutter.plugin.common.StringCodec.INSTANCE.decodeMessage(byteBuffer));
            java.lang.Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new java.lang.IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.nio.ByteBuffer encodeMessage(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object wrap = io.flutter.plugin.common.JSONUtil.wrap(obj);
        return wrap instanceof java.lang.String ? io.flutter.plugin.common.StringCodec.INSTANCE.encodeMessage(org.json.JSONObject.quote((java.lang.String) wrap)) : io.flutter.plugin.common.StringCodec.INSTANCE.encodeMessage(wrap.toString());
    }
}
