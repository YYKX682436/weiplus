package com.tencent.mm.plugin.game.chatroom.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class JoinRoomExternalConfirmView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f138996d;

    /* renamed from: e, reason: collision with root package name */
    public long f138997e;

    /* renamed from: f, reason: collision with root package name */
    public final x33.g f138998f;

    public JoinRoomExternalConfirmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bml, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.tencent.mm.R.id.c9y;
        com.tencent.mm.plugin.game.chatroom.view.FixAspectRatioAndTopCropImageView fixAspectRatioAndTopCropImageView = (com.tencent.mm.plugin.game.chatroom.view.FixAspectRatioAndTopCropImageView) x4.b.a(inflate, com.tencent.mm.R.id.c9y);
        if (fixAspectRatioAndTopCropImageView != null) {
            i18 = com.tencent.mm.R.id.c_5;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.c_5);
            if (textView != null) {
                i18 = com.tencent.mm.R.id.c_r;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.c_r);
                if (textView2 != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                    i18 = com.tencent.mm.R.id.hoo;
                    android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.hoo);
                    if (button != null) {
                        i18 = com.tencent.mm.R.id.f486198kk0;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486198kk0);
                        if (textView3 != null) {
                            i18 = com.tencent.mm.R.id.ouk;
                            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(inflate, com.tencent.mm.R.id.ouk);
                            if (mMRoundCornerImageView != null) {
                                this.f138998f = new x33.g(constraintLayout, fixAspectRatioAndTopCropImageView, textView, textView2, constraintLayout, button, textView3, mMRoundCornerImageView);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public JoinRoomExternalConfirmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
