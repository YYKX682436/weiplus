package za3;

/* loaded from: classes15.dex */
public class o0 implements com.tencent.mm.sdk.platformtools.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f471000a;

    public o0(za3.u0 u0Var) {
        this.f471000a = u0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.t5
    public void onCompletion() {
        za3.u0 u0Var = this.f471000a;
        u0Var.f471037t.d();
        if (u0Var.f471033p != 5) {
            return;
        }
        u0Var.f471033p = 3;
        ((dh4.f0) u0Var.f471039v).s();
        u0Var.f471041x.c(100L, 100L);
    }
}
