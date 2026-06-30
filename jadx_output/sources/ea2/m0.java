package ea2;

/* loaded from: classes3.dex */
public final class m0 extends x92.o {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f250573n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f250573n = jz5.h.b(new ea2.l0(activity));
    }

    @Override // x92.o, x92.r
    public void O6(int i17, java.lang.String str) {
        super.O6(i17, str);
        ((da2.a) ((jz5.n) this.f250573n).getValue()).a(i17, str);
    }

    @Override // x92.o, x92.r
    public void P6(int i17, java.lang.String str) {
        super.P6(i17, str);
        com.tencent.mars.xlog.Log.i("FinderMusicTopicTipsUIC", "responseCode:" + i17 + " errMsg:" + str);
        if (str == null || str.length() == 0) {
            if (getActivity().isFinishing()) {
                return;
            }
            getActivity().finish();
            return;
        }
        da2.a aVar = (da2.a) ((jz5.n) this.f250573n).getValue();
        android.widget.TextView textView = aVar.f2494d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = aVar.f2491a;
        if (textView != null) {
            if (str == null) {
                str = appCompatActivity.getResources().getString(com.tencent.mm.R.string.eqa);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = aVar.f2495e;
        if (textView2 != null) {
            textView2.setText("");
        }
        android.widget.Button button = aVar.f2492b;
        if (button != null) {
            button.setTextColor(appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Brand_BG_100));
        }
    }
}
