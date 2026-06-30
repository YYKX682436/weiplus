package os3;

/* loaded from: classes8.dex */
public class p3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f348171f;

    /* renamed from: d, reason: collision with root package name */
    public os3.o3 f348172d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f348173e;

    public p3(android.app.Activity activity) {
        gm0.j1.n().f273288b.a(138, this);
        this.f348173e = activity;
    }

    public void finalize() {
        gm0.j1.n().f273288b.q(138, this);
        super.finalize();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            os3.o3 o3Var = this.f348172d;
            if (o3Var != null) {
                com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI = ((os3.y0) o3Var).f348253a.f348261a;
                int i19 = com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.f154856s;
                compressPreviewUI.T6();
                this.f348172d = null;
            }
        } else {
            os3.o3 o3Var2 = this.f348172d;
            if (o3Var2 != null) {
                o3Var2.getClass();
                this.f348172d = null;
            }
        }
        f348171f = java.lang.System.currentTimeMillis();
    }
}
