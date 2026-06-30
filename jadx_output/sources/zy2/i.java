package zy2;

/* loaded from: classes4.dex */
public final class i extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.kv2 f477411b = new r45.kv2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.i iVar = new zy2.i();
        iVar.f477411b = this.f477411b;
        return iVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append(zy2.d5.f(this.f477411b));
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        this.f477411b = zy2.d5.j(".msg.appmsg", values);
    }

    public final java.lang.String f() {
        java.lang.String string;
        java.lang.String string2 = this.f477411b.getString(16);
        if ((string2 == null || string2.length() == 0) || kotlin.jvm.internal.o.b("null", this.f477411b.getString(16))) {
            string = this.f477411b.getString(3);
            if (string == null) {
                return "";
            }
        } else {
            string = this.f477411b.getString(16);
            if (string == null) {
                return "";
            }
        }
        return string;
    }

    public final java.lang.String g() {
        java.lang.String string;
        java.lang.String string2 = this.f477411b.getString(15);
        if ((string2 == null || string2.length() == 0) || kotlin.jvm.internal.o.b("null", this.f477411b.getString(15))) {
            string = this.f477411b.getString(2);
            if (string == null) {
                return "";
            }
        } else {
            string = this.f477411b.getString(15);
            if (string == null) {
                return "";
            }
        }
        return string;
    }

    public final r45.kv2 h() {
        return this.f477411b;
    }
}
