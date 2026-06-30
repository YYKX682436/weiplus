package kotlin.jvm.internal;

/* loaded from: classes15.dex */
public class j0 {
    public f06.g a(kotlin.jvm.internal.l lVar) {
        return lVar;
    }

    public f06.d b(java.lang.Class cls) {
        return new kotlin.jvm.internal.g(cls);
    }

    public f06.f c(java.lang.Class cls, java.lang.String str) {
        return new kotlin.jvm.internal.w(cls, str);
    }

    public f06.j d(kotlin.jvm.internal.r rVar) {
        return rVar;
    }

    public f06.l e(kotlin.jvm.internal.t tVar) {
        return tVar;
    }

    public f06.s f(kotlin.jvm.internal.x xVar) {
        return xVar;
    }

    public f06.u g(kotlin.jvm.internal.z zVar) {
        return zVar;
    }

    public java.lang.String h(kotlin.jvm.internal.k kVar) {
        java.lang.String obj = kVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public java.lang.String i(kotlin.jvm.internal.q qVar) {
        return h(qVar);
    }
}
