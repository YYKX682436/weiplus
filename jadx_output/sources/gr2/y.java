package gr2;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        super(1);
        this.f274836d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nn0.c player;
        r45.s7 it = (r45.s7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274836d;
        player = playTogetherVoiceRoomLinkMicView.getPlayer();
        android.content.Context context = playTogetherVoiceRoomLinkMicView.getContext();
        if (!java.lang.Boolean.valueOf(context instanceof androidx.appcompat.app.AppCompatActivity).booleanValue()) {
            context = null;
        }
        if (context == null) {
            context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
        }
        player.r(playTogetherVoiceRoomLinkMicView.n(context), playTogetherVoiceRoomLinkMicView.f122158w, it.getInteger(0), it.getInteger(1));
        return jz5.f0.f302826a;
    }
}
