package wc4;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(wc4.a aVar, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$addUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.c().put(str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$addUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
    }

    public final int b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPublishProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
            return 0;
        }
        java.lang.Integer num = (java.lang.Integer) com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.c().get(str);
        int intValue = num != null ? num.intValue() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        return intValue;
    }

    public final boolean c(java.lang.String localIdStr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPublish", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        kotlin.jvm.internal.o.g(localIdStr, "localIdStr");
        boolean containsKey = com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.c().containsKey(localIdStr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPublish", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        return containsKey;
    }
}
