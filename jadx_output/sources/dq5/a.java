package dq5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dq5.a f242371a = new dq5.a();

    public final boolean a(int i17, byte[] content, byte[] key) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(key, "key");
        byte[] b17 = kk.a.f308464a.b(content, key);
        if (b17 != null) {
            return b(i17, b17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.F2FTransportHelper", "sendEncrypted: encrypt failed");
        return false;
    }

    public final boolean b(int i17, byte[] content) {
        kotlin.jvm.internal.o.g(content, "content");
        r45.j87 j87Var = new r45.j87();
        j87Var.f377653d = i17;
        j87Var.f377654e = new com.tencent.mm.protobuf.g(content, 0, content.length);
        i95.m c17 = i95.n0.c(gz.l.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        byte[] byteArray = j87Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return com.tencent.wechat.aff.local_connection.d.f217358c.h(byteArray);
    }
}
