package ye5;

/* loaded from: classes9.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461246e;

    public c0(yb5.d dVar, rd5.d dVar2) {
        this.f461245d = dVar;
        this.f461246e = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e1 fromNewsJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        java.util.Iterator it = q26.y.d(view.getParent(), n3.w1.f334433d).iterator();
        while (true) {
            if (!it.hasNext()) {
                chattingMediaGroupMvvmView = 0;
                break;
            } else {
                chattingMediaGroupMvvmView = it.next();
                if (((android.view.ViewParent) chattingMediaGroupMvvmView) instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) {
                    break;
                }
            }
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView2 = chattingMediaGroupMvvmView instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView ? chattingMediaGroupMvvmView : null;
        int i17 = 0;
        boolean z17 = (chattingMediaGroupMvvmView2 == null || chattingMediaGroupMvvmView2.fromNewsJumpInfo == null) ? false : true;
        if (chattingMediaGroupMvvmView2 != null && (fromNewsJumpInfo = chattingMediaGroupMvvmView2.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f204784a;
        }
        com.tencent.mm.ui.chatting.m5 m5Var = new com.tencent.mm.ui.chatting.m5();
        m5Var.b(new com.tencent.mm.ui.chatting.f5(z17, i17));
        ze5.y9 y9Var = new ze5.y9(this.f461245d);
        y9Var.f472329g = 4;
        y9Var.f472330h = m5Var;
        y9Var.c(this.f461246e.f394254d.f445300b, view);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
