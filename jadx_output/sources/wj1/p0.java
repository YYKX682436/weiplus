package wj1;

/* loaded from: classes14.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.q0 f446629d;

    public p0(wj1.q0 q0Var) {
        this.f446629d = q0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        wj1.q0 q0Var = this.f446629d;
        r45.jc jcVar = (r45.jc) q0Var.f446630d.f89552e.f378582f.get(menuItem.getItemId());
        if (jcVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "not find phone_id, menuItem id :%d", java.lang.Integer.valueOf(menuItem.getItemId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "select menuItem id:%d, phone_id:%s, show_phone:%s, bank_type:%s", java.lang.Integer.valueOf(menuItem.getItemId()), jcVar.f377692d, jcVar.f377693e, jcVar.f377694f);
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = q0Var.f446630d;
        appBrandIDCardVerifyPwdFrag.f89553f = jcVar;
        appBrandIDCardVerifyPwdFrag.f89558n.setText(jcVar.f377693e);
    }
}
