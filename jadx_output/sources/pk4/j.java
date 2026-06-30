package pk4;

/* loaded from: classes10.dex */
public final class j implements gk4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356496a;

    public j(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout) {
        this.f356496a = mMMvVideoLayout;
    }

    public long a() {
        kk4.v currentPlayer = this.f356496a.getCurrentPlayer();
        if (currentPlayer != null) {
            return currentPlayer.o();
        }
        return -1L;
    }
}
