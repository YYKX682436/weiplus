package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTagTv", "()Landroid/widget/TextView;", "setTagTv", "(Landroid/widget/TextView;)V", "tagTv", "Lkotlin/Function2;", "Landroid/view/View;", "", "Ljz5/f0;", "e", "Lyz5/p;", "getClickListener", "()Lyz5/p;", "setClickListener", "(Lyz5/p;)V", "clickListener", "f", "Z", "getHasJoinFansClub", "()Z", "setHasJoinFansClub", "(Z)V", "hasJoinFansClub", "isAnchor", "setAnchor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFansClubTagWidget extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView tagTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.p clickListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hasJoinFansClub;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f117616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubTagWidget(android.content.Context context, android.util.AttributeSet attr) {
        super(context, attr);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attr, "attr");
        this.f117616g = new com.tencent.mm.plugin.finder.live.widget.uf(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aqc, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dsd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setTagTv((android.widget.TextView) findViewById);
        getTagTv().setTextSize(1, 12.0f);
        com.tencent.mm.ui.bk.r0(getTagTv().getPaint(), 0.8f);
        setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vf(this));
    }

    public final void a(boolean z17, java.lang.String tag, boolean z18) {
        kotlin.jvm.internal.o.g(tag, "tag");
        getTagTv().setText(tag);
        this.hasJoinFansClub = z18;
        if (z17) {
            getTagTv().setVisibility(0);
            return;
        }
        if (z18) {
            setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.d_b));
            getTagTv().setVisibility(8);
            return;
        }
        java.lang.Object tag2 = getTagTv().getTag();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!kotlin.jvm.internal.o.b(tag2, bool)) {
            getTagTv().setVisibility(0);
            getTagTv().postDelayed(this.f117616g, 3000L);
            getTagTv().setTag(bool);
        }
        setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.dlp));
    }

    public final yz5.p getClickListener() {
        return this.clickListener;
    }

    public final boolean getHasJoinFansClub() {
        return this.hasJoinFansClub;
    }

    public final android.widget.TextView getTagTv() {
        android.widget.TextView textView = this.tagTv;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("tagTv");
        throw null;
    }

    public final void setAnchor(boolean z17) {
    }

    public final void setClickListener(yz5.p pVar) {
        this.clickListener = pVar;
    }

    public final void setHasJoinFansClub(boolean z17) {
        this.hasJoinFansClub = z17;
    }

    public final void setTagTv(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.tagTv = textView;
    }
}
