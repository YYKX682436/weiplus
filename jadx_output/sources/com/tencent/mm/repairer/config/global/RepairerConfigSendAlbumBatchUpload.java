package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigSendAlbumBatchUpload;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigSendAlbumBatchUpload extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_SendAlbumBatchUpload";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "发送合集批量秒传";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupGlobal.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_albummsg_enable_send_batch_upload";
    }
}
