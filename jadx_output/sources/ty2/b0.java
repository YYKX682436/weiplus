package ty2;

/* loaded from: classes9.dex */
public final class b0 extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f423061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f423106f, config);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(14.0f);
        textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.a0c));
        textView.setMaxLines(2);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f423061d = textView;
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        ty2.c cVar = this.f423060c.f423131f;
        ty2.a0 a0Var = cVar instanceof ty2.a0 ? (ty2.a0) cVar : null;
        if (a0Var == null) {
            a0Var = new ty2.a0(1, 0.0f);
        }
        android.widget.TextView textView = this.f423061d;
        if (a0Var.f423056a == 2) {
            textView.setMaxLines(2);
            textView.setMinLines(2);
        } else {
            int i17 = item.Y;
            textView.setMaxLines(i17 > 0 ? i17 : 2);
            textView.setMinLines(0);
        }
        textView.setLineSpacing(i65.a.a(this.f423058a, a0Var.f423057b), 1.0f);
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.util.LinkedList<bw5.l5> linkedList = item.V;
        kotlin.jvm.internal.o.f(linkedList, "getIconImgs(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            bw5.l5 l5Var = (bw5.l5) it.next();
            if (l5Var.f29642g[1]) {
                str = l5Var.f29639d;
            }
            arrayList.add(str);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (bw5.l5 l5Var2 : linkedList) {
            arrayList2.add(java.lang.Float.valueOf((l5Var2.f29640e * 1.0f) / l5Var2.f29641f));
        }
        java.lang.String title = item.getTitle();
        ((com.tencent.mm.feature.finder.live.v4) w0Var).zk(textView, arrayList, arrayList2, title == null ? "" : title, i65.a.b(textView.getContext(), 16), true);
        i95.m c18 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        s40.w0 w0Var2 = (s40.w0) c18;
        java.lang.String a17 = a();
        kotlinx.coroutines.y0 a18 = v65.m.a(textView);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (bw5.l5 l5Var3 : linkedList) {
            arrayList3.add(l5Var3.f29642g[1] ? l5Var3.f29639d : "");
        }
        java.lang.String title2 = item.getTitle();
        s40.w0.X4(w0Var2, a17, a18, textView, arrayList3, title2 == null ? "" : title2, true, false, true, true, 0, 0, null, null, 7680, null);
        return textView;
    }
}
