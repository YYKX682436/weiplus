package iw5;

/* loaded from: classes13.dex */
public abstract class i extends android.os.Binder implements android.os.IInterface {
    public i() {
        attachInterface(this, "com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        iw5.n initCallback;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
            return true;
        }
        if (i17 == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            iw5.k callback = null;
            if (readStrongBinder == null) {
                initCallback = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelInitCallback");
                initCallback = (queryLocalInterface == null || !(queryLocalInterface instanceof iw5.n)) ? new iw5.m(readStrongBinder) : (iw5.n) queryLocalInterface;
            }
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelCallback");
                callback = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof iw5.k)) ? new iw5.j(readStrongBinder2) : (iw5.k) queryLocalInterface2;
            }
            jw5.b bVar = (jw5.b) this;
            kotlin.jvm.internal.o.g(initCallback, "initCallback");
            kotlin.jvm.internal.o.g(callback, "callback");
            bVar.f302349i = callback;
            boolean z17 = jw5.i.f302355c;
            java.lang.String bizName = bVar.f302344d;
            jw5.a aVar = new jw5.a(initCallback);
            kotlin.jvm.internal.o.g(bizName, "bizName");
            synchronized (jw5.i.f302356d) {
                java.util.HashMap hashMap = jw5.i.f302357e;
                if (hashMap.containsKey(bizName)) {
                    java.lang.String msg = "pushChannel ".concat(bizName);
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (iw5.o.f295275a != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
                    }
                    com.tencent.wechat.zrpc.g gVar = (com.tencent.wechat.zrpc.g) hashMap.get(bizName);
                    if (gVar != null) {
                        gVar.O0(new com.tencent.wechat.zrpc.b(bVar));
                    }
                    aVar.invoke(java.lang.Boolean.TRUE);
                } else {
                    java.util.HashMap hashMap2 = jw5.i.f302358f;
                    if (hashMap2.containsKey(bizName)) {
                        java.lang.String msg2 = "pushChannel bizName " + bizName + " has exist";
                        kotlin.jvm.internal.o.g(msg2, "msg");
                        if (iw5.o.f295275a != null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AidlZChannelServerFactory", msg2);
                        }
                        aVar.invoke(java.lang.Boolean.FALSE);
                    } else {
                        java.lang.String msg3 = "pushChannel: waitingCallback not contains " + bizName + ", waiting";
                        kotlin.jvm.internal.o.g(msg3, "msg");
                        if (iw5.o.f295275a != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg3);
                        }
                        jw5.g gVar2 = new jw5.g(bizName);
                        ((android.os.Handler) ((jz5.n) jw5.i.f302359g).getValue()).postDelayed(gVar2, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                        hashMap2.put(bizName, new jz5.o(bVar, gVar2, aVar));
                    }
                }
            }
            parcel2.writeNoException();
        } else if (i17 == 2) {
            byte[] data = parcel.createByteArray();
            jw5.b bVar2 = (jw5.b) this;
            kotlin.jvm.internal.o.g(data, "data");
            synchronized (bVar2) {
                kotlin.jvm.internal.o.g("send: " + data.length, "msg");
                if (bVar2.isConnected()) {
                    if (bVar2.f302347g) {
                        com.tencent.wechat.zrpc.c cVar = bVar2.f302346f;
                        if (cVar != null) {
                            cVar.Q(data, data.length);
                        }
                    } else {
                        if (iw5.o.f295275a != null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AidlServerZChannel", "send: not ready");
                        }
                        ((java.util.ArrayList) bVar2.f302348h).add(data);
                    }
                } else if (iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AidlServerZChannel", "send: not connected");
                }
            }
            parcel2.writeNoException();
        } else if (i17 == 3) {
            ((jw5.b) this).close();
            parcel2.writeNoException();
        } else {
            if (i17 != 4) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            boolean isConnected = ((jw5.b) this).isConnected();
            parcel2.writeNoException();
            parcel2.writeInt(isConnected ? 1 : 0);
        }
        return true;
    }
}
