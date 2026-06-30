package df5;

/* loaded from: classes10.dex */
public final class m1 extends df5.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final df5.e f232167a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df5.e task) {
        super(null);
        kotlin.jvm.internal.o.g(task, "task");
        this.f232167a = task;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.m1) && kotlin.jvm.internal.o.b(this.f232167a, ((df5.m1) obj).f232167a);
    }

    public int hashCode() {
        return this.f232167a.hashCode();
    }

    public java.lang.String toString() {
        return "Feed(task=" + this.f232167a + ')';
    }
}
