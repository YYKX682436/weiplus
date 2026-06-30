package t93;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f416578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f416579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t93.y f416581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, org.json.JSONObject jSONObject, t93.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416579e = context;
        this.f416580f = jSONObject;
        this.f416581g = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t93.x(this.f416579e, this.f416580f, this.f416581g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((t93.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f416578d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = this.f416579e;
            kotlin.jvm.internal.o.f(context, "$context");
            org.json.JSONObject jSONObject = this.f416580f;
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            this.f416578d = 1;
            ((c61.l7) b6Var).getClass();
            obj = com.tencent.mm.plugin.finder.assist.n7.f102406a.v(context, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.METHOD, (java.lang.String) obj);
        this.f416581g.f143443f.b(hashMap);
        return jz5.f0.f302826a;
    }
}
