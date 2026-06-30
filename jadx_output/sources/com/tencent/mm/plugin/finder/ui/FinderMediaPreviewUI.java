package com.tencent.mm.plugin.finder.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMediaPreviewUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int D = 0;
    public boolean B;
    public fc2.c C;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f128623w;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f128620t = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ma(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f128621u = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fa(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f128622v = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ga(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f128624x = jz5.h.b(new com.tencent.mm.plugin.finder.ui.na(this));

    /* renamed from: y, reason: collision with root package name */
    public final cw2.f8 f128625y = new cw2.f8(0, 1, null);

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f128626z = new java.util.LinkedList();
    public boolean A = true;

    public final com.tencent.mm.plugin.finder.view.FinderMediaLayout c7() {
        java.lang.Object value = ((jz5.n) this.f128620t).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.finder.view.FinderMediaLayout) value;
    }

    public final com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar d7() {
        java.lang.Object value = ((jz5.n) this.f128624x).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar) value;
    }

    public final boolean e7(boolean z17) {
        cw2.da videoView;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout mediaView = c7().getVideoBanner().getMediaView();
        if (mediaView == null || (videoView = mediaView.getVideoView()) == null) {
            return false;
        }
        boolean isPlaying = videoView.isPlaying();
        if (isPlaying || z17) {
            videoView.pause();
        } else {
            videoView.play();
        }
        return !isPlaying;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.initView():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201326592, 201326592);
        setLightNavigationbarIcon();
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        this.B = getIntent().getBooleanExtra("long_video_preview", false);
        initView();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        fc2.c cVar = this.C;
        if (cVar != null) {
            cVar.c();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && this.A) {
            this.A = false;
            if (c7().getMediaType() == com.tencent.mm.plugin.finder.view.qr.f132906e) {
                this.f128625y.j0();
                return;
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout mediaView = c7().getVideoBanner().getMediaView();
            if (mediaView != null) {
                mediaView.getVideoCore().j0();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
                finderItem.setMediaExtList(new java.util.LinkedList<>());
                finderItem.getMediaExtList().addAll(this.f128626z);
                if (mediaView.isLongVideo) {
                    com.tencent.mm.plugin.finder.ui.ea eaVar = new com.tencent.mm.plugin.finder.ui.ea(this);
                    java.lang.Object value = ((jz5.n) this.f128621u).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    ((com.tencent.mm.view.HardTouchableLayout) value).setOnSingleClickListener(new com.tencent.mm.plugin.finder.ui.da(eaVar));
                }
                com.tencent.mm.plugin.finder.video.FinderVideoLayout.v(mediaView, 0, com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(finderItem), null, 0, null, null, false, false, null, 508, null);
                cw2.v9.n(mediaView, 0, null, null, 7, null);
            }
        }
    }
}
