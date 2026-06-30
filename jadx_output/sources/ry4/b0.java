package ry4;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f401583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ry4.c0 c0Var, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401582e = c0Var;
        this.f401583f = shortcutCommandItem;
        this.f401584g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ry4.b0(this.f401582e, this.f401583f, this.f401584g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401581d;
        java.lang.String str = this.f401584g;
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = this.f401583f;
        boolean z17 = false;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.l56 l56Var = new r45.l56();
                l56Var.set(0, java.lang.Integer.valueOf(shortcutCommandItem.f188079d));
                l56Var.set(1, shortcutCommandItem.f188080e);
                l56Var.set(2, shortcutCommandItem.f188081f);
                r45.vo4 vo4Var = new r45.vo4();
                vo4Var.set(0, str);
                vo4Var.set(1, l56Var);
                xg3.a aVar2 = new xg3.a(24, 8, vo4Var);
                ry4.c0 c0Var = this.f401582e;
                this.f401581d = 1;
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
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = booleanValue ? ya.b.SUCCESS : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED;
            objArr[1] = new java.lang.Integer(shortcutCommandItem.f188079d);
            objArr[2] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandEditUIC", "syncModShortcutCommand: %s id:%d for username:%s", objArr);
            z17 = booleanValue;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandEditUIC", e17, "syncModShortcutCommand failed", new java.lang.Object[0]);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
