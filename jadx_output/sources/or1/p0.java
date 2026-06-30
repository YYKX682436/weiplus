package or1;

/* loaded from: classes9.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.s0 f347551d;

    public p0(or1.s0 s0Var) {
        this.f347551d = s0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        or1.s0 s0Var = this.f347551d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f347567d) && menuItem.getItemId() == 1) {
            java.lang.String str = s0Var.f347567d;
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView) s0Var.f347570g.get();
            if (enterpriseBizContactListView == null) {
                return;
            }
            android.content.Context context = enterpriseBizContactListView.getContext();
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.c17), "", context.getString(com.tencent.mm.R.string.f491127c16), context.getString(com.tencent.mm.R.string.f490347sg), new or1.r0(s0Var, str, context), null);
        }
    }
}
