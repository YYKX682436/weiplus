package jw3;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw3.i f302320d;

    public e(jw3.i iVar) {
        this.f302320d = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        jw3.i iVar = this.f302320d;
        iVar.getClass();
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        iw3.f fVar = iw3.f.f295237b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f340822b;
        if (arrayList.contains(fVar)) {
            arrayList.remove(fVar);
            arrayList.size();
        }
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = iVar.f302335t;
        if (boxWebView != null) {
            boxWebView.destroy();
        }
        iVar.f302335t = null;
        zg0.q2 q2Var = iVar.f302326h;
        if (q2Var != null) {
            ((com.tencent.mm.plugin.webview.core.e3) q2Var).D0();
        }
        android.content.Context context = iVar.f302325g;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        int hashCode = context.hashCode();
        java.util.Map map = hw3.a.f285583a;
        if (map != null) {
            uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(hashCode));
            if (vVar != null) {
                vVar.f426290j = null;
                vVar.f426285e = "";
            }
            ((java.util.concurrent.ConcurrentHashMap) hw3.a.f285583a).clear();
            hw3.a.f285583a = null;
        }
        iVar.f302329n = null;
    }
}
