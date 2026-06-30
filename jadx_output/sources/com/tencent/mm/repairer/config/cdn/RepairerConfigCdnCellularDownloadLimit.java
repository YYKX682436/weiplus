package com.tencent.mm.repairer.config.cdn;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/cdn/RepairerConfigCdnCellularDownloadLimit;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigCdnCellularDownloadLimit extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_CdnCellularDownloadLimit";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "蜂窝网络下载流量限制(MiB)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupCdn.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "25";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_cdn_cellular_download_limit";
    }
}
