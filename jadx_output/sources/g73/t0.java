package g73;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg73/t0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class t0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        g73.o0 o0Var = g73.o0.f269311d;
        o0Var.getClass();
        com.tencent.mm.plugin.handoff.model.HandOff Di = g73.o0.Di(ballInfo);
        if (Di != null) {
            Di.setHandOffType(1);
            int i18 = ballInfo.f93046d;
            if (i18 != 1) {
                i17 = 2;
                if (i18 != 2 && i18 != 50) {
                    i17 = 1;
                }
            } else {
                i17 = 3;
            }
            Di.setKey(com.tencent.mm.plugin.handoff.model.HandOff.Companion.a(i17, 1));
            o0Var.Jc(Di);
        }
    }
}
