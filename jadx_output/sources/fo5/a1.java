package fo5;

/* loaded from: classes11.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterPageStyle f264954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(yz5.l lVar, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264952e = lVar;
        this.f264953f = context;
        this.f264954g = flutterPageStyle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.a1(this.f264952e, this.f264953f, this.f264954g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264951d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Intent intent2 = fo5.q2.f265077m;
            if (intent2 != null) {
                this.f264952e.invoke(intent2);
                return jz5.f0.f302826a;
            }
            fo5.q2 q2Var = fo5.q2.f265071d;
            this.f264951d = 1;
            if (fo5.q2.b(q2Var, "", true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                intent = (android.content.Intent) obj;
                this.f264952e.invoke(intent);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fo5.q2 q2Var2 = fo5.q2.f265071d;
        q2Var2.f().q();
        pi0.l1 l1Var = q2Var2.c().f265145b;
        if (l1Var == null) {
            intent = null;
            this.f264952e.invoke(intent);
            return jz5.f0.f302826a;
        }
        android.content.Context context = this.f264953f;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f264954g;
        this.f264951d = 2;
        obj = pi0.l1.n(l1Var, context, flutterPageStyle, com.tencent.mm.plugin.voip.ui.VideoActivity.class, null, null, this, 24, null);
        if (obj == aVar) {
            return aVar;
        }
        intent = (android.content.Intent) obj;
        this.f264952e.invoke(intent);
        return jz5.f0.f302826a;
    }
}
