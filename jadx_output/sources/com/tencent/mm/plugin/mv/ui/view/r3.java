package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.q3 f151939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment f151941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f151942g;

    public r3(com.tencent.mm.plugin.mv.ui.view.q3 q3Var, int i17, com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment, android.widget.CheckBox checkBox) {
        this.f151939d = q3Var;
        this.f151940e = i17;
        this.f151941f = musicMvTabFragment;
        this.f151942g = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.q3 q3Var = this.f151939d;
        boolean z17 = true;
        q3Var.f151927d.f151953c = !r1.f151953c;
        fm3.g0 g0Var = fm3.g0.f264070a;
        int i17 = this.f151940e;
        fm3.g0.f264073d = i17;
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151941f;
        fm3.g0.f264072c = musicMvTabFragment.getFeedFrom();
        com.tencent.mm.plugin.mv.ui.view.o3 o3Var = musicMvTabFragment.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        java.lang.Boolean bool = null;
        if (o3Var != null) {
            com.tencent.mm.plugin.mv.ui.view.t3 data = q3Var.f151927d;
            boolean z18 = data.f151953c;
            int type = musicMvTabFragment.getType();
            kotlin.jvm.internal.o.g(data, "data");
            int i18 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = ((com.tencent.mm.plugin.mv.ui.view.g0) o3Var).f151829a;
            if (musicMVCardChooseView.h()) {
                com.tencent.mm.plugin.mv.ui.view.b0 b0Var = musicMVCardChooseView.G;
                if (b0Var != null) {
                    com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = (com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var;
                    java.lang.String u17 = pm0.v.u(data.f151951a);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = data.f151952b;
                    int videoDuration = (finderObject == null || (objectDesc2 = finderObject.getObjectDesc()) == null || (media2 = objectDesc2.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.a0(media2, 0)) == null) ? 0 : finderMedia2.getVideoDuration() * 1000;
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) a17;
                    v4Var.f151499s = true;
                    com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = v4Var.f151491h;
                    if (!z18) {
                        musicMvFlexLiveList.s(u17);
                        musicMvFlexLiveList.D();
                        musicMvMakerUI.f150879r -= 3;
                    } else if (musicMvMakerUI.W6(videoDuration, 3, true)) {
                        fm3.q qVar = new fm3.q();
                        qVar.f264109g = 2;
                        fm3.q.f264104p.a(data, qVar);
                        g0Var.b(musicMvFlexLiveList.f152065o.size(), qVar);
                        int i19 = videoDuration;
                        gm3.c cVar = new gm3.c(u17, 2, java.lang.System.currentTimeMillis(), type);
                        gm3.b bVar = new gm3.b(null, null, 3, null);
                        cVar.f273548i = bVar;
                        bVar.f273542b = finderObject;
                        if (finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.a0(media, 0)) == null) {
                            str = null;
                        } else {
                            str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
                        }
                        bVar.f273541a = str;
                        cVar.f273549m = i19;
                        com.tencent.mm.plugin.mvvmlist.MvvmList.q(musicMvFlexLiveList, cVar, false, 2, null);
                        musicMvFlexLiveList.D();
                    }
                    z17 = true;
                }
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "onItemChecked, but not on flex mode");
            }
            bool = java.lang.Boolean.valueOf(z17);
        }
        if (bool != null && !bool.booleanValue()) {
            q3Var.f151927d.f151953c = false;
        }
        this.f151942g.setChecked(q3Var.f151927d.f151953c);
        musicMvTabFragment.getAdapter().notifyItemChanged(i17);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
