package gr2;

/* loaded from: classes10.dex */
public final class i0 implements ls5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nn0.c f274776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274777b;

    public i0(nn0.c cVar, com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        this.f274776a = cVar;
        this.f274777b = playTogetherVoiceRoomLinkMicView;
    }

    @Override // ls5.l
    public boolean a() {
        android.content.Context context = this.f274776a.f329805d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return false;
        }
        int i17 = com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.B;
        this.f274777b.getClass();
        return (activity instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) activity).isStopped() : activity.isDestroyed()) ^ true;
    }
}
