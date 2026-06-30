package df2;

/* loaded from: classes3.dex */
public final class pz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231119d;

    public pz(df2.a00 a00Var) {
        this.f231119d = a00Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.xb2 xb2Var = (r45.xb2) obj;
        if ((xb2Var != null ? (r45.bb7) xb2Var.getCustom(0) : null) != null) {
            df2.a00 a00Var = this.f231119d;
            com.tencent.mm.plugin.finder.live.util.y.o(a00Var, null, null, new df2.oz(a00Var, xb2Var, null), 3, null);
        } else {
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = this.f231119d.c7();
            if (c76 != null) {
                c76.c();
            }
        }
    }
}
