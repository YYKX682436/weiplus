package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes10.dex */
public class p1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI f175068d;

    public p1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f175068d = topStorySettingVisibilityDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = ((java.util.HashSet) this.f175068d.f174913s).iterator();
        while (it.hasNext()) {
            gm0.j1.n().f273288b.d((sm4.i) it.next());
        }
    }
}
