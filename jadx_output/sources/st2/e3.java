package st2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f412279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f412281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f412282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f412283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(android.widget.TextView textView, java.lang.String str, java.util.LinkedList linkedList, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412279d = textView;
        this.f412280e = str;
        this.f412281f = linkedList;
        this.f412282g = z17;
        this.f412283h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.e3(this.f412279d, this.f412280e, this.f412281f, this.f412282g, this.f412283h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        st2.e3 e3Var = (st2.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.widget.TextView textView = this.f412279d;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(c1Var.q(context, this.f412280e, this.f412281f, this.f412282g));
        yz5.a aVar2 = this.f412283h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
