package f00;

/* loaded from: classes.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.o f258319d;

    public n(f00.o oVar) {
        this.f258319d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick data:");
        f00.o oVar = this.f258319d;
        sb6.append(oVar.f258321b);
        com.tencent.mars.xlog.Log.i("EcsProductWxaCoverWidget", sb6.toString());
        com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(oVar.f258321b), f00.h.class, f00.m.f258318d, null);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
