package lm4;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm4.c0 f319562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f319563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(lm4.c0 c0Var, lm4.i0 i0Var) {
        super(0);
        this.f319562d = c0Var;
        this.f319563e = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        lm4.c0 c0Var = lm4.c0.f319544d;
        lm4.c0 c0Var2 = this.f319562d;
        lm4.i0 i0Var = this.f319563e;
        if (c0Var2 == c0Var) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = i0Var.f319568d;
            java.lang.Object obj = vASCommonFragment != null ? vASCommonFragment.f211121p : null;
            m40.p0 p0Var = obj instanceof m40.p0 ? (m40.p0) obj : null;
            if (p0Var != null) {
                z17 = ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) p0Var).d7();
            }
            z17 = true;
        } else {
            if (i0Var.f319574m != 0) {
                z17 = false;
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
