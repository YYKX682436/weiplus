package s65;

/* loaded from: classes11.dex */
public class j0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s65.m0 f403485d;

    public j0(s65.m0 m0Var) {
        this.f403485d = m0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f403485d.a(true);
        return true;
    }
}
