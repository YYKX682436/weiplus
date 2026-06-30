package en3;

/* loaded from: classes2.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255286i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255287m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, java.lang.String str, int i17, int i18, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255282e = j17;
        this.f255283f = str;
        this.f255284g = i17;
        this.f255285h = i18;
        this.f255286i = str2;
        this.f255287m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new en3.a0(this.f255282e, this.f255283f, this.f255284g, this.f255285h, this.f255286i, this.f255287m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((en3.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255281d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(m40.h0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.modelbase.i ci6 = m40.h0.ci((m40.h0) c17, this.f255282e, this.f255283f, this.f255284g, this.f255285h, this.f255286i, false, null, null, 0L, null, false, false, null, null, 0, null, 57312, null);
            this.f255281d = 1;
            b17 = rm0.h.b(ci6, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeDataFeatureService", "requestFinderObject " + fVar);
        boolean b18 = fVar.b();
        yz5.l lVar = this.f255287m;
        if (b18) {
            r45.h51 h51Var = (r45.h51) fVar.f70618d;
            if (h51Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) != null) {
                bu2.j.f24534a.o(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 2097152), new bu2.h(3763, 0L));
            }
            r45.h51 h51Var2 = (r45.h51) fVar.f70618d;
            lVar.invoke(h51Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderObject) h51Var2.getCustom(2) : null);
        } else {
            lVar.invoke(null);
        }
        return jz5.f0.f302826a;
    }
}
