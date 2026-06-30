package tx2;

/* loaded from: classes.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f422564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422566f;

    public g0(r45.h32 h32Var, tx2.i0 i0Var, java.lang.String str) {
        this.f422564d = h32Var;
        this.f422565e = i0Var;
        this.f422566f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.h32 h32Var = this.f422564d;
        r45.t75 t75Var = (r45.t75) h32Var.getCustom(16);
        intent.putExtra("rawUrl", t75Var != null ? t75Var.getString(3) : null);
        intent.putExtra("convertActivityFromTranslucent", true);
        tx2.i0 i0Var = this.f422565e;
        j45.l.j(i0Var.f118381d, "webview", ".ui.tools.WebViewUI", intent, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        linkedHashMap.put("notice_id", string);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.A;
        android.content.Context context = i0Var.f118381d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, null, java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5)), null, this.f422566f, false, 84, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
