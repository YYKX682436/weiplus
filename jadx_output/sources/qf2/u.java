package qf2;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f362594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.coroutines.Continuation continuation, qf2.v0 v0Var, km2.q qVar) {
        super(2, continuation);
        this.f362593d = v0Var;
        this.f362594e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.u(continuation, this.f362593d, this.f362594e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.u uVar = (qf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f362593d.f291099e;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
        if (v1Var != null) {
            qo0.c.a(v1Var, qo0.b.f365342d5, null, 2, null);
        }
        qf2.v0 v0Var = this.f362593d;
        km2.q qVar = this.f362594e;
        mm2.o4 o4Var = (mm2.o4) v0Var.business(mm2.o4.class);
        if (o4Var != null && (list = o4Var.f329318o) != null) {
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    boolean z17 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    km2.q qVar2 = (km2.q) next;
                    if (!kotlin.jvm.internal.o.b(qVar2.f309170a, qVar.f309170a) && qVar2.f309177h) {
                        if (qVar2.f309181l == 7) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        arrayList.add(next);
                    }
                }
            }
            synchronized (arrayList) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((km2.q) it6.next()).f309181l = 0;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
