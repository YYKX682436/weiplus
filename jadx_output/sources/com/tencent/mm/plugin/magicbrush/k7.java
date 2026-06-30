package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class k7 extends i95.w implements com.tencent.mm.plugin.magicbrush.r4 {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).bj("MagicPermissionConfig", com.tencent.mm.plugin.magicbrush.j7.f148041a);
    }

    public java.util.LinkedList wi(java.lang.String bizName, java.lang.String module) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(module, "module");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "getPerMissionBlackList biz:%s,module:%s", bizName, module);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = bizName.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.appstorage.u1 b17 = com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, "MagicPermissionConfig", null, 2, null).b();
        java.lang.String str = "/" + module + '/' + lowerCase + "/blacklist.json";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = b17.readFile("/" + module + "/blacklist.json", b0Var);
        kotlin.jvm.internal.o.f(readFile, "readFile(...)");
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (readFile == j1Var) {
            byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
            kotlin.jvm.internal.o.f(a17, "arrayOfByteBuffer(...)");
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            org.json.JSONArray jSONArray = new org.json.JSONArray(new java.lang.String(a17, UTF_8));
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.getString(i17);
                linkedList.add(string);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "global black bizName %s jsapi:%s", bizName, string);
            }
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile2 = b17.readFile(str, b0Var);
        kotlin.jvm.internal.o.f(readFile2, "readFile(...)");
        if (readFile2 == j1Var) {
            byte[] a18 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
            kotlin.jvm.internal.o.f(a18, "arrayOfByteBuffer(...)");
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_82, "UTF_8");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(new java.lang.String(a18, UTF_82));
            int length2 = jSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                java.lang.String string2 = jSONArray2.getString(i18);
                if (!linkedList.contains(string2)) {
                    linkedList.add(string2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "biz black bizName %s jsapi:%s", bizName, string2);
                }
            }
        }
        return linkedList;
    }
}
