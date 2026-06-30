package rx4;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f401250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.b f401251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx4.d f401253g;

    public q(rx4.s sVar, rx4.b bVar, int i17, rx4.d dVar) {
        this.f401250d = sVar;
        this.f401251e = bVar;
        this.f401252f = i17;
        this.f401253g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String g07;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$renderDramaContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.s sVar = this.f401250d;
        sVar.hideVKB();
        vu4.a aVar = vu4.a.f440243m;
        sVar.getClass();
        rx4.b bVar = this.f401251e;
        if (bVar.f401100g.length() > 0) {
            g07 = bVar.f401100g;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drama click docInfo empty, idx=");
            int i17 = this.f401252f;
            sb6.append(i17);
            sb6.append(", hotword=");
            java.lang.String str2 = bVar.f401095b;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.w(sVar.f401259d, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i18 = i17 + 1;
            sb7.append(i18);
            sb7.append('|');
            sb7.append(i18);
            g07 = kz5.n0.g0(kz5.c0.i(sb7.toString(), bVar.f401096c, "", "0", fp.s0.b(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "", "", "short_dramas", "1"), "|", null, null, 0, null, null, 62, null);
        }
        java.lang.String docInfo = g07;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sVar.f401260e);
        sb8.append("|42|");
        rx4.d dVar = sVar.f401262g;
        if (dVar == null || (str = dVar.f401124b) == null) {
            str = "";
        }
        sb8.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        java.lang.String itemInfo = sb8.toString();
        boolean z17 = sVar.f401261f;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        android.app.Activity context = sVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        h2Var.a7();
        h2Var.q7(aVar, itemInfo, docInfo, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f401183y)));
        android.app.Activity context2 = sVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((rx4.h2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(rx4.h2.class)).m7(this.f401253g.f401125c, bVar.f401095b, bVar.f401099f);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$renderDramaContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
