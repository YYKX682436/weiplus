package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f117205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6() {
        android.view.View view = this.f117205d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485128gn3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117205d = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gis);
        findViewById2.post(new com.tencent.mm.plugin.finder.live.viewmodel.i(findViewById2));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.j(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.cme);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById3);
        findViewById(com.tencent.mm.R.id.f483977cm1).setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.k(this));
    }
}
