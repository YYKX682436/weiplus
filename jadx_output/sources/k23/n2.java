package k23;

/* loaded from: classes12.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.p2 f303633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303634e;

    public n2(k23.p2 p2Var, int i17) {
        this.f303633d = p2Var;
        this.f303634e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        k23.p2 p2Var = this.f303633d;
        p2Var.getStartBtn().getLocationInWindow(iArr);
        com.tencent.mars.xlog.Log.i("FTSStartRecognizeBtn", "DIAG setMarginBottomPx(" + this.f303634e + ") -> startBtn topInWindow=" + iArr[1] + " bottomInWindow=" + (iArr[1] + p2Var.getStartBtn().getHeight()) + " rootHeight=" + p2Var.f303652o.getRootView().getHeight());
    }
}
