package rh;

/* loaded from: classes12.dex */
public class c0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o3 f395317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395318b;

    public c0(rh.c1 c1Var, rh.o3 o3Var) {
        this.f395318b = c1Var;
        this.f395317a = o3Var;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.l3 l3Var;
        rh.c1 c1Var = this.f395318b;
        android.content.Context d17 = c1Var.f395329k.d();
        this.f395317a.getClass();
        wh.v1 b17 = wh.x1.b(d17);
        if (b17 == null) {
            l3Var = null;
        } else {
            rh.l3 l3Var2 = new rh.l3();
            l3Var2.f395446d = rh.x2.b(java.lang.Long.valueOf(b17.f445884a));
            l3Var2.f395447e = rh.x2.b(java.lang.Long.valueOf(b17.f445885b));
            l3Var2.f395448f = rh.x2.b(java.lang.Long.valueOf(b17.f445886c));
            l3Var2.f395449g = rh.x2.b(java.lang.Long.valueOf(b17.f445887d));
            l3Var = l3Var2;
        }
        if (l3Var != null) {
            rh.w0 w0Var = c1Var.f395334p;
            w0Var.f395533a++;
            w0Var.f395534b += ((java.lang.Long) l3Var.f395446d.f395552a).longValue();
            w0Var.f395535c += ((java.lang.Long) l3Var.f395447e.f395552a).longValue();
            w0Var.f395536d += ((java.lang.Long) l3Var.f395448f.f395552a).longValue();
            w0Var.f395537e += ((java.lang.Long) l3Var.f395449g.f395552a).longValue();
        }
        return 0;
    }
}
