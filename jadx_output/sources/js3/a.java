package js3;

/* loaded from: classes5.dex */
public class a implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelMailMsgTask", "delete mail msg %s", iPCString.toString());
        java.lang.String[] split = iPCString.toString().split(";");
        if (split.length == 2) {
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(split[0]);
            java.lang.String str = split[1];
            if (E1 != 0) {
                pt0.f0.P7(str, E1);
            }
        }
    }
}
