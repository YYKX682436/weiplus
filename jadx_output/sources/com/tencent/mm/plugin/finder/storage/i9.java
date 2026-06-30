package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.i9 f126936d = new com.tencent.mm.plugin.finder.storage.i9();

    public i9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "热评刚刚回复间隔", null, null, 12, null);
        aVar.a("FINDER_COMMENT_SHOW_AUTHOR_JUST_REACTION_TIME", kz5.c0.i(0, 1), kz5.c0.i("1小时", "30天"));
        return aVar;
    }
}
