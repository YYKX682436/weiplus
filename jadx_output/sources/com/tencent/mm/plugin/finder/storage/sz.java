package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sz f127572d = new com.tencent.mm.plugin.finder.storage.sz();

    public sz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(600000, "getAllDeviceInfo调用时间间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_get_all_device_info_call_interval, false, 2, null);
        aVar.a("FinderGetDeviceInfoIntervalMs", kz5.c0.i(600000, 30000, 0), kz5.c0.i("10分钟", "30秒", "不限制"));
        return aVar;
    }
}
