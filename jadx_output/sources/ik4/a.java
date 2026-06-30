package ik4;

/* loaded from: classes4.dex */
public final class a implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291913d;

    public a(ik4.g gVar) {
        this.f291913d = gVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public final void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        java.util.Iterator it = this.f291913d.f291926u.iterator();
        while (it.hasNext()) {
            ((com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener) it.next()).onCompletion(iTPPlayer);
        }
    }
}
