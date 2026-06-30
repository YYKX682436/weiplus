package nj5;

/* loaded from: classes8.dex */
public final class a extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.pref.MoreTabFinderPreference f337938a;

    public a(com.tencent.mm.ui.pref.MoreTabFinderPreference moreTabFinderPreference) {
        this.f337938a = moreTabFinderPreference;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            this.f337938a.getClass();
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            r45.f03 I0 = nk6.I0("FinderMyTab");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderMyTab");
            if (I0 == null || L0 == null) {
                return;
            }
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            com.tencent.mm.plugin.finder.extension.reddot.a3[] a3VarArr = com.tencent.mm.plugin.finder.extension.reddot.a3.f105338d;
            ((c61.w8) paVar).Ri("12", L0, I0, 1, "", 0, 0, 0);
        }
    }
}
