package fp0;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public fp0.c f265246d;

    /* renamed from: e, reason: collision with root package name */
    public fp0.v f265247e;

    public abstract void a();

    public void b(fp0.u status) {
        kotlin.jvm.internal.o.g(status, "status");
        fp0.v vVar = this.f265247e;
        if (vVar != null) {
            pm0.v.X(new fp0.g(((fp0.h) vVar).f265256a, this, status));
        } else {
            kotlin.jvm.internal.o.o("watch");
            throw null;
        }
    }

    public boolean c(fp0.d newTask) {
        kotlin.jvm.internal.o.g(newTask, "newTask");
        return true;
    }

    public abstract java.lang.String d();
}
