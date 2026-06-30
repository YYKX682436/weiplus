package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public abstract class k {
    public static void a(com.tencent.mm.modelbase.o oVar, android.os.Parcel parcel) {
        com.tencent.mm.modelbase.m mVar = oVar.f70710a;
        parcel.writeString(mVar.f70684a.getClass().getName());
        byte[] bArr = new byte[0];
        try {
            bArr = mVar.f70684a.toByteArray();
        } catch (java.lang.Exception unused) {
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        parcel.writeString(nVar.f70700a.getClass().getName());
        byte[] bArr2 = new byte[0];
        try {
            bArr2 = nVar.f70700a.toByteArray();
        } catch (java.lang.Exception unused2) {
        }
        parcel.writeInt(bArr2.length);
        parcel.writeByteArray(bArr2);
        parcel.writeString(oVar.f70712c);
        parcel.writeInt(oVar.f70713d);
        parcel.writeInt(mVar.f70686c);
        parcel.writeInt(nVar.f70701b);
    }

    public static com.tencent.mm.modelbase.o b(android.os.Parcel parcel) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        java.lang.String readString = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            lVar.f70664a = ((com.tencent.mm.protobuf.f) java.lang.Class.forName(readString).newInstance()).parseFrom(bArr);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String readString2 = parcel.readString();
        byte[] bArr2 = new byte[parcel.readInt()];
        parcel.readByteArray(bArr2);
        try {
            lVar.f70665b = ((com.tencent.mm.protobuf.f) java.lang.Class.forName(readString2).newInstance()).parseFrom(bArr2);
        } catch (java.lang.Exception e17) {
            if (e17 instanceof b36.g) {
                try {
                    lVar.f70665b = (com.tencent.mm.protobuf.f) java.lang.Class.forName(readString2).newInstance();
                } catch (java.lang.Exception e18) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgRunCgi", "readCommReqRespFromParcel, resp fields not ready, re-create one but exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                }
            }
        }
        lVar.f70666c = parcel.readString();
        lVar.f70667d = parcel.readInt();
        lVar.f70668e = parcel.readInt();
        lVar.f70669f = parcel.readInt();
        return lVar.a();
    }

    public static void c(com.tencent.mm.modelbase.o oVar, com.tencent.mm.plugin.wepkg.utils.i iVar) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.modelbase.z2.d(oVar, new com.tencent.mm.plugin.wepkg.utils.h(iVar), false);
            return;
        }
        com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask wepkgRunCgi$RemoteCgiTask = new com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask();
        ((java.util.HashSet) com.tencent.mm.plugin.wepkg.utils.n.f188503c).add(wepkgRunCgi$RemoteCgiTask);
        wepkgRunCgi$RemoteCgiTask.f188489n = oVar;
        wepkgRunCgi$RemoteCgiTask.f188490o = iVar;
        wepkgRunCgi$RemoteCgiTask.f188484f = 1;
        wepkgRunCgi$RemoteCgiTask.d();
    }
}
