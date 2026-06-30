package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B%\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u00020'¢\u0006\u0004\b1\u00104R\"\u0010\b\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R8\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010,\u001a\u00020'8\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedExposeLayout;", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "getCommentsLayout", "()Landroid/widget/LinearLayout;", "setCommentsLayout", "(Landroid/widget/LinearLayout;)V", "commentsLayout", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getSeeAllCommentsTv", "()Landroid/widget/TextView;", "setSeeAllCommentsTv", "(Landroid/widget/TextView;)V", "seeAllCommentsTv", "Landroid/view/View;", "g", "Landroid/view/View;", "getCommentIconContainer", "()Landroid/view/View;", "setCommentIconContainer", "(Landroid/view/View;)V", "commentIconContainer", "Lkotlin/Function2;", "Lcom/tencent/mm/protocal/protobuf/FinderCommentInfo;", "Ljz5/f0;", "h", "Lyz5/p;", "getOnCommentClickListener", "()Lyz5/p;", "setOnCommentClickListener", "(Lyz5/p;)V", "onCommentClickListener", "i", "getOnCommentLongClickListener", "setOnCommentLongClickListener", "onCommentLongClickListener", "", "m", "I", "getMAX_COMMENT_COUNT", "()I", "MAX_COMMENT_COUNT", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedExposeLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.LinearLayout commentsLayout;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f131077e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView seeAllCommentsTv;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View commentIconContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.p onCommentClickListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.p onCommentLongClickListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int MAX_COMMENT_COUNT;

    public FinderFeedExposeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ah8, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dzk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.commentsLayout = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dzm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131077e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.dzl);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById3).getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127996w2).getValue()).r()).intValue();
        ((java.lang.Number) t70Var.s2().r()).intValue();
        t70Var.p2();
        t70Var.q();
        new java.util.ArrayList();
        this.MAX_COMMENT_COUNT = 3;
    }

    public final android.view.View getCommentIconContainer() {
        android.view.View view = this.commentIconContainer;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("commentIconContainer");
        throw null;
    }

    public final android.widget.LinearLayout getCommentsLayout() {
        return this.commentsLayout;
    }

    public final int getMAX_COMMENT_COUNT() {
        return this.MAX_COMMENT_COUNT;
    }

    public final yz5.p getOnCommentClickListener() {
        return this.onCommentClickListener;
    }

    public final yz5.p getOnCommentLongClickListener() {
        return this.onCommentLongClickListener;
    }

    public final android.widget.TextView getSeeAllCommentsTv() {
        android.widget.TextView textView = this.seeAllCommentsTv;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("seeAllCommentsTv");
        throw null;
    }

    public final void setCommentIconContainer(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.commentIconContainer = view;
    }

    public final void setCommentsLayout(android.widget.LinearLayout linearLayout) {
        kotlin.jvm.internal.o.g(linearLayout, "<set-?>");
        this.commentsLayout = linearLayout;
    }

    public final void setOnCommentClickListener(yz5.p pVar) {
        this.onCommentClickListener = pVar;
    }

    public final void setOnCommentLongClickListener(yz5.p pVar) {
        this.onCommentLongClickListener = pVar;
    }

    public final void setSeeAllCommentsTv(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.seeAllCommentsTv = textView;
    }

    public FinderFeedExposeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setOrientation(1);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ah8, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dzk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.commentsLayout = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dzm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131077e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.dzl);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById3).getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127996w2).getValue()).r()).intValue();
        ((java.lang.Number) t70Var.s2().r()).intValue();
        t70Var.p2();
        t70Var.q();
        new java.util.ArrayList();
        this.MAX_COMMENT_COUNT = 3;
    }
}
