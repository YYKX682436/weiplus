package za3;

/* loaded from: classes15.dex */
public class n0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f470998d;

    public n0(za3.u0 u0Var) {
        this.f470998d = u0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f470998d.a();
        return false;
    }
}
