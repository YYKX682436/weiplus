package hr3;

/* loaded from: classes11.dex */
public class dh implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283500h;

    public dh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.LinkedList linkedList, r45.dz3 dz3Var, java.util.LinkedList linkedList2) {
        this.f283500h = sayHiWithSnsPermissionUI;
        this.f283493a = str;
        this.f283494b = str2;
        this.f283495c = str3;
        this.f283496d = map;
        this.f283497e = linkedList;
        this.f283498f = dz3Var;
        this.f283499g = linkedList2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283500h;
        boolean z17 = sayHiWithSnsPermissionUI.H;
        java.util.LinkedList linkedList = this.f283497e;
        java.util.Map map = this.f283496d;
        java.lang.String str5 = this.f283493a;
        if (i17 == -4000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
            r35.a aVar = new r35.a(sayHiWithSnsPermissionUI, null);
            if (sayHiWithSnsPermissionUI.H) {
                str5 = "";
            }
            aVar.H = str5;
            aVar.f369019t = this.f283494b;
            aVar.f369020u = this.f283495c;
            aVar.I = map;
            aVar.f369018s = sayHiWithSnsPermissionUI.f153823p;
            aVar.f369007e = new hr3.zg(this);
            aVar.f369022w = false;
            aVar.G = new hr3.ah(this);
            aVar.L = str4;
            gm0.j1.i();
            aVar.k(sayHiWithSnsPermissionUI, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(sayHiWithSnsPermissionUI.f153826q, true), sayHiWithSnsPermissionUI.f153826q, linkedList);
            sayHiWithSnsPermissionUI.Z6();
            sayHiWithSnsPermissionUI.f153822o = db5.e1.Q(sayHiWithSnsPermissionUI.getContext(), sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.iin), true, true, new hr3.bh(this, aVar));
        } else if (sayHiWithSnsPermissionUI.H) {
            sayHiWithSnsPermissionUI.getClass();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(sayHiWithSnsPermissionUI.f153826q, true);
            if (n17 != null) {
                sayHiWithSnsPermissionUI.M1 = sayHiWithSnsPermissionUI.getResources().getString(com.tencent.mm.R.string.bj9, n17.P0());
            } else {
                sayHiWithSnsPermissionUI.M1 = sayHiWithSnsPermissionUI.getResources().getString(com.tencent.mm.R.string.bj_);
            }
            sayHiWithSnsPermissionUI.K1 = android.view.View.inflate(sayHiWithSnsPermissionUI, com.tencent.mm.R.layout.ckf, null);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(sayHiWithSnsPermissionUI.M1 == null);
            java.lang.String str6 = sayHiWithSnsPermissionUI.M1;
            objArr[1] = java.lang.Integer.valueOf(str6 == null ? 0 : str6.length());
            objArr[2] = sayHiWithSnsPermissionUI.M1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sayHiWithSnsPermissionUI.M1)) {
                ((android.widget.TextView) sayHiWithSnsPermissionUI.K1.findViewById(com.tencent.mm.R.id.mmq)).setText(sayHiWithSnsPermissionUI.M1);
            }
            sayHiWithSnsPermissionUI.N1 = sayHiWithSnsPermissionUI.K1.findViewById(com.tencent.mm.R.id.d9b);
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) sayHiWithSnsPermissionUI.K1.findViewById(com.tencent.mm.R.id.mmp);
            sayHiWithSnsPermissionUI.L1 = mMLimitedClearEditText;
            mMLimitedClearEditText.setText((java.lang.String) null);
            sayHiWithSnsPermissionUI.L1.setVisibility(8);
            android.view.View view = sayHiWithSnsPermissionUI.N1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.dialog.j0 z18 = db5.e1.z(sayHiWithSnsPermissionUI, "", null, sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.bj7), sayHiWithSnsPermissionUI.K1, new hr3.ng(sayHiWithSnsPermissionUI), new hr3.og(sayHiWithSnsPermissionUI));
            sayHiWithSnsPermissionUI.J1 = z18;
            if (z18 == null) {
                sayHiWithSnsPermissionUI.onStop();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "dealAddContactError, resend request ver.");
            java.lang.String stringExtra = sayHiWithSnsPermissionUI.getIntent().getStringExtra("source_from_user_name");
            java.lang.String stringExtra2 = sayHiWithSnsPermissionUI.getIntent().getStringExtra("source_from_nick_name");
            r35.e4 e4Var = new r35.e4(sayHiWithSnsPermissionUI, null);
            e4Var.f369094q = str5;
            e4Var.f369096s = stringExtra;
            e4Var.f369097t = stringExtra2;
            e4Var.f369095r = map;
            e4Var.f369098u = sayHiWithSnsPermissionUI.f153823p;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(sayHiWithSnsPermissionUI.b7(sayHiWithSnsPermissionUI.L));
            e4Var.f369091n = linkedList2;
            e4Var.f369103z = this.f283498f;
            e4Var.g(this.f283499g, linkedList);
            sayHiWithSnsPermissionUI.Z6();
            sayHiWithSnsPermissionUI.f153822o = db5.e1.Q(sayHiWithSnsPermissionUI.getContext(), sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.f490573yv), sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.iin), true, true, new hr3.ch(this, e4Var));
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436679e, vg3.b.f436645e, vg3.c.f436655g, 0, new java.util.ArrayList(java.util.Collections.singletonList(sayHiWithSnsPermissionUI.f153826q))));
        }
        return true;
    }
}
