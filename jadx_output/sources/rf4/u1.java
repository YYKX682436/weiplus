package rf4;

/* loaded from: classes4.dex */
public final class u1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf4.a f395113b;

    public u1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView, gf4.a aVar) {
        this.f395112a = storyMsgView;
        this.f395113b = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Integer num;
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.ArrayList arrayList3;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        int i17;
        if (z17) {
            int i18 = com.tencent.mm.plugin.story.ui.view.StoryMsgView.H;
            com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395112a;
            storyMsgView.getClass();
            gf4.l lVar = gf4.l.f271354d;
            gf4.a aVar = this.f395113b;
            lVar.e(aVar.f271333d, aVar.f271334e, storyMsgView.com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String, aVar.f271331b);
            if4.a aVar2 = storyMsgView.f172019q;
            if (aVar2 == null || (linkedList2 = aVar2.f291240h) == null) {
                num = null;
            } else {
                java.util.Iterator it = linkedList2.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    gf4.a aVar3 = (gf4.a) it.next();
                    int i27 = aVar.f271334e;
                    if ((i27 == 0 || (i17 = aVar3.f271334e) == 0) ? com.tencent.mm.sdk.platformtools.t8.D0(aVar3.f271331b, aVar.f271331b) : i17 == i27) {
                        break;
                    } else {
                        i19++;
                    }
                }
                num = java.lang.Integer.valueOf(i19);
            }
            if (num == null || num.intValue() == -1) {
                return;
            }
            if4.a aVar4 = storyMsgView.f172019q;
            if (aVar4 != null && (linkedList = aVar4.f291240h) != null) {
            }
            pf4.a0 a0Var = storyMsgView.f172017o;
            if (a0Var != null && (arrayList3 = a0Var.f353838f) != null) {
            }
            boolean z18 = storyMsgView.f172020r;
            java.util.ArrayList arrayList4 = storyMsgView.f172018p;
            if (z18) {
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(1);
                if4.a aVar5 = storyMsgView.f172019q;
                if (aVar5 == null || (arrayList2 = aVar5.f291240h) == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                storyMsgListView.c(arrayList2);
            } else {
                com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList4.get(0);
                if4.a aVar6 = storyMsgView.f172019q;
                if (aVar6 == null || (arrayList = aVar6.f291240h) == null) {
                    arrayList = new java.util.ArrayList();
                }
                storyMsgListView2.c(arrayList);
            }
            if4.a aVar7 = storyMsgView.f172019q;
            if (aVar7 != null) {
                storyMsgView.f172016n.e(aVar7);
            }
        }
    }
}
