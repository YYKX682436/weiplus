package ik4;

/* loaded from: classes4.dex */
public final class d implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291916d;

    public d(ik4.g gVar) {
        this.f291916d = gVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        java.util.Iterator it = this.f291916d.f291928w.iterator();
        while (it.hasNext()) {
            ((com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener) it.next()).onStateChange(i17, i18);
        }
    }
}
