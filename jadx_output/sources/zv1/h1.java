package zv1;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f476303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17) {
        super(4);
        this.f476303d = i17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.tencent.mm.vfs.x1 m17;
        java.lang.String fsName = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.util.Map accEnv = (java.util.Map) obj3;
        java.lang.String path = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(fsName, "fsName");
        kotlin.jvm.internal.o.g(accEnv, "accEnv");
        kotlin.jvm.internal.o.g(path, "path");
        if ((intValue & 4095) != this.f476303d) {
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return java.lang.Boolean.valueOf(aw1.c0.a(intValue, m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null && m17.f213236f) >= 1);
    }
}
