package rs2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {

    /* renamed from: v, reason: collision with root package name */
    public boolean f399328v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f399328v = true;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new rs2.a(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dse;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void l7(int i17) {
        if (this.f399328v) {
            this.f399328v = false;
        } else {
            if (i17 < 0 || i17 >= f7().size()) {
                return;
            }
            boolean z17 = ((zx2.i) f7().get(i17)) instanceof rs2.b;
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new rs2.e(this, bundle, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f399328v = true;
    }
}
