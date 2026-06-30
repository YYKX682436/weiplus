package jm3;

/* loaded from: classes10.dex */
public final class y implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f300364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f300366f;

    public y(android.widget.TextView textView, com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, android.widget.TextView textView2) {
        this.f300364d = textView;
        this.f300365e = musicMvMakerUI;
        this.f300366f = textView2;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        android.widget.TextView textView = this.f300364d;
        android.widget.TextView textView2 = this.f300366f;
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = this.f300365e;
        if (num != null && num.intValue() == 0) {
            if (textView != null) {
                textView.setTextColor(musicMvMakerUI.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            if (textView2 != null) {
                textView2.setTextColor(musicMvMakerUI.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.V6(musicMvMakerUI);
            return;
        }
        if (textView2 != null) {
            textView2.setTextColor(musicMvMakerUI.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        if (textView != null) {
            textView.setTextColor(musicMvMakerUI.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
        int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        musicMvMakerUI.getClass();
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.mv.ui.uic.v4) pf5.z.f353948a.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.v4.class)).f151491h.f152065o;
        boolean z17 = false;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gm3.c) it.next()).f273544e != 0) {
                    z17 = true;
                    break;
                }
            }
        }
        musicMvMakerUI.c7(z17);
    }
}
