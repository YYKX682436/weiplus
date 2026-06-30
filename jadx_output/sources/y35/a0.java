package y35;

/* loaded from: classes.dex */
public class a0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f459184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference f459185e;

    public a0(com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference, android.view.View view) {
        this.f459185e = helperHeaderPreference;
        this.f459184d = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f459184d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = this.f459185e;
        int b17 = i65.a.b(helperHeaderPreference.f197770d, 60);
        int h17 = com.tencent.mm.ui.bl.h(helperHeaderPreference.f197770d);
        int a17 = com.tencent.mm.ui.bl.a(helperHeaderPreference.f197770d);
        com.tencent.mars.xlog.Log.i("MicroMsg.HelperHeaderPreference", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i17));
        if (h17 > 0 && a17 > 0) {
            b17 = a17 + i65.a.f(helperHeaderPreference.f197770d, com.tencent.mm.R.dimen.f479688cn);
        }
        if (i17 == 0) {
            b17 += h17;
        }
        if (b17 == view.getPaddingTop()) {
            return true;
        }
        view.setPadding(view.getPaddingLeft(), b17, view.getPaddingRight(), view.getPaddingBottom());
        return false;
    }
}
