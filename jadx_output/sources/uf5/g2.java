package uf5;

/* loaded from: classes10.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI f427232d;

    public g2(com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f427232d = topStorySettingVisibilityDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact, cancel.");
        com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f427232d;
        java.util.Iterator it = ((java.util.HashSet) topStorySettingVisibilityDetailUI.K).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            sm4.i iVar = (sm4.i) it.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.g(iVar);
            boolean z17 = true;
            if (i17 != ((java.util.HashSet) topStorySettingVisibilityDetailUI.K).size() - 1) {
                z17 = false;
            }
            topStorySettingVisibilityDetailUI.j7(iVar, z17);
            i17++;
        }
    }
}
