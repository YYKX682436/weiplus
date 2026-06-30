package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public final class MethodCall {
    public final java.lang.Object arguments;
    public final java.lang.String method;

    public MethodCall(java.lang.String str, java.lang.Object obj) {
        this.method = str;
        this.arguments = obj;
    }

    public <T> T argument(java.lang.String str) {
        java.lang.Object obj = this.arguments;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Map) {
            return (T) ((java.util.Map) obj).get(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return (T) ((org.json.JSONObject) obj).opt(str);
        }
        throw new java.lang.ClassCastException();
    }

    public <T> T arguments() {
        return (T) this.arguments;
    }

    public boolean hasArgument(java.lang.String str) {
        java.lang.Object obj = this.arguments;
        if (obj == null) {
            return false;
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).containsKey(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return ((org.json.JSONObject) obj).has(str);
        }
        throw new java.lang.ClassCastException();
    }
}
