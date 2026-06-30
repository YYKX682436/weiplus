package zi4;

/* loaded from: classes4.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f473259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f473260b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f473261c;

    public s1(com.tencent.mm.protobuf.f fVar, long j17, java.lang.String errMsg, int i17, kotlin.jvm.internal.i iVar) {
        fVar = (i17 & 1) != 0 ? null : fVar;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        errMsg = (i17 & 4) != 0 ? "" : errMsg;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f473259a = fVar;
        this.f473260b = j17;
        this.f473261c = errMsg;
    }
}
