package zy2;

/* loaded from: classes4.dex */
public final class d extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.hd2 f477371b = new r45.hd2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.d dVar = new zy2.d();
        dVar.f477371b = this.f477371b;
        return dVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append(zy2.d5.i(this.f477371b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        this.f477371b = zy2.d5.r(".msg.appmsg", values);
    }

    public final r45.hd2 f() {
        return this.f477371b;
    }
}
