package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView;", "Landroid/widget/LinearLayout;", "", "d", "Z", "getIntecerptKeyBoardEvent", "()Z", "setIntecerptKeyBoardEvent", "(Z)V", "intecerptKeyBoardEvent", "", "e", "I", "getFromScene", "()I", "setFromScene", "(I)V", "fromScene", "isAssistant", "setAssistant", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveDescEditView extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f117603p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean intecerptKeyBoardEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int fromScene;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f117606f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f117607g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.q f117608h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f117609i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117610m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117611n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f117612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117608h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.tencent.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f117610m = "";
        this.f117611n = "";
        this.f117612o = "";
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f117608h.f262250d.getWindowToken(), 0);
        setVisibility(8);
    }

    public final void b() {
        fg2.q qVar = this.f117608h;
        com.tencent.mm.ui.widget.MMEditText mMEditText = qVar.f262252f;
        mMEditText.setFocusable(true);
        mMEditText.setFocusableInTouchMode(true);
        mMEditText.setCursorVisible(true);
        mMEditText.setRawInputType(1);
        com.tencent.mm.ui.bk.r0(mMEditText.getPaint(), 0.8f);
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.kd(this, mMEditText));
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = qVar.f262250d;
        mMEditText2.setFocusable(true);
        mMEditText2.setFocusableInTouchMode(true);
        mMEditText2.setCursorVisible(true);
        mMEditText2.setRawInputType(1);
        com.tencent.mm.ui.bk.r0(mMEditText2.getPaint(), 0.8f);
        mMEditText2.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.ld(this, mMEditText2));
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, boolean z18, yz5.l lVar, yz5.a aVar, boolean z19, java.lang.String str3) {
        java.lang.String str4;
        this.f117609i = z17;
        this.f117610m = str3 == null ? "" : str3;
        this.f117606f = lVar;
        this.f117607g = aVar;
        fg2.q qVar = this.f117608h;
        qVar.f262249c.setText(getContext().getResources().getString(z17 ? com.tencent.mm.R.string.npa : com.tencent.mm.R.string.dcc));
        qVar.f262248b.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.md(this));
        qVar.f262253g.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.nd(this));
        if (z17) {
            qVar.f262252f.setVisibility(0);
            android.view.View view = qVar.f262251e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f262252f.requestFocus();
            qVar.f262252f.setHint(zl2.q4.f473933a.n());
            qVar.f262250d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        } else {
            qVar.f262252f.setVisibility(8);
            android.view.View view2 = qVar.f262251e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f262250d.requestFocus();
            qVar.f262250d.setSingleLine();
            qVar.f262250d.setHint(zl2.q4.f473933a.n());
        }
        if (z17) {
            if (str != null) {
                java.lang.String str5 = str.length() > 0 ? str : null;
                if (str5 != null) {
                    qVar.f262252f.setText(str5);
                    qVar.f262252f.setSelection(str5.length());
                }
            }
            if (str2 != null) {
                str4 = str2.length() > 0 ? str2 : null;
                if (str4 != null) {
                    qVar.f262250d.setText(str4);
                }
            }
            this.f117611n = str == null ? "" : str;
            this.f117612o = str2 != null ? str2 : "";
        } else {
            if (str != null) {
                str4 = str.length() > 0 ? str : null;
                if (str4 != null) {
                    qVar.f262250d.setText(str4);
                    qVar.f262250d.setSelection(str4.length());
                }
            }
            this.f117612o = str != null ? str : "";
        }
        setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f117609i ? qVar.f262252f : qVar.f262250d;
        kotlin.jvm.internal.o.d(mMEditText);
        com.tencent.mm.plugin.finder.live.widget.pd pdVar = new com.tencent.mm.plugin.finder.live.widget.pd(this, mMEditText);
        if (z19) {
            mMEditText.postDelayed(new com.tencent.mm.plugin.finder.live.widget.od(pdVar), 300L);
        } else {
            pdVar.invoke();
        }
    }

    public final int getFromScene() {
        return this.fromScene;
    }

    public final boolean getIntecerptKeyBoardEvent() {
        return this.intecerptKeyBoardEvent;
    }

    public final void setAssistant(boolean z17) {
    }

    public final void setFromScene(int i17) {
        this.fromScene = i17;
    }

    public final void setIntecerptKeyBoardEvent(boolean z17) {
        this.intecerptKeyBoardEvent = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117608h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.tencent.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f117610m = "";
        this.f117611n = "";
        this.f117612o = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117608h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.tencent.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f117610m = "";
        this.f117611n = "";
        this.f117612o = "";
    }
}
