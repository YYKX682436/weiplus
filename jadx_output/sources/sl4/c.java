package sl4;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.g f409255d;

    public c(sl4.g gVar) {
        this.f409255d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/playapp/base/floatball/TingBaseFloatBallHelper$onCoverClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sl4.g gVar = this.f409255d;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "TingBaseFloatBallHelper onFloatBallCoverClick %s", gVar.f409260o);
        gVar.x0(qk.y9.f364382e);
        if (gVar.f409268w == null) {
            gVar.f409268w = gVar.f0();
        }
        bl4.a aVar = gVar.f409268w;
        if (aVar != null) {
            aVar.setOnCoverClickListener(null);
        }
        gVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/playapp/base/floatball/TingBaseFloatBallHelper$onCoverClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
