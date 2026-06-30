package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class w20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.w20 f128224d = new com.tencent.mm.plugin.finder.storage.w20();

    public w20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "打开我tab的视频号入口", null, null, 12, null);
        aVar.b("FinderMineTabProfileEntranceDisplayType");
        aVar.a("ME_FINDER_ENTRY_FINAL_SWITCH", kz5.c0.i(0, 1, 2), kz5.c0.i("现网", "全开", "全关"));
        return aVar;
    }
}
