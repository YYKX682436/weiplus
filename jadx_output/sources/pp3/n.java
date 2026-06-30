package pp3;

/* loaded from: classes5.dex */
public final class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f357491d;

    public n(pp3.u uVar) {
        this.f357491d = uVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pp3.u uVar = this.f357491d;
        com.tencent.mars.xlog.Log.i(uVar.f357500g, "errorTimeHandler callback");
        android.widget.TextView textView = (android.widget.TextView) uVar.findViewById(com.tencent.mm.R.id.kpz);
        if (textView != null) {
            textView.setText(uVar.f357499f.getString(com.tencent.mm.R.string.hg8));
        }
        if (textView == null) {
            return false;
        }
        textView.setTextColor(i65.a.d(uVar.f357499f, com.tencent.mm.R.color.f478873jj));
        return false;
    }
}
