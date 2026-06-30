package fj4;

/* loaded from: classes11.dex */
public abstract class b {
    public static final mj4.h a(pj4.n1 n1Var) {
        kotlin.jvm.internal.o.g(n1Var, "<this>");
        mj4.j jVar = new mj4.j(new mj4.k(new mj4.a()));
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        jVar.h(a17);
        java.lang.String text_status_id = n1Var.f355199d;
        kotlin.jvm.internal.o.f(text_status_id, "text_status_id");
        jVar.g(text_status_id);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f355204i);
        java.util.HashMap hashMap = jVar.f327066b;
        hashMap.put("field_referenceCount", valueOf);
        jVar.b(n1Var.f355202g);
        hashMap.put("field_CommentCount", java.lang.Integer.valueOf(n1Var.f355206n));
        java.lang.String str = n1Var.f355207o;
        if (!(str == null || str.length() == 0)) {
            jVar.d(android.util.Base64.decode(n1Var.f355207o, 0));
        }
        pj4.b0 b0Var = new pj4.b0();
        try {
            b0Var.parseFrom(android.util.Base64.decode(n1Var.f355201f, 0));
            return ((mj4.j) ni4.x.f337776d.f(jVar, b0Var)).a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("TextStatusHistory", th6, "parse TextStatusHistory err id" + n1Var.f355199d, new java.lang.Object[0]);
            return jVar.a();
        }
    }
}
