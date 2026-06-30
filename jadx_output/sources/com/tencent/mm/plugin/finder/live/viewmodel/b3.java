package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f116918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f116919e;

    public b3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f116918d = m3Var;
        this.f116919e = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$authButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f116918d;
        kotlinx.coroutines.l.d(m3Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.a3(m3Var, this.f116919e, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$authButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
