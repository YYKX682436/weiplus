package gn5;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn5.o f273681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273682e;

    public n(gn5.o oVar, android.view.View view) {
        this.f273681d = oVar;
        this.f273682e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn5.o oVar = this.f273681d;
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = oVar.f273687h;
        if (emojiPopView != null) {
            if (emojiPopView != null) {
                emojiPopView.setVisibility(0);
            }
            com.tencent.mm.view.popview.EmojiPopView emojiPopView2 = oVar.f273687h;
            if (emojiPopView2 != null) {
                emojiPopView2.d(this.f273682e);
            }
            android.view.WindowManager windowManager = oVar.f273686g;
            com.tencent.mm.view.popview.EmojiPopView emojiPopView3 = oVar.f273687h;
            windowManager.updateViewLayout(emojiPopView3, emojiPopView3 != null ? emojiPopView3.getF213696n() : null);
        }
    }
}
