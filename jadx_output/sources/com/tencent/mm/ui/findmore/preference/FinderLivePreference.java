package com.tencent.mm.ui.findmore.preference;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/findmore/preference/FinderLivePreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLivePreference extends com.tencent.mm.ui.FinderIconViewTipPreference {

    /* renamed from: m3, reason: collision with root package name */
    public final java.lang.String f208593m3;

    /* renamed from: n3, reason: collision with root package name */
    public boolean f208594n3;

    public FinderLivePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f208593m3 = "FinderLivePreference";
        g1();
    }

    public final void g1() {
        ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).getClass();
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3839p0).getValue()).r()).intValue() == 1;
        this.f208594n3 = z17;
        java.lang.String str = this.f208593m3;
        if (z17) {
            android.content.Context context = this.f197770d;
            jz5.f0 f0Var = null;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            if (mMFragmentActivity != null) {
                c61.t8 t8Var = (c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class));
                t8Var.Ri(mMFragmentActivity, t8Var.bj(new sg5.a(this)));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(str, "init but getContext=" + context);
            }
        }
        com.tencent.mars.xlog.Log.i(str, "mRenderAttachCtrlInfo=" + this.f208594n3);
    }

    public FinderLivePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f208593m3 = "FinderLivePreference";
        g1();
    }

    public FinderLivePreference(android.content.Context context) {
        super(context, null);
        this.f208593m3 = "FinderLivePreference";
        g1();
    }
}
