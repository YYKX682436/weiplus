package te2;

/* loaded from: classes8.dex */
public final class ka implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418177c;

    public ka(java.lang.String str, te2.hc hcVar, java.lang.String str2) {
        this.f418175a = str;
        this.f418176b = hcVar;
        this.f418177c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f418175a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            g45.b.f268846a.a(str2 == null ? "" : str2, str, 0);
            tg3.a1 a17 = tg3.t1.a();
            te2.hc hcVar = this.f418176b;
            ((dk5.s5) a17).Zi(hcVar.getActivity(), this.f418175a, this.f418177c, 0, "", "", null, new com.tencent.mm.modelscan.ScanCodeInfo(hcVar.F, 1));
            com.tencent.mm.ui.widget.snackbar.j.c("已发送", null, hcVar.getActivity(), null, null);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
        }
    }
}
