package gn4;

/* loaded from: classes15.dex */
public class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.c0 f273587d;

    public a0(gn4.c0 c0Var) {
        this.f273587d = c0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gn4.c0 c0Var = this.f273587d;
        c0Var.w();
        c0Var.f273599x0.d();
        return false;
    }
}
