package u1;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u1.b2 f423606a;

    public j(boolean z17) {
        jz5.h.a(jz5.i.f302831f, u1.i.f423599d);
        this.f423606a = new u1.b2(new u1.h());
    }

    public final void a(u1.w node) {
        kotlin.jvm.internal.o.g(node, "node");
        if (!node.x()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f423606a.add(node);
    }

    public final boolean b(u1.w node) {
        kotlin.jvm.internal.o.g(node, "node");
        if (node.x()) {
            return this.f423606a.remove(node);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public java.lang.String toString() {
        java.lang.String obj = this.f423606a.toString();
        kotlin.jvm.internal.o.f(obj, "set.toString()");
        return obj;
    }
}
