package nj5;

/* loaded from: classes11.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.pref.MoreTabFinderPreference f337939a;

    public b(com.tencent.mm.ui.pref.MoreTabFinderPreference moreTabFinderPreference) {
        this.f337939a = moreTabFinderPreference;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MoreTabFinderPreference", "onViewExposed: isExposed:" + z17);
        if (z17) {
            com.tencent.mm.ui.pref.MoreTabFinderPreference moreTabFinderPreference = this.f337939a;
            moreTabFinderPreference.l0(view, "view_exp");
            if (moreTabFinderPreference.f209522d2) {
                rv.l3 Ai = ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ai();
                com.tencent.mm.autogen.mmdata.rpt.EntryMeWorkExposeClickStruct entryMeWorkExposeClickStruct = new com.tencent.mm.autogen.mmdata.rpt.EntryMeWorkExposeClickStruct();
                entryMeWorkExposeClickStruct.f56104d = 0L;
                entryMeWorkExposeClickStruct.f56105e = Ai.f399873a ? 1L : 0L;
                entryMeWorkExposeClickStruct.f56107g = Ai.f399874b;
                entryMeWorkExposeClickStruct.f56108h = entryMeWorkExposeClickStruct.b("RedDotContent", Ai.f399875c, true);
                entryMeWorkExposeClickStruct.f56109i = entryMeWorkExposeClickStruct.b("RedDotId", Ai.f399876d, true);
                entryMeWorkExposeClickStruct.f56110j = Ai.f399877e ? 1L : 0L;
                entryMeWorkExposeClickStruct.f56111k = Ai.f399878f;
                entryMeWorkExposeClickStruct.k();
            }
        }
    }
}
