package rt0;

/* loaded from: classes9.dex */
public final class b extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public long f399372b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f399373c = "";

    @Override // ot0.h
    public ot0.h a() {
        rt0.b bVar = new rt0.b();
        bVar.f399372b = this.f399372b;
        bVar.f399373c = this.f399373c;
        return bVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(content.f348666i))) {
            this.f399372b = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) values.get(".msg.appmsg.appattach.overwrite_newmsgid"), 0L);
            java.lang.String str = (java.lang.String) values.get(".msg.appmsg.appattach.fileuploadtoken");
            if (str == null) {
                str = "";
            }
            this.f399373c = str;
        }
    }

    public final java.lang.String f() {
        return this.f399373c;
    }

    public final long g() {
        return this.f399372b;
    }
}
