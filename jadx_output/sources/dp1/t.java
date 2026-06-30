package dp1;

/* loaded from: classes8.dex */
public class t implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f242174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp1.w f242175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dp1.u f242176c;

    public t(dp1.u uVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, dp1.w wVar) {
        this.f242176c = uVar;
        this.f242174a = atomicInteger;
        this.f242175b = wVar;
    }

    @Override // db5.d
    public void onComplete(boolean z17) {
        if (!z17 && this.f242174a.getAndIncrement() < 1) {
            db5.f.c(this.f242176c.getActivity(), new dp1.s(this));
            return;
        }
        dp1.w wVar = this.f242175b;
        if (wVar != null) {
            ((com.tencent.mm.plugin.ball.ui.z) wVar).a(z17);
        }
    }
}
