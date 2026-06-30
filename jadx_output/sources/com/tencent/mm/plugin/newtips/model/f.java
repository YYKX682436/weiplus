package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f152372a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f152373b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.newtips.model.f f152374c;

    public f() {
        f152372a = new java.util.HashMap();
        f152373b = new java.util.HashMap();
    }

    public static com.tencent.mm.plugin.newtips.model.j a(int i17) {
        if (f152374c == null) {
            f152374c = new com.tencent.mm.plugin.newtips.model.f();
        }
        f152374c.getClass();
        com.tencent.mm.plugin.newtips.model.j jVar = (com.tencent.mm.plugin.newtips.model.j) ((java.util.HashMap) f152372a).get(java.lang.Integer.valueOf(i17));
        if (jVar == null) {
            switch (i17) {
                case 70001002:
                    jVar = new tn3.a();
                    break;
                case 70001003:
                    jVar = new tn3.c();
                    break;
                default:
                    jVar = null;
                    break;
            }
            if (jVar != null) {
                ((java.util.HashMap) f152372a).put(java.lang.Integer.valueOf(i17), jVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsFilterPool", "Invalid tipsId:%s", java.lang.Integer.valueOf(i17));
            }
        }
        return jVar;
    }
}
