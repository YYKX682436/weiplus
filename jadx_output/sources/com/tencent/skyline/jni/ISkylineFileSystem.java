package com.tencent.skyline.jni;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/tencent/skyline/jni/ISkylineFileSystem;", "", "", "bytes", "", "suffix", "Lcom/tencent/skyline/jni/ISkylineFileSystemCallback;", "callback", "Ljz5/f0;", "writeTempFileAsync", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public interface ISkylineFileSystem {
    void writeTempFileAsync(byte[] bArr, java.lang.String str, com.tencent.skyline.jni.ISkylineFileSystemCallback iSkylineFileSystemCallback);
}
