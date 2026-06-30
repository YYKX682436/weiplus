package ez0;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f257800e;

    /* renamed from: f, reason: collision with root package name */
    public int f257801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f257802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f257803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ez0.i f257804i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257805m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, android.content.Intent intent, ez0.i iVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257802g = context;
        this.f257803h = intent;
        this.f257804i = iVar;
        this.f257805m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ez0.h(this.f257802g, this.f257803h, this.f257804i, this.f257805m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257801f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "mj_template", kz5.p0.f313996d, false, null, 24, null);
            java.util.List Ai = ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).Ai();
            pz0.r rVar = this.f257804i.f257806d;
            kotlin.jvm.internal.o.d(rVar);
            l1Var.a(kz5.c0.i(new pz0.m(), rVar));
            l1Var.a(Ai);
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle2 = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            flutterPageStyle2.f68118e = -1;
            io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
            kotlin.jvm.internal.o.g(backgroundMode, "<set-?>");
            flutterPageStyle2.f68119f = backgroundMode;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("RecMusicId", this.f257805m);
            linkedHashMap.put("EventTopicId", "");
            linkedHashMap.put("PriorityTplId", "");
            this.f257799d = l1Var;
            this.f257800e = flutterPageStyle2;
            this.f257801f = 1;
            if (l1Var.o("/", linkedHashMap, this) == aVar) {
                return aVar;
            }
            flutterPageStyle = flutterPageStyle2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquareWithMusicId");
                return jz5.f0.f302826a;
            }
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle3 = (com.tencent.mm.flutter.ui.FlutterPageStyle) this.f257800e;
            pi0.l1 l1Var2 = (pi0.l1) this.f257799d;
            kotlin.ResultKt.throwOnFailure(obj);
            flutterPageStyle = flutterPageStyle3;
            l1Var = l1Var2;
        }
        android.content.Context context = this.f257802g;
        android.os.Bundle extras = this.f257803h.getExtras();
        this.f257799d = null;
        this.f257800e = null;
        this.f257801f = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle, null, null, extras, this, 12, null) == aVar) {
            return aVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquareWithMusicId");
        return jz5.f0.f302826a;
    }
}
