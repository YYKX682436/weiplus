package mx0;

/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment f332128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout f332129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment finderMusicPickerShootRecommendFragment, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout shootComposingMusicPickerComponentLayout) {
        super(1);
        this.f332128d = finderMusicPickerShootRecommendFragment;
        this.f332129e = shootComposingMusicPickerComponentLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f332128d.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setItemAnimator(null);
        }
        this.f332129e.getClass();
        return jz5.f0.f302826a;
    }
}
