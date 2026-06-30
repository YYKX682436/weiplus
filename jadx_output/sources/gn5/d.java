package gn5;

/* loaded from: classes15.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn5.e f273666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273667e;

    public d(gn5.e eVar, android.view.View view) {
        this.f273666d = eVar;
        this.f273667e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn5.e eVar = this.f273666d;
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = eVar.f273672h;
        if (emojiPopView != null) {
            if (emojiPopView != null) {
                emojiPopView.setVisibility(0);
            }
            com.tencent.mm.view.popview.EmojiPopView emojiPopView2 = eVar.f273672h;
            if (emojiPopView2 != null) {
                emojiPopView2.d(this.f273667e);
            }
            android.view.WindowManager windowManager = eVar.f273671g;
            com.tencent.mm.view.popview.EmojiPopView emojiPopView3 = eVar.f273672h;
            windowManager.updateViewLayout(emojiPopView3, emojiPopView3 != null ? emojiPopView3.getF213696n() : null);
        }
    }
}
