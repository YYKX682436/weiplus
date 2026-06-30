package ik4;

/* loaded from: classes4.dex */
public final class b implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291914d;

    public b(ik4.g gVar) {
        this.f291914d = gVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public final void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        java.util.Iterator it = this.f291914d.f291925t.iterator();
        while (it.hasNext()) {
            ((com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener) it.next()).onError(iTPPlayer, i17, i18, j17, j18);
        }
    }
}
