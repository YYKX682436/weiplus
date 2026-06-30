package w11;

/* loaded from: classes12.dex */
public abstract class a1 {
    public static void a(int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        boolean unpack;
        com.tencent.mm.pointers.PByteArray pByteArray;
        o45.yh yhVar = new o45.yh();
        com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
        com.tencent.mm.pointers.PByteArray pByteArray3 = new com.tencent.mm.pointers.PByteArray();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt(0);
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt(255);
        try {
            unpack = com.tencent.mm.protocal.MMProtocalJni.unpack(pByteArray3, bArr, bArr2, pByteArray2, pInt, pInt2, pInt3, pInt4, new com.tencent.mm.pointers.PInt(0), new com.tencent.mm.pointers.PInt(0), new com.tencent.mm.pointers.PInt(0));
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", "summerdiz dealWithPushResp unpack ret:" + unpack + ", noticeid:" + unpack, java.lang.Integer.valueOf(pInt3.value));
            if (pInt3.value != 0) {
                com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent = new com.tencent.mm.autogen.events.GetDisasterInfoEvent();
                getDisasterInfoEvent.f54390g.f7808a = pInt3.value;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(pInt3.value), java.lang.Boolean.valueOf(getDisasterInfoEvent.e()));
                pInt3.value = 0;
            }
            if (pInt2.value == 13) {
                gm0.j1.i();
                byte[] c17 = gm0.j1.n().c(3);
                pByteArray = pByteArray3;
                pByteArray.value = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(c17, pByteArray.value);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerdiz dealWithPushResp unpack AES_GCM_ENCRYPT serverSession");
                int i18 = -1;
                sb6.append(c17 == null ? -1 : c17.length);
                sb6.append(" new pr[");
                sb6.append(pByteArray.value);
                sb6.append(": ");
                byte[] bArr3 = pByteArray.value;
                if (bArr3 != null) {
                    i18 = bArr3.length;
                }
                sb6.append(i18);
                sb6.append("]");
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", sb6.toString());
            } else {
                pByteArray = pByteArray3;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed: %s", e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewSyncMgr", e17, "", new java.lang.Object[0]);
        }
        if (!unpack) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed");
            return;
        }
        yhVar.setHeadExtFlags(pInt4.value);
        int i19 = pInt.value;
        if (i19 == -13) {
            yhVar.setRetCode(i19);
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed session timeout");
            return;
        }
        yhVar.setRetCode(yhVar.fromProtoBuf(pByteArray.value));
        yhVar.setBufferSize(bArr.length);
        byte[] a17 = w11.c2.f441991a.a();
        byte[] d17 = x51.j1.d(yhVar.f343039a.f373761g);
        gm0.j1.i();
        gm0.m b17 = gm0.j1.b();
        r45.ew4 ew4Var = yhVar.f343039a;
        b17.D(ew4Var.f373762h, ew4Var.f373763i);
        gm0.m.A(yhVar.f343039a.f373762h);
        if (!com.tencent.mm.sdk.platformtools.t8.M0(d17) && o45.qi.b(a17, d17)) {
            ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().g(yhVar, i17, cx4Var);
            if (pInt3.value != 0) {
                com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent2 = new com.tencent.mm.autogen.events.GetDisasterInfoEvent();
                getDisasterInfoEvent2.f54390g.f7808a = pInt3.value;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(pInt3.value), java.lang.Boolean.valueOf(getDisasterInfoEvent2.e()));
                pInt3.value = 0;
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NewSyncMgr", "compareKeybuf syncKey failed");
    }

    public static boolean b() {
        boolean z17;
        if (w11.c2.f441991a.a().length > 0) {
            gm0.j1.i();
            if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
