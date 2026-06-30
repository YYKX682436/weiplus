package rk4;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f396716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396713e = context;
        this.f396714f = str;
        this.f396715g = str2;
        this.f396716h = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.i3(this.f396713e, this.f396714f, this.f396715g, this.f396716h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396712d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396712d = 1;
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
        j45.l.j(this.f396713e, this.f396714f, this.f396715g, this.f396716h, null);
        return f0Var;
    }
}
