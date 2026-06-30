package zy2;

/* loaded from: classes4.dex */
public final class m extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.mv2 f477457b = new r45.mv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.m mVar = new zy2.m();
        mVar.f477457b = this.f477457b;
        return mVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append(zy2.d5.h(this.f477457b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f477457b = zy2.d5.o(".msg.appmsg", values);
    }

    public final r45.mv2 f() {
        return this.f477457b;
    }
}
