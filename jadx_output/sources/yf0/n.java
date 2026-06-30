package yf0;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final yf0.n f461589a = new yf0.n();

    public final wf0.a2 a(wf0.d2 strategy, zf0.v0 sendVideoTask) {
        kotlin.jvm.internal.o.g(strategy, "strategy");
        kotlin.jvm.internal.o.g(sendVideoTask, "sendVideoTask");
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            return new yf0.m(sendVideoTask);
        }
        if (ordinal == 1) {
            return new yf0.f(sendVideoTask);
        }
        throw new jz5.j();
    }

    public final wf0.d2 b(t21.v2 videoInfo) {
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        java.lang.String h17 = videoInfo.h();
        if (c01.e2.U(h17) && j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigMsgVideoSendPlugUseCdn()) != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoSendApiFactory", "talker[" + h17 + "] is plug,use cgi send");
        } else if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigMsgVideoSendSupportCdn()) != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoSendApiFactory", "isAllow2UseCdnWithXLab = false");
        } else {
            boolean Ri = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(2);
            if (Ri || videoInfo.f415023u == 1) {
                return wf0.d2.f445500d;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoSendApiFactory", " cdn tra not use cdn flag = [" + Ri + "] getCdnInfo:[" + videoInfo.f415023u + ']');
        }
        return wf0.d2.f445501e;
    }
}
