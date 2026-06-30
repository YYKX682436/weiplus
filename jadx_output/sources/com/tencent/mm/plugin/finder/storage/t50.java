package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t50 f127585d = new com.tencent.mm.plugin.finder.storage.t50();

    public t50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(172800000, "2天不出阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_2_day_threshold, false, 2, null);
        aVar.a("TWO_DAY_THRESHOLD", new java.util.ArrayList(kz5.c0.i(172800000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL), 120000)), kz5.c0.i("2天", "20 秒", "2 分钟"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_like_comment_edu, false, 2, null);
        aVar.a("DEBUG_SELF_LIKE_EDU", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "支持"));
        return aVar;
    }
}
