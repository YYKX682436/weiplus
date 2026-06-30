package com.tencent.mm.plugin.zero.api;

/* loaded from: classes11.dex */
public class ILightPushService$VoipInviteInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo> CREATOR = new a25.p();

    /* renamed from: d, reason: collision with root package name */
    public final int f188621d;

    /* renamed from: e, reason: collision with root package name */
    public long f188622e;

    /* renamed from: f, reason: collision with root package name */
    public long f188623f;

    public ILightPushService$VoipInviteInfo() {
        this.f188621d = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo a(byte[] r8) {
        /*
            java.lang.String r0 = "MicroMsg.proc.ILightPushService"
            java.lang.String r1 = ", curr=1"
            java.lang.String r2 = "ver mismatch, get="
            r3 = 0
            r4 = 0
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            int r6 = r8.length     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r5.unmarshall(r8, r3, r6)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r5.setDataPosition(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            android.os.Parcelable$Creator<com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo> r8 = com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo.CREATOR     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.lang.Object r8 = r8.createFromParcel(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo r8 = (com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo) r8     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            int r6 = r8.f188621d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r7 = 1
            if (r6 != r7) goto L25
            r5.recycle()
            return r8
        L25:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            int r8 = r8.f188621d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r6.append(r8)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r6.append(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            com.tencent.mars.xlog.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            goto L4c
        L3a:
            r8 = move-exception
            r4 = r5
            goto L50
        L3d:
            r8 = move-exception
            goto L43
        L3f:
            r8 = move-exception
            goto L50
        L41:
            r8 = move-exception
            r5 = r4
        L43:
            java.lang.String r1 = "decode err"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3a
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r8, r1, r2)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L4f
        L4c:
            r5.recycle()
        L4f:
            return r4
        L50:
            if (r4 == 0) goto L55
            r4.recycle()
        L55:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo.a(byte[]):com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f188621d);
        parcel.writeLong(this.f188622e);
        parcel.writeLong(this.f188623f);
    }

    public ILightPushService$VoipInviteInfo(android.os.Parcel parcel) {
        this.f188621d = 1;
        int readInt = parcel.readInt();
        this.f188621d = readInt;
        if (readInt == 1) {
            this.f188622e = parcel.readLong();
            this.f188623f = parcel.readLong();
        }
    }
}
