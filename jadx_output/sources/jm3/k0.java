package jm3;

/* loaded from: classes3.dex */
public final class k0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300331d;

    public k0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300331d = musicMvMakerUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 1) {
            com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.U6(this.f300331d);
        }
    }
}
