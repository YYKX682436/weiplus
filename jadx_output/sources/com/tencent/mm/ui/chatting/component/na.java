package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class na extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f199582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.util.List list, com.tencent.mm.ui.chatting.component.ta taVar) {
        super(0);
        this.f199582d = list;
        this.f199583e = taVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        for (com.tencent.mm.storage.f9 f9Var : this.f199582d) {
            xq.q qVar = this.f199583e.f199978m;
            kotlin.jvm.internal.o.d(f9Var);
            qVar.getClass();
            xq.n nVar = qVar.f456011c;
            java.util.Iterator it = nVar.f456007a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((xq.m) obj).f455991c == f9Var.getMsgId()) {
                    break;
                }
            }
            xq.m mVar = (xq.m) obj;
            if (mVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "stop: ");
                mVar.b();
                nVar.f456007a.remove(mVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
