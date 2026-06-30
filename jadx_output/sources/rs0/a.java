package rs0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399287a;

    /* renamed from: b, reason: collision with root package name */
    public final fp.j f399288b;

    public a(java.lang.String taskName) {
        kotlin.jvm.internal.o.g(taskName, "taskName");
        this.f399287a = taskName;
        fp.j jVar = new fp.j();
        this.f399288b = jVar;
        jVar.b();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CodeUtil", toString());
    }

    public java.lang.String toString() {
        return "CodeMan task " + this.f399287a + " cost : " + this.f399288b.a();
    }
}
