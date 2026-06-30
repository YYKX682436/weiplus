package fn3;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f264470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264471b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f264472c;

    public h(com.tencent.mm.protobuf.f fVar, int i17, java.lang.String errMsg, int i18, kotlin.jvm.internal.i iVar) {
        fVar = (i18 & 1) != 0 ? null : fVar;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        errMsg = (i18 & 4) != 0 ? "" : errMsg;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f264470a = fVar;
        this.f264471b = i17;
        this.f264472c = errMsg;
    }
}
