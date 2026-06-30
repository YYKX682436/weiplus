package te2;

/* loaded from: classes8.dex */
public final class t4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418434c;

    public t4(java.lang.String str, te2.p8 p8Var, java.lang.String str2) {
        this.f418432a = str;
        this.f418433b = p8Var;
        this.f418434c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f418432a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            g45.b.f268846a.a(str2 == null ? "" : str2, str, 0);
            tg3.a1 a17 = tg3.t1.a();
            te2.p8 p8Var = this.f418433b;
            ((dk5.s5) a17).Zi(p8Var.getActivity(), this.f418432a, this.f418434c, 0, "", "", null, new com.tencent.mm.modelscan.ScanCodeInfo(p8Var.B1, 1));
            com.tencent.mm.ui.widget.snackbar.j.c("已发送", null, p8Var.getActivity(), null, null);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
        }
    }
}
