package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.rb f127478d = new com.tencent.mm.plugin.finder.storage.rb();

    public rb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(v31.j.CTRL_INDEX, "强化流快划播放进度阈值(毫秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_enhance_fast_slip_time_threshold, false, 2, null);
        aVar.a("FINDER_ENHANCE_FAST_SLIP_TIME_THRESHOLD", kz5.c0.i(java.lang.Integer.valueOf(v31.j.CTRL_INDEX), 3000), kz5.c0.i("1400ms", "3000ms"));
        return aVar;
    }
}
