package xe2;

/* loaded from: classes3.dex */
public final class n0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f453887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453887c = new java.util.LinkedList();
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.util.LinkedList<r45.gw1> list;
        df2.g gVar;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.dh1 dh1Var = new r45.dh1();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        dh1Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("LiveGuideInfoAppMsgInterceptor", "pb = " + pm0.b0.g(dh1Var));
        r45.fw1 fw1Var = (r45.fw1) dh1Var.getCustom(0);
        if (fw1Var == null || (list = fw1Var.getList(0)) == null) {
            return;
        }
        for (r45.gw1 gw1Var : list) {
            java.lang.String string = gw1Var.getString(0);
            if (string == null) {
                string = "";
            }
            java.util.LinkedList linkedList = this.f453887c;
            if (linkedList.contains(string)) {
                com.tencent.mars.xlog.Log.i("LiveGuideInfoAppMsgInterceptor", "msgId:" + string + " already received");
            } else {
                linkedList.add(string);
                com.tencent.mars.xlog.Log.i("LiveGuideInfoAppMsgInterceptor", "receive guidetype: " + gw1Var.getInteger(1) + " text: " + gw1Var.getString(2));
                int integer = gw1Var.getInteger(1);
                gk2.e eVar = this.f445267a;
                if (integer == 2) {
                    ((kotlinx.coroutines.flow.q2) ((mm2.x) eVar.a(mm2.x.class)).f329520f).e(gw1Var);
                } else if (integer == 3) {
                    byte[] byteArray = gw1Var.toByteArray();
                    com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.i5) eVar.a(mm2.i5.class)).f329140f;
                    r45.f52 f52Var = new r45.f52();
                    f52Var.set(0, java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR));
                    f52Var.set(2, new com.tencent.mm.protobuf.g(byteArray));
                    liveMutableData.postValue(f52Var.toByteArray());
                } else if (integer != 6) {
                    if (integer == 7) {
                        ((mm2.x6) eVar.a(mm2.x6.class)).f329546f.postValue(gw1Var);
                    } else if (integer == 8) {
                        ((kotlinx.coroutines.flow.q2) ((om2.l) eVar.a(om2.l.class)).f346342g).e(gw1Var);
                    }
                } else if (zl2.r4.F1(eVar)) {
                    com.tencent.mars.xlog.Log.i("LiveGuideInfoAppMsgInterceptor", "dealWithMsgList: skip CreateLiveNotice bubble in co-live");
                } else if (zl2.r4.f473950a.w1()) {
                    dk2.ef efVar = dk2.ef.f233372a;
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
                    if (liveRoomControllerStore != null && (gVar = (df2.g) liveRoomControllerStore.controller(df2.g.class)) != null && (j0Var = gVar.f230180p) != null) {
                        j0Var.postValue(gw1Var);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("LiveGuideInfoAppMsgInterceptor", "dealWithMsgList: error, cannot bubble create live notice when not in anchor mode, isAssistant=" + ((mm2.c1) eVar.a(mm2.c1.class)).T);
                }
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20107};
    }
}
