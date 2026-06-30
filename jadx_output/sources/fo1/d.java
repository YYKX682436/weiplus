package fo1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.d f264858a = new fo1.d();

    public final boolean a(org.json.JSONObject jobj, java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(jobj, "jobj");
        kotlin.jvm.internal.o.g(key, "key");
        if (!jobj.has(key)) {
            return z17;
        }
        java.lang.Object obj = jobj.get(key);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : obj instanceof java.lang.Integer ? kotlin.jvm.internal.o.b(obj, 1) : obj instanceof java.lang.String ? kotlin.jvm.internal.o.b("true", obj) || kotlin.jvm.internal.o.b("1", obj) || kotlin.jvm.internal.o.b("True", obj) : z17;
    }

    public final boolean b(po1.d device) {
        kotlin.jvm.internal.o.g(device, "device");
        return r26.i0.A(device.f357295a, "#OnlineDeviceId@", false, 2, null);
    }

    public final boolean c(po1.d device) {
        kotlin.jvm.internal.o.g(device, "device");
        r26.i0.A(device.f357295a, "#OnlineDeviceId@", false, 2, null);
        java.lang.String substring = device.f357295a.substring(16);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        int parseInt = java.lang.Integer.parseInt(substring);
        if (r26.i0.A(device.f357300f, "UNIFY_MAC", false, 2, null)) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_roam_xwechat_version_update_mac, -228327424);
            com.tencent.mars.xlog.Log.i("AutoBindHelper", "isVersionSatisfied [Mac]: onlineVersion=" + ((java.lang.Object) jz5.u.a(parseInt)) + ", exptVersion=" + ((java.lang.Object) jz5.u.a(Ni)));
            return java.lang.Integer.compare(parseInt ^ Integer.MIN_VALUE, Ni ^ Integer.MIN_VALUE) >= 0;
        }
        if (!r26.i0.A(device.f357300f, "UNIFY_WINDOWS", false, 2, null)) {
            com.tencent.mars.xlog.Log.w("AutoBindHelper", "isVersionSatisfied [Others]: deviceInfo = " + device);
            return false;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_roam_xwechat_version_update_pc, -229376000);
        com.tencent.mars.xlog.Log.i("AutoBindHelper", "isVersionSatisfied [Windows]: onlineVersion=" + ((java.lang.Object) jz5.u.a(parseInt)) + ", exptVersion=" + ((java.lang.Object) jz5.u.a(Ni2)));
        return java.lang.Integer.compare(parseInt ^ Integer.MIN_VALUE, Ni2 ^ Integer.MIN_VALUE) >= 0;
    }
}
