package com.tencent.mm.udr.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/udr/api/WxUdrResource;", "Landroid/os/Parcelable;", "udr-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class WxUdrResource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.udr.api.WxUdrResource> CREATOR = new ea5.n();
    public int A;
    public java.lang.String B;
    public int C;
    public long D;
    public java.lang.String E;
    public byte[] F;
    public byte[] G;
    public byte[] H;
    public byte[] I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f196450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196451e;

    /* renamed from: f, reason: collision with root package name */
    public int f196452f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f196453g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f196454h;

    /* renamed from: i, reason: collision with root package name */
    public long f196455i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f196456m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f196457n;

    /* renamed from: o, reason: collision with root package name */
    public int f196458o;

    /* renamed from: p, reason: collision with root package name */
    public int f196459p;

    /* renamed from: q, reason: collision with root package name */
    public long f196460q;

    /* renamed from: r, reason: collision with root package name */
    public long f196461r;

    /* renamed from: s, reason: collision with root package name */
    public long f196462s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f196463t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f196464u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f196465v;

    /* renamed from: w, reason: collision with root package name */
    public long f196466w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f196467x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f196468y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f196469z;

    public WxUdrResource() {
        this.C = 1;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f196465v;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("key");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxUdrResource{projectId='");
        java.lang.String str = this.f196450d;
        if (str == null) {
            kotlin.jvm.internal.o.o("projectId");
            throw null;
        }
        sb6.append(str);
        sb6.append("', name='");
        java.lang.String str2 = this.f196451e;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            throw null;
        }
        sb6.append(str2);
        sb6.append("', version='");
        sb6.append(this.f196452f);
        sb6.append("', url='");
        sb6.append(this.f196453g);
        sb6.append("', md5='");
        java.lang.String str3 = this.f196454h;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("md5");
            throw null;
        }
        sb6.append(str3);
        sb6.append("', size='");
        sb6.append(this.f196455i);
        sb6.append("', path='");
        java.lang.String str4 = this.f196456m;
        if (str4 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        sb6.append(str4);
        sb6.append("', postPath='");
        sb6.append(this.f196457n);
        sb6.append("', category='");
        sb6.append(this.f196458o);
        sb6.append("', type='");
        sb6.append(this.f196459p);
        sb6.append("', createTime=");
        sb6.append(this.f196460q);
        sb6.append(", updateTime=");
        sb6.append(this.f196461r);
        sb6.append(", extId=");
        sb6.append(this.f196462s);
        sb6.append(", signatureKey='");
        sb6.append(this.f196463t);
        sb6.append("', fileKey='");
        sb6.append(this.f196464u);
        sb6.append("', key='");
        sb6.append(a());
        sb6.append("', expireTime='");
        sb6.append(this.f196466w);
        sb6.append("', extInfo='");
        java.lang.String arrays = java.util.Arrays.toString(this.f196467x);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append("', specifiedExtInfo='");
        sb6.append(this.f196468y);
        sb6.append("', virtualPath='");
        sb6.append(this.f196469z);
        sb6.append("', storageType='");
        sb6.append(this.A);
        sb6.append("', uinMd5='");
        sb6.append(this.B);
        sb6.append("', encryptFileSize='");
        sb6.append(this.D);
        sb6.append("', encryptMd5='");
        sb6.append(this.E);
        sb6.append("'}");
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104 A[Catch: Exception -> 0x0108, TRY_LEAVE, TryCatch #0 {Exception -> 0x0108, blocks: (B:11:0x0066, B:14:0x006d, B:17:0x0073, B:21:0x007a, B:23:0x0086, B:24:0x0089, B:26:0x008d, B:29:0x0093, B:33:0x009a, B:35:0x00a6, B:36:0x00a9, B:38:0x00ad, B:41:0x00b3, B:45:0x00ba, B:47:0x00c6, B:48:0x00c9, B:50:0x00cd, B:53:0x00d3, B:57:0x00da, B:59:0x00e6, B:60:0x00e9, B:62:0x00ed, B:65:0x00f3, B:69:0x00fa, B:73:0x0104), top: B:10:0x0066 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.udr.api.WxUdrResource.writeToParcel(android.os.Parcel, int):void");
    }

    public WxUdrResource(android.os.Parcel source) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        kotlin.jvm.internal.o.g(source, "source");
        boolean z17 = true;
        this.C = 1;
        this.f196450d = java.lang.String.valueOf(source.readString());
        this.f196451e = java.lang.String.valueOf(source.readString());
        this.f196452f = source.readInt();
        this.f196453g = source.readString();
        this.f196454h = java.lang.String.valueOf(source.readString());
        this.f196455i = source.readLong();
        this.f196456m = java.lang.String.valueOf(source.readString());
        this.f196457n = source.readString();
        this.f196458o = source.readInt();
        this.f196459p = source.readInt();
        this.f196460q = source.readLong();
        this.f196461r = source.readLong();
        this.f196462s = source.readLong();
        this.f196463t = source.readString();
        this.f196464u = source.readString();
        this.f196465v = java.lang.String.valueOf(source.readString());
        this.f196466w = source.readLong();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(source.readInt());
            byte[] bArr5 = null;
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                bArr = new byte[valueOf.intValue()];
                source.readByteArray(bArr);
            } else {
                bArr = null;
            }
            this.f196467x = bArr;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                bArr2 = new byte[valueOf2.intValue()];
                source.readByteArray(bArr2);
            } else {
                bArr2 = null;
            }
            this.F = bArr2;
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf3.intValue() > 0)) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                bArr3 = new byte[valueOf3.intValue()];
                source.readByteArray(bArr3);
            } else {
                bArr3 = null;
            }
            this.G = bArr3;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(source.readInt());
            if (!(valueOf4.intValue() > 0)) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                bArr4 = new byte[valueOf4.intValue()];
                source.readByteArray(bArr4);
            } else {
                bArr4 = null;
            }
            this.H = bArr4;
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(source.readInt());
            if (valueOf5.intValue() <= 0) {
                z17 = false;
            }
            if (!z17) {
                valueOf5 = null;
            }
            if (valueOf5 != null) {
                bArr5 = new byte[valueOf5.intValue()];
                source.readByteArray(bArr5);
            }
            this.I = bArr5;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WxUdrResource", e17, "read ByteArray exception", new java.lang.Object[0]);
        }
        this.f196468y = source.readString();
        this.f196469z = source.readString();
        this.A = source.readInt();
        this.B = source.readString();
        this.C = source.readInt();
        this.D = source.readLong();
        this.E = source.readString();
    }
}
