package jq4;

/* loaded from: classes5.dex */
public final class b0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.c0 f301124d;

    public b0(jq4.c0 c0Var) {
        this.f301124d = c0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        jq4.c0 c0Var = this.f301124d;
        android.widget.TextView textView = c0Var.f301131c;
        if (textView != null) {
            java.lang.String[] strArr = c0Var.f301129a;
            textView.setText(strArr[c0Var.f301133e % strArr.length]);
        }
        c0Var.f301133e++;
        return true;
    }
}
