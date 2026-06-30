package yu0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final yu0.c f465786a;

    /* renamed from: b, reason: collision with root package name */
    public final yu0.s f465787b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f465788c;

    public e(yu0.c task, yu0.s resultData, boolean z17) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(resultData, "resultData");
        this.f465786a = task;
        this.f465787b = resultData;
        this.f465788c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.e)) {
            return false;
        }
        yu0.e eVar = (yu0.e) obj;
        return kotlin.jvm.internal.o.b(this.f465786a, eVar.f465786a) && kotlin.jvm.internal.o.b(this.f465787b, eVar.f465787b) && this.f465788c == eVar.f465788c;
    }

    public int hashCode() {
        return (((this.f465786a.hashCode() * 31) + this.f465787b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f465788c);
    }

    public java.lang.String toString() {
        return "AudioTaskResult(task=" + this.f465786a + ", resultData=" + this.f465787b + ", isCancel=" + this.f465788c + ')';
    }
}
