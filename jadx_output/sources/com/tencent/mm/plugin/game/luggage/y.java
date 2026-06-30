package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes.dex */
public class y implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f140036b;

    public y(com.tencent.mm.plugin.game.luggage.a0 a0Var, android.content.Context context, android.content.Intent intent) {
        this.f140035a = context;
        this.f140036b = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-8388609)));
        android.content.Context context = this.f140035a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f140036b);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/LuggageGameInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/luggage/LuggageGameInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
