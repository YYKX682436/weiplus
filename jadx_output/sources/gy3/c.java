package gy3;

/* loaded from: classes13.dex */
public final class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f277552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gy3.d channel) {
        super("MicroMsg.Rtos.RtosBCChannel");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f277552a = new java.lang.ref.WeakReference(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        gy3.f fVar;
        gy3.k kVar;
        boolean z17;
        kotlin.jvm.internal.o.g(msg, "msg");
        gy3.d dVar = (gy3.d) this.f277552a.get();
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "handleMessage " + msg.what);
            switch (msg.what) {
                case 1:
                    if (!dVar.f277561i) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosBCChannel", "not connecting,ignore cancel");
                        return;
                    }
                    gy3.j jVar = dVar.f277555c;
                    if (jVar == null || (fVar = jVar.f277582b) == null) {
                        return;
                    }
                    try {
                        try {
                            try {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "cancel connect");
                                android.bluetooth.BluetoothSocket bluetoothSocket = fVar.f277567c;
                                if (bluetoothSocket != null) {
                                    bluetoothSocket.close();
                                }
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e17.toString());
                            }
                        } catch (java.lang.NullPointerException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e18 + ')');
                        }
                        return;
                    } finally {
                        fVar.f277567c = null;
                    }
                case 2:
                    if (dVar.f277556d.length() > 0) {
                        dVar.b();
                        return;
                    }
                    return;
                case 3:
                    gy3.k kVar2 = dVar.f277557e;
                    if (kVar2 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onIsDeviceBonded ...false");
                        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "bt is unbond! clear and close everything");
                        my3.c0 c0Var = ((my3.b0) kVar2).f332783a;
                        com.tencent.wechat.rtos.WeChatApi weChatApi = c0Var.f332787b;
                        if (weChatApi != null) {
                            weChatApi.logout();
                        }
                        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.p.class);
                        c0Var.a();
                        return;
                    }
                    return;
                case 4:
                    byte[] bArr = (byte[]) msg.obj;
                    if (bArr == null || (kVar = dVar.f277557e) == null) {
                        return;
                    }
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    kz5.v.h(bArr, bArr2, 0, 0, length);
                    my3.c0 c0Var2 = ((my3.b0) kVar).f332783a;
                    gy3.a aVar = c0Var2.f332786a;
                    if (aVar != null) {
                        long j17 = ((gy3.d) aVar).f277558f;
                        com.tencent.wechat.rtos.WeChatApi weChatApi2 = c0Var2.f332787b;
                        if (weChatApi2 != null) {
                            weChatApi2.notifyChannelData(j17, bArr2);
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    gy3.k kVar3 = dVar.f277557e;
                    if (kVar3 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onRtosChannelConnected");
                        my3.c0 c0Var3 = ((my3.b0) kVar3).f332783a;
                        gy3.a aVar2 = c0Var3.f332786a;
                        if (aVar2 != null) {
                            long j18 = ((gy3.d) aVar2).f277558f;
                            com.tencent.wechat.rtos.WeChatApi weChatApi3 = c0Var3.f332787b;
                            if (weChatApi3 != null) {
                                weChatApi3.notifyNewChannelConnected(j18, 512);
                            }
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 20, 0);
                        return;
                    }
                    return;
                case 6:
                    gy3.k kVar4 = dVar.f277557e;
                    if (kVar4 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onRtosChannelDisconnected");
                        my3.c0 c0Var4 = ((my3.b0) kVar4).f332783a;
                        gy3.a aVar3 = c0Var4.f332786a;
                        if (aVar3 != null) {
                            long j19 = ((gy3.d) aVar3).f277558f;
                            com.tencent.wechat.rtos.WeChatApi weChatApi4 = c0Var4.f332787b;
                            if (weChatApi4 != null) {
                                weChatApi4.notifyChannelDisconnected(j19);
                            }
                        }
                        if (c0Var4.f332790e) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 21, 0);
                        }
                        c0Var4.f332790e = false;
                        return;
                    }
                    return;
                case 7:
                    gy3.k kVar5 = dVar.f277557e;
                    if (kVar5 != null) {
                        my3.b0 b0Var = (my3.b0) kVar5;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOn");
                        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.q.class);
                        java.lang.String string = bundle != null ? bundle.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "") : null;
                        java.lang.String string2 = bundle != null ? bundle.getString(dm.i4.COL_USERNAME, "") : null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOn storeMac:" + string + ", storeUsername:" + string2);
                        if ((string == null || string.length() == 0) == false) {
                            hy3.a aVar4 = hy3.b.f286071a;
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            java.lang.String a17 = aVar4.a(context, string);
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            boolean c17 = aVar4.c(context2, a17);
                            my3.c0 c0Var5 = b0Var.f332783a;
                            if (c17) {
                                gy3.a aVar5 = c0Var5.f332786a;
                                if (aVar5 != null) {
                                    ((gy3.d) aVar5).d(a17);
                                }
                                gy3.a aVar6 = c0Var5.f332786a;
                                if (aVar6 != null) {
                                    ((gy3.d) aVar6).b();
                                }
                            }
                            if (string2 != null) {
                                if ((string2.length() == 0) == false) {
                                    z17 = false;
                                    c0Var5.f332795j = z17;
                                }
                            }
                            z17 = true;
                            c0Var5.f332795j = z17;
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 25, 0);
                        return;
                    }
                    return;
                case 8:
                    if (dVar.f277557e != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOff");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 26, 0);
                    }
                    gy3.j jVar2 = dVar.f277555c;
                    if (jVar2 != null) {
                        jVar2.a();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
