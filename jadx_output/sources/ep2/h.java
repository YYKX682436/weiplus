package ep2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f255715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f255716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f255717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255715e = s0Var;
        this.f255716f = baseFinderFeed;
        this.f255717g = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep2.h(this.f255715e, this.f255716f, this.f255717g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255714d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context context = this.f255715e.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f255716f;
            long j17 = baseFinderFeed.getFeedObject().field_id;
            java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
            android.widget.ImageView iconView = this.f255717g;
            kotlin.jvm.internal.o.f(iconView, "$iconView");
            this.f255714d = 1;
            if (((com.tencent.mm.feature.finder.live.v4) w0Var).wj(context, j17, objectNonceId, iconView, 1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
