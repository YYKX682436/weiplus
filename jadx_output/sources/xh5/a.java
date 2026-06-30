package xh5;

/* loaded from: classes3.dex */
public final class a extends lf3.n implements dg3.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dg3.m
    public void Z0(mf3.k info, mf3.p apiCenter, dg3.q type) {
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        int i17 = ordinal != 0 ? ordinal != 1 ? ordinal != 9 ? -1 : com.tencent.mm.R.id.dgu : com.tencent.mm.R.id.d2y : com.tencent.mm.R.id.ozx;
        if (getActivity().isDestroyed() || getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.e("ChatMenuComponent", "performMenuClick " + type.f232352d + " error, activity is not valid");
            return;
        }
        if (i17 == -1 || (findViewById = getActivity().findViewById(i17)) == null) {
            return;
        }
        findViewById.performClick();
    }

    @Override // dg3.m
    public void y6(mf3.k info, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        if (getActivity().isDestroyed() || getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.e("ChatMenuComponent", "showMenu error, activity is not valid");
            return;
        }
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.t1l);
        if (findViewById != null) {
            findViewById.performClick();
        }
    }
}
