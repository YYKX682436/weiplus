package fd;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.kinda.framework.module.impl.NetworkServiceImpl f261244a = new com.tencent.kinda.framework.module.impl.NetworkServiceImpl();

    public final void a(org.json.JSONObject config, java.nio.ByteBuffer data, fd.a callback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppNetworkService", "request cgi - config size: %d data size: %d", java.lang.Integer.valueOf(config.length()), java.lang.Integer.valueOf(data.capacity()));
            fd.f fVar = new fd.f(config, data);
            fVar.f261253i = new fd.d(fVar, this, callback);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(fVar.f261245a);
            objArr[1] = fVar.f261246b;
            byte[] bArr = fVar.f261252h;
            objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppNetworkService", "start invoke cgi - cgiId: %d cgiUrl: %s dataSize: %d", objArr);
            this.f261244a.invoke(fVar, null);
        } catch (java.lang.IllegalArgumentException e17) {
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = e17.toString();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke argument error, message: %s", message);
            callback.onResp(new com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse(-2, message, null));
        } catch (org.json.JSONException e18) {
            java.lang.String message2 = e18.getMessage();
            if (message2 == null) {
                message2 = e18.toString();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke argument error, message: %s", message2);
            callback.onResp(new com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse(-2, message2, null));
        } catch (java.lang.Exception e19) {
            java.lang.String message3 = e19.getMessage();
            if (message3 == null) {
                message3 = e19.toString();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke system error, message: %s", message3);
            callback.onResp(new com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse(-1, message3, null));
        }
    }
}
