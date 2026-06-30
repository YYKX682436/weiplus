package fq1;

/* loaded from: classes8.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f265505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265506e;

    public d(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, int i17) {
        this.f265505d = mMNeat7extView;
        this.f265506e = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f265505d;
        android.view.ViewTreeObserver viewTreeObserver = mMNeat7extView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        mMNeat7extView.post(new fq1.c(this.f265506e, mMNeat7extView));
        return true;
    }
}
