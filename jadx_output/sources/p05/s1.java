package p05;

/* loaded from: classes10.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f350681a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350682b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350683c;

    /* renamed from: d, reason: collision with root package name */
    public int f350684d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350685e;

    /* renamed from: f, reason: collision with root package name */
    public long f350686f;

    public s1(long j17, java.lang.String animationId, java.lang.String path, int i17, boolean z17, long j18, int i18, kotlin.jvm.internal.i iVar) {
        j18 = (i18 & 32) != 0 ? java.lang.System.currentTimeMillis() : j18;
        kotlin.jvm.internal.o.g(animationId, "animationId");
        kotlin.jvm.internal.o.g(path, "path");
        this.f350681a = j17;
        this.f350682b = animationId;
        this.f350683c = path;
        this.f350684d = i17;
        this.f350685e = z17;
        this.f350686f = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.s1)) {
            return false;
        }
        p05.s1 s1Var = (p05.s1) obj;
        return this.f350681a == s1Var.f350681a && kotlin.jvm.internal.o.b(this.f350682b, s1Var.f350682b) && kotlin.jvm.internal.o.b(this.f350683c, s1Var.f350683c) && this.f350684d == s1Var.f350684d && this.f350685e == s1Var.f350685e && this.f350686f == s1Var.f350686f;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f350681a) * 31) + this.f350682b.hashCode()) * 31) + this.f350683c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f350684d)) * 31) + java.lang.Boolean.hashCode(this.f350685e)) * 31) + java.lang.Long.hashCode(this.f350686f);
    }

    public java.lang.String toString() {
        return "RunningAnimationInfo(glPtr=" + this.f350681a + ", animationId=" + this.f350682b + ", path=" + this.f350683c + ", animationStage=" + this.f350684d + ", isSimplicity=" + this.f350685e + ", lastExecuteCmdTime=" + this.f350686f + ')';
    }
}
