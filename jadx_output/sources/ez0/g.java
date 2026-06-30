package ez0;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f257793e;

    /* renamed from: f, reason: collision with root package name */
    public int f257794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f257795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f257796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ez0.i f257797i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f257798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.content.Intent intent, ez0.i iVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257795g = context;
        this.f257796h = intent;
        this.f257797i = iVar;
        this.f257798m = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ez0.g(this.f257795g, this.f257796h, this.f257797i, this.f257798m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle;
        java.lang.String str;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257794f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "mj_template", kz5.p0.f313996d, false, null, 24, null);
            java.util.List Ai = ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).Ai();
            pz0.r rVar = this.f257797i.f257806d;
            kotlin.jvm.internal.o.d(rVar);
            l1Var.a(kz5.c0.i(new pz0.m(), rVar));
            l1Var.a(Ai);
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle3 = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            flutterPageStyle3.f68118e = -1;
            io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
            kotlin.jvm.internal.o.g(backgroundMode, "<set-?>");
            flutterPageStyle3.f68119f = backgroundMode;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            long j17 = this.f257798m;
            if (j17 == 0) {
                flutterPageStyle = flutterPageStyle3;
                str = "";
            } else {
                if (j17 == 0) {
                    str = "0";
                } else if (j17 > 0) {
                    str = java.lang.Long.toString(j17, 10);
                } else {
                    char[] cArr = new char[64];
                    flutterPageStyle = flutterPageStyle3;
                    long j18 = (j17 >>> 1) / 5;
                    long j19 = 10;
                    char forDigit = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
                    int i18 = 63;
                    cArr[63] = forDigit;
                    for (long j27 = 0; j18 > j27; j27 = 0) {
                        i18--;
                        cArr[i18] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                        j18 /= j19;
                    }
                    str = new java.lang.String(cArr, i18, 64 - i18);
                }
                flutterPageStyle = flutterPageStyle3;
            }
            linkedHashMap.put("EventTopicId", str);
            linkedHashMap.put("PriorityTplId", "");
            linkedHashMap.put("RecMusicId", "");
            this.f257792d = l1Var;
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle4 = flutterPageStyle;
            this.f257793e = flutterPageStyle4;
            this.f257794f = 1;
            if (l1Var.o("/", linkedHashMap, this) == aVar) {
                return aVar;
            }
            flutterPageStyle2 = flutterPageStyle4;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquare");
                return jz5.f0.f302826a;
            }
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle5 = (com.tencent.mm.flutter.ui.FlutterPageStyle) this.f257793e;
            pi0.l1 l1Var2 = (pi0.l1) this.f257792d;
            kotlin.ResultKt.throwOnFailure(obj);
            flutterPageStyle2 = flutterPageStyle5;
            l1Var = l1Var2;
        }
        android.content.Context context = this.f257795g;
        android.os.Bundle extras = this.f257796h.getExtras();
        this.f257792d = null;
        this.f257793e = null;
        this.f257794f = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle2, null, null, extras, this, 12, null) == aVar) {
            return aVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquare");
        return jz5.f0.f302826a;
    }
}
