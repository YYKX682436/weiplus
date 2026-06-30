package tj5;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419844d;

    public i(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419844d = fTSEditTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419844d;
        if (fTSEditTextView.f209816g == null) {
            return;
        }
        if (fTSEditTextView.hasWindowFocus()) {
            fTSEditTextView.s();
        } else {
            fTSEditTextView.getViewTreeObserver().addOnWindowFocusChangeListener(new tj5.h(this));
        }
    }
}
