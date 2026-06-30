package ik4;

/* loaded from: classes4.dex */
public final class c implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291915d;

    public c(ik4.g gVar) {
        this.f291915d = gVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.util.Iterator it = this.f291915d.f291924s.iterator();
        while (it.hasNext()) {
            ((com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener) it.next()).onSeekComplete(iTPPlayer);
        }
    }
}
