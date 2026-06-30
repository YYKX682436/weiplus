package ry4;

/* loaded from: classes.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f401576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ry4.c0 c0Var, java.lang.String str, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401574e = c0Var;
        this.f401575f = str;
        this.f401576g = shortcutCommandItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ry4.a0(this.f401574e, this.f401575f, this.f401576g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401573d;
        java.lang.String str = this.f401575f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.l56 l56Var = new r45.l56();
                com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = this.f401576g;
                l56Var.set(1, shortcutCommandItem.f188080e);
                l56Var.set(2, shortcutCommandItem.f188081f);
                r45.x4 x4Var = new r45.x4();
                x4Var.set(0, str);
                x4Var.set(1, l56Var);
                xg3.a aVar2 = new xg3.a(24, 6, x4Var);
                ry4.c0 c0Var = this.f401574e;
                this.f401573d = 1;
                obj = ry4.c0.T6(c0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                return new java.lang.Integer((int) (java.lang.System.currentTimeMillis() & 2147483647L));
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ShortcutCommandEditUIC", "[-] syncAddShortcutCommand: failed for username:%s", str);
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandEditUIC", e17, "syncAddShortcutCommand failed", new java.lang.Object[0]);
            return null;
        }
    }
}
