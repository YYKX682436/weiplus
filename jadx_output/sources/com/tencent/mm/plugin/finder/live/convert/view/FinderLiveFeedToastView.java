package com.tencent.mm.plugin.finder.live.convert.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView;", "Landroid/widget/FrameLayout;", "", "str", "Ljz5/f0;", "setTitle", "setDesc", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDescClickListener", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTitleTxtView", "()Landroid/widget/TextView;", "setTitleTxtView", "(Landroid/widget/TextView;)V", "titleTxtView", "e", "getDescTxtView", "setDescTxtView", "descTxtView", "Landroid/view/View;", "f", "Landroid/view/View;", "getDescRoot", "()Landroid/view/View;", "setDescRoot", "(Landroid/view/View;)V", "descRoot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveFeedToastView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView titleTxtView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView descTxtView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View descRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedToastView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488889dh1, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qcn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setTitleTxtView((android.widget.TextView) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484835q44);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setDescTxtView((android.widget.TextView) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qcl);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setDescRoot(findViewById3);
    }

    public final android.view.View getDescRoot() {
        android.view.View view = this.descRoot;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("descRoot");
        throw null;
    }

    public final android.widget.TextView getDescTxtView() {
        android.widget.TextView textView = this.descTxtView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("descTxtView");
        throw null;
    }

    public final android.widget.TextView getTitleTxtView() {
        android.widget.TextView textView = this.titleTxtView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("titleTxtView");
        throw null;
    }

    public final void setDesc(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        getDescTxtView().setText(str);
        android.view.View descRoot = getDescRoot();
        int i17 = str.length() > 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(descRoot, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView", "setDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        descRoot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(descRoot, "com/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView", "setDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setDescClickListener(android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        getDescRoot().setOnClickListener(listener);
    }

    public final void setDescRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.descRoot = view;
    }

    public final void setDescTxtView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.descTxtView = textView;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        getTitleTxtView().setText(str);
    }

    public final void setTitleTxtView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.titleTxtView = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedToastView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedToastView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }
}
