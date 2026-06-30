package rx;

@j95.b
/* loaded from: classes9.dex */
public final class j extends i95.w implements sx.c0 {
    public dn.m Ai(com.tencent.mm.modelcdntran.d1 taskInfo) {
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        com.tencent.mm.modelcdntran.b1 bj6 = com.tencent.mm.modelcdntran.s1.bj();
        if (bj6 == null) {
            return null;
        }
        if (!((com.tencent.mm.sdk.platformtools.t8.N0(taskInfo.f70907c, taskInfo.f70908d, taskInfo.f70912h) || taskInfo.f70913i <= 0 || (com.tencent.mm.sdk.platformtools.t8.N0(taskInfo.f70906b, taskInfo.f70905a) && com.tencent.mm.sdk.platformtools.t8.N0(taskInfo.f70917m, taskInfo.f70915k))) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnMediaFSC", "add task illegal, task mediaId:" + taskInfo.f70908d);
            return null;
        }
        dn.m mVar = new dn.m();
        java.lang.String str = taskInfo.f70908d;
        mVar.field_mediaId = str;
        mVar.f241785d = "task_RecordMsgCDNService";
        mVar.f241786e = false;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_totalLen = taskInfo.f70910f;
        mVar.field_aesKey = taskInfo.f70905a;
        mVar.field_fileId = taskInfo.f70906b;
        java.lang.String T6 = bj6.T6(str);
        if (T6 == null) {
            T6 = "";
        }
        mVar.field_fullpath = T6;
        mVar.field_fileType = taskInfo.f70913i;
        mVar.field_filemd5 = taskInfo.f70918n;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(taskInfo.f70917m)) {
            mVar.field_fileType = 19;
            mVar.field_authKey = taskInfo.f70916l;
            mVar.field_aesKey = taskInfo.f70915k;
            mVar.f241811z = taskInfo.f70917m;
            mVar.field_fileId = "";
        }
        if (!bj6.V6().contains(mVar.field_mediaId)) {
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) bj6.f70888h).getValue(), null, new com.tencent.mm.modelcdntran.z0(bj6, mVar, taskInfo, ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Di(new kq.a(mVar, com.tencent.mm.modelcdntran.n3.class)), null), 1, null);
        }
        return mVar;
    }

    public void Bi(com.tencent.mm.modelcdntran.c1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.modelcdntran.b1 bj6 = com.tencent.mm.modelcdntran.s1.bj();
        if (bj6 != null) {
            synchronized (bj6.U6()) {
                bj6.U6().remove(listener);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnMediaFSC", "remove listener " + listener + ", now listener count:" + bj6.U6().size());
        }
    }

    public void wi(com.tencent.mm.modelcdntran.c1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.modelcdntran.b1 bj6 = com.tencent.mm.modelcdntran.s1.bj();
        if (bj6 != null) {
            java.util.Iterator it = bj6.U6().iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b((com.tencent.mm.modelcdntran.c1) it.next(), listener)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnMediaFSC", "try add listener " + listener + ", but already add this listener, now listener count:" + bj6.U6().size());
                    return;
                }
            }
            synchronized (bj6.U6()) {
                bj6.U6().add(listener);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnMediaFSC", "add listener " + listener + ", now listener count:" + bj6.U6().size());
        }
    }
}
