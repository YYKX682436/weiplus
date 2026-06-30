package yf5;

/* loaded from: classes5.dex */
public final class d0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f461862d;

    public d0(yf5.n nVar) {
        this.f461862d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        yf5.n nVar = this.f461862d;
        nVar.f461914a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_launcher_avatar_hardware, (((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.tencent.mm.sdk.platformtools.v8.a(com.tencent.mm.sdk.platformtools.z.f193112h)) ? 1 : 0) == 1;
        if (fp.h.c(30) && wo.w0.q() && nVar.f461914a.isHardwareAccelerated() && z17) {
            nVar.f461914a.setLayerType(2, null);
        }
        return true;
    }
}
