package jm;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c0 f300235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jm.m f300236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qi3.c0 c0Var, jm.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300235e = c0Var;
        this.f300236f = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        jm.k kVar = new jm.k(this.f300235e, this.f300236f, continuation);
        kVar.f300234d = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jm.k kVar = (jm.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi3.c0 c0Var = this.f300235e;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = c0Var.f363679a;
        if (msgIdTalker != null) {
            double d17 = c0Var.f363680b;
            jm.m mVar = this.f300236f;
            if (d17 > 0.0d) {
                ((java.util.HashMap) ((jz5.n) mVar.f300240o).getValue()).put(msgIdTalker.toString(), new java.lang.Float(c0Var.f363680b));
            }
            java.util.Iterator it = ((java.util.HashSet) ((jz5.n) mVar.f300239n).getValue()).iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                qi3.z zVar = (qi3.z) ((d75.c) next).get();
                if (zVar != null) {
                    ut.b bVar = (ut.b) zVar;
                    pt0.e0 e0Var = pt0.f0.f358209b1;
                    com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = c0Var.f363679a;
                    java.lang.String a17 = msgIdTalker2 != null ? msgIdTalker2.a() : null;
                    com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker3 = c0Var.f363679a;
                    com.tencent.mm.storage.f9 k17 = e0Var.k(a17, msgIdTalker3 != null ? msgIdTalker3.f149480d : 0L);
                    if (k17 != null && k17.n2()) {
                        if (c0Var.f363681c) {
                            bVar.V6(k17, 4, false);
                        } else {
                            float f17 = c0Var.f363680b;
                            if (f17 >= 1.0f) {
                                bVar.V6(k17, 0, false);
                            } else if (f17 > 0.0f) {
                                bVar.V6(k17, 3, true);
                            }
                        }
                    }
                } else {
                    zVar = null;
                }
                if (zVar == null) {
                    it.remove();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
