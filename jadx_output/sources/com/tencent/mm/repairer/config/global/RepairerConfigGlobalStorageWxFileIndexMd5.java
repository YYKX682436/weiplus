package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigGlobalStorageWxFileIndexMd5;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigGlobalStorageWxFileIndexMd5 extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_StorageWxFileIndexMd5_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "文件索引保存文件 MD5 信息（>0）";
    }

    @Override // q55.h
    public int d() {
        return 3;
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupStorage.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_clean_file_index_md5_enable";
    }
}
