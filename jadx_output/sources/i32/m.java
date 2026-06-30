package i32;

/* loaded from: classes13.dex */
public class m extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i32.s f288126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i32.s sVar, android.os.Looper looper) {
        super(looper);
        this.f288126a = sVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "handleMessage msg.what = %d", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        i32.s sVar = this.f288126a;
        if (i17 == 0) {
            long longValue = ((java.lang.Long) message.obj).longValue();
            i32.q qVar = (i32.q) sVar.f288140d.get(java.lang.Long.valueOf(longValue));
            if (qVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId(%d), or response has been send", java.lang.Long.valueOf(longValue));
                return;
            }
            iz5.a.d(null, qVar.f288135a);
            qVar.f288135a.e(-1, "", null);
            iz5.a.d(null, qVar.f288135a);
            u32.h1.c().b(new w32.h(qVar.f288135a));
            sVar.f288140d.remove(java.lang.Long.valueOf(longValue));
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "unknown message type = %d", java.lang.Integer.valueOf(i17));
                    return;
                }
                i32.o oVar = (i32.o) message.obj;
                i32.q qVar2 = (i32.q) sVar.f288140d.get(java.lang.Long.valueOf(oVar.f288131a));
                if (qVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", java.lang.Long.valueOf(oVar.f288131a));
                    return;
                }
                qVar2.f288135a.e(0, "", oVar.f288132b);
                iz5.a.d(null, qVar2.f288135a);
                u32.h1.c().b(new w32.h(qVar2.f288135a));
                com.tencent.mm.sdk.platformtools.n3 n3Var = sVar.f288141e;
                iz5.a.d(null, qVar2.f288136b);
                n3Var.removeCallbacks(qVar2.f288136b);
                sVar.f288140d.remove(java.lang.Long.valueOf(oVar.f288131a));
                return;
            }
            i32.n nVar = (i32.n) message.obj;
            if (nVar.f288128b == 0 && nVar.f288127a == 0) {
                return;
            }
            com.tencent.mm.modelbase.o oVar2 = ((com.tencent.mm.plugin.exdevice.model.p2) nVar.f288130d).f99042d;
            iz5.a.d(null, oVar2);
            long j17 = ((r45.az5) oVar2.f70710a.f70684a).f370380e.f385224d;
            i32.q qVar3 = (i32.q) sVar.f288140d.get(java.lang.Long.valueOf(j17));
            if (qVar3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", java.lang.Long.valueOf(j17));
                return;
            }
            iz5.a.d(null, qVar3.f288135a);
            qVar3.f288135a.e(nVar.f288127a == -417 ? -5 : -1, nVar.f288129c, null);
            iz5.a.d(null, qVar3.f288135a);
            u32.h1.c().b(new w32.h(qVar3.f288135a));
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = sVar.f288141e;
            iz5.a.d(null, qVar3.f288136b);
            n3Var2.removeCallbacks(qVar3.f288136b);
            sVar.f288140d.remove(java.lang.Long.valueOf(j17));
            return;
        }
        i32.g gVar = (i32.g) message.obj;
        if (!u32.h1.a().g(gVar.f288119a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "This device send other cmd before do auth, device id = %d", java.lang.Long.valueOf(gVar.f288119a));
            gVar.e(-2, "", new byte[0]);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        int i18 = message.arg1;
        if (-5 == i18 || -3 == i18 || -4 == i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Error Code = %d, reply errorcode to device and close channel", java.lang.Integer.valueOf(i18));
            gVar.e(-1, "", new byte[0]);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        v32.b b17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().b1(gVar.f288119a + "");
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        if (java.lang.System.currentTimeMillis() / 1000 < b17.f237103v) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "device has been blocked");
            gVar.e(-5, "Device Is Block", null);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        if (i32.r.f288137b == null) {
            i32.r.f288137b = new i32.r();
        }
        i32.r rVar = i32.r.f288137b;
        if (com.tencent.wcdb.core.Database.DictDefaultMatchValue == rVar.f288138a) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSendDataToManufacturerLogic", "Sequence Data-overrun!!!");
            rVar.f288138a = 0L;
        }
        long j18 = rVar.f288138a + 1;
        rVar.f288138a = j18;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "save locall seq id : %d", java.lang.Long.valueOf(j18));
            sharedPreferences.edit().putLong("local_message_seq", j18).commit();
        }
        o32.k kVar = (o32.k) gVar.f288123e;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
            gVar.e(-4, "Decode failed", null);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        java.lang.Integer num = (java.lang.Integer) sVar.f288142f.get(b17.field_deviceID);
        if (num == null) {
            num = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataDirection = %s", num);
        int intValue = num.intValue();
        java.util.HashMap hashMap = sVar.f288140d;
        com.tencent.mm.sdk.platformtools.n3 n3Var3 = sVar.f288141e;
        if (intValue == 0) {
            if (kVar.f342716f == 10001) {
                com.tencent.mm.plugin.exdevice.model.l3.Di().p(b17.field_deviceID, b17.field_brandName, kVar.f342715e.g());
                return;
            }
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.p2(gVar.f288119a, b17.field_deviceType, b17.field_deviceID, j18, java.lang.System.currentTimeMillis(), kVar.f342715e.g(), kVar.f342716f));
            i32.p pVar = new i32.p(sVar, j18);
            n3Var3.postDelayed(pVar, 30000L);
            i32.q qVar4 = new i32.q(null);
            iz5.a.d(null, gVar);
            qVar4.f288135a = gVar;
            iz5.a.d(null, pVar);
            qVar4.f288136b = pVar;
            hashMap.put(java.lang.Long.valueOf(j18), qVar4);
            return;
        }
        if ((num.intValue() & 1) != 0) {
            com.tencent.mm.plugin.exdevice.model.l3.Di().p(b17.field_deviceID, b17.field_brandName, kVar.f342715e.g());
        }
        if ((num.intValue() & 2) != 0) {
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.p2(gVar.f288119a, b17.field_deviceType, b17.field_deviceID, j18, java.lang.System.currentTimeMillis(), kVar.f342715e.g(), kVar.f342716f));
            i32.p pVar2 = new i32.p(sVar, j18);
            n3Var3.postDelayed(pVar2, 30000L);
            i32.q qVar5 = new i32.q(null);
            iz5.a.d(null, gVar);
            qVar5.f288135a = gVar;
            iz5.a.d(null, pVar2);
            qVar5.f288136b = pVar2;
            hashMap.put(java.lang.Long.valueOf(j18), qVar5);
        }
    }
}
