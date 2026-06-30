package gn5;

/* loaded from: classes15.dex */
public final class o extends gn5.b implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273684e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273685f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.WindowManager f273686g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.popview.EmojiPopView f273687h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f273688i;

    public o(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f273683d = context;
        this.f273684e = i17;
        this.f273685f = "MicroMsg.PreviewRelativeEmotionPopupHelper";
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f273686g = (android.view.WindowManager) systemService;
    }

    @Override // gn5.b
    public boolean a(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!(obj instanceof com.tencent.mm.storage.emotion.EmojiInfo) || !anchor.isEnabled()) {
            return false;
        }
        this.f273688i = anchor;
        anchor.setPressed(true);
        j(anchor, obj);
        return true;
    }

    @Override // gn5.b
    public void b(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        anchor.setPressed(true);
        if (kotlin.jvm.internal.o.b(this.f273688i, anchor)) {
            return;
        }
        android.view.View view = this.f273688i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f273688i = anchor;
        j(anchor, obj);
    }

    @Override // gn5.b
    public void c() {
        android.view.View view = this.f273688i;
        if (view == null) {
            return;
        }
        view.setPressed(false);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i(this.f273685f, "removePopup: " + this.f273687h);
        android.view.View view = this.f273688i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f273688i = null;
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273687h;
        if (emojiPopView != null) {
            this.f273686g.removeView(emojiPopView);
        }
        this.f273687h = null;
    }

    @Override // im5.a
    public void dead() {
        d();
    }

    public final void j(android.view.View view, java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.storage.emotion.EmojiInfo) || !view.isEnabled()) {
            com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273687h;
            if (emojiPopView == null) {
                return;
            }
            emojiPopView.setVisibility(8);
            return;
        }
        int i17 = this.f273684e;
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct emoticonFastManagementStruct = nr.f.f339045b;
            emoticonFastManagementStruct.f56034f = emoticonFastManagementStruct.b("Pid", ((com.tencent.mm.storage.emotion.EmojiInfo) obj).field_groupId, true);
        }
        nr.f fVar = nr.f.f339044a;
        fVar.b(i17);
        com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct emoticonFastManagementStruct2 = nr.f.f339045b;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) obj;
        emoticonFastManagementStruct2.f56035g = emoticonFastManagementStruct2.b("Md5", emojiInfo.getMd5(), true);
        fVar.a(1);
        view.setPressed(true);
        com.tencent.mm.view.popview.EmojiPopView emojiPopView2 = this.f273687h;
        android.view.WindowManager windowManager = this.f273686g;
        if (emojiPopView2 == null) {
            com.tencent.mm.view.popview.EmojiPopView emojiPopView3 = new com.tencent.mm.view.popview.EmojiPopView(this.f273683d, null);
            this.f273687h = emojiPopView3;
            emojiPopView3.setOnDismissCallback(new gn5.m(this));
            com.tencent.mm.view.popview.EmojiPopView emojiPopView4 = this.f273687h;
            windowManager.addView(emojiPopView4, emojiPopView4 != null ? emojiPopView4.getWindowLayoutParams() : null);
            com.tencent.mm.view.popview.EmojiPopView emojiPopView5 = this.f273687h;
            if (emojiPopView5 != null) {
                emojiPopView5.setVisibility(4);
            }
        } else {
            emojiPopView2.d(view);
            com.tencent.mm.view.popview.EmojiPopView emojiPopView6 = this.f273687h;
            windowManager.updateViewLayout(emojiPopView6, emojiPopView6 != null ? emojiPopView6.getWindowLayoutParams() : null);
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView7 = this.f273687h;
        if (emojiPopView7 != null) {
            emojiPopView7.post(new gn5.n(this, view));
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView8 = this.f273687h;
        if (emojiPopView8 != null) {
            emojiPopView8.setEmojiInfo(emojiInfo);
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView9 = this.f273687h;
        if (emojiPopView9 != null) {
            emojiPopView9.setPopupType(i17);
        }
    }
}
