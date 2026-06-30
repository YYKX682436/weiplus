package x51;

/* loaded from: classes.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452011e;

    public g1(java.lang.String str, android.content.Context context) {
        this.f452010d = str;
        this.f452011e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f452010d);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, this.f452011e);
    }
}
