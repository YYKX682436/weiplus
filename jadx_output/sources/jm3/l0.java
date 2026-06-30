package jm3;

/* loaded from: classes10.dex */
public final class l0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300333d;

    public l0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300333d = musicMvMakerUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 1) {
            int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = this.f300333d.Z6();
            if (Z6 != null) {
                Z6.k();
            }
        }
    }
}
