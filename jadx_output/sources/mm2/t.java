package mm2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ce2 f329422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mm2.w wVar, r45.ce2 ce2Var) {
        super(0);
        this.f329421d = wVar;
        this.f329422e = ce2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.w wVar = this.f329421d;
        mm2.h hVar = wVar.f329504p;
        if (hVar != null) {
            hVar.B = java.lang.System.currentTimeMillis();
            hVar.getPlayer().b(false);
        }
        mm2.h hVar2 = wVar.f329504p;
        r45.ce2 ce2Var = this.f329422e;
        if (hVar2 != null) {
            hVar2.setOnVideoError(new mm2.q(wVar, ce2Var));
        }
        mm2.h hVar3 = wVar.f329504p;
        if (hVar3 != null) {
            hVar3.setOnVideoComplete(new mm2.r(wVar, ce2Var));
        }
        mm2.h hVar4 = wVar.f329504p;
        if (hVar4 != null) {
            hVar4.setOnProgressChange(new mm2.s(wVar));
        }
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        mm2.h hVar5 = wVar.f329504p;
        if (hVar5 != null) {
            hVar5.setOnVideoSizeChange(wVar.f329508t);
        }
        fo0.n O = w0Var != null ? w0Var.O() : null;
        if (O != null) {
            mm2.h hVar6 = wVar.f329504p;
            java.lang.Object parent = hVar6 != null ? hVar6.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(wVar.f329504p);
            }
            mm2.h hVar7 = wVar.f329504p;
            if (hVar7 != null) {
                O.b(hVar7);
            }
        }
        return jz5.f0.f302826a;
    }
}
