package zy2;

/* loaded from: classes4.dex */
public final class k extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.lv2 f477427b = new r45.lv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.k kVar = new zy2.k();
        kVar.f477427b = this.f477427b;
        return kVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        if (zy2.d5.b(qVar != null ? qVar.G2 : null, qVar != null ? qVar.D2 : 0) != 2) {
            return;
        }
        sb6.append(zy2.d5.a(2, zy2.d5.g(this.f477427b)));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f477427b = zy2.d5.m(".msg.appmsg.finder.detail", values);
    }

    public final r45.lv2 f() {
        return this.f477427b;
    }
}
