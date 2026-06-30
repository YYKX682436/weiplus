package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$B!\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b#\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveModeItemView;", "Landroid/widget/FrameLayout;", "Lr45/ah7;", "subMode", "Ljz5/f0;", "setVideoModeSelected", "Lr45/zg7;", "mode", "setModeUnSelected", "Lr45/bh7;", "setVoiceModeSelected", "", "gameName", "setGameModeSelected", "Landroid/view/View;", "g", "Landroid/view/View;", "getRedDotView", "()Landroid/view/View;", "setRedDotView", "(Landroid/view/View;)V", "redDotView", "", "h", "Ljz5/g;", "getPadding1_5A", "()I", "padding1_5A", "i", "getPaddingA", "paddingA", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleInt", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveModeItemView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f116050d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f116051e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f116052f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View redDotView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g padding1_5A;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g paddingA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveModeItemView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.padding1_5A = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.b7(this));
        this.paddingA = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.c7(this));
        a(context);
    }

    private final int getPadding1_5A() {
        return ((java.lang.Number) this.padding1_5A.getValue()).intValue();
    }

    private final int getPaddingA() {
        return ((java.lang.Number) this.paddingA.getValue()).intValue();
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dl8, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qui);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116050d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.que);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116051e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qud);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116052f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.quh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setRedDotView(findViewById4);
    }

    public final void b() {
        android.widget.TextView textView = this.f116050d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        android.widget.TextView textView2 = this.f116050d;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.view.View view = this.f116051e;
        if (view == null) {
            kotlin.jvm.internal.o.o("arrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveModeItemView", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveModeItemView", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f116052f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        view2.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.cpx));
        android.view.View view3 = this.f116052f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        int padding1_5A = getPadding1_5A();
        android.view.View view4 = this.f116052f;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        int paddingTop = view4.getPaddingTop();
        int paddingA = getPaddingA();
        android.view.View view5 = this.f116052f;
        if (view5 != null) {
            view3.setPadding(padding1_5A, paddingTop, paddingA, view5.getPaddingBottom());
        } else {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
    }

    public final android.view.View getRedDotView() {
        android.view.View view = this.redDotView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("redDotView");
        throw null;
    }

    public final void setGameModeSelected(java.lang.String gameName) {
        kotlin.jvm.internal.o.g(gameName, "gameName");
        b();
        android.widget.TextView textView = this.f116050d;
        if (textView != null) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.f491677m01, getContext().getString(com.tencent.mm.R.string.m08), gameName));
        } else {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
    }

    public final void setModeUnSelected(r45.zg7 mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        android.widget.TextView textView = this.f116050d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
        android.widget.TextView textView2 = this.f116050d;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
        com.tencent.mm.ui.fk.c(textView2);
        android.view.View view = this.f116051e;
        if (view == null) {
            kotlin.jvm.internal.o.o("arrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveModeItemView", "unSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveModeItemView", "unSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f116052f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        view2.setBackground(null);
        android.view.View view3 = this.f116052f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        int padding1_5A = getPadding1_5A();
        android.view.View view4 = this.f116052f;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        int paddingTop = view4.getPaddingTop();
        int padding1_5A2 = getPadding1_5A();
        android.view.View view5 = this.f116052f;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("itemGroup");
            throw null;
        }
        view3.setPadding(padding1_5A, paddingTop, padding1_5A2, view5.getPaddingBottom());
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            android.widget.TextView textView3 = this.f116050d;
            if (textView3 != null) {
                textView3.setText(getContext().getString(com.tencent.mm.R.string.m08));
                return;
            } else {
                kotlin.jvm.internal.o.o("contentTxt");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.widget.TextView textView4 = this.f116050d;
            if (textView4 != null) {
                textView4.setText(getContext().getString(com.tencent.mm.R.string.f491678m02));
                return;
            } else {
                kotlin.jvm.internal.o.o("contentTxt");
                throw null;
            }
        }
        if (ordinal != 3) {
            return;
        }
        android.widget.TextView textView5 = this.f116050d;
        if (textView5 != null) {
            textView5.setText(getContext().getString(com.tencent.mm.R.string.m09));
        } else {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
    }

    public final void setRedDotView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.redDotView = view;
    }

    public final void setVideoModeSelected(r45.ah7 subMode) {
        kotlin.jvm.internal.o.g(subMode, "subMode");
        b();
        int ordinal = subMode.ordinal();
        java.lang.String string = ordinal != 0 ? ordinal != 1 ? "" : getContext().getString(com.tencent.mm.R.string.m0a) : getContext().getString(com.tencent.mm.R.string.m0c);
        kotlin.jvm.internal.o.d(string);
        android.widget.TextView textView = this.f116050d;
        if (textView != null) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.f491677m01, getContext().getString(com.tencent.mm.R.string.m09), string));
        } else {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
    }

    public final void setVoiceModeSelected(r45.bh7 subMode) {
        kotlin.jvm.internal.o.g(subMode, "subMode");
        b();
        int ordinal = subMode.ordinal();
        java.lang.String string = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : getContext().getString(com.tencent.mm.R.string.epw) : getContext().getString(com.tencent.mm.R.string.f491679m03) : getContext().getString(com.tencent.mm.R.string.f491680m05);
        kotlin.jvm.internal.o.d(string);
        android.widget.TextView textView = this.f116050d;
        if (textView != null) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.f491677m01, getContext().getString(com.tencent.mm.R.string.f491678m02), string));
        } else {
            kotlin.jvm.internal.o.o("contentTxt");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveModeItemView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.padding1_5A = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.b7(this));
        this.paddingA = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.c7(this));
        a(context);
    }
}
