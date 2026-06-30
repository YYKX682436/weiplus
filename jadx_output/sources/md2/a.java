package md2;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.c f325825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325827g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(md2.c cVar, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f325825e = cVar;
        this.f325826f = str;
        this.f325827g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new md2.a(this.f325825e, this.f325826f, this.f325827g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((md2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.uv1 uv1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f325824d;
        java.lang.String str = this.f325826f;
        md2.c cVar = this.f325825e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i(cVar.f325835f, "[fetchBlueGiftCreate-enter] orderID = " + str);
            r45.eu1 eu1Var = new r45.eu1();
            eu1Var.set(1, db2.t4.f228171a.a(18583));
            eu1Var.set(2, java.lang.Long.valueOf(((mm2.e1) cVar.f325834e.a(mm2.e1.class)).f328983m));
            gk2.e eVar = cVar.f325834e;
            eu1Var.set(4, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v);
            eu1Var.set(5, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f328985o;
            if (bArr != null) {
                eu1Var.set(3, new com.tencent.mm.protobuf.g(bArr, 0, bArr.length));
            }
            com.tencent.mm.modelbase.i d17 = eu1Var.d();
            this.f325824d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i(cVar.f325835f, "[fetchBlueGiftCreate] errCode = " + fVar.f70616b + ", errType = " + fVar.f70615a);
        java.util.LinkedList list = ((r45.fu1) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getItem_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            r45.vv1 vv1Var = (r45.vv1) ((r45.uc5) obj2).getCustom(3);
            if (kotlin.jvm.internal.o.b((vv1Var == null || (uv1Var = (r45.uv1) vv1Var.getCustom(1)) == null) ? null : uv1Var.getString(11), str)) {
                break;
            }
        }
        r45.uc5 uc5Var = (r45.uc5) obj2;
        boolean b17 = fVar.b();
        yz5.l lVar = this.f325827g;
        if (b17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(uc5Var != null ? uc5Var.toByteArray() : null)));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
        return jz5.f0.f302826a;
    }
}
