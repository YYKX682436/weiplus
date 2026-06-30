package tv4;

/* loaded from: classes12.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv4.b f422358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv4.q f422359b;

    public a(tv4.b bVar, sv4.q qVar) {
        this.f422358a = bVar;
        this.f422359b = qVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        tv4.b bVar = this.f422358a;
        rv4.a0 a0Var = bVar.f422362d;
        a0Var.f400427a.f331675b.c(a0Var.a(ov4.f.f349231f));
        rv4.a0 a0Var2 = bVar.f422362d;
        a0Var2.e(z17);
        bVar.b((com.tencent.mm.ui.widget.MMSwitchBtn) ((jz5.n) this.f422359b.f413410f).getValue(), a0Var2.f400429c);
        sv4.i iVar = (sv4.i) bVar.f422361c;
        sv4.d dVar = (sv4.d) iVar.f413400a.get();
        iVar.f413401b = dVar != null ? ((qv4.r0) dVar).h() : null;
        jv4.i iVar2 = iVar.f413402c;
        if (iVar2 != null) {
            ((jv4.p) iVar2).y(false);
        }
        jv4.i iVar3 = iVar.f413402c;
        if (iVar3 != null) {
            ((jv4.p) iVar3).y(false);
        }
    }
}
