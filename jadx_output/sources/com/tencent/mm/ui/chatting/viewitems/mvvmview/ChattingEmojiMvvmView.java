package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/k;", "Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "f", "Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "getContent", "()Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "setContent", "(Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;)V", "content", "", "g", "Z", "isEmojiInited", "()Z", "setEmojiInited", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingEmojiMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.k> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isEmojiInited;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingEmojiMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = new com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView(context);
        setContent(rTChattingEmojiView);
        return rTChattingEmojiView;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        z01.k kVar = (z01.k) pVar2;
        if (kVar == null) {
            return;
        }
        if (!this.isEmojiInited) {
            int l17 = kVar.l();
            if (l17 == 0) {
                getContent().a();
                com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content = getContent();
                content.getClass();
                content.addView(content.f190826m, new android.widget.FrameLayout.LayoutParams(-2, -2));
            } else if (l17 == 1) {
                getContent().a();
                com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content2 = getContent();
                content2.getClass();
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 3;
                content2.addView(content2.f190826m, layoutParams);
            } else if (l17 == 2) {
                getContent().a();
                com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content3 = getContent();
                content3.getClass();
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 5;
                content3.addView(content3.f190826m, layoutParams2);
            }
            this.isEmojiInited = true;
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(kVar.getEmojiMd5());
        if (N == null) {
            return;
        }
        getContent().c(N, kVar.j(), kVar.l() == 2, kVar.n());
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content4 = getContent();
        java.lang.String k17 = kVar.k();
        jz5.f0 f0Var = null;
        if (!(k17.length() > 0)) {
            k17 = null;
        }
        if (k17 == null) {
            k17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(N.getMd5());
        }
        content4.setContentDescription(k17);
        android.view.View.OnClickListener onClickListener = kVar.f469083d;
        if (onClickListener != null) {
            getContent().setOnClickListener(onClickListener);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            getContent().setOnClickListener(new af5.x(this, kVar));
        }
        getContent().setOnLongClickListener(kVar.f469084e);
        getContent().setOnTouchListener(kVar.f469085f);
    }

    public final com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView getContent() {
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = this.content;
        if (rTChattingEmojiView != null) {
            return rTChattingEmojiView;
        }
        kotlin.jvm.internal.o.o("content");
        throw null;
    }

    public final void setContent(com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView) {
        kotlin.jvm.internal.o.g(rTChattingEmojiView, "<set-?>");
        this.content = rTChattingEmojiView;
    }

    public final void setEmojiInited(boolean z17) {
        this.isEmojiInited = z17;
    }

    public /* synthetic */ ChattingEmojiMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingEmojiMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
