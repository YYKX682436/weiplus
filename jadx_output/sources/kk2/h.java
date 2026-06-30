package kk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f308490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, kotlin.coroutines.Continuation continuation, kk2.p pVar) {
        super(2, continuation);
        this.f308490d = hVar;
        this.f308491e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk2.h(this.f308490d, continuation, this.f308491e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk2.h hVar = (kk2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.es2 es2Var = (r45.es2) ((xg2.i) this.f308490d).f454393b;
        kk2.p pVar = this.f308491e;
        pVar.f308511p = es2Var;
        pVar.f308512q = java.lang.System.currentTimeMillis();
        java.util.LinkedList list = es2Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getContainer_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.fa2) obj2).f374126e == 14) {
                break;
            }
        }
        r45.fa2 fa2Var = (r45.fa2) obj2;
        if (fa2Var != null) {
            pVar.f308514s = fa2Var;
            if (pVar.q()) {
                pVar.D(fa2Var);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestFinderLiveCloseNav good size=");
        java.util.LinkedList list2 = es2Var.getList(1);
        sb6.append(list2 != null ? new java.lang.Integer(list2.size()) : null);
        sb6.append(" isShowing: ");
        sb6.append(pVar.q());
        com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", sb6.toString());
        return jz5.f0.f302826a;
    }
}
