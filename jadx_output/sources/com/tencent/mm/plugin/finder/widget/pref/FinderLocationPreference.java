package com.tencent.mm.plugin.finder.widget.pref;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderLocationPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLocationPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public boolean M;
    public boolean N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;

    public FinderLocationPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = "";
        this.Q = "";
        this.R = "";
        this.G = com.tencent.mm.R.layout.byv;
    }

    public final void M() {
        if (!kotlin.jvm.internal.o.b(this.P, "unshow")) {
            if (!(this.P.length() == 0)) {
                java.lang.String l17 = com.tencent.mm.storage.ha.k().l(this.P);
                java.lang.String m17 = com.tencent.mm.storage.ha.k().m(this.P, this.Q);
                java.lang.String f17 = com.tencent.mm.storage.ha.k().f(this.P, this.Q, this.R);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                    L(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(m17) + ' ' + f17);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(m17)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                        return;
                    }
                    L(l17);
                    return;
                } else {
                    L(l17 + ' ' + m17);
                    return;
                }
            }
        }
        L(this.f197770d.getString(com.tencent.mm.R.string.f4f));
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.t(view);
        E(8);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.nh8);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById).setVisibility(this.M ? 0 : 8);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.in7);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2).setVisibility(this.N ? 0 : 8);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View u17 = super.u(parent);
        android.view.View findViewById = u17.findViewById(com.tencent.mm.R.id.cgi);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        viewGroup.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.b28, viewGroup);
        this.L = u17;
        return u17;
    }

    public FinderLocationPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = "";
        this.Q = "";
        this.R = "";
    }

    public FinderLocationPreference(android.content.Context context) {
        super(context);
        this.P = "";
        this.Q = "";
        this.R = "";
    }
}
