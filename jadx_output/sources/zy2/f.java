package zy2;

/* loaded from: classes4.dex */
public final class f extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.dv2 f477382b = new r45.dv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.f fVar = new zy2.f();
        fVar.f477382b = this.f477382b;
        return fVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append(zy2.d5.d(this.f477382b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f477382b = zy2.d5.k(".msg.appmsg", values);
    }

    public final r45.dv2 f() {
        return this.f477382b;
    }
}
