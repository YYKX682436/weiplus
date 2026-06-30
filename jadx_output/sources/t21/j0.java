package t21;

/* loaded from: classes12.dex */
public class j0 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public int f414796a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.l0 f414797b;

    public j0(t21.l0 l0Var) {
        this.f414797b = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.j0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        t21.l0 l0Var = this.f414797b;
        t21.k0 k0Var = l0Var.f414821b;
        if (k0Var != null) {
            k0Var.a(this.f414796a, l0Var.f414825f, l0Var.f414828i, l0Var.f414822c, l0Var.f414823d);
        }
    }
}
