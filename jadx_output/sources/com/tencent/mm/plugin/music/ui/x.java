package com.tencent.mm.plugin.music.ui;

/* loaded from: classes10.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150854d;

    public x(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI) {
        this.f150854d = musicMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150854d;
        java.util.concurrent.Future future = musicMainUI.D;
        if (future != null) {
            future.cancel(false);
        }
        musicMainUI.D = null;
        if (musicMainUI.f150702d.isChecked()) {
            b21.m.f();
            musicMainUI.f150702d.setChecked(true);
        } else {
            musicMainUI.f150714s = true;
            if (kl3.t.g().a().g()) {
                kl3.t.g().a().resume();
            } else {
                kl3.t.g().n(null);
            }
            musicMainUI.f150702d.setChecked(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
