package sf4;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, android.content.Context context) {
        super(2);
        this.f407536d = storyGalleryView;
        this.f407537e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.CompoundButton checkBox = (android.widget.CompoundButton) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(checkBox, "checkBox");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407536d;
        int size = storyGalleryView.f172109z.size();
        int i17 = storyGalleryView.f172102u;
        if (i17 >= 0 && i17 < size) {
            java.util.ArrayList arrayList = storyGalleryView.f172109z;
            int size2 = ((java.util.ArrayList) arrayList.get(i17)).size();
            int i18 = storyGalleryView.f172103v;
            if (i18 >= 0 && i18 < size2) {
                java.lang.Object obj3 = ((java.util.ArrayList) arrayList.get(storyGalleryView.f172102u)).get(storyGalleryView.f172103v);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                long j17 = ((if4.f) obj3).f291243a.field_storyID;
                int i19 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", "onCheckedFav " + j17 + ' ' + booleanValue);
                if (!booleanValue) {
                    storyGalleryView.getCheckedFavList().remove(java.lang.Long.valueOf(j17));
                } else if (storyGalleryView.getCheckedFavList().size() >= 9) {
                    checkBox.setChecked(false);
                    android.content.Context context = this.f407537e;
                    db5.e1.s(context, "", context.getResources().getString(com.tencent.mm.R.string.jmi));
                } else if (!storyGalleryView.getCheckedFavList().contains(java.lang.Long.valueOf(j17))) {
                    storyGalleryView.getCheckedFavList().add(java.lang.Long.valueOf(j17));
                }
                com.tencent.mm.autogen.events.StoryCheckedFavFromGalleryEvent storyCheckedFavFromGalleryEvent = new com.tencent.mm.autogen.events.StoryCheckedFavFromGalleryEvent();
                storyCheckedFavFromGalleryEvent.f54872g.getClass();
                storyCheckedFavFromGalleryEvent.e();
            }
        }
        return jz5.f0.f302826a;
    }
}
