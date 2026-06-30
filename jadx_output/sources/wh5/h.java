package wh5;

/* loaded from: classes12.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446067d;

    public h(wh5.s sVar) {
        this.f446067d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s sVar = this.f446067d;
        sVar.a0();
        sVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - sVar.B < 500) {
            sVar.Q("handleLivePlayClick return", new java.lang.Object[0]);
        } else {
            sVar.Q("handleLivePlayClick", new java.lang.Object[0]);
            sVar.B = currentTimeMillis;
            em.n1 n1Var = sVar.f446089v;
            if (n1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            n1Var.c().c();
            em.n1 n1Var2 = sVar.f446089v;
            if (n1Var2 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            n1Var2.c().d();
            sVar.k0();
        }
        vh5.a.f437197c++;
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
