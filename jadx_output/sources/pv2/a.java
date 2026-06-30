package pv2;

/* loaded from: classes10.dex */
public abstract class a implements pv2.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f358572d;

    public a(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f358572d = taskId;
    }

    @Override // pv2.g
    public java.lang.String b() {
        return this.f358572d;
    }

    public abstract void c();
}
