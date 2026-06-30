package so2;

/* loaded from: classes10.dex */
public final class k6 implements com.tencent.mm.plugin.finder.convert.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f410457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f410458b;

    public k6(so2.m6 m6Var, android.widget.TextView textView) {
        this.f410457a = m6Var;
        this.f410458b = textView;
    }

    public void a(boolean z17, android.text.SpannableStringBuilder spannableStringBuilder) {
        com.tencent.mars.xlog.Log.i("Finder.SyncGetImageModel", "onGetDescText type match isNeedRefresh:" + z17 + ' ' + ((java.lang.Object) spannableStringBuilder) + " pos:" + this.f410457a.f410487g + " hashCode:" + hashCode());
        if (!z17 || spannableStringBuilder == null) {
            return;
        }
        this.f410458b.setText(spannableStringBuilder);
    }
}
