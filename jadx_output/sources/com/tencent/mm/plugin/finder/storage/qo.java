package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qo f127442d = new com.tencent.mm.plugin.finder.storage.qo();

    public qo() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "Profile页是否展示领取红包封面", null, null, 12, null);
        aVar.b("FinderProfileForbidenDisplayRedPacketLink");
        aVar.a("FINDER_PROFILE_FORBIDDEN_LUCK_MONEY_COVER", kz5.c0.i(0, 1), kz5.c0.i("展示", "不展示"));
        return aVar;
    }
}
