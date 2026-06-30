package gm0;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.network.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.y f273276a;

    public u(gm0.y yVar) {
        this.f273276a = yVar;
    }

    @Override // com.tencent.mm.network.l
    public com.tencent.mm.network.s a() {
        try {
            return this.f273276a.f273288b.f70764d;
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            return null;
        }
    }
}
