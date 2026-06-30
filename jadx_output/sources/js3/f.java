package js3;

/* loaded from: classes.dex */
public class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        long j17 = bundle.getLong("msgid", 0L);
        java.lang.String string = bundle.getString("talker", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetMailMsgTask", "get mail msg %d", java.lang.Long.valueOf(j17));
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(j17 != 0 ? pt0.f0.Li(string, j17).j() : ""));
    }
}
