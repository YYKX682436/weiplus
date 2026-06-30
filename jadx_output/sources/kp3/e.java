package kp3;

/* loaded from: classes12.dex */
public final class e implements android.media.MediaPlayer.OnInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f310971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kp3.f f310972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f310973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.VideoView f310974d;

    public e(kotlin.jvm.internal.c0 c0Var, kp3.f fVar, long j17, android.widget.VideoView videoView) {
        this.f310971a = c0Var;
        this.f310972b = fVar;
        this.f310973c = j17;
        this.f310974d = videoView;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        if (i17 == 3) {
            kotlin.jvm.internal.c0 c0Var = this.f310971a;
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f310973c;
                kp3.f fVar = this.f310972b;
                fVar.f310985v = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmGuideDialog", "[setVideoAndPlay] MEDIA_INFO_VIDEO_RENDERING_START, dialogVideoLoadCost:" + fVar.f310985v);
                this.f310974d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.widget.ImageView imageView = fVar.f310981r;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
        }
        return true;
    }
}
