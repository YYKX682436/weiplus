package tf5;

/* loaded from: classes5.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f419003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419004e;

    static {
        new tf5.l(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f419003d = c01.id.c();
    }

    public static final void O6(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "addressbook_cell");
        aVar.fk(view, "addressbook_cell_type", java.lang.Integer.valueOf(i17));
        aVar.Ai(view, new tf5.k(context));
        aVar.ik(view, 8, 33926);
    }

    public final void P6(java.lang.String str) {
        if (this.f419004e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(this.f419003d)), new jz5.l("view_id", str)), 33926);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        P6("search_button_contact_tab");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        android.content.ComponentName component;
        super.onStartActivityForResult(intent, i17, bundle);
        if (kotlin.jvm.internal.o.b((intent == null || (component = intent.getComponent()) == null) ? null : component.getClassName(), com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.class.getName())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmAddressReportUIC", "onStartActivityForResult() FMessageConversationUI");
            if (intent != null) {
                pf5.j0.a(intent, tf5.j.class);
                intent.putExtra("MvvmAddressReportUIC_session_id", this.f419003d);
            }
        }
    }
}
