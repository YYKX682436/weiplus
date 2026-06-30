package qf4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.album.StoryAlbumUI f362711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.story.ui.album.StoryAlbumUI storyAlbumUI) {
        super(1);
        this.f362711d = storyAlbumUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nf4.h storyHistoryInfo = (nf4.h) obj;
        kotlin.jvm.internal.o.g(storyHistoryInfo, "storyHistoryInfo");
        com.tencent.mm.plugin.story.ui.album.StoryAlbumUI storyAlbumUI = this.f362711d;
        qf4.f fVar = storyAlbumUI.f171871g;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("mStoryAlbumAdapter");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = fVar.f362695h;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((qf4.h) arrayList2.get(i17)).f362702b.iterator();
            while (it.hasNext()) {
                arrayList.add(((nf4.h) it.next()).field_date);
            }
        }
        qf4.f fVar2 = storyAlbumUI.f171871g;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("mStoryAlbumAdapter");
            throw null;
        }
        nf4.j storyInfo = storyHistoryInfo.f336854p;
        kotlin.jvm.internal.o.g(storyInfo, "storyInfo");
        java.util.ArrayList arrayList3 = fVar2.f362695h;
        int size2 = arrayList3.size();
        int i18 = 0;
        loop2: for (int i19 = 0; i19 < size2; i19++) {
            java.util.Iterator it6 = ((qf4.h) arrayList3.get(i19)).f362702b.iterator();
            while (it6.hasNext()) {
                if (((int) ((nf4.h) it6.next()).f336854p.systemRowid) == ((int) storyInfo.systemRowid)) {
                    break loop2;
                }
                i18++;
            }
        }
        int i27 = com.tencent.mm.plugin.story.ui.album.StoryAlbumUI.f171867m;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAlbumUI", "onClickItem position=" + i18 + ", localId=" + ((int) storyHistoryInfo.f336854p.systemRowid) + ", storyId=" + storyHistoryInfo.f336854p.field_storyID + ", date=" + storyHistoryInfo.field_date + ", count=" + storyHistoryInfo.field_count);
        android.content.Intent intent = new android.content.Intent(storyAlbumUI.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.story.ui.StoryBrowseUI.class);
        intent.putExtra(dm.i4.COL_USERNAME, storyAlbumUI.f171873i);
        intent.putExtra("user_date_list", arrayList);
        intent.putExtra("v_position", i18);
        storyAlbumUI.startActivityForResult(intent, 1);
        mf4.d.f326163d.f60919e = 2L;
        return jz5.f0.f302826a;
    }
}
