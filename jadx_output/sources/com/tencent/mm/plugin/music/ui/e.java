package com.tencent.mm.plugin.music.ui;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew f150735d;

    public e(com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew) {
        this.f150735d = floatBallMusicViewNew;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f150735d.f150678g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
