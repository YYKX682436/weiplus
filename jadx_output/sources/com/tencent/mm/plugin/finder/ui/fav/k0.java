package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class k0 extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f129183k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f129184l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String title) {
        super("");
        kotlin.jvm.internal.o.g(title, "title");
        this.f129183k = title;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.f489031b33;
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        if (viewGroup != null) {
            java.lang.String str = this.f129183k;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f129184l = (android.widget.TextView) findViewById;
            if (str.length() == 0) {
                android.widget.TextView textView = this.f129184l;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
            }
            android.widget.TextView textView2 = this.f129184l;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView2.setText(str);
            android.widget.TextView textView3 = this.f129184l;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView3.setVisibility(0);
            android.widget.TextView textView4 = this.f129184l;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView4.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView5 = this.f129184l;
            if (textView5 != null) {
                com.tencent.mm.ui.fk.c(textView5);
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            android.widget.TextView textView = this.f129184l;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
            android.widget.TextView textView2 = this.f129184l;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.a(textView2);
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f129184l;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
        android.widget.TextView textView4 = this.f129184l;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.c(textView4);
        } else {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
    }
}
