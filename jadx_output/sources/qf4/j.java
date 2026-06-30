package qf4;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf4.k f362707d;

    public j(qf4.k kVar) {
        this.f362707d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof nf4.h) && (lVar = this.f362707d.f362709e) != null) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryHistoryInfo");
            lVar.invoke((nf4.h) tag);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
