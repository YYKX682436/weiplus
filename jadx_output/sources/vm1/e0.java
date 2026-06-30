package vm1;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingFinderContactInfo f438005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438004e = context;
        this.f438005f = tingFinderContactInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.e0(this.f438004e, this.f438005f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438003d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f438003d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_tab", 8);
        intent.putExtra("finder_username", this.f438005f.getUsername());
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        e1Var.w(this.f438004e, intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true));
        return f0Var;
    }
}
