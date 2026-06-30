package rf2;

/* loaded from: classes10.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f394654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394655h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394656i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394657m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(xg2.h hVar, kotlin.coroutines.Continuation continuation, rf2.c2 c2Var, java.lang.String str, rf2.d2 d2Var, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        super(2, continuation);
        this.f394651d = hVar;
        this.f394652e = c2Var;
        this.f394653f = str;
        this.f394654g = d2Var;
        this.f394655h = str2;
        this.f394656i = textView;
        this.f394657m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.a2(this.f394651d, continuation, this.f394652e, this.f394653f, this.f394654g, this.f394655h, this.f394656i, this.f394657m);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.a2 a2Var = (rf2.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rf2.c2 c2Var = this.f394652e;
        mm2.v4 v4Var = (mm2.v4) c2Var.f394680b.business(mm2.v4.class);
        rf2.d2 d2Var = this.f394654g;
        r45.l30 S6 = v4Var.S6(this.f394653f, new java.lang.Integer(d2Var.f394695d.getInteger(0)));
        d2Var.f394695d.set(2, 1);
        if (S6 != null) {
            d2Var.f394695d.set(3, java.lang.Integer.valueOf(S6.getInteger(3)));
        } else {
            r45.l30 l30Var = d2Var.f394695d;
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3) + 1));
        }
        com.tencent.mars.xlog.Log.i(c2Var.f394681c, "vote " + d2Var.f394699h + ", " + d2Var.f394695d.getInteger(0) + ", voteId:" + this.f394655h + ", succ");
        this.f394652e.d(this.f394653f, this.f394656i, this.f394657m, this.f394655h, true);
        return jz5.f0.f302826a;
    }
}
