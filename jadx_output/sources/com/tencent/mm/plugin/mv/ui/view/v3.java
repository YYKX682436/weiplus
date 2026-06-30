package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class v3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment f151970d;

    public v3(com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment) {
        this.f151970d = musicMvTabFragment;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.mv.ui.view.t3 t3Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 && i17 >= wxRecyclerAdapter.getItemCount()) {
            com.tencent.mars.xlog.Log.e("Music.MusicMvTabFragment", "invalid position:" + i17);
            return;
        }
        com.tencent.mm.plugin.mv.ui.view.q3 q3Var = (com.tencent.mm.plugin.mv.ui.view.q3) kz5.n0.a0(wxRecyclerAdapter.getData(), i17);
        if (q3Var == null || (t3Var = q3Var.f151927d) == null || (finderObject = t3Var.f151952b) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            return;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151970d;
        android.content.Context context = musicMvTabFragment.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean P6 = ((com.tencent.mm.plugin.mv.ui.uic.c3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.c3.class)).P6();
        bm3.e eVar = musicMvTabFragment.f151726v;
        if (P6) {
            adapter.notifyItemChanged(i17);
            com.tencent.mm.plugin.mv.ui.view.o3 o3Var = musicMvTabFragment.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            if (o3Var != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerView musicFeedsRecyclerView = eVar.f22512b;
                kotlin.jvm.internal.o.f(musicFeedsRecyclerView, "musicFeedsRecyclerView");
                ((com.tencent.mm.plugin.mv.ui.view.g0) o3Var).a(0, t3Var, i17, view, musicFeedsRecyclerView, musicMvTabFragment.getType());
                return;
            }
            return;
        }
        if (finderMedia.getVideoDuration() < lm3.d0.c(musicMvTabFragment.f151723s)) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "post fail, duration:" + finderMedia.getVideoDuration());
            db5.t7.m(musicMvTabFragment.getContext(), musicMvTabFragment.getContext().getString(com.tencent.mm.R.string.h5b, java.lang.Integer.valueOf(lm3.d0.c(musicMvTabFragment.f151723s))));
            return;
        }
        int videoDuration = finderMedia.getVideoDuration();
        int i18 = musicMvTabFragment.f151722r;
        if (videoDuration > lm3.d0.b(i18)) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "post fail, duration:" + finderMedia.getVideoDuration());
            db5.t7.m(musicMvTabFragment.getContext(), musicMvTabFragment.getContext().getString(com.tencent.mm.R.string.h5c, java.lang.Integer.valueOf(lm3.d0.b(i18))));
            return;
        }
        com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "post feedId:".concat(pm0.v.u(t3Var.f151951a)));
        fm3.g0.f264073d = i17;
        fm3.g0.f264072c = musicMvTabFragment.getFeedFrom();
        com.tencent.mm.plugin.mv.ui.view.o3 o3Var2 = musicMvTabFragment.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (o3Var2 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView musicFeedsRecyclerView2 = eVar.f22512b;
            kotlin.jvm.internal.o.f(musicFeedsRecyclerView2, "musicFeedsRecyclerView");
            ((com.tencent.mm.plugin.mv.ui.view.g0) o3Var2).a(0, t3Var, i17, view, musicFeedsRecyclerView2, musicMvTabFragment.getType());
        }
    }
}
