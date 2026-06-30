package zy2;

/* loaded from: classes9.dex */
public final class c extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.g92 f477359b = new r45.g92();

    @Override // ot0.h
    public ot0.h a() {
        zy2.c cVar = new zy2.c();
        cVar.f477359b = this.f477359b;
        return cVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append(zy2.d5.c(this.f477359b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        this.f477359b = zy2.d5.l(".msg.appmsg", values);
    }

    public final r45.g92 f() {
        return this.f477359b;
    }
}
