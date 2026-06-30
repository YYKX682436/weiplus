package xx0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f457948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xx0.d0 d0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457947d = d0Var;
        this.f457948e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx0.v(this.f457947d, this.f457948e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xx0.v vVar = (xx0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xx0.d0 d0Var = this.f457947d;
        d0Var.f457879g.setVisibility(8);
        d0Var.f457880h.setVisibility(0);
        xx0.t tVar = d0Var.f457881i;
        vt3.r tab = d0Var.f457877e;
        tVar.getClass();
        kotlin.jvm.internal.o.g(tab, "tab");
        java.util.List data = this.f457948e;
        kotlin.jvm.internal.o.g(data, "data");
        tVar.f457943i = tab;
        java.util.ArrayList arrayList = (java.util.ArrayList) tVar.f457941g;
        arrayList.clear();
        arrayList.addAll(data);
        tVar.notifyDataSetChanged();
        d0Var.getClass();
        xx0.z zVar = new xx0.z(d0Var);
        xx0.t tVar2 = d0Var.f457881i;
        tVar2.getClass();
        tVar2.f457944m = zVar;
        return jz5.f0.f302826a;
    }
}
