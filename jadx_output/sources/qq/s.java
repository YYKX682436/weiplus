package qq;

@j95.b
/* loaded from: classes.dex */
public final class s extends i95.w implements qq.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f365883d = jz5.h.b(qq.r.f365882d);

    public java.lang.Object Ai(java.lang.String key, java.lang.Object defaultValue) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        java.lang.String concat = "ecs_test_".concat(key);
        if (defaultValue instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(Di().getInt(concat, ((java.lang.Number) defaultValue).intValue()));
        }
        if (defaultValue instanceof java.lang.Long) {
            return java.lang.Long.valueOf(Di().getLong(concat, ((java.lang.Number) defaultValue).longValue()));
        }
        if (defaultValue instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) defaultValue;
            java.lang.String string = Di().getString(concat, str);
            return string == null ? str : string;
        }
        if (defaultValue instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(Di().getBoolean(concat, ((java.lang.Boolean) defaultValue).booleanValue()));
        }
        if (defaultValue instanceof java.lang.Float) {
            return java.lang.Float.valueOf(Di().getFloat(concat, ((java.lang.Number) defaultValue).floatValue()));
        }
        com.tencent.mars.xlog.Log.e("EcsTestService", "getConfig failed for key: " + key + ", defaultValue: " + defaultValue);
        return defaultValue;
    }

    public int Bi(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        return ((java.lang.Number) Ai(key, java.lang.Integer.valueOf(i17))).intValue();
    }

    public final com.tencent.mm.sdk.platformtools.o4 Di() {
        java.lang.Object value = ((jz5.n) this.f365883d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final void wi(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            if (kotlin.jvm.internal.o.b(str, "EcsMBAutoStartProfile")) {
                if (!kotlin.jvm.internal.o.b(obj, 1) || Di().getInt("ecs_test_EcsMBDebugPanel", 0) == 1) {
                    return;
                }
                Di().putInt("ecs_test_EcsMBDebugPanel", 1);
                com.tencent.mars.xlog.Log.i("EcsTestService", "linkage: profile switch on, set panel switch to 1");
                return;
            }
            if (kotlin.jvm.internal.o.b(str, "EcsMBDebugPanel") && kotlin.jvm.internal.o.b(obj, 0) && Di().getInt("ecs_test_EcsMBAutoStartProfile", 0) != 0) {
                Di().putInt("ecs_test_EcsMBAutoStartProfile", 0);
                com.tencent.mars.xlog.Log.i("EcsTestService", "linkage: panel switch off, set profile switch to 0");
            }
        }
    }
}
