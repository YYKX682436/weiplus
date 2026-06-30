package vm1;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f437994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437995i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f437996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437991e = context;
        this.f437992f = str;
        this.f437993g = str2;
        this.f437994h = z17;
        this.f437995i = str3;
        this.f437996m = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.c0(this.f437991e, this.f437992f, this.f437993g, this.f437994h, this.f437995i, this.f437996m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437990d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f437990d = 1;
                ((com.tencent.mm.plugin.audio.BizAudioFlutterActivity) aVar3).a7(this);
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
        android.content.Context context = this.f437991e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(this.f437992f));
        intent.putExtra("feed_object_nonceId", pm0.v.Z(this.f437993g));
        boolean z17 = this.f437994h;
        intent.putExtra("key_need_related_list", z17);
        if (z17) {
            intent.putExtra("key_reuqest_scene", 35);
        }
        java.lang.String str = this.f437995i;
        intent.putExtra("key_session_id", str);
        if (str.length() > 0) {
            intent.putExtra("allow_pull_top", true);
        }
        zy2.ta.b(e1Var, context, intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", this.f437996m), false, 4, null);
        return f0Var;
    }
}
