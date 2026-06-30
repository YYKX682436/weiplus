package ki2;

/* loaded from: classes10.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f308111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308112e;

    public g(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, yz5.a aVar) {
        this.f308111d = liveVoiceRoomLayoutView;
        this.f308112e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f308111d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f308112e.invoke();
        return true;
    }
}
