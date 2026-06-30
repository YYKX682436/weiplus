package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.g2 f212948d = new com.tencent.mm.vfs.g2();

    public g2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        java.util.List list = com.tencent.mm.vfs.l2.f213056o;
        boolean z17 = false;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String relPath = fe6.f213231a;
                kotlin.jvm.internal.o.f(relPath, "relPath");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('/');
                if (r26.i0.y(relPath, sb6.toString(), false) || (fe6.f213236f && kotlin.jvm.internal.o.b(fe6.f213231a, str))) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            intValue = 65536 | (intValue & (-4097));
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
