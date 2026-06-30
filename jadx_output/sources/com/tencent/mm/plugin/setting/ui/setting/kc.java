package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager f161235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager) {
        super(2);
        this.f161235d = settingsHearingAidAudioCardViewManager;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f161235d;
        java.util.Iterator it = settingsHearingAidAudioCardViewManager.f160413i.iterator();
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) it.next();
            int i18 = 0;
            while (true) {
                if (!(i18 < linearLayout.getChildCount())) {
                    z17 = false;
                    break;
                }
                int i19 = i18 + 1;
                android.view.View childAt = linearLayout.getChildAt(i18);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                if (childAt == view) {
                    z17 = true;
                    break;
                }
                i18 = i19;
            }
            if (z17) {
                break;
            }
            i17++;
        }
        java.lang.Object obj3 = settingsHearingAidAudioCardViewManager.f160413i.get(i17);
        kotlin.jvm.internal.o.f(obj3, "get(...)");
        q26.i iVar = (q26.i) q26.h0.p(new n3.r1((android.view.ViewGroup) obj3), com.tencent.mm.plugin.setting.ui.setting.jc.f161192d);
        q26.h hVar = new q26.h(iVar);
        while (true) {
            if (!hVar.hasNext()) {
                z18 = true;
                break;
            }
            if (!((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) hVar.next()).getHasPlayed()) {
                break;
            }
        }
        if (z18) {
            com.tencent.mm.plugin.setting.ui.setting.gc playFinishedListener = settingsHearingAidAudioCardViewManager.getPlayFinishedListener();
            if (playFinishedListener != null) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI) playFinishedListener;
                settingsHearingAidTestUI.a7(true);
                settingsHearingAidTestUI.Z6();
            }
            q26.h hVar2 = new q26.h(iVar);
            while (hVar2.hasNext()) {
                ((com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) hVar2.next()).setBtnEnable(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
