package ry4;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401656f;

    public k(ry4.c0 c0Var, android.widget.ScrollView scrollView, int i17) {
        this.f401654d = c0Var;
        this.f401655e = scrollView;
        this.f401656f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f401654d.f401594i;
        if (mMLimitedClearEditText == null) {
            return;
        }
        int[] iArr = new int[2];
        mMLimitedClearEditText.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        android.widget.ScrollView scrollView = this.f401655e;
        scrollView.getLocationOnScreen(iArr2);
        int height = iArr[1] + mMLimitedClearEditText.getHeight();
        int height2 = (iArr2[1] + scrollView.getHeight()) - this.f401656f;
        if (height > height2) {
            scrollView.smoothScrollBy(0, height - height2);
        }
    }
}
