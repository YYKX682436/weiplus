package dk5;

/* loaded from: classes11.dex */
public class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.u0 f234893d;

    public t0(dk5.u0 u0Var) {
        this.f234893d = u0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        dk5.u0 u0Var = this.f234893d;
        if (i17 == 0) {
            u0Var.f234925q = vVar;
        } else {
            u0Var.f234925q = null;
        }
        if (vVar.f351160e.size() == 0) {
            p13.y yVar = new p13.y();
            yVar.f351187e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            vVar.f351160e = arrayList;
            arrayList.add(yVar);
        }
        u0Var.h();
        u0Var.notifyDataSetChanged();
        u0Var.f207051i.d4(vVar.f351156a.f351141c, vVar.f351160e.size(), true);
    }
}
