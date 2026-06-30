package dr0;

/* loaded from: classes12.dex */
public final class y1 {
    public y1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        jz5.g gVar = dr0.z1.f242580d;
        synchronized (((java.util.List) gVar.getValue())) {
            dr0.y1 y1Var = dr0.z1.f242579c;
            ((java.util.List) gVar.getValue()).add(new dr0.z1(tag, msg));
        }
    }
}
