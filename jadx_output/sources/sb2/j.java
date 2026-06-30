package sb2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f405418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f405420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f405421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sb2.k f405422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.convert.zf zfVar, sb2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f405419e = context;
        this.f405420f = finderObject;
        this.f405421g = zfVar;
        this.f405422h = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sb2.j(this.f405419e, this.f405420f, this.f405421g, this.f405422h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sb2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.Object Q6;
        r45.nw1 liveInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f405418d;
        long j17 = 0;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f405420f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = this.f405419e;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.b8 b8Var = (zy2.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.b8.class);
            long id6 = finderObject2.getId();
            java.lang.String objectNonceId = finderObject2.getObjectNonceId();
            r45.nw1 liveInfo2 = finderObject2.getLiveInfo();
            long j18 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
            r45.dm2 object_extend = finderObject2.getObject_extend();
            java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
            android.content.Context context2 = this.f405419e;
            this.f405418d = 1;
            finderObject = finderObject2;
            Q6 = ((com.tencent.mm.plugin.finder.feed.fg) b8Var).Q6(id6, objectNonceId, j18, string, context2, this);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Q6 = obj;
            finderObject = finderObject2;
        }
        jz5.l lVar = (jz5.l) Q6;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302834e).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f302833d;
        if (booleanValue || ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.F2).getValue()).r()).intValue() == 1) {
            in5.s0 s0Var = this.f405422h.f417141d.f417149i;
            java.lang.Integer num = s0Var != null ? new java.lang.Integer(s0Var.getAdapterPosition()) : null;
            if (finderObject != null && (liveInfo = finderObject.getLiveInfo()) != null) {
                j17 = liveInfo.getLong(0);
            }
            java.lang.Long l17 = new java.lang.Long(j17);
            java.lang.Integer num2 = new java.lang.Integer(6);
            com.tencent.mm.plugin.finder.convert.zf zfVar = this.f405421g;
            zfVar.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.lf(num, zfVar, l17, num2, str));
        }
        return jz5.f0.f302826a;
    }
}
