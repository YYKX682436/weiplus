package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaFile extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public int f220152f = 1073741824;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220153g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220154h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220155i;

    @Override // com.tencent.wework.api.model.BaseMessage
    public void a(android.content.Intent intent, java.lang.String str) {
        java.lang.String str2 = this.f220153g;
        if (str2 == null || !str2.startsWith("content")) {
            return;
        }
        if (intent.getClipData() == null) {
            intent.setClipData(new android.content.ClipData("", new java.lang.String[]{"*/*"}, new android.content.ClipData.Item(android.net.Uri.parse(this.f220153g))));
        } else {
            intent.getClipData().addItem(new android.content.ClipData.Item(android.net.Uri.parse(this.f220153g)));
        }
        intent.addFlags(1);
        this.f220155i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r4 = this;
            boolean r0 = super.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r4.f220153g
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 == 0) goto L36
            java.lang.String r0 = r4.f220153g
            if (r0 == 0) goto L34
            int r2 = r0.length()
            if (r2 == 0) goto L2e
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L28
            goto L2e
        L28:
            long r2 = r2.length()
            int r0 = (int) r2
            goto L2f
        L2e:
            r0 = r1
        L2f:
            int r2 = r4.f220152f
            if (r0 <= r2) goto L34
            return r1
        L34:
            r0 = 1
            return r0
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaFile.b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r0 == null) goto L30;
     */
    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "_wwfileobject_fileData"
            r1 = 0
            r8.putByteArray(r0, r1)
            java.lang.String r0 = "_wwfileobject_filePath"
            java.lang.String r1 = r7.f220153g
            r8.putString(r0, r1)
            java.lang.String r0 = "_wwfileobject_fileName"
            java.lang.String r1 = r7.f220154h
            r8.putString(r0, r1)
            java.lang.String r0 = r7.f220153g
            java.lang.String r1 = "content"
            r2 = 0
            if (r0 == 0) goto L25
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            r7.f220155i = r2
            goto Laa
        L25:
            android.content.Context r0 = r7.f220145a
            java.lang.String r3 = r7.f220146b
            java.lang.String r4 = r7.f220153g
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L97
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L97
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            android.net.Uri$Builder r1 = r6.scheme(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            r6.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = ".wwapi"
            r6.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L97
            android.net.Uri$Builder r1 = r1.authority(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "name"
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L97
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "filepath"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r4)     // Catch: java.lang.Throwable -> L97
            android.net.Uri r1 = r1.build()     // Catch: java.lang.Throwable -> L97
            r1.toString()     // Catch: java.lang.Throwable -> L97
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L97
            java.io.OutputStream r0 = r0.openOutputStream(r1)     // Catch: java.lang.Throwable -> L97
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L93
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L93
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L91
        L7c:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> L91
            if (r4 <= 0) goto L87
            r6 = 0
            r0.write(r3, r6, r4)     // Catch: java.lang.Throwable -> L91
            goto L7c
        L87:
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Throwable -> L91
            r1.close()     // Catch: java.lang.Throwable -> L8e
        L8e:
            if (r0 == 0) goto La8
            goto La5
        L91:
            r3 = move-exception
            goto L9b
        L93:
            r1 = move-exception
            r3 = r1
            r1 = r2
            goto L9b
        L97:
            r0 = move-exception
            r3 = r0
            r0 = r2
            r1 = r0
        L9b:
            r3.toString()     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto La3
            r1.close()     // Catch: java.lang.Throwable -> La3
        La3:
            if (r0 == 0) goto La8
        La5:
            r0.close()     // Catch: java.lang.Throwable -> La8
        La8:
            r7.f220155i = r2
        Laa:
            java.lang.String r0 = "_wwfileobject_fileId"
            java.lang.String r1 = r7.f220155i
            r8.putString(r0, r1)
            super.f(r8)
            return
        Lb5:
            r8 = move-exception
            if (r1 == 0) goto Lbb
            r1.close()     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            if (r0 == 0) goto Lc0
            r0.close()     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaFile.f(android.os.Bundle):void");
    }
}
