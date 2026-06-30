package ry4;

/* loaded from: classes.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.util.List list, ry4.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401585d = list;
        this.f401586e = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ry4.b1(this.f401585d, this.f401586e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ry4.b1 b1Var = (ry4.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem> list = this.f401585d;
        ry4.d1 d1Var = this.f401586e;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            r45.u26 u26Var = new r45.u26();
            u26Var.set(0, d1Var.f401608d);
            for (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem : list) {
                java.util.LinkedList list2 = u26Var.getList(1);
                r45.l56 l56Var = new r45.l56();
                l56Var.set(0, java.lang.Integer.valueOf(shortcutCommandItem.f188079d));
                l56Var.set(1, shortcutCommandItem.f188080e);
                l56Var.set(2, shortcutCommandItem.f188081f);
                list2.add(l56Var);
            }
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.a(24, 7, u26Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandListUIC", "syncToServer: fired %d items for username:%s", new java.lang.Integer(list.size()), d1Var.f401608d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandListUIC", e17, "syncToServer failed", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
