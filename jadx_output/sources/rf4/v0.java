package rf4;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        super(2);
        this.f395115d = storyCommentView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView2;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView3;
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395115d;
        storyCommentView.f171973y = booleanValue;
        boolean z17 = storyCommentView.f171974z;
        java.util.LinkedHashMap linkedHashMap = storyCommentView.B;
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = storyCommentView.f171955d;
        if (!z17) {
            if (booleanValue) {
                linkedHashMap.remove(storyCommentView.C);
                storyCommentView.A = null;
                storyCommentView.f171967s.f291239g.add(gf4.l.f271354d.h(storyCommentView.f171968t, content, storyCommentView.C, storyCommentView.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), storyCommentView.f171965q, storyCommentView.D));
                com.tencent.mm.plugin.story.ui.view.CommentsContainer.d(commentsContainer, storyCommentView.f171967s.f291239g, false, 2, null);
                commentsContainer.b();
            }
            rf4.a aVar = storyCommentView.f171972x;
            if (aVar != null) {
                aVar.dismiss();
            }
        } else if (booleanValue) {
            linkedHashMap.remove(storyCommentView.C);
            storyCommentView.A = null;
            gf4.a h17 = gf4.l.f271354d.h(storyCommentView.f171968t, content, storyCommentView.C, storyCommentView.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), storyCommentView.f171965q, storyCommentView.D);
            storyCommentView.f171967s.f291239g.add(h17);
            storyCommentView.f171967s.f291240h.add(h17);
            com.tencent.mm.plugin.story.ui.view.CommentsContainer.d(commentsContainer, storyCommentView.f171967s.f291239g, false, 2, null);
            rf4.a aVar2 = storyCommentView.f171972x;
            if (aVar2 != null && (storyCommentInputView3 = aVar2.f395015f) != null) {
                java.util.LinkedList storyComments = storyCommentView.f171967s.f291239g;
                kotlin.jvm.internal.o.g(storyComments, "storyComments");
                storyCommentInputView3.f171943p.x(storyComments);
            }
            rf4.a aVar3 = storyCommentView.f171972x;
            if (aVar3 != null && (storyCommentInputView2 = aVar3.f395015f) != null) {
                storyCommentInputView2.f171943p.notifyDataSetChanged();
            }
            rf4.a aVar4 = storyCommentView.f171972x;
            if (aVar4 != null && (storyCommentInputView = aVar4.f395015f) != null) {
                int size = storyCommentView.f171967s.f291239g.size() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(size));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(storyCommentInputView, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
                storyCommentInputView.f171942o.post(new rf4.h0(storyCommentInputView, ((java.lang.Integer) arrayList.get(0)).intValue()));
                yj0.a.f(storyCommentInputView, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            rf4.a aVar5 = storyCommentView.f171972x;
            if (aVar5 != null) {
                aVar5.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
