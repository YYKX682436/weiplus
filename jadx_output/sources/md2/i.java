package md2;

/* loaded from: classes10.dex */
public final class i implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f325848d;

    /* renamed from: e, reason: collision with root package name */
    public final long f325849e;

    public i(android.content.Context context, gk2.e eVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f325848d = context;
        this.f325849e = 1L;
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi
    public void getSelfFinderUsername(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(xy2.c.e(context))));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveMultiplatformNativeApi
    public void openNativePage(com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeParams params) {
        java.lang.String username;
        java.lang.String chnlExtra;
        java.lang.String chnlExtra2;
        java.lang.Long itemIndex;
        kotlin.jvm.internal.o.g(params, "params");
        long type = params.getType();
        if (type != 0) {
            if (type == this.f325849e) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile openProfile = params.getOpenProfile();
                finderObject.parseFrom(openProfile != null ? openProfile.getFeedPBData() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                if (contact == null || (username = contact.getUsername()) == null) {
                    return;
                }
                dk2.q4.j(dk2.q4.f233938a, this.f325848d, new gk2.e(null, 1, null), false, username, null, false, null, 96, null);
                return;
            }
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = new com.tencent.mm.protocal.protobuf.FinderObject();
        com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeLiveRoom openLiveRoom = params.getOpenLiveRoom();
        finderObject2.parseFrom(openLiveRoom != null ? openLiveRoom.getFeedPBData() : null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        long id6 = finderObject2.getId();
        r45.nw1 liveInfo = finderObject2.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        r45.dm2 object_extend = finderObject2.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        java.lang.String username2 = finderObject2.getUsername();
        com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeLiveRoom openLiveRoom2 = params.getOpenLiveRoom();
        long longValue = (openLiveRoom2 == null || (itemIndex = openLiveRoom2.getItemIndex()) == null) ? 0L : itemIndex.longValue();
        long integer = finderObject2.getLiveInfo() != null ? r9.getInteger(1) : -1L;
        ml2.x1 x1Var = ml2.x1.f328207n;
        ml2.q1 q1Var = ml2.q1.f327812e;
        long integer2 = finderObject2.getLiveInfo() != null ? r9.getInteger(2) : 0L;
        com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeLiveRoom openLiveRoom3 = params.getOpenLiveRoom();
        java.lang.String str = "";
        java.lang.String str2 = (openLiveRoom3 == null || (chnlExtra2 = openLiveRoom3.getChnlExtra()) == null) ? "" : chnlExtra2;
        ml2.j0 j0Var = (ml2.j0) zbVar;
        if (username2 == null) {
            username2 = "";
        }
        j0Var.wi(new ml2.v0(id6, j17, string, username2, longValue, integer, x1Var, "354", integer2, 0L, null, null, 0, "", "", str2, null, finderObject2, 69120, null), null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, wk0Var.getString(0));
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(java.lang.Integer.parseInt("354")));
        java.lang.String nickname = finderObject2.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        y74Var.set(2, nickname);
        wk0Var.set(6, y74Var);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeLiveRoom openLiveRoom4 = params.getOpenLiveRoom();
        if (openLiveRoom4 != null && (chnlExtra = openLiveRoom4.getChnlExtra()) != null) {
            str = chnlExtra;
        }
        intent.putExtra("key_chnl_extra", str);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(this.f325848d, intent, kz5.b0.c(finderObject2), 0, wk0Var, null);
    }
}
