package fn4;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264597d;

    public q(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f264597d = topStoryBaseVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264597d;
        fn4.e eVar = topStoryBaseVideoUI.f175138r;
        int y17 = eVar.y();
        int itemCount = eVar.getItemCount();
        x.o oVar = eVar.f264490e;
        int i17 = oVar.f450851g;
        java.lang.Object[] objArr = oVar.f450850f;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = null;
        }
        oVar.f450851g = 0;
        oVar.f450848d = false;
        eVar.notifyItemRangeRemoved(itemCount - y17, y17);
        fn4.e eVar2 = topStoryBaseVideoUI.f175142v;
        int y18 = eVar2.y();
        int itemCount2 = eVar2.getItemCount();
        x.o oVar2 = eVar2.f264490e;
        int i19 = oVar2.f450851g;
        java.lang.Object[] objArr2 = oVar2.f450850f;
        for (int i27 = 0; i27 < i19; i27++) {
            objArr2[i27] = null;
        }
        oVar2.f450851g = 0;
        oVar2.f450848d = false;
        eVar2.notifyItemRangeRemoved(itemCount2 - y18, y18);
    }
}
