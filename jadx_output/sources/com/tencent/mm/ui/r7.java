package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MainTabUI f209601e;

    public r7(android.content.Context context, com.tencent.mm.ui.MainTabUI mainTabUI) {
        this.f209600d = context;
        this.f209601e = mainTabUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.t7 t7Var = com.tencent.mm.ui.t7.f209881a;
        com.tencent.mm.ui.MainTabUI mainTabUI = this.f209601e;
        int i17 = mainTabUI != null ? mainTabUI.f196925e : 0;
        if (i17 == 0) {
            if ((mainTabUI != null ? mainTabUI.g() : null) instanceof com.tencent.mm.ui.conversation.MainUI) {
                com.tencent.mm.ui.MMFragment g17 = mainTabUI.g();
                kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.MainUI");
            }
        }
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        android.content.Context context = this.f209600d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((s50.g0) vVar).Bi((android.app.Activity) context, i17);
        yj0.a.h(this, "com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
