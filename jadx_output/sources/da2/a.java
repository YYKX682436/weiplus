package da2;

/* loaded from: classes3.dex */
public final class a extends aa2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        b();
    }

    @Override // aa2.b
    public void a(int i17, java.lang.String str) {
        android.widget.TextView textView = this.f2494d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f2491a;
        if (textView != null) {
            if (str == null) {
                str = appCompatActivity.getResources().getString(com.tencent.mm.R.string.eqa);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.f2495e;
        if (textView2 != null) {
            textView2.setText(appCompatActivity.getResources().getString(com.tencent.mm.R.string.eqb));
        }
        android.widget.Button button = this.f2492b;
        if (button != null) {
            button.setTextColor(appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Brand_BG_100));
        }
    }
}
