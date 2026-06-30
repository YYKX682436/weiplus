package or0;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347428d;

    public b(java.lang.String str) {
        this.f347428d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = or0.c.f347431c;
        if (textView == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f347428d);
        sb6.append('\n');
        or0.e eVar = or0.c.f347434f;
        sb6.append("平均帧率:" + eVar.f347446b.f347444d + "\n实时帧率:" + eVar.f347447c);
        textView.setText(sb6.toString());
    }
}
