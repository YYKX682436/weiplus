package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jz f127034d = new com.tencent.mm.plugin.finder.storage.jz();

    public jz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "长按评论点「投诉」改成跳转至liteapp", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_comment_report_liteapp_android, false, 2, null);
        aVar.a("FinderCommentReportLiteApp", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
