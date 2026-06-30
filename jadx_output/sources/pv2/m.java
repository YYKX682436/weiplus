package pv2;

/* loaded from: classes10.dex */
public abstract class m implements pv2.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f358582d;

    public m(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f358582d = taskId;
    }

    @Override // pv2.g
    public java.lang.String b() {
        return this.f358582d;
    }

    public abstract pv2.g c();

    public abstract void d(pv2.g gVar);

    public abstract void e(pv2.g gVar);

    public abstract void f(pv2.g gVar);
}
