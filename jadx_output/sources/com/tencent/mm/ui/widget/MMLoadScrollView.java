package com.tencent.mm.ui.widget;

/* loaded from: classes12.dex */
public class MMLoadScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public al5.r1 f211325d;

    public MMLoadScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        al5.r1 r1Var;
        if (z18 && i18 > 0 && (r1Var = this.f211325d) != null) {
            ((com.tencent.mm.plugin.fav.ui.detail.a) r1Var).f100681a.f100600g.f343492q = true;
        }
        super.onOverScrolled(i17, i18, z17, z18);
    }

    public void setOnTopOrBottomListerner(al5.r1 r1Var) {
        this.f211325d = r1Var;
    }

    public MMLoadScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
