package gh;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f271850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        super(0);
        this.f271850d = magicBrushView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f271850d;
        java.lang.Object surface = magicBrushView.f48652e.getSurface();
        if (surface != null) {
            gh.s.a(magicBrushView.f48661q, surface, 1, 1, false, false, 16, null);
        }
        return jz5.f0.f302826a;
    }
}
