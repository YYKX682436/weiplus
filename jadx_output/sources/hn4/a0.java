package hn4;

/* loaded from: classes15.dex */
public class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.c0 f282544d;

    public a0(hn4.c0 c0Var) {
        this.f282544d = c0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        hn4.c0 c0Var = this.f282544d;
        c0Var.w();
        c0Var.F.d();
        return false;
    }
}
