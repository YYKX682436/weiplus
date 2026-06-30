package xi1;

/* loaded from: classes7.dex */
public class a implements xi1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi1.b f454686a;

    public a(xi1.b bVar) {
        this.f454686a = bVar;
    }

    @Override // xi1.k
    public android.view.ViewGroup a(android.view.View view) {
        xi1.g gVar = this.f454686a.f454688b;
        android.app.Activity w17 = gVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0 ? ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) gVar).w() : null;
        return w17 == null ? (android.view.ViewGroup) view.getRootView() : (android.view.ViewGroup) w17.getWindow().getDecorView();
    }
}
