package gf2;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f271279d;

    public f(java.lang.String str, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, java.lang.String str2, yz5.p pVar) {
        this.f271276a = str;
        this.f271277b = anchorMilestoneShareView;
        this.f271278c = str2;
        this.f271279d = pVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f271276a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            g45.b.f268846a.a(str2 == null ? "" : str2, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f271277b.getContext(), this.f271276a, this.f271278c, 0, "", "", null);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
            if (str2 != null) {
                this.f271279d.invoke(0, kz5.c0.d(str2));
            }
        }
    }
}
