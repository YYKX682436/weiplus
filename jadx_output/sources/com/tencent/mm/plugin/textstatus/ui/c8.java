package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.c8 f173768d = new com.tencent.mm.plugin.textstatus.ui.c8();

    public c8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        byte[] bytes = a17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("LastStatusId");
        return com.tencent.mm.sdk.platformtools.o4.N(sb6.toString(), 2, null);
    }
}
