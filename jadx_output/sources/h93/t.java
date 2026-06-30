package h93;

/* loaded from: classes11.dex */
public final class t extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279729g;

    /* renamed from: h, reason: collision with root package name */
    public final int f279730h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279729g = "MicroMsg.SearchLabelPanel";
        this.f279730h = 2;
    }

    @Override // h93.c
    public int P6() {
        return this.f279730h;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f279729g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.tencent.mm.R.string.o77);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        boolean containsKey;
        kotlin.jvm.internal.o.g(keyword, "keyword");
        if (list == null || list.isEmpty()) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        O6().e();
        java.util.Iterator it = list.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            h93.k Q6 = Q6();
            if (str == null) {
                Q6.getClass();
                containsKey = false;
            } else {
                containsKey = Q6.f279708d.containsKey(str);
            }
            O6().d(str, containsKey);
            if (str.equals(keyword)) {
                z17 = true;
            }
        }
        if (z17) {
            O6().setNeedNewLebal(false);
            return;
        }
        O6().setNeedNewLebal(true);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel O6 = O6();
        java.lang.String string = getActivity().getString(com.tencent.mm.R.string.o9z, keyword);
        O6.U = com.tencent.mm.R.layout.e3p;
        O6.V = string;
        O6.x();
        O6.postInvalidate();
        O6().setClickNewLebalCallBack(new h93.s(this));
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel O62 = O6();
        if (O62.P) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.MMLabelPanel", "addNeedNewLabel.");
            db5.b7 b7Var = O62.R;
            if (b7Var == null || b7Var.f228297c == null) {
                O62.x();
            }
            O62.addView(O62.R.f228297c);
        }
    }

    public android.view.View V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u8l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.label.ui.widget.MMLabelPanel O6() {
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.u8i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) findViewById;
    }
}
