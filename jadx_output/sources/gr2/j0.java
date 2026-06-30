package gr2;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        super(0);
        this.f274779d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int X = nn0.c.X(false);
        int i17 = (X == 5 || X == 6) ? 2 : 0;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274779d;
        nn0.c cVar = new nn0.c(playTogetherVoiceRoomLinkMicView.getContext(), i17, false);
        cVar.f(true);
        cVar.J(new gr2.z(playTogetherVoiceRoomLinkMicView));
        cVar.Q(0);
        cVar.f329807f.f321128h = new gr2.i0(cVar, playTogetherVoiceRoomLinkMicView);
        return cVar;
    }
}
