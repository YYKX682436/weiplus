package hr3;

/* loaded from: classes11.dex */
public class v0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.w0 f284094d;

    public v0(hr3.w0 w0Var) {
        this.f284094d = w0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        hr3.w0 w0Var = this.f284094d;
        if (i17 == 0) {
            java.util.List list = vVar.f351160e;
            w0Var.f284127p = list;
            com.tencent.mm.ui.contact.n4 n4Var = w0Var.f207051i;
            if (n4Var != null) {
                n4Var.d4(vVar.f351156a.f351141c, list.size(), true);
            }
        }
        w0Var.h();
        w0Var.notifyDataSetChanged();
    }
}
