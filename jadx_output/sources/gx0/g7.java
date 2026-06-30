package gx0;

/* loaded from: classes5.dex */
public final class g7 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276453a;

    public g7(gx0.w8 w8Var) {
        this.f276453a = w8Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MovieComp.MainComposingUIC", "openReeditLiteApp: failed to open LiteApp!");
        gx0.w8 w8Var = this.f276453a;
        kotlinx.coroutines.y0 mainScope = w8Var.getMainScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(mainScope, kotlinx.coroutines.internal.b0.f310484a, null, new gx0.f7(w8Var, null), 2, null);
    }

    @Override // q80.f0
    public void success() {
        byte[] byteArray;
        byte[] byteArray2;
        com.tencent.mars.xlog.Log.e("MovieComp.MainComposingUIC", "openReeditLiteApp: success to open LiteApp!");
        r45.mi0 mi0Var = this.f276453a.v7().f69357v;
        if (mi0Var != null && (byteArray2 = mi0Var.toByteArray()) != null) {
            gu0.l2.f275762b = byteArray2;
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "openReeditLiteApp: saved effectEditInfoBytes(" + byteArray2.length + " bytes) to SessionManager");
        }
        r45.ab4 ab4Var = this.f276453a.v7().f69356u;
        if (ab4Var != null && (byteArray = ab4Var.toByteArray()) != null) {
            gu0.l2.f275763c = byteArray;
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "openReeditLiteApp: saved localCreateTemplateInfoBytes(" + byteArray.length + " bytes) to SessionManager");
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f276453a.getActivity();
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        if (activity != null) {
            activity.finish();
        }
    }
}
