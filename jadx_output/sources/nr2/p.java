package nr2;

/* loaded from: classes2.dex */
public final class p extends com.tencent.mm.ui.component.UIComponent implements zy2.l9 {

    /* renamed from: d, reason: collision with root package name */
    public long f339282d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f339283e;

    /* renamed from: f, reason: collision with root package name */
    public gx2.q f339284f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f339285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        gx2.q qVar = this.f339284f;
        if (!(qVar != null ? qVar.isDrawerOpen : false)) {
            return super.onBackPressed();
        }
        if (qVar == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f339284f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
