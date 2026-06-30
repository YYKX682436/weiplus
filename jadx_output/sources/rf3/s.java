package rf3;

/* loaded from: classes12.dex */
public final class s implements cg3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf3.u f395000a;

    public s(rf3.u uVar) {
        this.f395000a = uVar;
    }

    @Override // cg3.c
    public android.graphics.Matrix a() {
        return this.f395000a.S().a().getMainMatrix();
    }

    @Override // cg3.c
    public android.view.View getView() {
        rf3.u uVar = this.f395000a;
        android.view.View activeView = ((com.tencent.mm.plugin.media.image.SwitchableImageContainer) ((jz5.n) uVar.f395006s).getValue()).getActiveView();
        if (activeView != null) {
            return activeView;
        }
        com.tencent.mm.ui.base.MultiTouchImageView b17 = uVar.S().b();
        kotlin.jvm.internal.o.f(b17, "getNormalImage(...)");
        return b17;
    }
}
