package com.tencent.mm.repairer.config.location;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/location/RepairerConfigPOIDetailPrefetchListExpireSeconds;", "Lx55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RepairerConfigPOIDetailPrefetchListExpireSeconds extends x55.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f192220a = 300;

    @Override // q55.h
    public java.lang.String c() {
        return "POI双列流预加载首屏缓存有效期(秒)";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_finder_poi_list_prefetch_expire_seconds";
    }
}
