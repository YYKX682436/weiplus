package x10;

/* loaded from: classes9.dex */
public final class b extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.v7 g17 = jumpInfo.g();
        java.lang.String c17 = g17 != null ? g17.c() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.GivePreviewCover", "handle params nil");
            callback.c("handle params nil");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c17);
            b00.p0 p0Var = b00.p0.f16747a;
            java.util.Map e17 = p0Var.e(jSONObject);
            java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(context.f357553c);
            com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.GivePreviewCover", "set open event callback, eventId:" + wi6);
            e17.put("ecsOpenEventId", wi6);
            c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
            android.content.Context c18 = context.c();
            ((j00.k1) e3Var).getClass();
            java.lang.String k17 = gm0.j1.b().k();
            kotlin.jvm.internal.o.d(k17);
            e17.put("giverNickName", p0Var.c(k17));
            j00.y.f296946a.a(c18, e17, "ecs_gift_give_preview_cover", null);
            callback.d(null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.GivePreviewCover", "handle error:" + e18);
            callback.c("handle error");
        }
    }
}
