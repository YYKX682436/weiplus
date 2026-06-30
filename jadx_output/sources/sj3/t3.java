package sj3;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f408747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408748e;

    public t3(android.content.Intent intent, sj3.d4 d4Var) {
        this.f408747d = intent;
        this.f408748e = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setOnClickListener(null);
        android.content.Intent intent = this.f408747d;
        intent.addFlags(268435456);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        sj3.d4 d4Var = this.f408748e;
        d4Var.f408479h = new com.tencent.mm.sdk.platformtools.b4(new sj3.r3(d4Var), false);
        com.tencent.mm.sdk.platformtools.b4 b4Var = d4Var.f408479h;
        if (b4Var != null) {
            b4Var.c(2000L, 2000L);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new sj3.s3(d4Var), 200L);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
