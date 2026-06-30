package up3;

/* loaded from: classes.dex */
public class x implements com.tencent.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f429851a;

    public x(boolean z17) {
        this.f429851a = z17;
    }

    @Override // com.tencent.mm.app.g3
    public void a(java.lang.String str) {
        d(str);
    }

    @Override // com.tencent.mm.app.g3
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(up3.d0.f429823d, "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        if (i17 == 100) {
            d(str);
        }
    }

    public final void d(java.lang.String str) {
        if (str == null || !this.f429851a) {
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        boolean z17 = false;
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() && m17.f213266a.d(m17.f213267b)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(up3.d0.f429823d, "Delete file %s, res: %s", str, java.lang.Boolean.valueOf(z17));
    }
}
