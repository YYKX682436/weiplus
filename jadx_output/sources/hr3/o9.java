package hr3;

/* loaded from: classes11.dex */
public class o9 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.u9 f283855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f283856e;

    public o9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, hr3.u9 u9Var) {
        this.f283856e = normalProfileHeaderPreference;
        this.f283855d = u9Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17;
        hr3.u9 u9Var = this.f283855d;
        u9Var.B.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        u9Var.B.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = this.f283856e;
        int h17 = com.tencent.mm.ui.bl.h(normalProfileHeaderPreference.f197770d);
        int f17 = i65.a.f(normalProfileHeaderPreference.f197770d, com.tencent.mm.R.dimen.a8h);
        android.content.Context context = normalProfileHeaderPreference.f197770d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        wm3.l lVar = (wm3.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(wm3.l.class);
        if (lVar != null ? lVar.f447281d : false) {
            f17 = i65.a.f(normalProfileHeaderPreference.f197770d, com.tencent.mm.R.dimen.f479688cn);
        } else if (normalProfileHeaderPreference.V) {
            f17 = i65.a.f(normalProfileHeaderPreference.f197770d, com.tencent.mm.R.dimen.a8f);
        } else if (h17 > 0 && (i17 = normalProfileHeaderPreference.X) > 0) {
            f17 = i65.a.f(normalProfileHeaderPreference.f197770d, com.tencent.mm.R.dimen.f479688cn) + i17;
        }
        if ((i18 == 0 && !normalProfileHeaderPreference.V) || (normalProfileHeaderPreference.Y && normalProfileHeaderPreference.W)) {
            f17 += h17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalProfileHeaderPreference", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s, paddingTopToSet:%s,curPaddingTop:%s", java.lang.Integer.valueOf(normalProfileHeaderPreference.X), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(u9Var.B.getPaddingTop()));
        if (f17 == u9Var.B.getPaddingTop()) {
            return true;
        }
        android.view.View view = u9Var.B;
        view.setPadding(view.getPaddingLeft(), f17, u9Var.B.getPaddingRight(), u9Var.B.getPaddingBottom());
        return false;
    }
}
