package gn5;

/* loaded from: classes15.dex */
public final class e extends gn5.b implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273669e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273670f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.WindowManager f273671g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.popview.EmojiPopView f273672h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f273673i;

    public e(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f273668d = context;
        this.f273669e = i17;
        this.f273670f = "MicroMsg.EmojiOperatePopupHelper";
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f273671g = (android.view.WindowManager) systemService;
    }

    @Override // gn5.b
    public boolean a(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!(obj instanceof ir.g) || !anchor.isEnabled()) {
            return false;
        }
        this.f273673i = anchor;
        anchor.setPressed(true);
        j(anchor, obj);
        return true;
    }

    @Override // gn5.b
    public void b(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        anchor.setPressed(true);
        if (kotlin.jvm.internal.o.b(this.f273673i, anchor)) {
            return;
        }
        android.view.View view = this.f273673i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f273673i = anchor;
        j(anchor, obj);
    }

    @Override // gn5.b
    public void c() {
        android.view.View view = this.f273673i;
        if (view == null) {
            return;
        }
        view.setPressed(false);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i(this.f273670f, "removePopup: " + this.f273672h);
        android.view.View view = this.f273673i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f273673i = null;
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273672h;
        if (emojiPopView != null) {
            this.f273671g.removeView(emojiPopView);
        }
        this.f273672h = null;
    }

    @Override // im5.a
    public void dead() {
        d();
    }

    public final void j(android.view.View view, java.lang.Object obj) {
        if (!(obj instanceof ir.g) || !view.isEnabled()) {
            com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273672h;
            if (emojiPopView == null) {
                return;
            }
            emojiPopView.setVisibility(8);
            return;
        }
        int i17 = this.f273669e;
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct emoticonFastManagementStruct = nr.f.f339045b;
            emoticonFastManagementStruct.f56034f = emoticonFastManagementStruct.b("Pid", ((ir.g) obj).f293836b.getGroupId(), true);
        }
        nr.f fVar = nr.f.f339044a;
        fVar.b(i17);
        com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct emoticonFastManagementStruct2 = nr.f.f339045b;
        ir.g gVar = (ir.g) obj;
        emoticonFastManagementStruct2.f56035g = emoticonFastManagementStruct2.b("Md5", gVar.f293836b.getMd5(), true);
        fVar.a(1);
        view.setPressed(true);
        com.tencent.mm.view.popview.EmojiPopView emojiPopView2 = this.f273672h;
        android.view.WindowManager windowManager = this.f273671g;
        if (emojiPopView2 == null) {
            com.tencent.mm.view.popview.EmojiPopView emojiPopView3 = new com.tencent.mm.view.popview.EmojiPopView(this.f273668d, null);
            this.f273672h = emojiPopView3;
            emojiPopView3.setOnDismissCallback(new gn5.c(this));
            com.tencent.mm.view.popview.EmojiPopView emojiPopView4 = this.f273672h;
            windowManager.addView(emojiPopView4, emojiPopView4 != null ? emojiPopView4.getWindowLayoutParams() : null);
            com.tencent.mm.view.popview.EmojiPopView emojiPopView5 = this.f273672h;
            if (emojiPopView5 != null) {
                emojiPopView5.setVisibility(4);
            }
        } else {
            emojiPopView2.d(view);
            com.tencent.mm.view.popview.EmojiPopView emojiPopView6 = this.f273672h;
            windowManager.updateViewLayout(emojiPopView6, emojiPopView6 != null ? emojiPopView6.getWindowLayoutParams() : null);
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView7 = this.f273672h;
        if (emojiPopView7 != null) {
            emojiPopView7.post(new gn5.d(this, view));
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView8 = this.f273672h;
        if (emojiPopView8 != null) {
            emojiPopView8.setEmojiInfo((com.tencent.mm.storage.emotion.EmojiInfo) gVar.f293836b);
        }
        com.tencent.mm.view.popview.EmojiPopView emojiPopView9 = this.f273672h;
        if (emojiPopView9 != null) {
            emojiPopView9.setPopupType(i17);
        }
    }
}
