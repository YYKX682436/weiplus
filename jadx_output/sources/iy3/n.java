package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/n;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class n implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncINvokeTask_OnUploadXlog", "invoke UploadXlog");
        my3.c0 a17 = my3.c0.f332784k.a();
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onXlogUpload: " + str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) + 57600000) - 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        stringBuffer.append("000000");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        try {
            currentTimeMillis2 = simpleDateFormat.parse(stringBuffer2).getTime();
        } catch (java.text.ParseException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosWatchService", "dateToTimeStamp failed. date:%s, stack:%s", stringBuffer2, new com.tencent.mm.sdk.platformtools.z3());
        }
        int i17 = (int) ((currentTimeMillis - currentTimeMillis2) / 86400000);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "time = " + i17);
        com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
        if (weChatApi != null) {
            weChatApi.uploadXlog(i17);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
