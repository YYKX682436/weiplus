package rx4;

/* loaded from: classes3.dex */
public final class n2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f401241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401241d = jz5.h.b(new rx4.j2(activity));
    }

    public final com.tencent.mm.ui.tools.f5 T6() {
        return (com.tencent.mm.ui.tools.f5) ((jz5.n) this.f401241d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        S6(rx4.k2.f401217d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        T6().f210400e = new rx4.l2(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        T6().d();
        T6().f210400e = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        T6().d();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        getRootView().post(new rx4.m2(this));
    }
}
