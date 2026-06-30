package lf4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f318348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f318349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lf4.g gVar, java.util.List list) {
        super(0);
        this.f318348d = gVar;
        this.f318349e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.album.StoryAlbumUI storyAlbumUI = (com.tencent.mm.plugin.story.ui.album.StoryAlbumUI) this.f318348d.f318394d;
        storyAlbumUI.getClass();
        java.util.List datas = this.f318349e;
        kotlin.jvm.internal.o.g(datas, "datas");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAlbumUI", "onLoadFinish datas.size=" + datas.size());
        qf4.f fVar = storyAlbumUI.f171871g;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("mStoryAlbumAdapter");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAlbumAdapter", "updateDatas");
        java.util.ArrayList arrayList = fVar.f362695h;
        arrayList.clear();
        arrayList.addAll(datas);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fVar.f362698n += ((qf4.h) it.next()).f362702b.size();
        }
        if (!datas.isEmpty()) {
            arrayList.add(new qf4.h(fVar.f362691d, new java.util.ArrayList()));
        }
        fVar.notifyDataSetChanged();
        if (datas.isEmpty()) {
            android.widget.TextView textView = storyAlbumUI.f171869e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mStoryNoDataTv");
                throw null;
            }
            textView.setVisibility(0);
            androidx.recyclerview.widget.RecyclerView recyclerView = storyAlbumUI.f171868d;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = storyAlbumUI.f171869e;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mStoryNoDataTv");
                throw null;
            }
            textView2.setVisibility(8);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = storyAlbumUI.f171868d;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            recyclerView2.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
