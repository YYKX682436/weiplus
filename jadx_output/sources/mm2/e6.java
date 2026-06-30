package mm2;

/* loaded from: classes3.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f329008d;

    /* renamed from: e, reason: collision with root package name */
    public int f329009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.f6 f329010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f329011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(mm2.f6 f6Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329010f = f6Var;
        this.f329011g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.e6(this.f329010f, this.f329011g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.e6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mm2.f6 f6Var;
        r45.cp1 cp1Var;
        r45.j92 j92Var;
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329009e;
        mm2.f6 f6Var2 = this.f329010f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            mm2.d6 d6Var = new mm2.d6(f6Var2, this.f329011g, null);
            this.f329008d = f6Var2;
            this.f329009e = 1;
            obj = kotlinx.coroutines.l.g(p0Var, d6Var, this);
            if (obj == aVar) {
                return aVar;
            }
            f6Var = f6Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6Var = (mm2.f6) this.f329008d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        f6Var.V6((r45.cp1) obj);
        f6Var2.T = false;
        boolean N6 = f6Var2.N6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if ((N6 || f6Var2.f329035i) && (cp1Var = f6Var2.S) != null) {
            if (((r45.j92) cp1Var.getCustom(1)) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vip info size = ");
                r45.cp1 cp1Var2 = f6Var2.S;
                sb6.append((cp1Var2 == null || (j92Var = (r45.j92) cp1Var2.getCustom(1)) == null || (list = j92Var.getList(0)) == null) ? null : new java.lang.Integer(list.size()));
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb6.toString());
                f6Var2.f329042p1.postValue((r45.j92) cp1Var.getCustom(1));
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryToGetEcReponse shopVipInfo = ");
            r45.j92 j92Var2 = (r45.j92) cp1Var.getCustom(1);
            sb7.append(j92Var2 != null ? j92Var2.getList(0) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb7.toString());
        }
        return f0Var;
    }
}
