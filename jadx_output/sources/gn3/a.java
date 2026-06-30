package gn3;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f273581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f273582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn3.d f273583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gn3.b f273584g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f273585h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.ArrayList arrayList, fn3.d dVar, gn3.b bVar, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f273582e = arrayList;
        this.f273583f = dVar;
        this.f273584g = bVar;
        this.f273585h = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gn3.a(this.f273582e, this.f273583f, this.f273584g, this.f273585h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gn3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f273581d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk0.i iVar = (dk0.i) i95.n0.c(dk0.i.class);
            this.f273581d = 1;
            oy4.v vVar = (oy4.v) iVar;
            vVar.getClass();
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new oy4.u(this.f273582e, vVar, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        r45.ru4 ru4Var = new r45.ru4();
        int i18 = 0;
        for (java.lang.Object obj2 : (java.util.ArrayList) g17) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            float[] fArr = (float[]) obj2;
            java.lang.String str = this.f273584g.f273586e;
            kz5.z.b0(fArr, ", ", null, null, 0, null, null, 62, null);
            java.util.LinkedList list = ru4Var.getList(0);
            r45.su4 su4Var = new r45.su4();
            su4Var.set(0, (java.lang.String) this.f273585h.get(i18));
            r45.xu4 xu4Var = new r45.xu4();
            xu4Var.getList(1).addAll(kz5.z.w0(fArr));
            su4Var.set(1, xu4Var);
            list.add(su4Var);
            i18 = i19;
        }
        this.f273583f.a(ru4Var, 0, "");
        return jz5.f0.f302826a;
    }
}
