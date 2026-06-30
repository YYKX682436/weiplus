package ki2;

/* loaded from: classes10.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f308105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308106e;

    public c(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, yz5.a aVar) {
        this.f308105d = liveVoiceRoomLayoutView;
        this.f308106e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f308105d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f308106e.invoke();
        return true;
    }
}
