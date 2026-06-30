package ot0;

/* loaded from: classes9.dex */
public final class g extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f348475b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348476c = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.g gVar = new ot0.g();
        gVar.f348475b = this.f348475b;
        gVar.f348476c = this.f348476c;
        return gVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        int i19 = this.f348475b;
        sb6.append("<mpsharetrace>");
        sb6.append("<hasfinderelement>");
        sb6.append(i19);
        sb6.append("</hasfinderelement>");
        sb6.append("<lastgmsgid>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348476c));
        sb6.append("</lastgmsgid>");
        sb6.append("</mpsharetrace>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f348475b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) values.get(".msg.appmsg.mpsharetrace.hasfinderelement"), 0);
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.mpsharetrace.lastgmsgid");
        if (str == null) {
            str = "";
        }
        this.f348476c = str;
    }
}
