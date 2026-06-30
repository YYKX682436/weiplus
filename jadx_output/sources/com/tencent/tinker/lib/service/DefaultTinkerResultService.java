package com.tencent.tinker.lib.service;

/* loaded from: classes13.dex */
public class DefaultTinkerResultService extends com.tencent.tinker.lib.service.AbstractResultService {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    @Override // com.tencent.tinker.lib.service.AbstractResultService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.tinker.lib.service.PatchResult r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "Tinker.DefaultTinkerResultService"
            if (r7 != 0) goto Ld
            java.lang.String r7 = "DefaultTinkerResultService received null result!!!!"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r1, r7, r0)
            return
        Ld:
            java.lang.String r2 = r7.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "DefaultTinkerResultService received a result:%s "
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(r1, r3, r2)
            android.content.Context r2 = r6.getApplicationContext()
            uv5.a.b(r2)
            boolean r2 = r7.isSuccess
            if (r2 == 0) goto Lba
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r7.rawPatchFilePath
            r2.<init>(r3)
            boolean r3 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(r2)
            if (r3 != 0) goto L33
            goto L8a
        L33:
            java.lang.String r3 = r2.getPath()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "deleteRawPatchFile rawFile path: %s"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(r1, r4, r3)
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "patch-"
            boolean r5 = r3.startsWith(r4)
            if (r5 == 0) goto L87
            java.lang.String r5 = ".apk"
            boolean r3 = r3.endsWith(r5)
            if (r3 != 0) goto L55
            goto L87
        L55:
            java.io.File r3 = r2.getParentFile()
            java.lang.String r5 = r3.getName()
            boolean r4 = r5.startsWith(r4)
            if (r4 != 0) goto L67
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
            goto L8a
        L67:
            java.io.File r3 = r3.getParentFile()
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "tinker"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L8a
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "wc_tinker_dir"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L8a
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
            goto L8a
        L87:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
        L8a:
            android.content.Context r2 = r6.getApplicationContext()
            tv5.b r2 = tv5.b.b(r2)
            boolean r3 = r2.f422379l
            if (r3 == 0) goto La8
            tv5.d r2 = r2.f422378k
            if (r2 == 0) goto La8
            java.lang.String r2 = r2.f422380a
            java.lang.String r7 = r7.patchVersion
            if (r7 == 0) goto La8
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto La8
            r7 = r0
            goto La9
        La8:
            r7 = 1
        La9:
            if (r7 == 0) goto Lb3
            int r7 = android.os.Process.myPid()
            android.os.Process.killProcess(r7)
            goto Lba
        Lb3:
            java.lang.String r7 = "I have already install the newly patch version!"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(r1, r7, r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.lib.service.DefaultTinkerResultService.a(com.tencent.tinker.lib.service.PatchResult):void");
    }
}
