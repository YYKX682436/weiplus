package pc5;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView f353436d;

    public a(com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView fullScreenStatusMaskView) {
        this.f353436d = fullScreenStatusMaskView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView fullScreenStatusMaskView = this.f353436d;
        if (fullScreenStatusMaskView.f201513e.getLineCount() > 1) {
            fullScreenStatusMaskView.f201513e.setTextSize(0, i65.a.h(fullScreenStatusMaskView.getContext(), com.tencent.mm.R.dimen.f479628b3));
        }
        fullScreenStatusMaskView.f201513e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
