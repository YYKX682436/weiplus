package t23;

/* loaded from: classes10.dex */
public class k0 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.o0 f415199a;

    public k0(t23.o0 o0Var) {
        this.f415199a = o0Var;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return "";
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        t23.o0 o0Var = this.f415199a;
        o0Var.f415214e.size();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!o0Var.f415214e.containsKey(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryCache", "not hit!!!");
            return;
        }
        t23.n0 n0Var = (t23.n0) o0Var.f415214e.get(str);
        if (n0Var != null) {
            n0Var.b(str);
        }
    }
}
