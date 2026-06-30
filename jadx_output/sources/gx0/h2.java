package gx0;

/* loaded from: classes5.dex */
public final class h2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276486d;

    public h2(gx0.u2 u2Var) {
        this.f276486d = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((com.tencent.maas.model.time.MJTime) obj) == null) {
            return;
        }
        ow0.q0.h(this.f276486d);
    }
}
