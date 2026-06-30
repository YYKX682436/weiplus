package rk4;

/* loaded from: classes11.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f397115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f397116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397117h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397118i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f397119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f397120n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, long j17, long j18, java.lang.String str, java.lang.String str2, boolean z17, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397114e = context;
        this.f397115f = j17;
        this.f397116g = j18;
        this.f397117h = str;
        this.f397118i = str2;
        this.f397119m = z17;
        this.f397120n = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.z1(this.f397114e, this.f397115f, this.f397116g, this.f397117h, this.f397118i, this.f397119m, this.f397120n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397113d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f397113d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        long ordinal = com.tencent.pigeon.ting.FinderProfileTabType.TYPE_CATEGORY.ordinal();
        long j17 = this.f397115f;
        if (j17 == ordinal) {
            intent.putExtra("key_enter_profile_tab", 7);
        } else if (j17 == com.tencent.pigeon.ting.FinderProfileTabType.TYPE_MUSIC.ordinal()) {
            intent.putExtra("key_enter_profile_tab", 6);
        } else if (j17 == com.tencent.pigeon.ting.FinderProfileTabType.TYPE_AUDIO.ordinal()) {
            intent.putExtra("key_enter_profile_tab", 8);
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        int i18 = (int) this.f397116g;
        ((c61.l7) b6Var).Bj(37, 42, i18, intent);
        java.lang.String str2 = this.f397117h;
        intent.putExtra("finder_username", str2);
        intent.putExtra("key_enter_profile_type", 42);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        java.lang.String str3 = this.f397118i;
        if (!(str3 == null || r26.n0.N(str3))) {
            intent.putExtra("key_extra_info", str3);
        }
        boolean z17 = this.f397119m;
        if (z17) {
            intent.putExtra("key_half_screen_source", z17);
        }
        intent.putExtra("key_from_comment_scene", i18);
        intent.putExtra("key_from_follow_scene", il4.c.a(this.f397120n));
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        android.content.Context context = this.f397114e;
        if (eVar == null || (str = ((k40.f) eVar).Ui(context)) == null) {
            str = "";
        }
        e1Var.w(context, intent.putExtra("KEY_FINDER_SELF_FLAG", i18 == 338 && kotlin.jvm.internal.o.b(str2, str)));
        return f0Var;
    }
}
