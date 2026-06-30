package uf5;

/* loaded from: classes10.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f427228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI f427229e;

    public f2(com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI, java.util.List list) {
        this.f427229e = topStorySettingVisibilityDetailUI;
        this.f427228d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f427228d;
            int size = list.size();
            com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f427229e;
            if (i17 >= size) {
                topStorySettingVisibilityDetailUI.A = true;
                topStorySettingVisibilityDetailUI.l7();
                return;
            } else {
                java.lang.String str2 = (java.lang.String) list.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) list.get(i17)) && !str.equals(list.get(i17))) {
                    topStorySettingVisibilityDetailUI.f207100d.remove(str2);
                }
                i17++;
            }
        }
    }
}
