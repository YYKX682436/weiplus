package h93;

/* loaded from: classes11.dex */
public final class o extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279721g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f279722h;

    /* renamed from: i, reason: collision with root package name */
    public final int f279723i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279721g = "MicroMsg.MyLabelPanel";
        this.f279722h = jz5.h.b(new h93.n(this));
        this.f279723i = 1;
    }

    @Override // h93.c
    public int P6() {
        return this.f279723i;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f279721g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.tencent.mm.R.string.f492377o73);
        jz5.g gVar = this.f279722h;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new h93.l(this));
        O6().setNeedNewLebal(true);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel O6 = O6();
        O6.U = com.tencent.mm.R.layout.e3p;
        O6.V = null;
        O6.x();
        O6.postInvalidate();
        O6().setClickNewLebalCallBack(new h93.m(this));
    }

    @Override // h93.c
    public void T6(java.util.ArrayList selectedList) {
        kotlin.jvm.internal.o.g(selectedList, "selectedList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set<java.lang.String> keySet = Q6().f279710f.f338698a.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            if (selectedList.contains(str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        O6().r(selectedList, arrayList);
        O6().v(this.f279695e, this.f279694d, "3", 33926);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        if (list != null) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public android.view.View V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u8j);
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
