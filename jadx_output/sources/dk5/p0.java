package dk5;

/* loaded from: classes11.dex */
public class p0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.s0 f234792d;

    public p0(dk5.s0 s0Var) {
        this.f234792d = s0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        dk5.s0 s0Var = this.f234792d;
        dk5.r0 r0Var = new dk5.r0(s0Var, null);
        r0Var.f234838a = vVar.f351156a.f351141c;
        r0Var.f234839b = vVar.f351159d;
        java.util.List list = vVar.f351160e;
        r0Var.f234843f = list;
        if (list == null || list.size() == 0) {
            p13.y yVar = new p13.y();
            yVar.f351187e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r0Var.f234843f = arrayList;
            arrayList.add(yVar);
        }
        ((java.util.ArrayList) s0Var.f234867p).add(r0Var);
        s0Var.v();
    }
}
