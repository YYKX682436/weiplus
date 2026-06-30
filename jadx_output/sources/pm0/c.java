package pm0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356763a;

    /* renamed from: b, reason: collision with root package name */
    public final fp.j f356764b;

    public c(java.lang.String taskName) {
        kotlin.jvm.internal.o.g(taskName, "taskName");
        this.f356763a = taskName;
        fp.j jVar = new fp.j();
        this.f356764b = jVar;
        jVar.b();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CodeUtil", toString());
    }

    public java.lang.String toString() {
        return "CodeMan task " + this.f356763a + " cost : " + this.f356764b.a();
    }
}
