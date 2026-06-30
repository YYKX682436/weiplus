package cw1;

/* loaded from: classes12.dex */
public final class g2 implements android.widget.ExpandableListView.OnGroupExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f222946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f222947b;

    public g2(cw1.o0 o0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f222946a = o0Var;
        this.f222947b = cleanCacheUI;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i17) {
        java.lang.Object obj = this.f222946a.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        if (((java.lang.Number) obj).intValue() == 3) {
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI = this.f222947b;
            long j17 = cleanCacheUI.f95695m;
            if (j17 >= 0) {
                mt1.b0.s(12, j17, java.lang.Long.valueOf(cleanCacheUI.f95697o), java.lang.Long.valueOf(cleanCacheUI.f95696n));
                cleanCacheUI.f95695m = -2L;
            }
        }
    }
}
