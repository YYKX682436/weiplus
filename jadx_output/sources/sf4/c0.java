package sf4;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(2);
        this.f407425d = storyGalleryView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List arrayList;
        androidx.recyclerview.widget.f2 adapter;
        java.util.List arrayList2;
        androidx.recyclerview.widget.f2 adapter2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView storyGalleryItemView = this.f407425d.f172094n;
        if (storyGalleryItemView != null && bf4.f.f19715b.f()) {
            com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = storyGalleryItemView.msgView;
            if (!booleanValue) {
                storyMsgView.getClass();
            } else if (com.tencent.mm.sdk.platformtools.t8.B0(longValue, storyMsgView.f172025w)) {
                java.util.ArrayList arrayList3 = storyMsgView.f172018p;
                if (!arrayList3.isEmpty()) {
                    if (storyMsgView.f172020r) {
                        com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(1);
                        if4.a aVar = storyMsgView.f172019q;
                        if (aVar == null || (arrayList2 = aVar.f291240h) == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        storyMsgListView.getClass();
                        if (storyMsgListView.f172003f == 1 && (adapter2 = storyMsgListView.f172001d.getAdapter()) != null) {
                            ((pf4.w) adapter2).x(storyMsgListView.a(arrayList2));
                        }
                    } else {
                        com.tencent.mm.plugin.story.ui.view.StoryMsgListView storyMsgListView2 = (com.tencent.mm.plugin.story.ui.view.StoryMsgListView) arrayList3.get(0);
                        if4.a aVar2 = storyMsgView.f172019q;
                        if (aVar2 == null || (arrayList = aVar2.f291240h) == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        storyMsgListView2.getClass();
                        if (storyMsgListView2.f172003f == 1 && (adapter = storyMsgListView2.f172001d.getAdapter()) != null) {
                            ((pf4.w) adapter).x(storyMsgListView2.a(arrayList));
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
