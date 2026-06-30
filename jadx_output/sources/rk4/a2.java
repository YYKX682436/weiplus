package rk4;

/* loaded from: classes.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f396535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396536i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f396537m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396532e = context;
        this.f396533f = str;
        this.f396534g = str2;
        this.f396535h = z17;
        this.f396536i = str3;
        this.f396537m = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.a2(this.f396532e, this.f396533f, this.f396534g, this.f396535h, this.f396536i, this.f396537m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396531d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396531d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f396532e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(this.f396533f));
        intent.putExtra("feed_object_nonceId", pm0.v.Z(this.f396534g));
        boolean z17 = this.f396535h;
        intent.putExtra("key_need_related_list", z17);
        if (z17) {
            intent.putExtra("key_reuqest_scene", 35);
        }
        java.lang.String str = this.f396536i;
        intent.putExtra("key_session_id", str);
        if (str.length() > 0) {
            intent.putExtra("allow_pull_top", true);
        }
        zy2.ta.b(e1Var, context, intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", this.f396537m), false, 4, null);
        return f0Var;
    }
}
