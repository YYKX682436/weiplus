package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ph extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f113884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f113885g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f113886h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.qh f113887i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(java.lang.String str, long j17, com.tencent.mm.protobuf.g gVar, long j18, com.tencent.mm.plugin.finder.live.plugin.qh qhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113883e = str;
        this.f113884f = j17;
        this.f113885g = gVar;
        this.f113886h = j18;
        this.f113887i = qhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ph(this.f113883e, this.f113884f, this.f113885g, this.f113886h, this.f113887i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ph) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.zr1 zr1Var;
        r45.m70 m70Var;
        r45.l70 l70Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113882d;
        java.lang.String str = this.f113883e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.yr1 yr1Var = new r45.yr1();
                long j17 = this.f113884f;
                com.tencent.mm.protobuf.g gVar = this.f113885g;
                long j18 = this.f113886h;
                yr1Var.set(1, db2.t4.f228171a.a(10635));
                yr1Var.set(2, str);
                yr1Var.set(3, java.lang.Long.valueOf(j17));
                yr1Var.set(5, gVar);
                yr1Var.set(4, java.lang.Long.valueOf(j18));
                yr1Var.set(7, 2);
                com.tencent.mm.modelbase.i d17 = yr1Var.d();
                this.f113882d = 1;
                obj = rm0.h.a(d17, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            zr1Var = (r45.zr1) obj;
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket FinderLiveGetConcertTicketInfoRequest fail. " + e17);
            zr1Var = null;
        }
        if (zr1Var != null && (m70Var = (r45.m70) zr1Var.getCustom(1)) != null) {
            if (!m70Var.getBoolean(6)) {
                m70Var = null;
            }
            if (m70Var != null) {
                java.util.LinkedList list = m70Var.getList(22);
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.l70) obj2).getString(0), m70Var.getString(21))) {
                            break;
                        }
                    }
                    l70Var = (r45.l70) obj2;
                } else {
                    l70Var = null;
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(1, str);
                com.tencent.mm.plugin.finder.live.plugin.qh qhVar = this.f113887i;
                qhVar.K0(0);
                qhVar.f114010q.setText(l70Var != null ? l70Var.getString(1) : null);
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(l70Var != null ? l70Var.getString(4) : null, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
                android.widget.ImageView imageView = qhVar.f114011r;
                b17.c(imageView);
                imageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.oh(str, qhVar, m70Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
