package com.tencent.mm.plugin.finder.live.plugin.view.gift;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveLevelProgressView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f114763d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f114764e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f114765f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f114766g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f114767h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f114768i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f114769m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f114770n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f114771o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f114772p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLevelProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f114763d = "FinderLiveLevelProgressView";
        b(context);
    }

    public final void a(android.widget.TextView textView) {
        java.util.LinkedList linkedList;
        java.lang.String string;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        jz5.f0 f0Var = null;
        if (c1Var != null && (linkedList = c1Var.f328812h) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.yl1 yl1Var = (r45.yl1) next;
                if (yl1Var.getInteger(0) == 8 || yl1Var.getInteger(0) == 10) {
                    arrayList.add(next);
                }
            }
            r45.yl1 yl1Var2 = (r45.yl1) kz5.n0.k0(arrayList);
            if (yl1Var2 != null) {
                textView.setVisibility(0);
                int integer = yl1Var2.getInteger(0);
                if (integer == 8) {
                    android.content.Context context = this.f114764e;
                    if (context == null) {
                        kotlin.jvm.internal.o.o("mContext");
                        throw null;
                    }
                    string = context.getString(com.tencent.mm.R.string.f491821ec0);
                } else if (integer != 10) {
                    textView.setVisibility(8);
                    string = "";
                } else {
                    android.content.Context context2 = this.f114764e;
                    if (context2 == null) {
                        kotlin.jvm.internal.o.o("mContext");
                        throw null;
                    }
                    string = context2.getString(com.tencent.mm.R.string.f491822ec1);
                }
                kotlin.jvm.internal.o.d(string);
                textView.setText(string);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            textView.setVisibility(8);
        }
    }

    public final void b(android.content.Context context) {
        this.f114764e = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.arn, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f114765f = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f0x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f114766g = findViewById;
        android.view.View view = this.f114765f;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484662f31);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f114767h = (android.widget.ProgressBar) findViewById2;
        android.view.View view2 = this.f114765f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.f484664f33);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f114768i = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f114765f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.f0y);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f114769m = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f114765f;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.f3f);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f114770n = (android.widget.TextView) findViewById5;
        android.view.View view5 = this.f114765f;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById6 = view5.findViewById(com.tencent.mm.R.id.f484668f40);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f114771o = (android.widget.TextView) findViewById6;
        android.view.View view6 = this.f114765f;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById7 = view6.findViewById(com.tencent.mm.R.id.f0z);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f114772p = findViewById7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLevelProgressView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f114763d = "FinderLiveLevelProgressView";
        b(context);
    }
}
