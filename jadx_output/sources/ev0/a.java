package ev0;

/* loaded from: classes5.dex */
public final class a extends kk4.i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ev0.b f256834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ev0.b bVar) {
        super(bVar);
        this.f256834e = bVar;
    }

    @Override // kk4.i, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        yz5.a aVar;
        super.onInfo(iTPPlayer, i17, j17, j18, obj);
        if (i17 != 105 || (aVar = this.f256834e.f256836b0) == null) {
            return;
        }
        aVar.invoke();
    }
}
