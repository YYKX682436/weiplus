package iy4;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy4/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webwx/model/AutoDownloadAddTaskData;", "", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData data = (com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPC addTask received: msgId=");
        long j17 = data.f187958d;
        sb6.append(j17);
        sb6.append(", talker=");
        java.lang.String str = data.f187959e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadAddTaskIPCTask", sb6.toString());
        iy4.j.f295971a.b(j17, str);
        if (rVar != null) {
            rVar.a(java.lang.Boolean.TRUE);
        }
    }
}
