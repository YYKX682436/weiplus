package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190865d;

    public i(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190865d = abstractVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190865d;
        com.tencent.mars.xlog.Log.i(abstractVideoView.f189739e, "%s seek bar play button on click ", abstractVideoView.N());
        if (abstractVideoView.f189748q != null) {
            if (abstractVideoView.isPlaying()) {
                abstractVideoView.pause();
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(abstractVideoView.f189748q.getF174598m())) {
                abstractVideoView.start();
            } else {
                abstractVideoView.play();
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
