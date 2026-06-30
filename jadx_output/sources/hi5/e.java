package hi5;

/* loaded from: classes8.dex */
public final class e extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmec.NewCardPackageTipPreference f281563a;

    public e(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference) {
        this.f281563a = newCardPackageTipPreference;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(c00.x3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c00.x3.m8((c00.x3) c17, bw5.n9.EXPOSE_WITHOUT_REDDOT, null, 2, null);
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Card.Entrance.Right") != null) {
                i95.m c18 = i95.n0.c(c00.x3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c00.x3.m8((c00.x3) c18, bw5.n9.EXPOSE_WITH_REDDOT, null, 2, null);
            }
            this.f281563a.i1(1);
        }
    }
}
