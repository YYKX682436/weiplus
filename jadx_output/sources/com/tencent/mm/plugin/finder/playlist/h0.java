package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122316d;

    public h0(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        this.f122316d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context l17 = this.f122316d.l();
        pf5.z zVar = pf5.z.f353948a;
        if (!(l17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) l17).a(com.tencent.mm.plugin.finder.member.preview.f0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.member.preview.f0.V6((com.tencent.mm.plugin.finder.member.preview.f0) a17, view, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
