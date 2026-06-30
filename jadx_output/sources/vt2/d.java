package vt2;

/* loaded from: classes3.dex */
public final class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vt2.g f439946a;

    public d(vt2.g gVar) {
        this.f439946a = gVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        vt2.g gVar = this.f439946a;
        com.tencent.mars.xlog.Log.i(gVar.f439957b, "onReceiveValue value" + ((java.lang.String) obj));
        android.app.Activity context = gVar.f439956a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vt2.g gVar2 = ((zt2.a) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zt2.a.class)).f475574d;
        if (gVar2 != null) {
            gk2.e eVar = dk2.ef.I;
            r45.i56 i56Var = gVar2.f439960e;
            if (eVar == null || i56Var == null) {
                return;
            }
            android.app.Activity activity = gVar2.f439956a;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveShoppingManagerUI");
            kotlinx.coroutines.l.d(((com.tencent.mm.plugin.finder.feed.ui.FinderLiveShoppingManagerUI) activity).f109415v, null, null, new vt2.f(gVar2, eVar, i56Var, null), 3, null);
        }
    }
}
