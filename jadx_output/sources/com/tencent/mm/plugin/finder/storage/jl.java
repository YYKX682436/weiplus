package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jl f127020d = new com.tencent.mm.plugin.finder.storage.jl();

    public jl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "NPS问卷延迟展示时间", null, null, 12, null);
        aVar.a("FINDER_NPS_SURVEY_DELAY_APPEAR_TIME", kz5.c0.i(5, 0), kz5.c0.i("5秒", "跟随问卷"));
        return aVar;
    }
}
