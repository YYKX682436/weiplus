package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes10.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150950d;

    public j(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150950d = musicMainUINew;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150950d;
        b21.r rVar = musicMainUINew.f150907m;
        com.tencent.mars.xlog.Log.i("MusicMainUINew", "MusicType:%d, SongWebUrl ", java.lang.Integer.valueOf(rVar.f17345d), rVar.f17354p);
        if (!com.tencent.mm.plugin.mv.ui.shake.p.b(musicMainUINew.f150907m).isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr = {musicMainUINew.getString(com.tencent.mm.R.string.h4u), musicMainUINew.getString(com.tencent.mm.R.string.h4v)};
            arrayList2.add(0);
            arrayList2.add(1);
            db5.e1.e(musicMainUINew, "", strArr, "", new com.tencent.mm.plugin.mv.ui.shake.d(musicMainUINew));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
