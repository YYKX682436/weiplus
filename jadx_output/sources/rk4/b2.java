package rk4;

/* loaded from: classes.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.String str, java.lang.String str2, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396557e = str;
        this.f396558f = str2;
        this.f396559g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.b2(this.f396557e, this.f396558f, this.f396559g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396556d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396556d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(this.f396557e));
        intent.putExtra("feed_object_nonceId", pm0.v.Z(this.f396558f));
        intent.putExtra("key_reuqest_scene", 35);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.N(this.f396559g, intent, true);
        return f0Var;
    }
}
