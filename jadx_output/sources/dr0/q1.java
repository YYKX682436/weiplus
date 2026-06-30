package dr0;

/* loaded from: classes12.dex */
public final class q1 extends java.lang.InterruptedException {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f242500d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f242501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String abortBy, java.lang.String reason) {
        super("abortBy=" + abortBy + ", reason=" + reason);
        kotlin.jvm.internal.o.g(abortBy, "abortBy");
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f242500d = abortBy;
        this.f242501e = reason;
    }
}
