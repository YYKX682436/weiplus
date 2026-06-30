package w11;

/* loaded from: classes11.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f442095a;

    /* renamed from: b, reason: collision with root package name */
    public long f442096b;

    public final boolean a() {
        if (this.f442095a == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("SendMsgCgiFactory", "[execute] cgi is null. %s", new com.tencent.mm.sdk.platformtools.z3());
        }
        java.util.Objects.requireNonNull(this.f442095a);
        return ((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.h(this.f442095a, 0);
    }
}
