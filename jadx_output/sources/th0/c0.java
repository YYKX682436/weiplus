package th0;

/* loaded from: classes5.dex */
public class c0 implements com.tencent.mm.app.g3 {
    public c0(th0.d0 d0Var, boolean z17) {
    }

    @Override // com.tencent.mm.app.g3
    public void a(java.lang.String str) {
        d(str);
    }

    @Override // com.tencent.mm.app.g3
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(th0.d0.f419280d, "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        if (i17 == 100) {
            com.tencent.mars.xlog.Log.i(th0.d0.f419280d, "Upload finished.");
            d(str);
        }
    }

    public final void d(java.lang.String str) {
    }
}
