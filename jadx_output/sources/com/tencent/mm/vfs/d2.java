package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.d2 f212893d = new com.tencent.mm.vfs.d2();

    public d2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        return java.lang.Integer.valueOf((fe6.f213236f ? 1073741824 : 65536) | (intValue & (-4097)));
    }
}
