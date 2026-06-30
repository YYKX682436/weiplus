package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class il extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.il f126957d = new com.tencent.mm.plugin.finder.storage.il();

    public il() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "NPS问卷定时隐藏时间", null, null, 12, null);
        aVar.a("FINDER_NPS_SURVEY_AUTO_DISAPPEAR_TIME", kz5.c0.i(10, 0), kz5.c0.i("10秒", "跟随问卷"));
        return aVar;
    }
}
