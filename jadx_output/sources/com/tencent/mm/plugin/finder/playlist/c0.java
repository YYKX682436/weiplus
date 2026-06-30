package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122269e;

    public c0(com.tencent.mm.plugin.finder.playlist.l0 l0Var, java.lang.String str) {
        this.f122268d = l0Var;
        this.f122269e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context l17 = this.f122268d.l();
        pf5.z zVar = pf5.z.f353948a;
        if (!(l17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((androidx.appcompat.app.AppCompatActivity) l17).e(nr2.u0.class);
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(view);
            u0Var.O6(view, this.f122269e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
