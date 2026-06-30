package ye5;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461285e;

    public u(yb5.d dVar, rd5.d dVar2) {
        this.f461284d = dVar;
        this.f461285e = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$expandOptBtnCreator$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f461284d;
        sb5.a0 a0Var = (sb5.a0) dVar.f460708c.a(sb5.a0.class);
        if (a0Var != null) {
            kotlin.jvm.internal.o.d(view);
            ((com.tencent.mm.ui.chatting.component.o4) a0Var).p0(view);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$expandOptBtnCreator$2$1$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$expandOptBtnCreator$2$1$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.chatting.component.v4 v4Var = (com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) dVar.f460708c.a(sb5.b0.class));
        rd5.d dVar2 = this.f461285e;
        v4Var.m0(dVar2);
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ai(dVar2.f394254d.f445300b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$expandOptBtnCreator$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
