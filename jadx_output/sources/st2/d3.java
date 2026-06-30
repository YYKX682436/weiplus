package st2;

/* loaded from: classes3.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f412262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f412265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f412266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(android.widget.TextView textView, java.lang.String str, int i17, float f17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412262e = textView;
        this.f412263f = str;
        this.f412264g = i17;
        this.f412265h = f17;
        this.f412266i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.d3(this.f412262e, this.f412263f, this.f412264g, this.f412265h, this.f412266i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412261d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            st2.g3 g3Var = st2.g3.f412326a;
            android.content.Context context = this.f412262e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = this.f412263f;
            int i18 = (int) (this.f412264g * this.f412265h);
            boolean z17 = !this.f412266i;
            this.f412261d = 1;
            obj = g3Var.l(context, str, i18, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
