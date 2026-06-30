package rf4;

/* loaded from: classes4.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        super(2);
        this.f395128d = storyMsgView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.ArrayList arrayList3;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(content, "content");
        int i17 = com.tencent.mm.plugin.story.ui.view.StoryMsgView.H;
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395128d;
        storyMsgView.getClass();
        if (booleanValue) {
            storyMsgView.f172026x.remove(storyMsgView.f172022t);
            storyMsgView.f172027y = null;
            gf4.a h17 = gf4.l.f271354d.h(storyMsgView.f172025w, content, storyMsgView.f172022t, storyMsgView.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), storyMsgView.f172023u, storyMsgView.f172024v);
            if4.a aVar = storyMsgView.f172019q;
            if (aVar != null && (linkedList2 = aVar.f291240h) != null) {
                linkedList2.add(h17);
            }
            if4.a aVar2 = storyMsgView.f172019q;
            if (aVar2 != null && (linkedList = aVar2.f291239g) != null) {
                linkedList.add(h17);
            }
            pf4.a0 a0Var = storyMsgView.f172017o;
            if (a0Var != null && (arrayList3 = a0Var.f353838f) != null) {
                arrayList3.add(h17);
            }
            boolean z17 = storyMsgView.f172020r;
            java.util.ArrayList arrayList4 = storyMsgView.f172018p;
            if (z17) {
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(1);
                if4.a aVar3 = storyMsgView.f172019q;
                if (aVar3 == null || (arrayList2 = aVar3.f291240h) == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                storyMsgListView.c(arrayList2);
            } else {
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(0);
                if4.a aVar4 = storyMsgView.f172019q;
                if (aVar4 == null || (arrayList = aVar4.f291240h) == null) {
                    arrayList = new java.util.ArrayList();
                }
                storyMsgListView2.c(arrayList);
            }
        }
        if (storyMsgView.f172020r) {
            storyMsgView.getCommentInputView().setVisibility(8);
            if4.a aVar5 = storyMsgView.f172019q;
            if (aVar5 != null) {
                storyMsgView.f172016n.e(aVar5);
            }
        }
        storyMsgView.f172024v = 0;
        return jz5.f0.f302826a;
    }
}
