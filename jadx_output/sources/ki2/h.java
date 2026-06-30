package ki2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ki2.i f308113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f308114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ki2.i iVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView) {
        super(0);
        this.f308113d = iVar;
        this.f308114e = liveVoiceRoomLayoutView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ki2.i iVar = this.f308113d;
        iVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAddContentView diff tag, removeAll, tag: ");
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f308114e;
        sb6.append(liveVoiceRoomLayoutView.getTag());
        sb6.append(" childCount: ");
        sb6.append(liveVoiceRoomLayoutView.getChildCount());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = iVar.f272266a;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (!kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getTag(), str) || !kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getSingContentLayout().getParent(), liveVoiceRoomLayoutView)) {
            liveVoiceRoomLayoutView.removeAllViews();
            android.widget.FrameLayout singContentLayout = liveVoiceRoomLayoutView.getSingContentLayout();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
            layoutParams.f10893h = 0;
            layoutParams.f10885d = 0;
            liveVoiceRoomLayoutView.addView(singContentLayout, layoutParams);
        }
        return jz5.f0.f302826a;
    }
}
