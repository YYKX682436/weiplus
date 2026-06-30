package kp4;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView f311122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311122e = editFrameListView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kp4.l lVar = new kp4.l(this.f311122e, continuation);
        lVar.f311121d = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kp4.l lVar = (kp4.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f311121d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", y0Var.hashCode() + " setTrackInfo launch");
        com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = this.f311122e;
        kp4.c1 c1Var = editFrameListView.f175982e;
        if (c1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", y0Var.hashCode() + " setTrackInfo init thumb fetcher");
            rm5.k kVar = editFrameListView.f175996v;
            if (kVar != null) {
                kVar.destroy();
            }
            rm5.h a17 = rm5.h.f397489h.a(c1Var.f311097n.f175627l);
            editFrameListView.f175996v = a17;
            a17.setSize(c1Var.f311071a, c1Var.f311072b);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(y0Var.hashCode());
            sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
            java.util.LinkedList linkedList = c1Var.f311077g;
            sb6.append(linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", sb6.toString());
            rm5.k kVar2 = editFrameListView.f175996v;
            if (kVar2 != null) {
                kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new kp4.j(editFrameListView));
            }
            rm5.k kVar3 = editFrameListView.f175996v;
            if (kVar3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((kp4.m) it.next()).f311124a));
                }
                kVar3.a(arrayList, new kp4.k(editFrameListView, c1Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
