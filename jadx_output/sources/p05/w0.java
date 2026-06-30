package p05;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350716a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f350718c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Float[] f350719d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Float[] f350720e;

    public w0(java.lang.String animationId, java.lang.String path, long j17, java.lang.Float[] startPos, java.lang.Float[] detectRegion, int i17, kotlin.jvm.internal.i iVar) {
        startPos = (i17 & 8) != 0 ? new java.lang.Float[]{java.lang.Float.valueOf(0.1f), java.lang.Float.valueOf(0.1f)} : startPos;
        detectRegion = (i17 & 16) != 0 ? new java.lang.Float[]{java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.0f)} : detectRegion;
        kotlin.jvm.internal.o.g(animationId, "animationId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(startPos, "startPos");
        kotlin.jvm.internal.o.g(detectRegion, "detectRegion");
        this.f350716a = animationId;
        this.f350717b = path;
        this.f350718c = j17;
        this.f350719d = startPos;
        this.f350720e = detectRegion;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(p05.w0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.xlabeffect.IPkGiftEffect.EffectCommandData");
        p05.w0 w0Var = (p05.w0) obj;
        if (kotlin.jvm.internal.o.b(this.f350716a, w0Var.f350716a) && kotlin.jvm.internal.o.b(this.f350717b, w0Var.f350717b) && java.util.Arrays.equals(this.f350719d, w0Var.f350719d)) {
            return java.util.Arrays.equals(this.f350720e, w0Var.f350720e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f350716a.hashCode() * 31) + this.f350717b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f350719d)) * 31) + java.util.Arrays.hashCode(this.f350720e);
    }

    public java.lang.String toString() {
        return "EffectCommandData(animationId=" + this.f350716a + ", path=" + this.f350717b + ", giftCount=" + this.f350718c + ", startPos=" + java.util.Arrays.toString(this.f350719d) + ", detectRegion=" + java.util.Arrays.toString(this.f350720e) + ')';
    }
}
