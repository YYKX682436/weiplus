package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151916d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f151917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.FrameListView2 f151918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151918f = frameListView2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.mv.ui.view.p pVar = new com.tencent.mm.plugin.mv.ui.view.p(this.f151918f, continuation);
        pVar.f151917e = obj;
        return pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.view.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151916d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f151917e;
            com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = this.f151918f;
            com.tencent.mars.xlog.Log.i(frameListView2.f151597d, y0Var.hashCode() + " setTrackInfo launch");
            kp4.a aVar2 = frameListView2.f151599f;
            if (aVar2 != null) {
                com.tencent.mars.xlog.Log.i(frameListView2.f151597d, y0Var.hashCode() + " setTrackInfo init thumb fetcher");
                rm5.k kVar = frameListView2.f151610t;
                if (kVar != null) {
                    kVar.destroy();
                }
                rm5.k a17 = frameListView2.f151611u.a(aVar2, frameListView2.f151612v);
                frameListView2.f151610t = a17;
                if (a17 != null) {
                    a17.setSize(aVar2.f311071a, aVar2.f311072b);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(y0Var.hashCode());
                sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
                java.util.LinkedList linkedList = aVar2.f311077g;
                sb6.append(linkedList.size());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = frameListView2.f151597d;
                com.tencent.mars.xlog.Log.i(str, sb7);
                rm5.k kVar2 = frameListView2.f151610t;
                if (kVar2 != null) {
                    kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new com.tencent.mm.plugin.mv.ui.view.m(frameListView2));
                }
                rm5.k kVar3 = frameListView2.f151610t;
                if (kVar3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new java.lang.Long(((kp4.m) it.next()).f311124a));
                    }
                    kVar3.a(arrayList, new com.tencent.mm.plugin.mv.ui.view.n(frameListView2, aVar2));
                }
                com.tencent.mars.xlog.Log.i(str, y0Var.hashCode() + " setTrackInfo request layout");
                if (!frameListView2.isInLayout() || aVar2.f311078h) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    com.tencent.mm.plugin.mv.ui.view.o oVar = new com.tencent.mm.plugin.mv.ui.view.o(frameListView2, null);
                    this.f151916d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, oVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
