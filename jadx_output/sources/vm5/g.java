package vm5;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public rm5.v f438157a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tav.player.Player f438158b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tavkit.composition.TAVSource f438159c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tav.player.PlayerItem f438160d;

    /* renamed from: e, reason: collision with root package name */
    public vm5.a f438161e;

    /* renamed from: f, reason: collision with root package name */
    public int f438162f;

    /* renamed from: g, reason: collision with root package name */
    public int f438163g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438164h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f438165i;

    /* renamed from: j, reason: collision with root package name */
    public vm5.c f438166j;

    public g(rm5.v composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f438157a = composition;
        com.tencent.tavkit.composition.TAVSource c17 = rm5.v.c(composition, false, 1, null);
        this.f438159c = c17;
        com.tencent.tav.player.PlayerItem playerItem = new com.tencent.tav.player.PlayerItem(c17.getAsset());
        this.f438160d = playerItem;
        playerItem.setVideoComposition(this.f438159c.getVideoComposition());
        this.f438160d.setAudioMix(this.f438159c.getAudioMix());
        android.graphics.Bitmap bitmap = this.f438157a.f397586n;
        if (bitmap != null) {
            this.f438160d.setEnableLut(true, bitmap);
        }
        com.tencent.tav.player.PlayerItem playerItem2 = this.f438160d;
        playerItem2.setDecoderFactory(this.f438157a.f397590r);
        com.tencent.tav.player.Player player = new com.tencent.tav.player.Player(playerItem2);
        this.f438158b = player;
        player.setPlayRange(this.f438157a.h());
        this.f438157a.getClass();
        this.f438164h = false;
        this.f438165i = false;
        com.tencent.tav.player.Player player2 = this.f438158b;
        if (player2 != null) {
            player2.setPlayerListener(new vm5.d(this));
        }
        xm5.b.c("VideoCompositionPlayer", "create player, composition:" + this.f438157a, new java.lang.Object[0]);
    }

    public final long a() {
        com.tencent.tav.coremedia.CMTime currentTime;
        com.tencent.tav.player.Player player = this.f438158b;
        return ((player == null || (currentTime = player.currentTime()) == null) ? 0L : currentTime.getTimeUs()) / 1000;
    }

    public final void b(boolean z17) {
        xm5.b.c("VideoCompositionPlayer", "setLoop:" + z17, new java.lang.Object[0]);
        com.tencent.tav.player.Player player = this.f438158b;
        if (player != null) {
            player.setLoop(z17);
        }
    }

    public final void c() {
        com.tencent.tav.player.Player player;
        xm5.b.c("VideoCompositionPlayer", "start, isUpdatingComposition:" + this.f438165i, new java.lang.Object[0]);
        if (!this.f438165i && (player = this.f438158b) != null) {
            player.play();
        }
        this.f438164h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(rm5.v r17, boolean r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm5.g.d(rm5.v, boolean, boolean, long):void");
    }
}
