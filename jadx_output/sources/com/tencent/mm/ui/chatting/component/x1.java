package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class x1 extends o65.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f200195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f200196d;

    public x1(com.tencent.mm.ui.chatting.component.q2 q2Var, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f200196d = q2Var;
        this.f200195c = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        com.tencent.mm.storage.f9 f9Var;
        o65.e eVar = (o65.e) bVar;
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f200196d;
        if (!com.tencent.mm.sdk.platformtools.t8.U0(q2Var.f198580d.g()) || q2Var.v0(q2Var.f198580d.g(), i17, i18, str) || (f9Var = eVar.f343221a) == null) {
            return;
        }
        f9Var.l1(f9Var.F | 128);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).nb(f9Var.I0(), f9Var);
        dp.a.makeText(q2Var.f198580d.g(), q2Var.f198580d.s().getString(com.tencent.mm.R.string.f492328g25), 0).show();
        if (this.f200195c.f192245a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 24L, eVar.f343222b, true);
        }
    }
}
