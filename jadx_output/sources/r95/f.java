package r95;

/* loaded from: classes10.dex */
public final class f extends r95.c {

    /* renamed from: b, reason: collision with root package name */
    public s95.n f393457b = s95.o.f405154g.toBuilder();

    public f() {
        this.f393452a = s95.n0.f405134z.toBuilder();
    }

    public final java.lang.String c() {
        java.lang.String str;
        s95.m0 m0Var = (s95.m0) a();
        java.lang.Object obj = m0Var.f405115e;
        if (obj instanceof java.lang.String) {
            str = (java.lang.String) obj;
        } else {
            str = ((com.google.protobuf.y) obj).r();
            m0Var.f405115e = str;
        }
        kotlin.jvm.internal.o.c(str, "innerBuilder.path");
        return str;
    }

    public void d(byte[] data) {
        kotlin.jvm.internal.o.h(data, "data");
        this.f393452a = ((s95.n0) s95.n0.A.parseFrom(data)).toBuilder();
        s95.o oVar = ((s95.m0) a()).f405128u;
        if (oVar == null) {
            oVar = s95.o.f405154g;
        }
        this.f393457b = oVar.toBuilder();
    }

    public final void e(int i17) {
        s95.m0 m0Var = (s95.m0) a();
        s95.v vVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? s95.v.UNRECOGNIZED : s95.v.CenterInside : s95.v.CenterCrop : s95.v.Custom;
        m0Var.getClass();
        m0Var.f405130w = vVar.getNumber();
        m0Var.onChanged();
    }

    public final void f(r95.e value) {
        kotlin.jvm.internal.o.h(value, "value");
        s95.m0 m0Var = (s95.m0) a();
        m0Var.f405117g = value.f393455a;
        m0Var.onChanged();
        s95.m0 m0Var2 = (s95.m0) a();
        m0Var2.f405118h = value.f393456b;
        m0Var2.onChanged();
    }

    public final void g(r95.e value) {
        kotlin.jvm.internal.o.h(value, "value");
        s95.m0 m0Var = (s95.m0) a();
        m0Var.f405119i = value.f393455a;
        m0Var.onChanged();
        s95.m0 m0Var2 = (s95.m0) a();
        m0Var2.f405120m = value.f393456b;
        m0Var2.onChanged();
    }

    public java.lang.String toString() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Track(trackId:");
        sb6.append(((s95.m0) a()).f405114d);
        sb6.append(" path:");
        sb6.append(c());
        sb6.append(" trackType:");
        s95.u a17 = s95.u.a(((s95.m0) a()).f405116f);
        if (a17 == null) {
            a17 = s95.u.UNRECOGNIZED;
        }
        int ordinal = a17.ordinal();
        if (ordinal != 1) {
            i17 = 3;
            if (ordinal != 2) {
                i17 = ordinal != 3 ? 0 : 1;
            }
        } else {
            i17 = 2;
        }
        sb6.append(i17);
        sb6.append(" source:");
        sb6.append(new r95.e(((s95.m0) a()).f405117g, ((s95.m0) a()).f405118h));
        sb6.append("  track:");
        sb6.append(new r95.e(((s95.m0) a()).f405119i, ((s95.m0) a()).f405120m));
        sb6.append(" playRate:");
        sb6.append(((s95.m0) a()).f405127t);
        sb6.append(" volume:");
        sb6.append(((s95.m0) a()).f405125r);
        sb6.append(" rotate:");
        sb6.append(((s95.m0) a()).f405126s);
        sb6.append(" resolution:");
        sb6.append(new r95.d(((s95.m0) a()).f405122o, ((s95.m0) a()).f405123p));
        sb6.append(" contentCrop:");
        s95.v a18 = s95.v.a(((s95.m0) a()).f405130w);
        if (a18 == null) {
            a18 = s95.v.UNRECOGNIZED;
        }
        int ordinal2 = a18.ordinal();
        sb6.append(ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? 4 : 2 : 1 : 0);
        sb6.append(" displayRect:");
        s95.o oVar = ((s95.m0) a()).f405128u;
        if (oVar == null) {
            oVar = s95.o.f405154g;
        }
        kotlin.jvm.internal.o.c(oVar, "innerBuilder.cropInfo");
        s95.y h17 = oVar.h();
        kotlin.jvm.internal.o.c(h17, "innerBuilder.cropInfo.displayRect");
        sb6.append(r95.a.b(h17));
        sb6.append(')');
        return sb6.toString();
    }
}
