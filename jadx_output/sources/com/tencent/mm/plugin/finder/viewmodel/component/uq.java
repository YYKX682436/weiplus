package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class uq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f136159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f136160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(android.view.View view, android.view.View view2, android.widget.TextView textView, r45.zk2 zk2Var, java.lang.String str) {
        super(0);
        this.f136157d = view;
        this.f136158e = view2;
        this.f136159f = textView;
        this.f136160g = zk2Var;
        this.f136161h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f136157d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f136158e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = this.f136160g.getString(1);
        if (string == null) {
            string = this.f136161h;
        }
        this.f136159f.setText(string);
        return jz5.f0.f302826a;
    }
}
