package zi4;

/* loaded from: classes4.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f473253a;

    /* renamed from: b, reason: collision with root package name */
    public final zi4.h0 f473254b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f473255c;

    public r1(yz5.l callback, zi4.h0 h0Var) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f473253a = callback;
        this.f473254b = h0Var;
    }

    public void a(com.tencent.mm.protobuf.f fVar, long j17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        zi4.h0 h0Var = this.f473254b;
        if (h0Var != null) {
            if (this.f473255c) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f473253a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.status.FLTStatusActionResponse(h0Var.f473180d, j17, errMsg, new com.tencent.pigeon.status.FLTStatusPlatformProto(fVar != null ? fVar.toByteArray() : null)))));
            this.f473255c = true;
        }
    }
}
