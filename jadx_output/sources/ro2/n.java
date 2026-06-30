package ro2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f398068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398073i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398074m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Bitmap bitmap, android.content.Context context, int i17, int i18, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398068d = bitmap;
        this.f398069e = context;
        this.f398070f = i17;
        this.f398071g = i18;
        this.f398072h = baseFinderFeed;
        this.f398073i = qeVar;
        this.f398074m = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro2.n(this.f398068d, this.f398069e, this.f398070f, this.f398071g, this.f398072h, this.f398073i, this.f398074m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ro2.n nVar = (ro2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102139h);
        sb6.append("mile_stone_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.sdk.platformtools.x.D0(this.f398068d, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb7, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("poster_type", this.f398070f);
        jSONObject.put("poster_num", this.f398071g);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "saveMileStoneBitmap, writeExifSuccess: " + com.tencent.mm.sdk.platformtools.x.L0(jSONObject.toString(), sb7) + ' ');
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398073i;
        in5.s0 s0Var = this.f398074m;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f398072h;
        android.content.Context context = this.f398069e;
        ((yb0.g) b0Var).wi(context, sb7, new ro2.m(baseFinderFeed, context, qeVar, s0Var));
        return jz5.f0.f302826a;
    }
}
