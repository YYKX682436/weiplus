package jw5;

/* loaded from: classes13.dex */
public final class b extends iw5.i implements com.tencent.wechat.zrpc.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f302344d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f302345e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.zrpc.c f302346f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f302347g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f302348h;

    /* renamed from: i, reason: collision with root package name */
    public iw5.k f302349i;

    public b(java.lang.String bizName, java.lang.String extra) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f302344d = bizName;
        this.f302345e = extra;
        this.f302348h = new java.util.ArrayList();
    }

    @Override // com.tencent.wechat.zrpc.d
    public void close() {
        synchronized (this) {
            if (this.f302349i == null) {
                if (iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AidlServerZChannel", "close: aidlCallback already null");
                }
                return;
            }
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AidlServerZChannel", "close");
            }
            this.f302349i = null;
            com.tencent.wechat.zrpc.c cVar = this.f302346f;
            if (cVar != null) {
                cVar.Q(new byte[0], -1);
            }
        }
    }

    @Override // com.tencent.wechat.zrpc.d
    public void e() {
        if (iw5.o.f295275a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AidlServerZChannel", "ready");
        }
        synchronized (this) {
            if (!this.f302347g) {
                this.f302347g = true;
                for (byte[] bArr : this.f302348h) {
                    com.tencent.wechat.zrpc.c cVar = this.f302346f;
                    if (cVar != null) {
                        cVar.Q(bArr, bArr.length);
                    }
                }
                ((java.util.ArrayList) this.f302348h).clear();
            }
        }
    }

    @Override // com.tencent.wechat.zrpc.d
    public java.lang.String getExtra() {
        return this.f302345e;
    }

    @Override // com.tencent.wechat.zrpc.d
    public boolean isConnected() {
        return this.f302349i != null;
    }

    @Override // com.tencent.wechat.zrpc.d
    public void j() {
        close();
    }

    @Override // com.tencent.wechat.zrpc.d
    public int k() {
        return 0;
    }

    @Override // com.tencent.wechat.zrpc.d
    public void l(com.tencent.wechat.zrpc.c cVar) {
        this.f302346f = cVar;
    }

    @Override // com.tencent.wechat.zrpc.d
    public void p(long j17, byte[] data, long j18) {
        java.util.Collection collection;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.wechat.zrpc.c cVar = this.f302346f;
        iw5.k kVar = this.f302349i;
        if (kVar == null) {
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AidlServerZChannel", "sendAsync: aidlCallback is null 2");
            }
            if (cVar != null) {
                cVar.R(j17, false);
                return;
            }
            return;
        }
        if (cVar == null) {
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AidlServerZChannel", "sendAsync: zidlCallback is null");
                return;
            }
            return;
        }
        int i17 = (int) j18;
        if (data.length != i17) {
            if (!(i17 >= 0)) {
                throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
            }
            if (i17 == 0) {
                collection = kz5.p0.f313996d;
            } else if (i17 >= data.length) {
                collection = kz5.z.v0(data);
            } else if (i17 == 1) {
                collection = kz5.b0.c(java.lang.Byte.valueOf(data[0]));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(i17);
                int i18 = 0;
                for (byte b17 : data) {
                    arrayList.add(java.lang.Byte.valueOf(b17));
                    i18++;
                    if (i18 == i17) {
                        break;
                    }
                }
                collection = arrayList;
            }
            data = kz5.n0.N0(collection);
        }
        try {
            iw5.j jVar = (iw5.j) kVar;
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelCallback");
                obtain.writeByteArray(data);
                jVar.f295273d.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.recycle();
                obtain.recycle();
                cVar.R(j17, true);
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            java.lang.String msg = "sendAsync error " + e17;
            kotlin.jvm.internal.o.g(msg, "msg");
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AidlServerZChannel", msg);
            }
            cVar.R(j17, false);
            close();
        }
    }
}
