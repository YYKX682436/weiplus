package ph1;

/* loaded from: classes7.dex */
public class u implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph1.v f354350a;

    public u(ph1.v vVar) {
        this.f354350a = vVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        ph1.v vVar = this.f354350a;
        android.content.Context r07 = vVar.f354355h.f354329f.r0();
        if (r07 == null) {
            r07 = vVar.f354355h.f354329f.f74795d;
        }
        fl1.g1 g1Var = new fl1.g1(r07);
        g1Var.setMessage(r07.getString(com.tencent.mm.R.string.gom));
        return g1Var;
    }
}
