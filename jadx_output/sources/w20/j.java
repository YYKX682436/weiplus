package w20;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final w20.j f442288a = new w20.j();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f442289b = jz5.h.b(w20.h.f442286d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f442290c = jz5.h.b(w20.i.f442287d);

    public final void a(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
        if (m18.a()) {
            m18.f213266a.r(m18.f213267b);
        }
    }
}
