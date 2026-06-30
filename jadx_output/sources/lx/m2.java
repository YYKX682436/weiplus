package lx;

/* loaded from: classes11.dex */
public final class m2 implements com.tencent.mm.storage.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.n2 f321865a;

    public m2(lx.n2 n2Var) {
        this.f321865a = n2Var;
    }

    @Override // com.tencent.mm.storage.z1
    public final void a(java.lang.Object obj, com.tencent.mm.storage.x1 x1Var) {
        com.tencent.mm.storage.s1 info;
        lx.n2 n2Var;
        com.tencent.pigeon.biz.NotifyMsgCallbackApi notifyMsgCallbackApi;
        if (x1Var != null) {
            com.tencent.mm.storage.y1 y1Var = x1Var.f196321a;
            if ((y1Var != com.tencent.mm.storage.y1.INSERT && y1Var != com.tencent.mm.storage.y1.MERGE_UPDATE) || (info = x1Var.f196322b) == null || (notifyMsgCallbackApi = (n2Var = this.f321865a).f321878f) == null) {
                return;
            }
            kotlin.jvm.internal.o.f(info, "info");
            notifyMsgCallbackApi.onNewMsg(n2Var.a(info), n2Var.f321876d, lx.l2.f321846d);
        }
    }
}
