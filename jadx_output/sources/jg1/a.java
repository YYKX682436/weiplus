package jg1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg1.b f299641d;

    public a(jg1.b bVar) {
        this.f299641d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeyBoardComponentView", "clear all views runnable");
        jg1.b bVar = this.f299641d;
        com.tencent.mm.plugin.appbrand.page.ia iaVar = bVar.f299646g;
        if (iaVar != null) {
            iaVar.h();
        }
        android.widget.LinearLayout linearLayout = bVar.f299644e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }
}
