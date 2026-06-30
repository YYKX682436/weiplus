package wk2;

/* loaded from: classes3.dex */
public final class k extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView f446955d;

    public k(com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView) {
        this.f446955d = multiStreamPreviewView;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        java.util.LinkedList enterLiveStep;
        java.util.LinkedList enterLiveStep2;
        java.util.LinkedList enterLiveStep3;
        r45.nw1 nw1Var;
        super.onPlayEvent(i17, bundle);
        com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView = this.f446955d;
        mn0.b0 b0Var = multiStreamPreviewView.f111756d;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            if (i17 == -2301) {
                java.lang.System.out.print((java.lang.Object) ("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + (com.tencent.mars.comm.NetStatusUtil.getNetType(multiStreamPreviewView.getContext()) == -1)));
                mn0.b0 b0Var2 = multiStreamPreviewView.f111756d;
                if (b0Var2 != null) {
                    mn0.b0.C(b0Var2, false, false, false, 6, null);
                    return;
                }
                return;
            }
            if (i17 == 2001) {
                java.lang.System.out.print((java.lang.Object) "onPlayEvent ".concat(i17 == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC"));
                return;
            }
            if (i17 != 2003) {
                if (i17 != 2103) {
                    return;
                }
                java.lang.System.out.print((java.lang.Object) ("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + (com.tencent.mars.comm.NetStatusUtil.getNetType(multiStreamPreviewView.getContext()) == -1)));
                return;
            }
            uk2.a aVar = multiStreamPreviewView.f111759g;
            if (aVar != null) {
                r45.ka4 ka4Var = aVar.f428520f;
                if (ka4Var != null && ka4Var.V >= ka4Var.W) {
                    android.widget.ImageView imageView = multiStreamPreviewView.f111758f;
                    if (imageView == null) {
                        kotlin.jvm.internal.o.o("bgView");
                        throw null;
                    }
                    imageView.setVisibility(0);
                } else {
                    android.widget.ImageView imageView2 = multiStreamPreviewView.f111758f;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.o.o("bgView");
                        throw null;
                    }
                    imageView2.setVisibility(8);
                }
            }
            enterLiveStep = multiStreamPreviewView.getEnterLiveStep();
            r45.qa4 qa4Var = (r45.qa4) kz5.n0.Z(enterLiveStep);
            long j17 = 0;
            long j18 = qa4Var != null ? qa4Var.getLong(1) : 0L;
            long elapsedRealtime = j18 > 0 ? android.os.SystemClock.elapsedRealtime() - j18 : 0L;
            mn0.b0 b0Var3 = multiStreamPreviewView.f111756d;
            if (b0Var3 != null) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                java.lang.String str = a52.a.f1584l;
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
                if (e1Var != null && (nw1Var = e1Var.f328988r) != null) {
                    j17 = nw1Var.getLong(0);
                }
                long j19 = j17;
                java.lang.String valueOf = java.lang.String.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(j19));
                mn0.b0 b0Var4 = multiStreamPreviewView.f111756d;
                if (b0Var4 != null) {
                    kotlin.jvm.internal.o.d(str);
                    ((mn0.y) b0Var4).h(str, valueOf, elapsedRealtime);
                }
                zl2.q4 q4Var = zl2.q4.f473933a;
                kotlin.jvm.internal.o.d(str);
                enterLiveStep3 = multiStreamPreviewView.getEnterLiveStep();
                q4Var.L(str, j19, valueOf, elapsedRealtime, enterLiveStep3, ((mn0.y) b0Var3).l(), "MultiStream");
            }
            enterLiveStep2 = multiStreamPreviewView.getEnterLiveStep();
            enterLiveStep2.clear();
        }
    }
}
