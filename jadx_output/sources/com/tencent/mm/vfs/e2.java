package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.e2 f212905d = new com.tencent.mm.vfs.e2();

    public e2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        java.util.List<java.lang.String> list = com.tencent.mm.vfs.l2.f213058q;
        if (!fe6.f213236f) {
            java.lang.String relPath = fe6.f213231a;
            kotlin.jvm.internal.o.f(relPath, "relPath");
            boolean z17 = false;
            if (r26.i0.y(relPath, "pkg/", false)) {
                java.lang.String relPath2 = fe6.f213231a;
                kotlin.jvm.internal.o.f(relPath2, "relPath");
                if (r26.i0.n(relPath2, ".wxapkg", false)) {
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        for (java.lang.String str : list) {
                            java.lang.String relPath3 = fe6.f213231a;
                            kotlin.jvm.internal.o.f(relPath3, "relPath");
                            java.lang.String substring = relPath3.substring(4);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            if (r26.i0.y(substring, str, false)) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        intValue |= 65536;
                    }
                }
            }
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
