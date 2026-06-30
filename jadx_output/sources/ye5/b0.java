package ye5;

/* loaded from: classes9.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f461242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461243f;

    public b0(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, rd5.d dVar2) {
        this.f461241d = dVar;
        this.f461242e = a0Var;
        this.f461243f = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
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
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
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
        new ze5.u6(this.f461241d, this.f461242e, 4, this.f461243f.f394254d.f445300b, view, false, m5Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
