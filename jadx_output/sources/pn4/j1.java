package pn4;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f357125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357126i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pn4.k1 f357127m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, java.lang.String str4, pn4.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357121d = str;
        this.f357122e = str2;
        this.f357123f = i17;
        this.f357124g = str3;
        this.f357125h = i18;
        this.f357126i = str4;
        this.f357127m = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.j1(this.f357121d, this.f357122e, this.f357123f, this.f357124g, this.f357125h, this.f357126i, this.f357127m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pn4.j1 j1Var = (pn4.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.jp3 jp3Var = new r45.jp3();
        jp3Var.f378006d = 1;
        jp3Var.f378008f = this.f357121d;
        java.util.LinkedList linkedList = jp3Var.f378007e;
        r45.cq6 cq6Var = new r45.cq6();
        cq6Var.f371793f = this.f357122e;
        cq6Var.f371791d = this.f357123f;
        cq6Var.f371796i = this.f357124g;
        cq6Var.f371794g = this.f357125h;
        cq6Var.f371792e = this.f357126i;
        linkedList.add(cq6Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 631;
        lVar.f70666c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f70664a = jp3Var;
        lVar.f70665b = new r45.kp3();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new pn4.i1(a17, this.f357127m, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
