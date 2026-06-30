package rx4;

/* loaded from: classes8.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f401237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.c f401238e;

    public n(rx4.s sVar, rx4.c cVar) {
        this.f401237d = sVar;
        this.f401238e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$addMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.s sVar = this.f401237d;
        sVar.hideVKB();
        android.app.Activity context = sVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        rx4.c cVar = this.f401238e;
        java.lang.String str2 = cVar.f401111c == 1 ? "top_more" : "bottom_more";
        vu4.a aVar = vu4.a.f440248r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(sVar.f401260e);
        sb6.append("|42|");
        rx4.d dVar = sVar.f401262g;
        if (dVar == null || (str = dVar.f401124b) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        java.lang.String itemInfo = sb6.toString();
        java.lang.String docInfo = "0|0|" + str2 + "||0||||more|2";
        boolean z17 = sVar.f401261f;
        kz5.q0 extInfo = (16 & 16) != 0 ? kz5.q0.f314001d : null;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        h2Var.a7();
        h2Var.q7(aVar, itemInfo, docInfo, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f401183y)));
        sVar.getClass();
        if (cVar.f401112d > 0) {
            try {
                sVar.U6(cVar);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(sVar.f401259d, "handleMoreJump error: " + e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$addMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
