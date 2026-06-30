package w65;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final w65.q f443362a;

    /* renamed from: b, reason: collision with root package name */
    public final w65.m f443363b;

    /* renamed from: c, reason: collision with root package name */
    public int f443364c;

    /* renamed from: d, reason: collision with root package name */
    public float f443365d;

    public p(w65.q status, w65.m task) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(task, "task");
        this.f443362a = status;
        this.f443363b = task;
    }

    public java.lang.String toString() {
        return "id:" + this.f443363b.id() + " status:" + this.f443362a + " ret:" + this.f443364c + " taskPercent:" + this.f443365d;
    }
}
