package ie5;

/* loaded from: classes8.dex */
public abstract class a {
    public static int a() {
        try {
            return java.lang.Integer.parseInt(j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgListTopLoadPageCount()));
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingDataConstants", e17, "", new java.lang.Object[0]);
            new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgListTopLoadPageCount();
            return java.lang.Integer.parseInt("48");
        }
    }
}
