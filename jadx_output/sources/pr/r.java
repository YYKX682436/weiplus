package pr;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.t f357773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f357774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pr.t tVar, com.tencent.mm.storage.u3 u3Var) {
        super(2);
        this.f357773d = tVar;
        this.f357774e = u3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.storage.n5.f().c().C1(0);
        pr.t tVar = this.f357773d;
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSyncFetchList", "EmojiSyncMd5List downloadList " + arrayList.size());
        int size = arrayList.size();
        int i17 = tVar.f357781a;
        if (size > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSyncFetchList", "try to sync emoji downloadList:%d", java.lang.Integer.valueOf(arrayList.size()));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(11595, 2, java.lang.Integer.valueOf(i17));
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                g0Var.d(11595, 3, java.lang.Integer.valueOf(i17));
            }
        } else {
            gm0.j1.u().c().x(this.f357774e, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSyncFetchList", "no things need to download.");
        }
        if (i17 == 1) {
            gr.t.g().m(true);
            pr.k0.f357723q.a(false).b(true);
        } else {
            gr.t.g().n(true);
            gr.t.g().l(true);
            pr.k0.f357723q.b(false).b(true);
        }
        gr.v.f274696a.a(true);
        new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        if (tVar.f357782b != null) {
            com.tencent.mm.storage.z4.f196391j.g();
        }
        return jz5.f0.f302826a;
    }
}
