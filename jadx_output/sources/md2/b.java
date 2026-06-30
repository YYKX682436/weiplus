package md2;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.c f325829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(md2.c cVar, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f325829e = cVar;
        this.f325830f = str;
        this.f325831g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new md2.b(this.f325829e, this.f325830f, this.f325831g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((md2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f325828d;
        md2.c cVar = this.f325829e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = cVar.f325835f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendBlueGift-enter] itemID = ");
            java.lang.String str2 = this.f325830f;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            r45.do1 do1Var = new r45.do1();
            do1Var.set(1, db2.t4.f228171a.a(23090));
            do1Var.set(3, java.lang.Long.valueOf(((mm2.e1) cVar.f325834e.a(mm2.e1.class)).f328983m));
            gk2.e eVar = cVar.f325834e;
            do1Var.set(4, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v);
            do1Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
            do1Var.set(6, java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f328985o;
            if (bArr != null) {
                do1Var.set(5, new com.tencent.mm.protobuf.g(bArr, 0, bArr.length));
            }
            com.tencent.mm.modelbase.i d17 = do1Var.d();
            this.f325828d = 1;
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
        com.tencent.mars.xlog.Log.i(cVar.f325835f, "[sendBlueGift] errCode = " + fVar.f70616b + ", errType = " + fVar.f70615a);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f325831g.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(fVar.b()))));
        return jz5.f0.f302826a;
    }
}
