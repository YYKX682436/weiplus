package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c2 f126557d = new com.tencent.mm.plugin.finder.storage.c2();

    public c2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30, "18054限制曝光数上报", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_18054_exposed_count_limit, false, 2, null);
        aVar.a("DEBUG_POST_UPLOAD_BLOCK", new java.util.ArrayList(kz5.c0.i(30, 3)), kz5.c0.i("默认30", "3"));
        return aVar;
    }
}
