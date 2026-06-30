package gn5;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.popview.EmojiPopView f273675d;

    public g(com.tencent.mm.view.popview.EmojiPopView emojiPopView) {
        this.f273675d = emojiPopView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273675d;
        if (emojiPopView.f213690z != null) {
            return;
        }
        emojiPopView.f213690z = com.tencent.mm.ui.widget.dialog.u3.f(emojiPopView.getContext(), emojiPopView.getContext().getString(com.tencent.mm.R.string.c0d), true, 0, new gn5.f(this));
    }
}
