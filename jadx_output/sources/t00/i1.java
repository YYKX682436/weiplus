package t00;

/* loaded from: classes7.dex */
public final class i1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t00.j1 f414289a;

    public i1(t00.j1 j1Var) {
        this.f414289a = j1Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewImageActionHandler", "on Activity result: %s", java.lang.Integer.valueOf(i18));
        return i17 == this.f414289a.f414295a;
    }
}
