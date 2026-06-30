package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public class w extends java.util.LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        if (size() > 500 && entry != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorageLogic", "remove eldest ad snsId " + entry.getKey());
        }
        boolean z17 = size() > 500;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        return z17;
    }
}
