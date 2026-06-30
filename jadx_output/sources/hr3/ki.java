package hr3;

/* loaded from: classes11.dex */
public class ki implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283736h;

    public ki(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.LinkedList linkedList, r45.dz3 dz3Var, java.util.LinkedList linkedList2) {
        this.f283736h = sayHiWithSnsPermissionUI3;
        this.f283729a = str;
        this.f283730b = str2;
        this.f283731c = str3;
        this.f283732d = map;
        this.f283733e = linkedList;
        this.f283734f = dz3Var;
        this.f283735g = linkedList2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        java.util.LinkedList linkedList = this.f283733e;
        java.util.Map map = this.f283732d;
        java.lang.String str5 = this.f283729a;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283736h;
        if (i17 == -4000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
            r35.a aVar = new r35.a(sayHiWithSnsPermissionUI3, null);
            if (sayHiWithSnsPermissionUI3.V) {
                str5 = "";
            }
            aVar.H = str5;
            aVar.f369019t = this.f283730b;
            aVar.f369020u = this.f283731c;
            aVar.I = map;
            aVar.f369018s = sayHiWithSnsPermissionUI3.f153859u;
            aVar.f369007e = new hr3.gi(this);
            aVar.f369022w = false;
            aVar.G = new hr3.hi(this);
            aVar.L = str4;
            gm0.j1.i();
            aVar.k(sayHiWithSnsPermissionUI3, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI3.f153860v, true), sayHiWithSnsPermissionUI3.f153860v, linkedList);
            sayHiWithSnsPermissionUI3.Y6();
            sayHiWithSnsPermissionUI3.f153858t = db5.e1.Q(sayHiWithSnsPermissionUI3.getContext(), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.iin), true, true, new hr3.ii(this, aVar));
        } else if (sayHiWithSnsPermissionUI3.V) {
            sayHiWithSnsPermissionUI3.getClass();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(sayHiWithSnsPermissionUI3.f153860v, true);
            if (n17 != null) {
                sayHiWithSnsPermissionUI3.P1 = sayHiWithSnsPermissionUI3.getResources().getString(com.tencent.mm.R.string.bj9, n17.P0());
            } else {
                sayHiWithSnsPermissionUI3.P1 = sayHiWithSnsPermissionUI3.getResources().getString(com.tencent.mm.R.string.bj_);
            }
            sayHiWithSnsPermissionUI3.N1 = android.view.View.inflate(sayHiWithSnsPermissionUI3, com.tencent.mm.R.layout.ckf, null);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(sayHiWithSnsPermissionUI3.P1 == null);
            java.lang.String str6 = sayHiWithSnsPermissionUI3.P1;
            objArr[1] = java.lang.Integer.valueOf(str6 == null ? 0 : str6.length());
            objArr[2] = sayHiWithSnsPermissionUI3.P1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sayHiWithSnsPermissionUI3.P1)) {
                ((android.widget.TextView) sayHiWithSnsPermissionUI3.N1.findViewById(com.tencent.mm.R.id.mmq)).setText(sayHiWithSnsPermissionUI3.P1);
            }
            sayHiWithSnsPermissionUI3.Q1 = sayHiWithSnsPermissionUI3.N1.findViewById(com.tencent.mm.R.id.d9b);
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) sayHiWithSnsPermissionUI3.N1.findViewById(com.tencent.mm.R.id.mmp);
            sayHiWithSnsPermissionUI3.O1 = mMLimitedClearEditText;
            mMLimitedClearEditText.setText((java.lang.String) null);
            sayHiWithSnsPermissionUI3.O1.setVisibility(8);
            android.view.View view = sayHiWithSnsPermissionUI3.Q1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.dialog.j0 z17 = db5.e1.z(sayHiWithSnsPermissionUI3, "", null, sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.bj7), sayHiWithSnsPermissionUI3.N1, new hr3.uh(sayHiWithSnsPermissionUI3), new hr3.vh(sayHiWithSnsPermissionUI3));
            sayHiWithSnsPermissionUI3.M1 = z17;
            if (z17 == null) {
                sayHiWithSnsPermissionUI3.onStop();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "dealAddContactError, resend request ver.");
            java.lang.String stringExtra = sayHiWithSnsPermissionUI3.getIntent().getStringExtra("source_from_user_name");
            java.lang.String stringExtra2 = sayHiWithSnsPermissionUI3.getIntent().getStringExtra("source_from_nick_name");
            r35.e4 e4Var = new r35.e4(sayHiWithSnsPermissionUI3, null);
            e4Var.f369094q = str5;
            e4Var.f369096s = stringExtra;
            e4Var.f369097t = stringExtra2;
            e4Var.f369095r = map;
            e4Var.f369098u = sayHiWithSnsPermissionUI3.f153859u;
            e4Var.f369103z = this.f283734f;
            e4Var.g(this.f283735g, linkedList);
            sayHiWithSnsPermissionUI3.Y6();
            sayHiWithSnsPermissionUI3.f153858t = db5.e1.Q(sayHiWithSnsPermissionUI3.getContext(), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.iin), true, true, new hr3.ji(this, e4Var));
        }
        return true;
    }
}
