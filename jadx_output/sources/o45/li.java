package o45;

/* loaded from: classes12.dex */
public abstract class li extends android.os.Binder implements o45.mi {
    public li() {
        attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        byte[] protoBuf;
        long j17;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
            return true;
        }
        if (i17 == 1) {
            gm0.r rVar = (gm0.r) this;
            byte[] bArr = null;
            if (gm0.j1.a()) {
                boolean a17 = o45.ji.a();
                w11.b2 b2Var = w11.c2.f441991a;
                if (a17) {
                    o45.fi fiVar = new o45.fi();
                    gm0.j1.i();
                    fiVar.f342929d = gm0.j1.b().h() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                    fiVar.f342926a = b2Var.a();
                    fiVar.f342927b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    fiVar.f342928c = o45.a.b();
                    try {
                        protoBuf = fiVar.toProtoBuf();
                        rVar.f273270d = fiVar.f342930e;
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                } else {
                    o45.gi giVar = new o45.gi();
                    gm0.j1.i();
                    giVar.f342938d = gm0.j1.b().h();
                    giVar.f342935a = b2Var.a();
                    giVar.f342936b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    giVar.f342937c = o45.a.b();
                    try {
                        protoBuf = giVar.toProtoBuf();
                        rVar.f273270d = giVar.f342939e;
                    } catch (java.lang.Exception e18) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    }
                }
                bArr = protoBuf;
            }
            parcel2.writeNoException();
            parcel2.writeByteArray(bArr);
        } else if (i17 == 2) {
            byte[] bArr2 = ((gm0.r) this).f273270d;
            parcel2.writeNoException();
            parcel2.writeByteArray(bArr2);
        } else {
            if (i17 != 3) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            byte[] createByteArray = parcel.createByteArray();
            int i19 = 0;
            if (o45.ji.a()) {
                o45.hi hiVar = new o45.hi();
                try {
                    hiVar.fromProtoBuf(createByteArray);
                    j17 = hiVar.f342947a;
                } catch (java.lang.Exception e19) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                }
            } else {
                o45.ii iiVar = new o45.ii();
                try {
                    iiVar.fromProtoBuf(createByteArray);
                    j17 = iiVar.f342961a;
                } catch (java.lang.Exception e27) {
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                }
            }
            i19 = (int) j17;
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        }
        return true;
    }
}
