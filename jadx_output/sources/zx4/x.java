package zx4;

/* loaded from: classes8.dex */
public final class x implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f477207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477208c;

    public x(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z17, zx4.l0 l0Var) {
        this.f477206a = webViewUI;
        this.f477207b = z17;
        this.f477208c = l0Var;
    }

    @Override // qj5.q
    public java.lang.String a() {
        return this.f477206a.getString(com.tencent.mm.R.string.ook);
    }

    @Override // qj5.q
    public p15.n b(boolean z17) {
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f477206a;
        if (!((yq1.z) a0Var).o(webViewUI.F7())) {
            return null;
        }
        p15.n nVar = new p15.n();
        p15.m mVar = new p15.m();
        mVar.n(webViewUI.F7());
        mVar.l(11);
        nVar.n(mVar);
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // qj5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.x.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qj5.q
    public qj5.p h() {
        qj5.p pVar = new qj5.p();
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(this.f477206a.F7())) {
            pVar.f363996b = true;
        }
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(this.f477206a.F7()) ? 0 : 8;
    }
}
