package ev0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment f256842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment) {
        super(1);
        this.f256842d = musicPickerRecommendDataFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f256842d.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setItemAnimator(null);
        }
        return jz5.f0.f302826a;
    }
}
