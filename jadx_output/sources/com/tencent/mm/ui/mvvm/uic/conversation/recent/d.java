package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.mvvm.uic.conversation.recent.d f209283d = new com.tencent.mm.ui.mvvm.uic.conversation.recent.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.storage.f9 it = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (g95.e0.b(it) == 5) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = it.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                java.lang.String string = k17.getString(k17.f432315e + 0);
                if (r26.n0.N(string)) {
                    string = k17.getString(k17.f368365d + 9);
                }
                if (r26.n0.D(string, "mp.weixin.qq.com", false, 2, null)) {
                    str = ";\"url_type\":1";
                }
            }
            str = ";\"url_type\":2";
        } else {
            str = ";\"url_type\":0";
        }
        return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.getCreateTime() + str + '}';
    }
}
