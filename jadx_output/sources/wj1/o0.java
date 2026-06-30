package wj1;

/* loaded from: classes14.dex */
public class o0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.q0 f446622d;

    public o0(wj1.q0 q0Var) {
        this.f446622d = q0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        wj1.q0 q0Var = this.f446622d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_list.size %d", java.lang.Integer.valueOf(q0Var.f446630d.f89552e.f378582f.size()));
        java.util.Iterator it = q0Var.f446630d.f89552e.f378582f.iterator();
        while (it.hasNext()) {
            r45.jc jcVar = (r45.jc) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(jcVar.f377692d) || com.tencent.mm.sdk.platformtools.t8.K0(jcVar.f377693e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_id or show_phone is empty, continue");
            } else {
                g4Var.f(q0Var.f446630d.f89552e.f378582f.indexOf(jcVar), jcVar.f377693e);
            }
        }
    }
}
