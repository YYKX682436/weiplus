package ol4;

/* loaded from: classes14.dex */
public final class a implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346149d;

    public a(ol4.q qVar) {
        this.f346149d = qVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        ol4.q qVar = this.f346149d;
        com.tencent.mars.xlog.Log.i(qVar.f346197s, "onSeekEnd");
        qVar.f346196r = false;
        ll4.a aVar = qVar.f346182d;
        if (aVar != null) {
            ll4.a.a(aVar, 10, null, 2, null);
        }
    }
}
