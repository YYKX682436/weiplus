package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public final class JSONMethodCodec implements io.flutter.plugin.common.MethodCodec {
    public static final io.flutter.plugin.common.JSONMethodCodec INSTANCE = new io.flutter.plugin.common.JSONMethodCodec();

    private JSONMethodCodec() {
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.lang.Object decodeEnvelope(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.Object decodeMessage = io.flutter.plugin.common.JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (decodeMessage instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) decodeMessage;
                if (jSONArray.length() == 1) {
                    return unwrapNull(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    java.lang.Object obj = jSONArray.get(0);
                    java.lang.Object unwrapNull = unwrapNull(jSONArray.opt(1));
                    java.lang.Object unwrapNull2 = unwrapNull(jSONArray.opt(2));
                    if ((obj instanceof java.lang.String) && (unwrapNull == null || (unwrapNull instanceof java.lang.String))) {
                        throw new io.flutter.plugin.common.FlutterException((java.lang.String) obj, (java.lang.String) unwrapNull, unwrapNull2);
                    }
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid envelope: " + decodeMessage);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public io.flutter.plugin.common.MethodCall decodeMethodCall(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.Object decodeMessage = io.flutter.plugin.common.JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (decodeMessage instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) decodeMessage;
                java.lang.Object obj = jSONObject.get(ya.b.METHOD);
                java.lang.Object unwrapNull = unwrapNull(jSONObject.opt("args"));
                if (obj instanceof java.lang.String) {
                    return new io.flutter.plugin.common.MethodCall((java.lang.String) obj, unwrapNull);
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid method call: " + decodeMessage);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeErrorEnvelope(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return io.flutter.plugin.common.JSONMessageCodec.INSTANCE.encodeMessage(new org.json.JSONArray().put(str).put(io.flutter.plugin.common.JSONUtil.wrap(str2)).put(io.flutter.plugin.common.JSONUtil.wrap(obj)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeErrorEnvelopeWithStacktrace(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3) {
        return io.flutter.plugin.common.JSONMessageCodec.INSTANCE.encodeMessage(new org.json.JSONArray().put(str).put(io.flutter.plugin.common.JSONUtil.wrap(str2)).put(io.flutter.plugin.common.JSONUtil.wrap(obj)).put(io.flutter.plugin.common.JSONUtil.wrap(str3)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeMethodCall(io.flutter.plugin.common.MethodCall methodCall) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.METHOD, methodCall.method);
            jSONObject.put("args", io.flutter.plugin.common.JSONUtil.wrap(methodCall.arguments));
            return io.flutter.plugin.common.JSONMessageCodec.INSTANCE.encodeMessage(jSONObject);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e17);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeSuccessEnvelope(java.lang.Object obj) {
        return io.flutter.plugin.common.JSONMessageCodec.INSTANCE.encodeMessage(new org.json.JSONArray().put(io.flutter.plugin.common.JSONUtil.wrap(obj)));
    }

    public java.lang.Object unwrapNull(java.lang.Object obj) {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
