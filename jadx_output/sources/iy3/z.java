package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/z;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class z implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.rtos.model.RtosQuickReplyList rtosQuickReplyList = (com.tencent.mm.plugin.rtos.model.RtosQuickReplyList) obj;
        my3.c0 a17 = my3.c0.f332784k.a();
        java.util.ArrayList arrayList = rtosQuickReplyList != null ? rtosQuickReplyList.f158584d : null;
        if (a17.f332789d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncQuickReply ");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", sb6.toString());
            if (arrayList != null) {
                int size = arrayList.size();
                java.lang.String[] strArr = new java.lang.String[size];
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj2 = arrayList.get(i17);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    strArr[i17] = ((com.tencent.mm.plugin.rtos.model.RtosQuickReply) obj2).f158583e;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "replies " + java.lang.Integer.valueOf(size));
                com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
                if (weChatApi != null) {
                    weChatApi.setFastReplies(strArr);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "syncQuickReply but not init");
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
