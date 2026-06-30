package cw2;

/* loaded from: classes10.dex */
public final class w4 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f224084a;

    public w4(android.content.Context context, r45.mb4 media) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(media, "media");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout(context);
        this.f224084a = mMTPEffectVideoLayout;
        mn2.g4 g4Var = new mn2.g4(media, com.tencent.mm.plugin.finder.storage.y90.f128367t, "xV10", 0, 0, null, false, null, 248, null);
        dk4.a aVar = new dk4.a(g4Var.n(), g4Var.getPath(), g4Var.getUrl() + '/' + g4Var.i(), (int) media.getFloat(4), (int) media.getFloat(5));
        aVar.f234467d = media.getString(17);
        mMTPEffectVideoLayout.f();
        mMTPEffectVideoLayout.setMediaInfo(aVar);
        kk4.b player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            ((kk4.v) player).f308585j = true;
        }
        kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).C(true);
        }
        kk4.b player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).O();
        }
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        kotlin.jvm.internal.o.g(onReady, "onReady");
        kotlin.jvm.internal.o.g(onDestroy, "onDestroy");
        kotlin.jvm.internal.o.g(onSeekFrame, "onSeekFrame");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f224084a;
        mMTPEffectVideoLayout.setOnFirstFrameAvailable(new cw2.u4(this, onReady));
        mMTPEffectVideoLayout.setOnFrameAvailable(new cw2.v4(this, onSeekFrame));
    }

    @Override // cw2.aa
    public void destroy() {
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f224084a;
        kk4.b player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            ((kk4.v) player).P();
        }
        kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            player2.recycle();
        }
        mMTPEffectVideoLayout.g();
    }

    @Override // cw2.aa
    public android.graphics.Bitmap getBitmap() {
        return this.f224084a.getBitmap();
    }

    @Override // cw2.aa
    public long getCurrentPositionMs() {
        kk4.b player = this.f224084a.getPlayer();
        if (player != null) {
            return ((kk4.v) player).o();
        }
        return 0L;
    }

    @Override // cw2.aa
    public android.view.View getView() {
        return this.f224084a;
    }

    @Override // cw2.aa
    public void resume() {
        kk4.b player = this.f224084a.getPlayer();
        if (player != null) {
            ((kk4.v) player).O();
        }
    }

    @Override // cw2.aa
    public void seekTo(long j17) {
        kk4.b player = this.f224084a.getPlayer();
        if (player != null) {
            kk4.b.f(player, (int) j17, true, null, 4, null);
        }
    }
}
