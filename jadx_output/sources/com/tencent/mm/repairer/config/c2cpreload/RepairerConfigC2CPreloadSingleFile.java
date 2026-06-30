package com.tencent.mm.repairer.config.c2cpreload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/c2cpreload/RepairerConfigC2CPreloadSingleFile;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class RepairerConfigC2CPreloadSingleFile extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Global_C2CPreload_SingleFile";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "单聊文件预加载策略";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupC2CPreload.class;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_predownload_c2c_strategy_single_file_andr";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("老策略", "后台优先级", "客户端优先级", "覆写优先级", "强制预加载");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2", "3", "4");
    }
}
