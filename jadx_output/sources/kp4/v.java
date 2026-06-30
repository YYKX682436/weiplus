package kp4;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311149d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.FrameListView f311151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.vlog.ui.thumb.FrameListView frameListView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311151f = frameListView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kp4.v vVar = new kp4.v(this.f311151f, continuation);
        vVar.f311150e = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f311149d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f311150e;
            com.tencent.mm.plugin.vlog.ui.thumb.FrameListView frameListView = this.f311151f;
            com.tencent.mars.xlog.Log.i(frameListView.f176001d, y0Var.hashCode() + " setTrackInfo launch");
            kp4.a aVar2 = frameListView.f176003f;
            if (aVar2 != null) {
                com.tencent.mars.xlog.Log.i(frameListView.f176001d, y0Var.hashCode() + " setTrackInfo init thumb fetcher");
                rm5.k kVar = frameListView.f176018x;
                if (kVar != null) {
                    kVar.destroy();
                }
                rm5.k a17 = frameListView.f176019y.a(aVar2, frameListView.f176020z);
                frameListView.f176018x = a17;
                if (a17 != null) {
                    a17.setSize(aVar2.f311071a, aVar2.f311072b);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(y0Var.hashCode());
                sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
                java.util.LinkedList linkedList = aVar2.f311077g;
                sb6.append(linkedList.size());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = frameListView.f176001d;
                com.tencent.mars.xlog.Log.i(str, sb7);
                rm5.k kVar2 = frameListView.f176018x;
                if (kVar2 != null) {
                    kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new kp4.s(frameListView));
                }
                rm5.k kVar3 = frameListView.f176018x;
                if (kVar3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new java.lang.Long(((kp4.m) it.next()).f311124a));
                    }
                    kVar3.a(arrayList, new kp4.t(frameListView, aVar2));
                }
                com.tencent.mars.xlog.Log.i(str, y0Var.hashCode() + " setTrackInfo request layout");
                if (!frameListView.isInLayout() || aVar2.f311078h) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    kp4.u uVar = new kp4.u(frameListView, null);
                    this.f311149d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, uVar, this) == aVar) {
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
