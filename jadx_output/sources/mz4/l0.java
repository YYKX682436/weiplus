package mz4;

/* loaded from: classes12.dex */
public class l0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.j0 f333317d;

    public l0(mz4.j0 j0Var) {
        this.f333317d = j0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        mz4.j0 j0Var = this.f333317d;
        if (-1 == j0Var.f333301i) {
            return false;
        }
        j0Var.a();
        return true;
    }
}
