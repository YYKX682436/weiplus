package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class v50 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v50 f128172d = new com.tencent.mm.plugin.finder.storage.v50();

    public v50() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.mm.uitool.UITool");
            java.lang.Object obj3 = cls.getDeclaredField("INSTANCE").get(cls);
            if (intValue > 0) {
                cls.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj3, java.lang.Integer.valueOf(intValue));
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.UIToolCommon", "enable UIToolCommon", new java.lang.Object[0]);
                zl5.b.f474087b = true;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(intValue));
            } else {
                cls.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj3, new java.lang.Object[0]);
                zl5.b.f474087b = false;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, 0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderConfig", e17, "fail to enable uitool", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
