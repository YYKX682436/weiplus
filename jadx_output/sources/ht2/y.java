package ht2;

/* loaded from: classes2.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f284935d;

    public y(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f284935d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f284935d;
        android.view.ViewParent parent = mMPAGView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(mMPAGView);
        }
    }
}
