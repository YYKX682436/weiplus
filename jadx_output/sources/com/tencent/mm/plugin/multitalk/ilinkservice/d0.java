package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class d0 implements com.tencent.wxmm.IConfCallBack {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.f0 f149541a;

    public d0(com.tencent.mm.plugin.multitalk.ilinkservice.f0 f0Var) {
        this.f149541a = f0Var;
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public byte[] callBackFromConf(int i17, int i18, byte[] bArr) {
        byte[] bArr2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: triggered native callback: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.multitalk.ilinkservice.f0 f0Var = this.f149541a;
        synchronized (f0Var) {
            java.util.HashSet hashSet = (java.util.HashSet) f0Var.f149574b.get(i17);
            if (hashSet == null || hashSet.size() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", java.lang.Integer.valueOf(i17));
                bArr2 = new byte[1];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                bArr2 = new byte[1];
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.multitalk.ilinkservice.e0 e0Var = (com.tencent.mm.plugin.multitalk.ilinkservice.e0) it.next();
                    if (e0Var != null) {
                        java.lang.Object a17 = e0Var.a(i18, e0Var.b(bArr));
                        if (a17 != null) {
                            bArr2 = e0Var.c(a17);
                        }
                        if (!e0Var.d()) {
                            arrayList.add(e0Var);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: event %d item or buffer is null! weired", java.lang.Integer.valueOf(i17));
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    hashSet.remove((com.tencent.mm.plugin.multitalk.ilinkservice.e0) it6.next());
                }
            }
        }
        return bArr2;
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public void callbackVideoFrame(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        java.nio.ByteBuffer byteBuffer2;
        boolean z17;
        int i28;
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.multitalk.ilinkservice.v4 v4Var = this.f149541a.f149575c;
        if (v4Var != null) {
            cj3.j jVar = (cj3.j) v4Var;
            nj3.b bVar = jVar.f41895a.f41898b;
            int i29 = ((i18 * i19) * 3) / 2;
            android.util.SparseArray sparseArray = bVar.f337888e;
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(i29);
            do {
                byteBuffer2 = (concurrentLinkedDeque == null || (weakReference = (java.lang.ref.WeakReference) concurrentLinkedDeque.poll()) == null) ? null : (java.nio.ByteBuffer) weakReference.get();
                if ((concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0) <= 0) {
                    break;
                }
            } while (byteBuffer2 == null);
            int i37 = bVar.f337889f;
            bVar.f337889f = i37 + 1;
            if (i37 % 200 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "clear cache");
                sparseArray.clear();
            }
            if (byteBuffer2 == null) {
                if (bVar.f337890g > 70) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MTR.BufferManager", "cur buffer size " + bVar.f337890g);
                }
                byteBuffer2 = java.nio.ByteBuffer.allocateDirect(i29);
            }
            nj3.a aVar = new nj3.a(bVar, null, byteBuffer2, 1, null);
            if (java.lang.System.currentTimeMillis() - aVar.f337883d <= 200) {
                z17 = aVar.f337884e;
            } else {
                aVar.a();
                z17 = false;
            }
            java.nio.ByteBuffer byteBuffer3 = z17 ? aVar.f337881b : null;
            if (byteBuffer3 != null) {
                synchronized (byteBuffer3) {
                    byteBuffer3.clear();
                    byteBuffer.clear().limit(byteBuffer3.capacity());
                    byteBuffer3.put(byteBuffer);
                }
                cj3.n nVar = jVar.f41895a;
                boolean z18 = (i27 & 128) == 128;
                cj3.b bVar2 = nVar.f41897a;
                java.lang.String d17 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.f149623f.d(i17);
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String str = d17;
                if (!z18) {
                    i28 = -1;
                } else if ((i27 & 256) == 0) {
                    int i38 = (i27 & 512) == 0 ? 1 : 2;
                    if ((i27 & 1024) != 0) {
                        i38 += 2;
                    }
                    i28 = i38;
                } else {
                    i28 = 1;
                }
                ((com.tencent.mm.plugin.multitalk.model.w1) bVar2).a(new cj3.c(str, aVar, i18, i19, z18, i28));
            }
        }
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public void callbackWriteLog(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        if (i17 >= (com.tencent.mars.xlog.Log.getImpl() != null ? com.tencent.mars.xlog.Log.getImpl().getLogLevel(0L) : 0)) {
            com.tencent.mars.xlog.MMXlog.logWrite2(i17, "CloudVoIPNative:" + str, str2, str3, android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str4);
        }
    }
}
