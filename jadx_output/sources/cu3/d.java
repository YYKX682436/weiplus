package cu3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f222466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f222467b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f222468c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f222469d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f222470e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f222471f;

    public d(android.view.View effectLayout, int i17, java.lang.String effectName, yz5.l onSelect) {
        kotlin.jvm.internal.o.g(effectLayout, "effectLayout");
        kotlin.jvm.internal.o.g(effectName, "effectName");
        kotlin.jvm.internal.o.g(onSelect, "onSelect");
        this.f222466a = effectLayout;
        this.f222467b = i17;
        this.f222468c = onSelect;
        android.view.View findViewById = effectLayout.findViewById(com.tencent.mm.R.id.kv6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f222469d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = effectLayout.findViewById(com.tencent.mm.R.id.kv8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f222470e = findViewById2;
        android.view.View findViewById3 = effectLayout.findViewById(com.tencent.mm.R.id.kv9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        effectLayout.setOnClickListener(new cu3.c(this));
        ((android.widget.TextView) findViewById3).setText(effectName);
    }

    public final void a() {
        android.view.View view = this.f222470e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222468c.invoke(java.lang.Integer.valueOf(this.f222467b));
    }
}
