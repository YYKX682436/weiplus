package j00;

/* loaded from: classes9.dex */
public final class d0 implements com.tencent.pigeon.ecs.EcsNativeApi, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f296740d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296741e = hashCode();

    public final void a(long j17, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ecs.EcsNativeRouterResponse(java.lang.Long.valueOf(j17), str, str2))));
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void addNewAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f296740d;
        if (activity == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("activity is null")))));
        } else {
            b30.i a17 = b30.i.f17563b.a(activity);
            a17.a().add(new m00.b(callback));
            j45.l.n(activity, "address", ".ui.WalletAddAddressUI", null, 4360);
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void callAppPay(com.tencent.pigeon.ecs.EcsAppPayInfo payInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(payInfo, "payInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String payPackage = payInfo.getPayPackage();
        java.lang.String orderId = payInfo.getOrderId();
        if (com.tencent.mm.sdk.platformtools.t8.K0(payPackage) || com.tencent.mm.sdk.platformtools.t8.K0(orderId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsGiftFlutterPlugin", "callAppPay error, payPackage or orderId is empty");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ecs.EcsAppPayResult(-1L, "payPackage or orderId invalid", null, 4, null))));
        } else {
            ((com.tencent.mm.feature.wxpay.m) ((mh0.p) i95.n0.c(mh0.p.class))).wi(this.f296740d, payPackage, new j00.z(orderId, callback));
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void editAddress(com.tencent.pigeon.ecs.EcsAddressStruct address, boolean z17, yz5.l callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(address, "address");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f296740d;
        if (activity != null) {
            b30.i.f17563b.a(activity).a().add(new m00.c(callback, address));
            ct.o2 o2Var = (ct.o2) i95.n0.c(ct.o2.class);
            java.lang.Long addressId = address.getAddressId();
            int longValue = addressId != null ? (int) addressId.longValue() : 0;
            ((o71.b) o2Var).getClass();
            o71.l.Bi().g();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activity, com.tencent.mm.plugin.address.ui.WalletAddAddressUI.class);
            intent.putExtra("address_id", longValue);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4361);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/address/app/AddrFeatureService", "launchEditAddressUIForResult", "(Landroid/app/Activity;II)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("activity is null")))));
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void enableGiftPageSwipe() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "enableGiftPageSwipe");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void getAllAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((o71.b) ((ct.o2) i95.n0.c(ct.o2.class))).wi(new m00.d(callback));
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public java.lang.String getEcsGiftImgCacheDirectory() {
        java.lang.String valueOf = java.lang.String.valueOf((java.lang.String) ((jz5.n) ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).f296746d).getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "getEcsGiftImgCacheDirectory, dir: ".concat(valueOf));
        return valueOf;
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void getPoiInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public java.lang.String getSearchtExtraSessionData() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void launchSearch(java.lang.String extData, yz5.l callback) {
        kotlin.jvm.internal.o.g(extData, "extData");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void markBoxUnwrap(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "markBoxUnwrap, giftMsgId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "markBoxUnwrap, giftMsgId:" + str + ", sendType:" + j17);
        int i17 = (int) j17;
        if (i17 == 0 || i17 == 1) {
            n00.f a17 = n00.d.f333815a.a();
            kotlin.jvm.internal.o.d(str);
            a17.J0(str, true);
            return;
        }
        n00.f a18 = n00.d.f333815a.a();
        kotlin.jvm.internal.o.d(str);
        a18.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, isInsertNew:true");
        if (a18.D0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, is insert new is true, update directly");
            a18.J0(str, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateOrInsertHasMsgClicked, is insert new is true, insert new");
            a18.z0(str, 0L, "", true, "", false);
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void nativeRouter(com.tencent.pigeon.ecs.EcsNativeRouterRequest request, yz5.l callback) {
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "nativeRouter");
        if (com.tencent.mm.sdk.platformtools.t8.K0(request.getParams())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsGiftFlutterPlugin", "nativeRouter error, params invalid");
            a(-1L, "", "", callback);
            return;
        }
        try {
            java.lang.String params = request.getParams();
            kotlin.jvm.internal.o.d(params);
            org.json.JSONObject jSONObject = new org.json.JSONObject(params);
            int i17 = jSONObject.getInt("recipientType");
            java.lang.Long type = request.getType();
            bw5.x7 Ai = type != null ? ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).Ai(type.longValue(), i17) : null;
            if (Ai == null || (activity = this.f296740d) == null) {
                return;
            }
            pq.a aVar = new pq.a(activity);
            aVar.b(jSONObject);
            java.lang.Long type2 = request.getType();
            i00.a[] aVarArr = i00.a.f286495d;
            if (type2 != null && type2.longValue() == 7) {
                bw5.g8 g8Var = new bw5.g8();
                g8Var.f27712e = true;
                g8Var.f27722r[2] = true;
                aVar.f357552b.e(g8Var);
                ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, Ai, new j00.b0(request, this, callback));
            }
            aVar.f357553c = new j00.a0(this, callback);
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, Ai, new j00.b0(request, this, callback));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsGiftFlutterPlugin", e17, "", new java.lang.Object[0]);
            a(1L, "", "", callback);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f296740d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "onAttachedToEngine");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion companion = com.tencent.pigeon.ecs.EcsNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f296740d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f296740d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion companion = com.tencent.pigeon.ecs.EcsNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void onEcsGiftResendCompleted(com.tencent.pigeon.ecs.EcsNativeGiftResendResult result) {
        java.lang.Object m521constructorimpl;
        java.lang.Long giftOrderId;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(result, "result");
        j00.e0 e0Var = (j00.e0) ((j00.z3) i95.n0.c(j00.z3.class));
        e0Var.getClass();
        e0Var.f296756f.getClass();
        com.tencent.mars.xlog.Log.i("Ecs.Gift.Live.EcsGiftInLiveMonitor", "onFinishResend, seqId: " + result.getSeqId() + ", errCode: " + result.getErrCode());
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jz5.l[] lVarArr = new jz5.l[4];
            j00.s1[] s1VarArr = j00.s1.f296885d;
            lVarArr[0] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(1));
            lVarArr[1] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, "resend_end");
            java.lang.String seqId = result.getSeqId();
            if (seqId == null) {
                seqId = "";
            }
            lVarArr[2] = new jz5.l("seqId", seqId);
            lVarArr[3] = new jz5.l("errCode", java.lang.String.valueOf(result.getErrCode()));
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(lVarArr)).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            y02.v0 a17 = y02.x0.f458634d.a();
            if (a17 != null) {
                a17.p1(bw5.d5.EcsGiftSendFlow, 1, t17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Ecs.Gift.Live.EcsGiftInLiveMonitor", m524exceptionOrNullimpl, "onFinishResend", new java.lang.Object[0]);
        }
        java.lang.String seqId2 = result.getSeqId();
        if (seqId2 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e0Var.f296755e;
            c00.l3 l3Var = (c00.l3) concurrentHashMap.get(seqId2);
            if (l3Var != null) {
                com.tencent.mm.plugin.finder.live.widget.as asVar = (com.tencent.mm.plugin.finder.live.widget.as) l3Var;
                com.tencent.mars.xlog.Log.i(asVar.f117793a.f118280J, "cgiSendWxGiftAgain ecsResult orderID " + result.getGiftOrderId() + " errorCode " + result.getErrCode());
                java.lang.Long errCode = result.getErrCode();
                long longValue = errCode != null ? errCode.longValue() : 0L;
                v65.n nVar = asVar.f117794b;
                if (longValue != 0 || ((giftOrderId = result.getGiftOrderId()) != null && giftOrderId.longValue() == 0)) {
                    nVar.a(null);
                } else {
                    nVar.a(result.getGiftOrderId());
                }
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f296740d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void openUrl(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.app.Activity activity = this.f296740d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void publishEcsGiftOpenEvent(long j17, java.lang.String eventId, java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(callback, "callback");
        c00.d3 d3Var = (c00.d3) i95.n0.c(c00.d3.class);
        bw5.j8 a17 = bw5.j8.a((int) j17);
        kotlin.jvm.internal.o.f(a17, "forNumber(...)");
        bw5.i8 i8Var = new bw5.i8();
        i8Var.f28494f = str;
        i8Var.f28496h[3] = true;
        ((j00.o) d3Var).Ai(eventId, a17, i8Var);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void publishEscGiftNotifyEvent(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "publishEscGiftNotifyEvent, eventType:" + j17);
        com.tencent.mm.autogen.events.EcsGiftNotifyEvent ecsGiftNotifyEvent = new com.tencent.mm.autogen.events.EcsGiftNotifyEvent();
        ecsGiftNotifyEvent.f54098g.f7127a = (int) j17;
        ecsGiftNotifyEvent.b(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f296740d;
        if (activity == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Throwable("selectAddress activity null")))));
            return;
        }
        b30.i a17 = b30.i.f17563b.a(activity);
        a17.a().add(new m00.e(callback));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pageTitle", com.tencent.mm.R.string.neh);
        intent.putExtra("launch_from_ecs_gift", true);
        intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
        j45.l.o(activity, "address", ".ui.WalletSelectAddrUI", intent, 4359, false);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectContact(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectStandardAddress(java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).Ai(this.f296740d, this.f296741e, jSONObject, new j00.c0(this, callback));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsGiftFlutterPlugin", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void sendLocalGiftMessage(java.lang.String str, java.lang.String str2, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void updateEcsGiftMsgStatus(java.lang.String giftMsgId, com.tencent.pigeon.ecs.EcsGiftStatusInfoForUpdate statusInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        kotlin.jvm.internal.o.g(statusInfo, "statusInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        j00.k1 k1Var = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
        k1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new j00.i1(statusInfo, giftMsgId, k1Var), "MicroMsg.EcsGiftMsgService");
    }
}
