package yo4;

/* loaded from: classes10.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f464203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, long j17) {
        super(0);
        this.f464202d = multiVideoPluginLayout;
        this.f464203e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464202d;
        long j17 = multiVideoPluginLayout.B1 ? 1L : 4L;
        uo4.i iVar = new uo4.i();
        java.util.ArrayList E = multiVideoPluginLayout.f175875r.E();
        com.tencent.mm.plugin.vlog.model.h1 h1Var = multiVideoPluginLayout.G.f175743t;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = iVar.f429709a;
        multiMediaEditResultStruct.f59323d = multiMediaEditResultStruct.b("EditId", multiVideoPluginLayout.D1, true);
        iVar.f429709a.f59333n = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(multiVideoPluginLayout.getContext());
        iVar.f429709a.f59330k = j17;
        iVar.c(E);
        iVar.b(h1Var);
        iVar.f429709a.f59328i = multiVideoPluginLayout.f175879v.f464287r == null ? 0L : 1L;
        jp4.a aVar = multiVideoPluginLayout.getMultiPreviewPlugin().f23218q;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct2 = iVar.f429709a;
        multiMediaEditResultStruct2.f59334o = multiMediaEditResultStruct2.b("SeekTimeStr", kz5.n0.g0(aVar.f301032a, "#", null, null, 0, null, null, 62, null), true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct3 = iVar.f429709a;
        multiMediaEditResultStruct3.f59335p = multiMediaEditResultStruct3.b("UpdateCompositionTimeStr", kz5.n0.g0(aVar.f301033b, "#", null, null, 0, null, null, 62, null), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(iVar.f429709a.f59334o)) {
            java.util.Iterator it = h1Var.f175597c.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
                if (i1Var.f175617b == 2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(dq4.c.f242369a.b(i1Var.f175616a));
                    sb7.append('#');
                    sb6.append(sb7.toString());
                }
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct4 = iVar.f429709a;
        multiMediaEditResultStruct4.f59336q = multiMediaEditResultStruct4.b("VideoGOPStr", sb6.toString(), true);
        iVar.f429709a.f59329j = this.f464203e;
        iVar.a();
        return jz5.f0.f302826a;
    }
}
