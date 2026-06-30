package q12;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.k0 f359590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DeleteMsgEvent f359591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(q12.k0 k0Var, com.tencent.mm.autogen.events.DeleteMsgEvent deleteMsgEvent) {
        super(0);
        this.f359590d = k0Var;
        this.f359591e = deleteMsgEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        am.y3 y3Var = this.f359591e.f54086g;
        java.lang.String str = y3Var != null ? y3Var.f8427c : null;
        long p17 = c01.w9.p() / 1000;
        this.f359590d.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("EmoticonMsgDeleteListener", "talker is empty");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.d(str);
            hashMap.put("to_username", str);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(0);
            hashMap.put("begin_timestamps", jSONArray);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(p17);
            hashMap.put("end_timestamps", jSONArray2);
            hashMap.put("view_id", "chat_emoticon_delete_report");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("chat_emoticon_delete_report", null, hashMap, 10, false);
        }
        return jz5.f0.f302826a;
    }
}
