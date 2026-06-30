package gx0;

/* loaded from: classes5.dex */
public final class mg implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f276738d;

    public mg(gx0.bh bhVar) {
        this.f276738d = bhVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        gx0.fd fdVar = (gx0.fd) obj;
        gx0.bh bhVar = this.f276738d;
        bhVar.getClass();
        int i17 = fdVar == null ? -1 : gx0.hg.f276513a[fdVar.ordinal()];
        if (i17 != 1) {
            jz5.g gVar = bhVar.F;
            if (i17 == 2 || i17 == 3) {
                com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = bhVar.f276270z;
                if (playbackTimelineToolbar == null) {
                    kotlin.jvm.internal.o.o("timelineToolbar");
                    throw null;
                }
                playbackTimelineToolbar.setAlpha(1.0f);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bhVar.f276267w;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView.setEnabled(true);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = bhVar.f276267w;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView2.setAlpha(1.0f);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = bhVar.f276267w;
                if (weImageView3 == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView3.setImageResource(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            } else {
                com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar2 = bhVar.f276270z;
                if (playbackTimelineToolbar2 == null) {
                    kotlin.jvm.internal.o.o("timelineToolbar");
                    throw null;
                }
                playbackTimelineToolbar2.setAlpha(0.0f);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = bhVar.f276267w;
                if (weImageView4 == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView4.setEnabled(false);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = bhVar.f276267w;
                if (weImageView5 == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView5.setAlpha(0.5f);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = bhVar.f276267w;
                if (weImageView6 == null) {
                    kotlin.jvm.internal.o.o("timelinePlayButton");
                    throw null;
                }
                weImageView6.setImageResource(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            }
        } else {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar3 = bhVar.f276270z;
            if (playbackTimelineToolbar3 == null) {
                kotlin.jvm.internal.o.o("timelineToolbar");
                throw null;
            }
            playbackTimelineToolbar3.setAlpha(1.0f);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = bhVar.f276267w;
            if (weImageView7 == null) {
                kotlin.jvm.internal.o.o("timelinePlayButton");
                throw null;
            }
            weImageView7.setEnabled(true);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = bhVar.f276267w;
            if (weImageView8 == null) {
                kotlin.jvm.internal.o.o("timelinePlayButton");
                throw null;
            }
            weImageView8.setAlpha(1.0f);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = bhVar.f276267w;
            if (weImageView9 == null) {
                kotlin.jvm.internal.o.o("timelinePlayButton");
                throw null;
            }
            weImageView9.setImageResource(((java.lang.Number) ((jz5.n) bhVar.G).getValue()).intValue());
        }
        gx0.fd.f276428d.getClass();
        if ((fdVar == gx0.fd.f276431g || fdVar == gx0.fd.f276433i) && bhVar.H.isNumeric()) {
            gx0.bf.q7(bhVar.V6(), bhVar.H, true, 0L, 4, null);
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            bhVar.H = InvalidTime;
        }
        if (fdVar == gx0.fd.f276432h) {
            com.tencent.maas.model.time.MJTime InvalidTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime2, "InvalidTime");
            bhVar.H = InvalidTime2;
        }
    }
}
