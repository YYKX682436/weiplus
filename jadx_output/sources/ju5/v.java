package ju5;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.y f302162d;

    public v(ju5.y yVar) {
        this.f302162d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f302162d.f302167c.f302173h;
        if (dVar != null) {
            pe4.g gVar = (pe4.g) dVar;
            gVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen success");
            pe4.m mVar = gVar.f353701a;
            mVar.f353708j = false;
            mVar.f353709k = null;
            if (mVar.f353717a.f394522d.booleanValue()) {
                return;
            }
            mVar.f353712n.removeCallbacks(mVar.f353716r);
            mVar.f353711m.setImageResource(com.tencent.mm.R.drawable.c5q);
            android.widget.TextView textView = mVar.f353712n;
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f479531a83));
            android.widget.TextView textView2 = mVar.f353712n;
            textView2.setText(textView2.getResources().getString(com.tencent.mm.R.string.jiu));
        }
    }
}
