package rk2;

/* loaded from: classes3.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final mn0.b0 f396447d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f396448e;

    /* renamed from: f, reason: collision with root package name */
    public final uk2.b f396449f;

    public c(mn0.b0 player, boolean z17, uk2.b data) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(data, "data");
        this.f396447d = player;
        this.f396448e = z17;
        this.f396449f = data;
    }

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "key: " + this.f396449f.a() + ' ' + str);
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        if (i17 == -2301) {
            a("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1));
            return;
        }
        if (i17 == 1007) {
            a("onPlayEvent PUSH_EVT_FIRST_FRAME_AVAILABLE");
            return;
        }
        if (i17 == 2001) {
            a("onPlayEvent ".concat(i17 == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC"));
            return;
        }
        if (i17 != 2009) {
            if (i17 == 2033) {
                a("receive EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
                return;
            } else {
                if (i17 != 2103) {
                    return;
                }
                a("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1));
                return;
            }
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        mn0.y yVar = (mn0.y) this.f396447d;
        boolean z17 = this.f396448e;
        yVar.Q(z17 ? 1 : 0);
        a("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION, w:h=" + i18 + ':' + i19 + " videoRatioWH:" + ((i18 * 1.0f) / i19) + " isLandscape: " + z17);
    }
}
