package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pr f127388d = new com.tencent.mm.plugin.finder.storage.pr();

    public pr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号进度条精细化调节", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_seek_bar_fine_adjust_type_android, false, 2, null);
        aVar.a("FINDER_SEEK_BAR_FINE_ADJUST", kz5.c0.i(0, 1, 2), kz5.c0.i("不出按钮", "仅拖动出按钮", "拖动和长按都出按钮"));
        return aVar;
    }
}
