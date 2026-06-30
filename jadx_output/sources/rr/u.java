package rr;

/* loaded from: classes4.dex */
public abstract class u {
    public static final void a(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        r45.gj0 h17 = gr.t.g().h();
        if (h17.f375293d.contains(groupId)) {
            return;
        }
        h17.f375293d.add(groupId);
        gr.t g17 = gr.t.g();
        g17.getClass();
        try {
            byte[] byteArray = g17.h().toByteArray();
            z85.x e17 = com.tencent.mm.storage.n5.f().e();
            e17.getClass();
            e17.replace(new z85.w("cache_type_user_data", byteArray));
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e18, "save user data error", new java.lang.Object[0]);
        }
    }
}
