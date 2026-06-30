package pe4;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353707d;

    public l(pe4.m mVar) {
        this.f353707d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pe4.m mVar = this.f353707d;
        android.widget.TextView textView = mVar.f353712n;
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f479230ti));
        android.widget.TextView textView2 = mVar.f353712n;
        textView2.setText(textView2.getResources().getString(com.tencent.mm.R.string.jit));
        mVar.f353711m.setImageResource(com.tencent.mm.R.drawable.c5o);
    }
}
