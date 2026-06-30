package fo5;

/* loaded from: classes14.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ er4.r f265040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f265041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f265042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265043i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f265044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f265045n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fo5.r0 r0Var, int i17, er4.r rVar, long j17, int i18, java.lang.String str, java.util.ArrayList arrayList, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265038d = r0Var;
        this.f265039e = i17;
        this.f265040f = rVar;
        this.f265041g = j17;
        this.f265042h = i18;
        this.f265043i = str;
        this.f265044m = arrayList;
        this.f265045n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.o0(this.f265038d, this.f265039e, this.f265040f, this.f265041g, this.f265042h, this.f265043i, this.f265044m, this.f265045n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.o0 o0Var = (fo5.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.r0 r0Var = this.f265038d;
        lo5.h hVar = r0Var.f265095n;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long j17 = this.f265041g;
        int i17 = this.f265042h;
        hVar.getClass();
        er4.r roomType = this.f265040f;
        kotlin.jvm.internal.o.g(roomType, "roomType");
        java.lang.String toUser = this.f265043i;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        lo5.m mVar = hVar.f320216c;
        mVar.getClass();
        mVar.f301223x = false;
        boolean z17 = this.f265045n;
        mVar.f301249r = z17 ? 3 : 1;
        mVar.H = roomType;
        mVar.f301225z = roomType == er4.r.MP_ROOM_TYPE_VIDEO;
        mVar.D = this.f265039e;
        mVar.A = roomType == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI || roomType == er4.r.MP_ROOM_TYPE_MULTI_TALK;
        mVar.G = this.f265044m;
        mVar.x(context, new android.content.Intent(), j17, i17, mVar.f301225z, toUser, false, mVar.f301249r);
        if (!z17) {
            ((jp5.o) i95.n0.c(jp5.o.class)).Gi(toUser, mVar.f301225z);
        }
        jz5.g gVar = co5.v.f43887j;
        ((co5.v) ((jz5.n) co5.v.f43887j).getValue()).getClass();
        com.tencent.mm.plugin.vqm.a aVar2 = com.tencent.mm.plugin.vqm.a.f177293b;
        kotlin.jvm.internal.o.f(aVar2, "getInstance(...)");
        aVar2.e(com.tencent.mm.plugin.vqm.d.DidAppearFloatingBannerInApp, new com.tencent.mm.plugin.vqm.c().toByteArrayOrNull());
        r0Var.f265095n.f320214a = new fo5.l0(r0Var, z17);
        return jz5.f0.f302826a;
    }
}
