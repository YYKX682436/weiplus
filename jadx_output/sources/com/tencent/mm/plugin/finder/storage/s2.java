package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s2 f127518d = new com.tencent.mm.plugin.finder.storage.s2();

    public s2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(180, "活动结束时间支持用户选择最近x天", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_activity_end_time_max_day, false, 2, null);
        return aVar;
    }
}
