package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class b6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        super(0);
        this.f203456d = dVar;
        this.f203457e = f9Var;
        this.f203458f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "get card height");
        yb5.d dVar = this.f203456d;
        if (dVar != null && (f9Var = this.f203457e) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "enable scrollToLastProtect");
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f203458f);
            if (q57 != null && q57.getMsgId() == f9Var.getMsgId()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "is last item, scrollToLastProtect");
                dVar.M(true, true, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
