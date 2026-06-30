package gw1;

/* loaded from: classes14.dex */
public final class c implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gw1.e f276147a;

    public c(gw1.e eVar) {
        this.f276147a = eVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j
    public final void a(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        java.nio.ByteBuffer byteBuffer2;
        int i28;
        boolean z17;
        java.lang.String str;
        int i29;
        mw1.c a17;
        boolean z18;
        java.lang.ref.WeakReference weakReference;
        qw1.b bVar = this.f276147a.f276150b;
        int i37 = ((i18 * i19) * 3) / 2;
        android.util.SparseArray sparseArray = bVar.f367075e;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(i37);
        do {
            byteBuffer2 = (concurrentLinkedDeque == null || (weakReference = (java.lang.ref.WeakReference) concurrentLinkedDeque.poll()) == null) ? null : (java.nio.ByteBuffer) weakReference.get();
            i28 = 0;
            if ((concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0) <= 0) {
                break;
            }
        } while (byteBuffer2 == null);
        int i38 = bVar.f367076f;
        bVar.f367076f = i38 + 1;
        if (i38 % 200 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "clear cache");
            sparseArray.clear();
        }
        qw1.a aVar = new qw1.a(bVar, null, byteBuffer2 == null ? java.nio.ByteBuffer.allocateDirect(i37) : byteBuffer2, 1, null);
        if (java.lang.System.currentTimeMillis() - aVar.f367070c <= 200) {
            z17 = aVar.f367071d;
        } else {
            aVar.a();
            z17 = false;
        }
        java.nio.ByteBuffer byteBuffer3 = z17 ? aVar.f367069b : null;
        if (byteBuffer3 != null) {
            synchronized (byteBuffer3) {
                byteBuffer3.clear();
                byteBuffer.clear().limit(byteBuffer3.capacity());
                byteBuffer3.put(byteBuffer);
            }
            gw1.e eVar = this.f276147a;
            boolean z19 = (i27 & 128) == 128;
            if (z19) {
                str = "" + i17 + "_screen";
            } else {
                str = "" + i17 + "_video";
            }
            java.lang.String str2 = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.OpenVoiceEngineOp", "weiranli: framecallback, " + i18 + 'x' + i19 + ", viewname:" + str2);
            java.util.HashMap hashMap = (java.util.HashMap) eVar.f276151c.get(java.lang.Integer.valueOf(i17));
            if (hashMap != null) {
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j jVar = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j) ((java.util.Map.Entry) it.next()).getValue();
                    boolean z27 = z19;
                    if (java.lang.System.currentTimeMillis() - aVar.f367070c <= 200) {
                        z18 = aVar.f367071d;
                    } else {
                        aVar.a();
                        z18 = false;
                    }
                    jVar.a(i17, z18 ? aVar.f367069b : null, i18, i19, i27);
                    str2 = str2;
                    aVar = aVar;
                    z19 = z27;
                }
            }
            java.lang.String username = str2;
            boolean z28 = z19;
            qw1.a aVar2 = aVar;
            gw1.a aVar3 = eVar.f276149a;
            if (!z28) {
                i29 = -1;
            } else if ((i27 & 256) == 0) {
                int i39 = (i27 & 512) == 0 ? 1 : 2;
                if ((i27 & 1024) != 0) {
                    i39 += 2;
                }
                i29 = i39;
            } else {
                i29 = 1;
            }
            kotlin.jvm.internal.o.g(username, "username");
            fw1.g gVar = (fw1.g) aVar3;
            gVar.getClass();
            iw1.k kVar = (iw1.k) ((jz5.n) gVar.f267078a.f302309n).getValue();
            mw1.b a18 = gVar.f267079b.c().f302307i.a(username);
            if (a18 != null && (a17 = a18.a()) != null) {
                i28 = ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17).getRenderRotation();
            }
            kw1.n nVar = new kw1.n(aVar2, username, new pw1.g(i18, i19, (i28 + 90) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, false, 0, 24, null), i29);
            kVar.getClass();
            u26.o oVar = (u26.o) kVar.f295221f;
            if (oVar.j()) {
                return;
            }
            oVar.e(nVar);
        }
    }
}
