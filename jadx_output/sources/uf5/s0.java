package uf5;

/* loaded from: classes10.dex */
public class s0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.t0 f427296d;

    public s0(uf5.t0 t0Var) {
        this.f427296d = t0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        uf5.t0 t0Var = this.f427296d;
        java.lang.String obj = t0Var.f427300e.f207108o.getText().toString();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            t0Var.f427300e.f207107n.setVisible(com.tencent.mm.sdk.platformtools.t8.K0(obj));
        }
        uf5.w0 w0Var = t0Var.f427300e.f207103g;
        if (!w0Var.f427317q.equalsIgnoreCase(obj)) {
            w0Var.f427317q = obj;
        }
        w0Var.s();
        return false;
    }
}
