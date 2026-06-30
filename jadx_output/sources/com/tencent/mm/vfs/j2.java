package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.j2 f213011d = new com.tencent.mm.vfs.j2();

    public j2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fe6, "fe");
        return java.lang.Integer.valueOf((fe6.f213236f ? 1073741824 : kotlin.jvm.internal.o.b(fe6.f213232b, "account.bin") ? 65536 : 4096) | (intValue & (-4097)));
    }
}
