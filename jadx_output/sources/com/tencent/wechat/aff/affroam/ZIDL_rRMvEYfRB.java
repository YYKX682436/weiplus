package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
class ZIDL_rRMvEYfRB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.affroam.v0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.w0 f215763a;

    private native void ZIDL_BI(long j17, byte[] bArr, byte[] bArr2);

    public void Q1(com.tencent.wechat.aff.affroam.p pVar, byte[] bArr) {
        ZIDL_BI(this.nativeHandler, pVar.toByteArrayOrNull(), bArr);
    }

    public void ZIDL_A() {
        po1.e eVar;
        com.tencent.wechat.aff.affroam.w wVar;
        ho1.w wVar2 = (ho1.w) this.f215763a;
        wVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomRoamDiskManagerImpl", "[+] Scan devices for custom roam disks.");
        oo1.j jVar = oo1.j.f347145a;
        ro1.v vVar = ro1.v.f398014a;
        java.util.List a17 = vVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "allDevices=" + a17);
        java.util.List b17 = vVar.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            po1.d dVar = (po1.d) it.next();
            hashMap.put(dVar.f357300f, dVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "connectedDevices=" + hashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (hashMap.containsKey(((po1.d) next).f357300f)) {
                arrayList.add(next);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UsbVolumeHelper", "availableDevices=" + arrayList);
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            po1.d dVar2 = (po1.d) it7.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.CustomRoamDiskManagerImpl", "discoverUSBDisk device=" + dVar2);
            dVar2.getClass();
            com.tencent.wechat.aff.affroam.p pVar = new com.tencent.wechat.aff.affroam.p();
            pVar.f215942e = dVar2.f357295a;
            pVar.f215941d = dVar2.b();
            po1.g gVar = dVar2.f357296b;
            gVar.getClass();
            po1.e[] eVarArr = po1.g.f357307e;
            int length = eVarArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArr[i17];
                if (eVar.f357303a == gVar) {
                    break;
                } else {
                    i17++;
                }
            }
            if (eVar == null || (wVar = eVar.f357304b) == null) {
                wVar = com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_UNKNOWN;
            }
            pVar.f215943f = wVar;
            com.tencent.wechat.aff.affroam.v0 v0Var = wVar2.f282839a;
            if (v0Var != null) {
                ((com.tencent.wechat.aff.affroam.ZIDL_rRMvEYfRB) v0Var).Q1(pVar, pVar.f215944g.g());
            }
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.affroam.w0 w0Var = (com.tencent.wechat.aff.affroam.w0) obj;
        this.f215763a = w0Var;
        ((ho1.w) w0Var).f282839a = this;
    }
}
