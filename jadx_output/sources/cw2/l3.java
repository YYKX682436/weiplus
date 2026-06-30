package cw2;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f223828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f223829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f223831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(java.lang.Long l17, java.lang.String str, r45.nw1 nw1Var, java.lang.String str2, com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f223829e = l17;
        this.f223830f = str;
        this.f223831g = nw1Var;
        this.f223832h = str2;
        this.f223833i = finderLivePlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.l3(this.f223829e, this.f223830f, this.f223831g, this.f223832h, this.f223833i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f223828d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            long longValue = this.f223829e.longValue();
            java.lang.String str = this.f223830f;
            long j17 = this.f223831g.getLong(0);
            java.lang.String str2 = this.f223832h;
            android.content.Context context = this.f223833i.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f223828d = 1;
            obj = ((b92.d1) zbVar).Bi(longValue, str, j17, str2, context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
