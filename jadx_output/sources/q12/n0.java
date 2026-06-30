package q12;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.o0 f359617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f359618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q12.o0 o0Var, com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f359617d = o0Var;
        this.f359618e = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f359617d.getClass();
        com.tencent.mm.storage.f9 f9Var = this.f359618e;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("EmoticonMsgRevokeListener", "info data is null");
        } else {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            jSONArray.put(f9Var.getCreateTime() / 1000);
            jSONArray2.put(f9Var.z0());
            jSONArray3.put(f9Var.A0() == 1);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("begin_timestamps", jSONArray);
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            hashMap.put("to_username", Q0);
            hashMap.put("md5s", jSONArray2);
            hashMap.put("is_send", jSONArray3);
            hashMap.put("view_id", "chat_emoticon_delete_report");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("chat_emoticon_delete_report", null, hashMap, 10, false);
        }
        return jz5.f0.f302826a;
    }
}
