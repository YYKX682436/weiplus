package we0;

/* loaded from: classes11.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ we0.u0 f445158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f445160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445162i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterPageStyle f445163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(we0.u0 u0Var, java.lang.String str, java.util.Map map, java.lang.String str2, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445158e = u0Var;
        this.f445159f = str;
        this.f445160g = map;
        this.f445161h = str2;
        this.f445162i = context;
        this.f445163m = flutterPageStyle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new we0.s0(this.f445158e, this.f445159f, this.f445160g, this.f445161h, this.f445162i, this.f445163m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((we0.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Class cls;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445157d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f445157d = 1;
            obj = this.f445158e.Bi(this.f445159f, this.f445160g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pi0.l1 l1Var = (pi0.l1) obj;
        java.lang.String str = this.f445161h;
        if (r26.n0.N(str)) {
            int i18 = com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity.f173434u;
            cls = com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity.class;
        } else {
            cls = java.lang.Class.forName(str);
        }
        android.content.Context context = this.f445162i;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f445163m;
        this.f445157d = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle, cls, null, null, this, 24, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
