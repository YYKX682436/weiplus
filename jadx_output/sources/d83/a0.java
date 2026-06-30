package d83;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f226950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.ilink.network.CloudCgiRequest f226951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.ilink.network.CloudCgiRequest cloudCgiRequest, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226951e = cloudCgiRequest;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d83.a0(this.f226951e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d83.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f226950d;
        com.tencent.ilink.network.CloudCgiRequest cloudCgiRequest = this.f226951e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = cloudCgiRequest.hasUseNetworkType() && cloudCgiRequest.getUseNetworkType() == com.tencent.ilink.network.IlinkNetworkType.kIlinkNetworkTypeMobile;
            d83.e0 e0Var = d83.e0.f226958a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: taskid " + cloudCgiRequest.getCloudTaskid() + ", type " + cloudCgiRequest.getCgiType() + ", timeout " + cloudCgiRequest.getTimeoutMs() + ", longPolling " + cloudCgiRequest.getLongPolling() + ", bindCellular " + z17);
            com.tencent.ilink.network.CloudCgiType cgiType = cloudCgiRequest.getCgiType();
            int i18 = cgiType == null ? -1 : d83.z.f227044a[cgiType.ordinal()];
            d83.o oVar = d83.o.f227002a;
            if (i18 == 1) {
                byte[] g17 = cloudCgiRequest.getRequestBody().g();
                com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(g17, 0, g17.length);
                int timeoutMs = cloudCgiRequest.getTimeoutMs();
                this.f226950d = 1;
                obj = oVar.a(gVar, timeoutMs, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = (jz5.l) obj;
            } else if (i18 != 2) {
                lVar = null;
            } else {
                byte[] g18 = cloudCgiRequest.getRequestBody().g();
                com.tencent.mm.protobuf.g gVar2 = new com.tencent.mm.protobuf.g(g18, 0, g18.length);
                int timeoutMs2 = cloudCgiRequest.getTimeoutMs();
                boolean longPolling = cloudCgiRequest.getLongPolling();
                java.lang.String ilinkCgiUrl = cloudCgiRequest.hasIlinkCgiUrl() ? cloudCgiRequest.getIlinkCgiUrl() : "";
                kotlin.jvm.internal.o.d(ilinkCgiUrl);
                this.f226950d = 2;
                obj = oVar.b(gVar2, timeoutMs2, longPolling, ilinkCgiUrl, z17, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = (jz5.l) obj;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            lVar = (jz5.l) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            lVar = (jz5.l) obj;
        }
        if (lVar != null) {
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) d83.e0.f226962e.get(new java.lang.Integer(cloudCgiRequest.getCloudTaskid()));
            int intValue = ((java.lang.Number) lVar.f302833d).intValue();
            com.tencent.mm.protobuf.g gVar3 = (com.tencent.mm.protobuf.g) lVar.f302834e;
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: resp taskid " + cloudCgiRequest.getCloudTaskid() + ", errcode " + intValue);
            if (r2Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ILinkInitMgr", "job already been canceled");
            } else {
                d83.e0 e0Var2 = d83.e0.f226958a;
                com.tencent.ilink.CloudSession cloudSession = d83.e0.f226963f;
                if (cloudSession != null) {
                    cloudSession.receiveCloudCgiResponse(cloudCgiRequest.getCloudTaskid(), intValue, gVar3.g());
                }
            }
        }
        d83.e0.f226962e.remove(new java.lang.Integer(cloudCgiRequest.getCloudTaskid()));
        return jz5.f0.f302826a;
    }
}
