package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dv3 f140314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.h f140315e;

    public g(com.tencent.mm.plugin.game.model.h hVar, r45.dv3 dv3Var) {
        this.f140315e = hVar;
        this.f140314d = dv3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f140315e.f140322d;
        java.lang.String str2 = com.tencent.mm.plugin.game.model.l.f140355a;
        r45.dv3 dv3Var = this.f140314d;
        if (dv3Var == null) {
            return;
        }
        java.util.LinkedList linkedList = dv3Var.f372770d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "menu list is null. appid:%s", str);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(linkedList);
        com.tencent.mm.plugin.game.model.l.a(arrayList, new com.tencent.mm.plugin.game.model.i(str, dv3Var));
    }
}
