package h03;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f277884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.app.Activity activity, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277884d = activity;
        this.f277885e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h03.g(this.f277884d, this.f277885e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h03.g gVar = (h03.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f277884d != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.app.Activity activity = this.f277884d;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("feed_object_id", pm0.v.Z(this.f277885e));
            zy2.ta.b(e1Var, activity, intent.putExtra("key_need_related_list", false), false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
