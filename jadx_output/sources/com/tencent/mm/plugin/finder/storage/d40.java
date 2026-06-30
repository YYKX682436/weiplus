package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d40 f126625d = new com.tencent.mm.plugin.finder.storage.d40();

    public d40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频质量分上报", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_report_quality_info, false, 2, null);
        aVar.a("REPORT_QUALITY_INFO", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
