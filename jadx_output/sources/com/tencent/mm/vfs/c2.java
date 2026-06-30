package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.c2 f212867d = new com.tencent.mm.vfs.c2();

    public c2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        java.lang.String name = fe6.f213232b;
        kotlin.jvm.internal.o.f(name, "name");
        java.util.List f07 = r26.n0.f0(name, new java.lang.String[]{".db"}, false, 2, 2, null);
        int size = f07.size();
        boolean z17 = fe6.f213236f;
        if (size == 2 && !z17) {
            java.lang.Integer num = (java.lang.Integer) com.tencent.mm.vfs.l2.f213046e.get(f07.get(0));
            if (num != null) {
                intValue = (intValue & (-4096)) | num.intValue();
            }
            if (com.tencent.mm.vfs.l2.f213047f.contains(f07.get(0))) {
                return java.lang.Integer.valueOf(((-65537) & intValue) | 4096);
            }
        }
        return java.lang.Integer.valueOf((z17 ? 1073741824 : 65536) | (intValue & (-4097)));
    }
}
