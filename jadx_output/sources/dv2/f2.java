package dv2;

/* loaded from: classes3.dex */
public final class f2 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f243852d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f243853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243853e = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(getActivity());
        this.f243852d = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f243852d;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f243852d;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        java.util.Iterator it = new java.util.ArrayList(this.f243853e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.tools.c5) it.next()).w2(i17, z17);
        }
    }
}
