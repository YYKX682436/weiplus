package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.f2 f212923d = new com.tencent.mm.vfs.f2();

    public f2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        java.lang.String str = com.tencent.mm.vfs.l2.f213060s;
        if (str == null) {
            str = com.tencent.mm.vfs.b2.i(java.lang.System.currentTimeMillis());
        }
        int i17 = ((-65537) & intValue) | 4096;
        int i18 = (intValue & (-4097)) | 65536;
        if (!fe6.f213236f) {
            java.lang.String relPath = fe6.f213231a;
            kotlin.jvm.internal.o.f(relPath, "relPath");
            if (!r26.n0.C(relPath, '/', false, 2, null)) {
                r26.t tVar = com.tencent.mm.vfs.l2.f213050i;
                java.lang.String name = fe6.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                r26.m d17 = tVar.d(name);
                if (d17 == null) {
                    return java.lang.Integer.valueOf(i18);
                }
                if (((java.lang.String) ((r26.q) d17).a().get(1)).compareTo(str) >= 0) {
                    i17 = i18;
                }
                return java.lang.Integer.valueOf(i17);
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
