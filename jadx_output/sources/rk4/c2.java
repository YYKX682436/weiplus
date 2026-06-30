package rk4;

/* loaded from: classes.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingFinderContactInfo f396577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396576e = context;
        this.f396577f = tingFinderContactInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.c2(this.f396576e, this.f396577f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396575d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396575d = 1;
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
        intent.putExtra("key_enter_profile_tab", 8);
        intent.putExtra("finder_username", this.f396577f.getUsername());
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        e1Var.w(this.f396576e, intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true));
        return f0Var;
    }
}
