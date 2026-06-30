package com.tencent.qbar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/qbar/ScanIdentifyReportInfo;", "Landroid/os/Parcelable;", "scan-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScanIdentifyReportInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f215242d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f215243e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215244f;

    /* renamed from: g, reason: collision with root package name */
    public final int f215245g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f215246h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f215247i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f215248m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f215249n;

    public ScanIdentifyReportInfo(byte[] bArr, android.graphics.Point point, int i17, int i18, java.lang.String str, byte[] bArr2, boolean z17) {
        this.f215242d = bArr;
        this.f215243e = point;
        this.f215244f = i17;
        this.f215245g = i18;
        this.f215246h = str;
        this.f215247i = bArr2;
        this.f215248m = z17;
    }

    public final boolean a() {
        android.graphics.Point point;
        if (this.f215242d != null && (point = this.f215243e) != null && point.x > 0 && point.y > 0) {
            return true;
        }
        java.lang.String str = this.f215246h;
        return !(str == null || str.length() == 0);
    }

    public final void b(com.tencent.mm.plugin.scanner.CodePointRect codeRect, int i17, int i18) {
        kotlin.jvm.internal.o.g(codeRect, "codeRect");
        this.f215249n = new android.graphics.RectF(codeRect.f158611d, codeRect.f158612e, codeRect.f158613f, codeRect.f158614g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        try {
            parcel.writeByteArray(this.f215242d);
            parcel.writeParcelable(this.f215243e, i17);
            parcel.writeInt(this.f215244f);
            parcel.writeInt(this.f215245g);
            parcel.writeString(this.f215246h);
            parcel.writeParcelable(this.f215249n, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanIdentifyReportInfo", "failed write reportinfo to parcel: " + e17);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScanIdentifyReportInfo(byte[] r9, android.graphics.Point r10, int r11, int r12) {
        /*
            r8 = this;
            if (r9 == 0) goto Ld
            int r0 = r9.length
            byte[] r9 = java.util.Arrays.copyOf(r9, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.o.f(r9, r0)
            goto Le
        Ld:
            r9 = 0
        Le:
            r1 = r9
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qbar.ScanIdentifyReportInfo.<init>(byte[], android.graphics.Point, int, int):void");
    }

    public ScanIdentifyReportInfo(java.lang.String str, byte[] bArr, boolean z17) {
        this(null, null, 0, 0, str, bArr, z17);
    }
}
