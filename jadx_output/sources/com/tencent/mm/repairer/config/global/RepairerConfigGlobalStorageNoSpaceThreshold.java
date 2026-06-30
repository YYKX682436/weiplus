package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigGlobalStorageNoSpaceThreshold;", "Lq55/f;", "<init>", "()V", "w55/a", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerConfigGlobalStorageNoSpaceThreshold extends q55.f {

    /* renamed from: a, reason: collision with root package name */
    public static final w55.a f192218a = new w55.a(null);

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_StorageNoSpaceThreshold";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "剩余存储空间不足阈值(MB)";
    }

    @Override // q55.h
    public int d() {
        return 1;
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
        return "clicfg_clean_no_space_threshold";
    }
}
