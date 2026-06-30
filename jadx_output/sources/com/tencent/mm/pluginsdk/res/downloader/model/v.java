package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189723a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f189724b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f189725c;

    /* renamed from: d, reason: collision with root package name */
    public final long f189726d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189727e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189728f;

    /* renamed from: g, reason: collision with root package name */
    public final int f189729g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Exception f189730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f189731i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Bundle f189732j;

    public v(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, int i17, java.lang.Exception exc, int i18) {
        this.f189732j = new android.os.Bundle();
        this.f189728f = str;
        this.f189723a = str2;
        this.f189724b = str3;
        this.f189725c = str4;
        this.f189726d = j17;
        this.f189727e = str5;
        this.f189729g = i17;
        this.f189730h = exc;
        this.f189731i = i18;
    }

    public java.lang.String toString() {
        return "NetworkResponse{urlKey='" + this.f189723a + "', url='" + this.f189724b + "', filePath='" + this.f189725c + "', contentLength=" + this.f189726d + ", contentType='" + this.f189727e + "', status=" + this.f189729g + ", e=" + this.f189730h + '}';
    }

    public v(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, int i17, java.lang.Exception exc) {
        this(str, str2, str3, str4, j17, str5, i17, exc, -1);
    }

    public v(com.tencent.mm.pluginsdk.res.downloader.model.u uVar, int i17, long j17, java.lang.String str) {
        this(uVar.c(), uVar.f189712a, uVar.f189717f, uVar.b(), j17, str, i17, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(com.tencent.mm.pluginsdk.res.downloader.model.i r12, int r13, long r14, java.lang.String r16) {
        /*
            r11 = this;
            java.lang.String r1 = r12.getGroupId()
            r0 = r12
            com.tencent.mm.pluginsdk.res.downloader.model.x r0 = (com.tencent.mm.pluginsdk.res.downloader.model.x) r0
            java.lang.String r2 = r0.f()
            java.lang.String r3 = r12.a()
            java.lang.String r4 = r0.e()
            r9 = 0
            r10 = -1
            r0 = r11
            r5 = r14
            r7 = r16
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.v.<init>(com.tencent.mm.pluginsdk.res.downloader.model.i, int, long, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(com.tencent.mm.pluginsdk.res.downloader.model.i r12, java.lang.Exception r13, int r14, int r15) {
        /*
            r11 = this;
            java.lang.String r1 = r12.getGroupId()
            r0 = r12
            com.tencent.mm.pluginsdk.res.downloader.model.x r0 = (com.tencent.mm.pluginsdk.res.downloader.model.x) r0
            java.lang.String r2 = r0.f()
            java.lang.String r3 = r12.a()
            java.lang.String r4 = r0.e()
            r5 = -1
            r7 = 0
            r0 = r11
            r8 = r15
            r9 = r13
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.v.<init>(com.tencent.mm.pluginsdk.res.downloader.model.i, java.lang.Exception, int, int):void");
    }
}
