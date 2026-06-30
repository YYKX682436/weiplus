package com.tencent.tav.core.audio;

/* loaded from: classes13.dex */
class EncoderUtils {
    private static final int FREQ_IDX = 4;
    public static final int INDEX_START = 1;
    private static final int PROFILE = 2;

    public static void addADTStoPacket(byte[] bArr, int i17) {
        byte[] generateADTSHeader = generateADTSHeader(bArr.length, i17);
        java.lang.System.arraycopy(generateADTSHeader, 0, bArr, 0, generateADTSHeader.length);
    }

    public static void close(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void deleteAllTmpFiles(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.tav.decoder.logger.Logger.d("EncoderUtils", "deleteAllTmpFiles " + i17 + " sessionId = " + str2);
        for (int i18 = 1; i18 <= i17; i18++) {
            java.io.File file = new java.io.File(getAudioOutSaveFilePath(str, i18, str2));
            com.tencent.tav.decoder.logger.Logger.d("EncoderUtils", "delete file " + file.getAbsolutePath() + " deleteResult = " + file.delete());
        }
    }

    public static byte[] generateADTSHeader(int i17, int i18) {
        return new byte[]{-1, -7, (byte) ((i18 >> 2) + 80), (byte) (((i18 & 3) << 6) + (i17 >> 11)), (byte) ((i17 & 2047) >> 3), (byte) (((i17 & 7) << 5) + 31), -4};
    }

    public static java.lang.String getAudioOutSaveFilePath(java.lang.String str, int i17, java.lang.String str2) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf <= 0) {
            return str + "_" + str2 + "_" + i17;
        }
        return str.substring(0, lastIndexOf) + "_" + str2 + "_" + i17 + str.substring(lastIndexOf);
    }

    private static boolean isValidFile(java.io.File file) {
        return file.createNewFile() || (file.exists() && file.isFile());
    }

    public static boolean mergeAllFiles(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.tav.decoder.logger.Logger.d("EncoderUtils", "mergeAllFiles " + i17 + " sessionId = " + str2);
        try {
            java.io.File file = new java.io.File(str);
            file.delete();
            if (!isValidFile(file)) {
                return false;
            }
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            for (int i18 = 1; i18 <= i17; i18++) {
                randomAccessFile.write(readFromFile(getAudioOutSaveFilePath(str, i18, str2)));
            }
            close(randomAccessFile);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static byte[] readFromFile(java.lang.String str) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } finally {
            close(fileInputStream);
        }
    }
}
