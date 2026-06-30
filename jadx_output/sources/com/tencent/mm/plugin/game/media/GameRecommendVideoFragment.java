package com.tencent.mm.plugin.game.media;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/media/GameRecommendVideoFragment;", "Landroidx/fragment/app/Fragment;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameRecommendVideoFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f140061n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final p33.e0 f140062d;

    /* renamed from: e, reason: collision with root package name */
    public final int f140063e;

    /* renamed from: f, reason: collision with root package name */
    public final int f140064f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f140065g;

    /* renamed from: h, reason: collision with root package name */
    public o43.b f140066h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140067i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f140068m;

    public GameRecommendVideoFragment(p33.e0 videoAlbumItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(videoAlbumItem, "videoAlbumItem");
        this.f140062d = videoAlbumItem;
        this.f140063e = i17;
        this.f140064f = i18;
        this.f140065g = "MicroMsg.GameHaoWanGalleryView.GameRecommendVideoFragment";
        this.f140068m = jz5.h.b(i53.e2.f288565d);
    }

    public final void j0(boolean z17, int i17) {
        android.content.Context context = getContext();
        int i18 = this.f140063e + 504;
        int i19 = z17 ? 2 : 1;
        p33.k kVar = this.f140062d.f351539f;
        com.tencent.mm.game.report.l.d(context, 87, 8762, i18, i19, i17, kVar != null ? kVar.f351599d : null, this.f140064f, 0, null, null, lj0.a.a(7, new java.util.HashMap()));
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.bbm, viewGroup, false);
        int i17 = com.tencent.mm.R.id.azf;
        android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.azf);
        if (button != null) {
            i17 = com.tencent.mm.R.id.hog;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.hog);
            if (imageView != null) {
                i17 = com.tencent.mm.R.id.ll_;
                com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = (com.tencent.mm.plugin.game.media.preview.GameVideoView) x4.b.a(inflate, com.tencent.mm.R.id.ll_);
                if (gameVideoView != null) {
                    i17 = com.tencent.mm.R.id.lla;
                    com.tencent.mm.plugin.game.media.FixAspectRatioRelativeLayout fixAspectRatioRelativeLayout = (com.tencent.mm.plugin.game.media.FixAspectRatioRelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.lla);
                    if (fixAspectRatioRelativeLayout != null) {
                        i17 = com.tencent.mm.R.id.f487432om4;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487432om4);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.om7;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.om7);
                            if (textView2 != null) {
                                i17 = com.tencent.mm.R.id.p0k;
                                com.tencent.mm.plugin.game.chatroom.view.flow.FlowView flowView = (com.tencent.mm.plugin.game.chatroom.view.flow.FlowView) x4.b.a(inflate, com.tencent.mm.R.id.p0k);
                                if (flowView != null) {
                                    com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) inflate;
                                    this.f140066h = new o43.b(roundCornerRelativeLayout, button, imageView, gameVideoView, fixAspectRatioRelativeLayout, textView, textView2, flowView);
                                    kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
                                    return roundCornerRelativeLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o43.b bVar = this.f140066h;
        kotlin.jvm.internal.o.d(bVar);
        bVar.f342844d.d();
        ((android.os.Handler) ((jz5.n) this.f140068m).getValue()).removeCallbacksAndMessages(null);
        this.f140066h = null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o43.b bVar = this.f140066h;
        kotlin.jvm.internal.o.d(bVar);
        bVar.f342844d.e();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o43.b bVar = this.f140066h;
        kotlin.jvm.internal.o.d(bVar);
        bVar.f342844d.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        p33.e0 e0Var = this.f140062d;
        p33.v vVar = e0Var.f351550t;
        java.util.LinkedList linkedList = vVar != null ? vVar.f351655d : null;
        if (linkedList == null || linkedList.isEmpty()) {
            o43.b bVar = this.f140066h;
            kotlin.jvm.internal.o.d(bVar);
            bVar.f342847g.setVisibility(8);
        } else {
            i53.f4 f4Var = new i53.f4();
            p33.v vVar2 = e0Var.f351550t;
            f4Var.f259544d = vVar2 != null ? vVar2.f351655d : null;
            o43.b bVar2 = this.f140066h;
            kotlin.jvm.internal.o.d(bVar2);
            bVar2.f342847g.setAdapter(f4Var);
        }
        p33.f0 f0Var = e0Var.f351540g;
        if (f0Var != null) {
            com.tencent.mars.xlog.Log.i(this.f140065g, "videoInfo = " + f0Var + "  playUrl = " + f0Var.f351560d + "  duration  = " + f0Var.f351565i);
            o11.f fVar = new o11.f();
            fVar.f342083g = i53.h4.f288593a;
            fVar.f342078b = true;
            o11.g a17 = fVar.a();
            n11.a b17 = n11.a.b();
            java.lang.String str = f0Var.f351561e;
            o43.b bVar3 = this.f140066h;
            kotlin.jvm.internal.o.d(bVar3);
            b17.k(str, bVar3.f342843c, a17, null, null);
            o43.b bVar4 = this.f140066h;
            kotlin.jvm.internal.o.d(bVar4);
            com.tencent.mm.pluginsdk.ui.e1 e1Var = com.tencent.mm.pluginsdk.ui.e1.FILL;
            com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = bVar4.f342844d;
            gameVideoView.setScaleType(e1Var);
            gameVideoView.h(false, f0Var.f351560d, f0Var.f351565i);
            gameVideoView.setMute(true);
            gameVideoView.setLoop(false);
            gameVideoView.setIsShowBasicControls(false);
            gameVideoView.setPlayerListener(new i53.f2(this, gameVideoView));
            o43.b bVar5 = this.f140066h;
            kotlin.jvm.internal.o.d(bVar5);
            bVar5.f342846f.setText(f0Var.f351564h);
        }
        o43.b bVar6 = this.f140066h;
        kotlin.jvm.internal.o.d(bVar6);
        bVar6.f342845e.setText(android.text.format.DateFormat.format(requireContext().getString(com.tencent.mm.R.string.fcl), e0Var.f351538e * 1000));
        o43.b bVar7 = this.f140066h;
        kotlin.jvm.internal.o.d(bVar7);
        bVar7.f342842b.setOnClickListener(new i53.g2(this));
        o43.b bVar8 = this.f140066h;
        kotlin.jvm.internal.o.d(bVar8);
        bVar8.f342844d.setOnClickListener(new i53.h2(this));
        j0(false, 1);
        j0(false, 2);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView;
        o43.b bVar;
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView2;
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView3;
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView4;
        super.setUserVisibleHint(z17);
        if (!z17) {
            o43.b bVar2 = this.f140066h;
            if (bVar2 == null || (gameVideoView = bVar2.f342844d) == null) {
                return;
            }
            gameVideoView.pause();
            return;
        }
        if (!this.f140067i) {
            o43.b bVar3 = this.f140066h;
            if (bVar3 != null && (gameVideoView4 = bVar3.f342844d) != null) {
                gameVideoView4.start();
            }
            o43.b bVar4 = this.f140066h;
            if (bVar4 != null && (gameVideoView3 = bVar4.f342844d) != null) {
                gameVideoView3.play();
            }
        }
        if (this.f140067i && (bVar = this.f140066h) != null && (gameVideoView2 = bVar.f342844d) != null) {
            gameVideoView2.play();
        }
        ((android.os.Handler) ((jz5.n) this.f140068m).getValue()).postDelayed(new i53.i2(this), 500L);
    }
}
