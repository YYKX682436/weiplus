package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tp extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.g f114467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.b82 f114468h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.dq dqVar, ce2.i iVar, dk2.g gVar, r45.b82 b82Var) {
        super(3);
        this.f114464d = str;
        this.f114465e = dqVar;
        this.f114466f = iVar;
        this.f114467g = gVar;
        this.f114468h = b82Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.tencent.mm.protobuf.g gVar;
        kz5.p0 p0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str3 = (java.lang.String) obj2;
        java.lang.String str4 = (java.lang.String) obj3;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "doPostGift, giftId:" + this.f114464d + ", cnt:" + intValue + ", pkgBatchId:" + str3 + ", pkgDurationId:" + str4);
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f114465e;
        int i18 = !dqVar.A ? 0 : 8;
        dk2.xf W0 = dqVar.W0();
        if (W0 != null) {
            android.content.Context context = this.f114465e.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long j17 = ((mm2.e1) this.f114465e.P0(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) this.f114465e.P0(mm2.e1.class)).f328983m;
            java.lang.String str5 = this.f114464d;
            int P0 = (int) this.f114466f.P0();
            dk2.g gVar2 = this.f114467g;
            java.lang.String str6 = this.f114465e.R;
            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(this.f114468h.toByteArray());
            com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var = this.f114465e.f112332x0;
            if (mo0Var != null) {
                str = str3;
                gVar = b17;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                synchronized (mo0Var) {
                    i17 = i18;
                    str2 = str6;
                    com.tencent.mars.xlog.Log.i(mo0Var.f113547b, "onBatch prepareSuccList:" + mo0Var.f113549d.size() + ", rawList:" + mo0Var.f113548c.size() + ", prepareJobList:" + mo0Var.f113550e);
                    arrayList.addAll(mo0Var.f113549d);
                    arrayList.addAll(mo0Var.f113548c);
                    mo0Var.f113549d.clear();
                    mo0Var.f113548c.clear();
                    java.util.Iterator it = mo0Var.f113550e.iterator();
                    while (it.hasNext()) {
                        java.util.Iterator it6 = it;
                        kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) it.next(), null, 1, null);
                        it = it6;
                    }
                }
                p0Var = arrayList;
            } else {
                str = str3;
                str2 = str6;
                i17 = i18;
                gVar = b17;
                p0Var = kz5.p0.f313996d;
            }
            ((dk2.r4) W0).H(context, j17, j18, str5, intValue, P0, gVar2, str2, i17, gVar, p0Var, str, str4, ((mm2.e1) this.f114465e.P0(mm2.e1.class)).f328993w, ((mm2.e1) this.f114465e.P0(mm2.e1.class)).f328985o, this.f114465e.P);
        }
        return jz5.f0.f302826a;
    }
}
