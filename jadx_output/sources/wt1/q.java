package wt1;

/* loaded from: classes13.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.p f449339d;

    public q(wt1.p pVar) {
        this.f449339d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        wt1.p pVar = this.f449339d;
        pVar.c();
        pVar.e();
        return true;
    }
}
