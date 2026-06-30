package pn4;

/* loaded from: classes4.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.c2 f357275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f357276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.String str, int i17, java.lang.String str2, pn4.c2 c2Var, pn4.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357272d = str;
        this.f357273e = i17;
        this.f357274f = str2;
        this.f357275g = c2Var;
        this.f357276h = t1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.z1(this.f357272d, this.f357273e, this.f357274f, this.f357275g, this.f357276h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pn4.z1 z1Var = (pn4.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.jp3 jp3Var = new r45.jp3();
        jp3Var.f378006d = 1;
        jp3Var.f378008f = this.f357272d;
        java.util.LinkedList linkedList = jp3Var.f378007e;
        r45.cq6 cq6Var = new r45.cq6();
        cq6Var.f371791d = this.f357273e;
        cq6Var.f371794g = 114;
        cq6Var.f371792e = this.f357274f;
        linkedList.add(cq6Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 631;
        lVar.f70666c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f70664a = jp3Var;
        lVar.f70665b = new r45.kp3();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new pn4.y1(a17, this.f357275g, this.f357276h, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
