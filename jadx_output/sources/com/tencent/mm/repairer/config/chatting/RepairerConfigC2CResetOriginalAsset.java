package com.tencent.mm.repairer.config.chatting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/RepairerConfigC2CResetOriginalAsset;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigC2CResetOriginalAsset extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_C2CResetOriginalAsset";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "C2C会话-重置原图/原视频/原文件";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupChatting.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).remove("UseC2COriginalAssetPath");
        dp.a.makeText(context, "已重置", 0).show();
    }
}
