package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class es extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.uc5 f118279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.uc5 uc5Var) {
        super(0);
        this.f118278d = etVar;
        this.f118279e = uc5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f118278d;
        java.util.LinkedList linkedList = etVar.K;
        if (linkedList != null) {
            r45.uc5 uc5Var = this.f118279e;
            int indexOf = linkedList.indexOf(uc5Var);
            if ((indexOf >= 0 && indexOf < linkedList.size()) && linkedList.remove(uc5Var)) {
                ((com.tencent.mm.plugin.finder.live.widget.vs) ((jz5.n) etVar.U).getValue()).notifyItemRemoved(indexOf);
                etVar.k0();
            }
        }
        return jz5.f0.f302826a;
    }
}
