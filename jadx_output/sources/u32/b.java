package u32;

/* loaded from: classes13.dex */
public final class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u32.i f424274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u32.i iVar, java.lang.String str) {
        super(str);
        this.f424274a = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                u32.d dVar = (u32.d) message.obj;
                ((u32.a2) this.f424274a.f424305e).N6(1, 0, null, dVar.f424281a, dVar.f424282b, dVar.f424283c, dVar.f424284d);
                return;
            case 2:
                ((u32.a2) this.f424274a.f424305e).N6(2, 0, null, null, null, 0, null);
                return;
            case 3:
                u32.f fVar = (u32.f) message.obj;
                ((u32.a2) this.f424274a.f424305e).j(fVar.f424291a, fVar.f424292b, fVar.f424293c, fVar.f424294d);
                return;
            case 4:
                u32.e eVar = (u32.e) message.obj;
                ((u32.a2) this.f424274a.f424305e).g(eVar.f424285a, eVar.f424286b, eVar.f424287c, eVar.f424288d);
                return;
            case 5:
                u32.c cVar = (u32.c) message.obj;
                u32.x xVar = this.f424274a.f424305e;
                int i17 = message.arg1;
                long j17 = cVar.f424277a;
                short s17 = cVar.f424278b;
                short s18 = cVar.f424279c;
                byte[] bArr = cVar.f424280d;
                u32.a2 a2Var = (u32.a2) xVar;
                a2Var.getClass();
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Long.valueOf(j17);
                objArr[2] = java.lang.Short.valueOf(s17);
                objArr[3] = java.lang.Short.valueOf(s18);
                objArr[4] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", objArr);
                u32.p1 p1Var = new u32.p1(null);
                p1Var.f424347c = s18;
                p1Var.f424348d = bArr;
                p1Var.f424345a = j17;
                p1Var.f424346b = s17;
                p1Var.f424349e = i17;
                com.tencent.mm.sdk.platformtools.n3 n3Var = a2Var.f424267p;
                if (n3Var.sendMessage(n3Var.obtainMessage(6, p1Var))) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 6);
                return;
            case 6:
            case 7:
            default:
                return;
            case 8:
                u32.h hVar = (u32.h) message.obj;
                u32.i iVar = this.f424274a;
                long j18 = hVar.f424297a;
                u32.w0 w0Var = hVar.f424298b;
                u32.x xVar2 = iVar.f424305e;
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "startTaskImp, taskId = %d", java.lang.Long.valueOf(j18));
                iz5.a.d(null, w0Var);
                try {
                    long deviceId = w0Var.getReqObj().getDeviceId();
                    if (!v32.a.c("conneted_device", deviceId)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BTDeviceManager", "Cannot startTask because this channel is close aready!!!");
                        u32.f fVar2 = new u32.f();
                        fVar2.f424291a = j18;
                        fVar2.f424293c = -1;
                        fVar2.f424292b = -1;
                        fVar2.f424294d = "Channel is close aready!!!";
                        com.tencent.mm.sdk.platformtools.n3 n3Var2 = u32.i.f424303h.f424306f;
                        iz5.a.g(null, n3Var2.sendMessage(n3Var2.obtainMessage(3, 0, 0, fVar2)));
                        return;
                    }
                    java.util.HashMap hashMap = iVar.f424304d;
                    if (!hashMap.containsKey(java.lang.Long.valueOf(deviceId))) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find Channel by DeviceInfo(%s) in mMapDeviceChannelId", java.lang.Long.valueOf(deviceId));
                        ((u32.a2) xVar2).j(j18, -1, -1, "Cannot find Channel by DeviceInfo!!!");
                        return;
                    }
                    com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.AccessoryCmd accessoryCmd = new com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.AccessoryCmd();
                    accessoryCmd.channelID = ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(deviceId))).longValue();
                    try {
                        accessoryCmd.reqCmdID = w0Var.getReqObj().Hf();
                        accessoryCmd.respCmdID = w0Var.getReqObj().W4();
                        try {
                            byte[] z96 = w0Var.getReqObj().z9();
                            int W5 = w0Var.getReqObj().W5();
                            if (com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.startTaskV2(j18, (short) W5, accessoryCmd, z96) != 0) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startTaskV2 Failed!!!");
                                return;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "------let task go------ taskId = %d, deviceId = %d, channelId = %d, seq = %d, reqCmdId = %d, respCmdId = %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(deviceId), java.lang.Long.valueOf(accessoryCmd.channelID), java.lang.Integer.valueOf(W5), java.lang.Integer.valueOf(accessoryCmd.reqCmdID), java.lang.Integer.valueOf(accessoryCmd.respCmdID));
                                return;
                            }
                        } catch (android.os.RemoteException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDataOut failed!!! %s", e17.getMessage());
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e17, "", new java.lang.Object[0]);
                            ((u32.a2) xVar2).j(j18, -1, -1, "Remote getDataOut failed!!!!!!");
                            return;
                        }
                    } catch (android.os.RemoteException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getResquestCmdId or getResponseCmdId failed!!! %s", e18.getMessage());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e18, "", new java.lang.Object[0]);
                        ((u32.a2) xVar2).j(j18, -1, -1, "Remote getResquestCmdId or getResponseCmdId failed!!!");
                        return;
                    }
                } catch (android.os.RemoteException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDeviceId failed!!! %s", e19.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", e19, "", new java.lang.Object[0]);
                    ((u32.a2) xVar2).j(j18, -1, -1, "Remote getDeviceId failed!!!");
                    return;
                }
            case 9:
                u32.i iVar2 = this.f424274a;
                long longValue = ((java.lang.Long) message.obj).longValue();
                iVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "stopTaskImp taskId = %d", java.lang.Long.valueOf(longValue));
                com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopTaskV2(longValue);
                return;
            case 10:
                u32.g gVar = (u32.g) message.obj;
                u32.i iVar3 = this.f424274a;
                long j19 = gVar.f424295a;
                byte[] bArr2 = gVar.f424296b;
                iVar3.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKeyImp------ deviceId = %d", java.lang.Long.valueOf(j19));
                java.util.HashMap hashMap2 = iVar3.f424304d;
                if (hashMap2.containsKey(java.lang.Long.valueOf(j19))) {
                    com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.setChannelSessionKeyV2(((java.lang.Long) hashMap2.get(java.lang.Long.valueOf(j19))).longValue(), bArr2);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
                    return;
                }
            case 11:
                synchronized (this.f424274a.f424307g) {
                    u32.i.d(this.f424274a, ((java.lang.Long) message.obj).longValue());
                }
                return;
            case 12:
                synchronized (this.f424274a.f424307g) {
                    this.f424274a.f(((java.lang.Long) message.obj).longValue());
                }
                return;
        }
    }
}
