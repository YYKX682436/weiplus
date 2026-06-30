package gi2;

/* loaded from: classes10.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView f272262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f272263e;

    public a(com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView, yz5.a aVar) {
        this.f272262d = liveCustomRoomLayoutView;
        this.f272263e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f272262d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f272263e.invoke();
        return true;
    }
}
