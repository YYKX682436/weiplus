package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes10.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f124377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f124376d = j3Var;
        this.f124377e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ss4 mvTrackData = (r45.ss4) obj;
        kotlin.jvm.internal.o.g(mvTrackData, "mvTrackData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_track_data", mvTrackData.toByteArray());
        intent.putExtra("key_mv_from_scene", 1);
        intent.putExtra("key_mv_enter_maker_ui_from_scene", 2);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f124376d;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) eVar).Di(j3Var.getActivity(), "MusicMvRouterUI", 7, r45.bt4.class);
        if (bt4Var != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            bt4Var.f371037e = uuid;
            bt4Var.f371038f = 86;
        }
        int i17 = this.f124377e.f310116d;
        if (i17 == 2 || i17 == 1) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            androidx.appcompat.app.AppCompatActivity context = j3Var.getActivity();
            i0Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            try {
                int i18 = com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.f150889g;
                intent.putExtra("KEY_MUSIC_ROUTER", 7);
                intent.setClass(context, com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("Finder.ActivityRouter", "enterMusicMvPostUI : " + e17);
            }
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Qk(j3Var.getActivity(), intent);
        }
        return jz5.f0.f302826a;
    }
}
