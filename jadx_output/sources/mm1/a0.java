package mm1;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f328628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f328629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f328630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f328631h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterPageStyle f328632i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f328633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.os.Bundle bundle, mm1.b0 b0Var, pi0.l1 l1Var, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328628e = bundle;
        this.f328629f = b0Var;
        this.f328630g = l1Var;
        this.f328631h = context;
        this.f328632i = flutterPageStyle;
        this.f328633m = l17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm1.a0(this.f328628e, this.f328629f, this.f328630g, this.f328631h, this.f328632i, this.f328633m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328627d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.os.Bundle bundle = this.f328628e;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            bundle2.putString("session_id", this.f328629f.f328639e);
            pi0.l1 l1Var = this.f328630g;
            android.content.Context context = this.f328631h;
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f328632i;
            um1.a aVar2 = mm1.b0.f328635i;
            java.lang.Long l17 = this.f328633m;
            this.f328627d = 1;
            obj = l1Var.d(context, flutterPageStyle, com.tencent.mm.plugin.audio.BizAudioFlutterActivity.class, l17, bundle2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Intent intent = (android.content.Intent) obj;
        if (intent != null) {
            android.content.Context context2 = this.f328631h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/audio/BizAudioRouter$showBizStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/audio/BizAudioRouter$showBizStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
