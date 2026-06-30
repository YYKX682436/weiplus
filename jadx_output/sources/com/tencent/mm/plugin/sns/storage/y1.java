package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class y1 {
    public y1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String username) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserCoverPath", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), username);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        boolean u17 = com.tencent.mm.vfs.w6.u(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "mkdir:" + d17 + " ret:" + u17);
        java.lang.String str = d17 + username + "bg_";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserCoverPath", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        return str;
    }
}
