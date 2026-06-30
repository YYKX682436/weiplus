package kt4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f312038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt4.h f312039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kt4.n f312041g;

    public l(kt4.n nVar, android.widget.EditText editText, jt4.h hVar, android.widget.TextView textView) {
        this.f312041g = nVar;
        this.f312038d = editText;
        this.f312039e = hVar;
        this.f312040f = textView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "click verify btn");
        java.lang.String obj = this.f312038d.getText().toString();
        int length = obj.length();
        kt4.n nVar = this.f312041g;
        if (length == 11) {
            nVar.f338834b.c(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
            r45.pz4 pz4Var = (r45.pz4) ((com.tencent.mm.modelbase.o) this.f312039e.getReqResp()).f70710a.f70684a;
            nVar.f312044d.f213801c.putInt("key_verify_scene", 2);
            nVar.f338834b.d(new jt4.h(kt4.r.F(nVar.f312044d), pz4Var.f383492e, pz4Var.f383493f, obj, pz4Var.f383496i, nVar.f312044d.G(), true, false, 2, pz4Var.f383501q), true);
            return;
        }
        r45.wz3 wz3Var = new r45.wz3();
        r45.td0 td0Var = new r45.td0();
        wz3Var.f389597f = td0Var;
        td0Var.f386319d = nVar.f338833a.getString(com.tencent.mm.R.string.f491075bt3);
        wz3Var.f389597f.f386320e = "#FA5151";
        r45.td0 td0Var2 = new r45.td0();
        wz3Var.f389598g = td0Var2;
        td0Var2.f386319d = nVar.f338833a.getString(com.tencent.mm.R.string.f491074bt2);
        wz3Var.f389598g.f386320e = "#0C4F8E";
        nVar.g(wz3Var, this.f312040f);
    }
}
