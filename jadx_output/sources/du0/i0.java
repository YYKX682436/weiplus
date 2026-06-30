package du0;

/* loaded from: classes.dex */
public final class i0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f243362d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243363e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f243364f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f243365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243365g = new du0.q(this);
    }

    public final void O6(com.tencent.maas.model.MJLocation mJLocation, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f243364f = callback;
        if (mJLocation != null) {
            com.tencent.mars.xlog.Log.i("LocationUIC", "requestClipPoi: clipMjLocation latitude " + mJLocation.getLatitude() + " longitude " + mJLocation.getLongitude());
            P6(mJLocation.getLatitude(), mJLocation.getLongitude(), new du0.d0(this));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity context = getContext();
        ((sb0.f) jVar).getClass();
        if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
            com.tencent.mars.xlog.Log.i("LocationUIC", "requestClipPoi: has Permission");
            kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.v(this, null), 3, null);
            return;
        }
        this.f243362d = true;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        java.lang.Object l17 = c17.l(274436, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        if (u11.c.f((java.lang.String) l17)) {
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (kotlin.jvm.internal.o.b(c17.m(u3Var, bool), bool)) {
                com.tencent.mars.xlog.Log.i("LocationUIC", " checkPermissionWithoutRequest gDPRLocationConfirm");
                android.app.Activity context2 = getContext();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", context2.getResources().getString(com.tencent.mm.R.string.f492399gh2));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.n(context2, "webview", ".ui.tools.WebViewUI", intent, 206);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("LocationUIC", " requestPremiss requestPermission");
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity context3 = getContext();
        ((sb0.f) jVar2).getClass();
        j35.u.i(context3, "android.permission.ACCESS_FINE_LOCATION", 64);
    }

    public final void P6(float f17, float f18, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("LocationUIC", "requestLocation: lat " + f17 + " lng " + f18);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.c0(new du0.e0(com.tencent.mm.ui.widget.dialog.u3.f(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), true, 0, null), lVar), f17, f18, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("LocationUIC", " onActivityResult requestCode " + i17 + " resultCode " + i18);
        this.f243363e = false;
        if (i17 != 206) {
            return;
        }
        yz5.l lVar = this.f243365g;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("LocationUIC", " onActivityResult data == null ");
            ((du0.q) lVar).invoke(null);
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
        if (bundleExtra == null) {
            com.tencent.mars.xlog.Log.i("LocationUIC", " onActivityResult bundle == null ");
            ((du0.q) lVar).invoke(null);
        } else {
            if (!kotlin.jvm.internal.o.b(bundleExtra.getString("go_next", ""), "gdpr_auth_location")) {
                com.tencent.mars.xlog.Log.i("LocationUIC", " onActivityResult KNext not NEXT_GDPR_AUTH_LOCATION");
                ((du0.q) lVar).invoke(null);
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity context = getContext();
            ((sb0.f) jVar).getClass();
            j35.u.i(context, "android.permission.ACCESS_FINE_LOCATION", 64);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mars.xlog.Log.i("LocationUIC", " onRequestPermissionsResult requestCode requestCode " + i17 + " permissions " + kz5.z.d0(permissions, null, null, null, 0, null, du0.w.f243453d, 31, null) + " grantResults " + kz5.z.c0(grantResults, null, null, null, 0, null, du0.x.f243454d, 31, null) + " requestClipPoiResult " + this.f243364f);
        if (i17 != 64) {
            return;
        }
        java.lang.Integer S = kz5.z.S(grantResults, 0);
        if (S != null && S.intValue() == 0) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.v(this, null), 3, null);
            return;
        }
        du0.y yVar = new du0.y(this);
        com.tencent.mars.xlog.Log.i("LocationUIC", "showDeniedAlert: ");
        db5.e1.C(getContext(), getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new du0.g0(this, yVar), new du0.h0(yVar));
    }
}
