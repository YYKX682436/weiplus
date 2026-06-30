package lx;

/* loaded from: classes7.dex */
public final class v5 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.biz.BizTransferApi {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizTransferApi.Companion companion = com.tencent.pigeon.biz.BizTransferApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizTransferApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizTransferApi.Companion companion = com.tencent.pigeon.biz.BizTransferApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizTransferApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.biz.BizTransferApi
    public void transfer(com.tencent.pigeon.biz.BizTransferRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
        transferRequestInfo.f93913d = 2;
        transferRequestInfo.f93915f = request.getScope();
        transferRequestInfo.f93914e = request.getH5Url();
        r45.y24 y24Var = new r45.y24();
        y24Var.f390725d = request.getCgiUrl();
        java.lang.String reqBody = request.getReqBody();
        if (reqBody == null) {
            reqBody = "";
        }
        y24Var.f390726e = reqBody;
        y24Var.f390729h = (int) request.getMethod();
        java.util.Map<java.lang.String, java.lang.String> reqHeaders = request.getReqHeaders();
        if (reqHeaders != null) {
            for (java.lang.String str : reqHeaders.keySet()) {
                if (str != null) {
                    java.lang.String str2 = reqHeaders.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.util.LinkedList linkedList = transferRequestInfo.f93917h.f390728g;
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f371860d = str;
                    cw3Var.f371861e = str2;
                    linkedList.push(cw3Var);
                }
            }
        }
        transferRequestInfo.f93917h = y24Var;
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(transferRequestInfo, new lx.u5(callback));
    }
}
