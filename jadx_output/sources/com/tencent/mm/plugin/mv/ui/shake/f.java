package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150943d;

    public f(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150943d = musicMainUINew;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150943d;
        if (!musicMainUINew.D && !musicMainUINew.f150913s) {
            musicMainUINew.setResult(-1);
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(musicMainUINew.getContext(), com.tencent.mm.R.anim.f477914f2);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.mv.ui.shake.g(musicMainUINew));
        musicMainUINew.f150909o.startAnimation(loadAnimation);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
