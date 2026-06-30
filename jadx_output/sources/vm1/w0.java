package vm1;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f438066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438063e = context;
        this.f438064f = str;
        this.f438065g = str2;
        this.f438066h = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.w0(this.f438063e, this.f438064f, this.f438065g, this.f438066h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438062d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f438062d = 1;
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
        j45.l.j(this.f438063e, this.f438064f, this.f438065g, this.f438066h, null);
        return f0Var;
    }
}
