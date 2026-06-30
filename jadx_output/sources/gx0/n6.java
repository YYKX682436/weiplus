package gx0;

/* loaded from: classes5.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f276750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f276751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xt0.h f276752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276753i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276754m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276755n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f276756o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.ab4 f276757p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(gx0.w8 w8Var, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, xt0.h hVar, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, r45.ab4 ab4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276749e = w8Var;
        this.f276750f = timeline;
        this.f276751g = recordConfigProvider;
        this.f276752h = hVar;
        this.f276753i = mJTime;
        this.f276754m = str;
        this.f276755n = str2;
        this.f276756o = gVar;
        this.f276757p = ab4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.n6(this.f276749e, this.f276750f, this.f276751g, this.f276752h, this.f276753i, this.f276754m, this.f276755n, this.f276756o, this.f276757p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c76;
        com.tencent.mm.protobuf.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276748d;
        gx0.w8 w8Var = this.f276749e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f276748d = 1;
            c76 = gx0.w8.c7(w8Var, this);
            if (c76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c76 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) c76).booleanValue();
        xt0.d dVar = w8Var.f277122x0;
        android.app.Activity context = w8Var.getContext();
        com.tencent.maas.moviecomposing.Timeline timeline = this.f276750f;
        double milliseconds = timeline.l().toMilliseconds();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f276751g;
        r45.q23 q23Var = w8Var.v7().f69347i;
        boolean a17 = w8Var.v7().a();
        xt0.h hVar = this.f276752h;
        com.tencent.maas.model.time.MJTime mJTime = this.f276753i;
        java.lang.String str = this.f276754m;
        java.lang.String str2 = this.f276755n;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        java.lang.String B = timeline.B();
        com.tencent.mm.protobuf.g c17 = B != null ? com.tencent.mm.protobuf.g.c(B) : null;
        java.nio.ByteBuffer A = timeline.A();
        if (A != null) {
            byte[] bArr = new byte[A.capacity()];
            A.rewind();
            A.get(bArr);
            gVar = com.tencent.mm.protobuf.g.b(bArr);
        } else {
            gVar = null;
        }
        dVar.c(context, milliseconds, recordConfigProvider, q23Var, a17, hVar, mJTime, str, str2, valueOf, c17, gVar, this.f276756o, this.f276757p);
        return jz5.f0.f302826a;
    }
}
