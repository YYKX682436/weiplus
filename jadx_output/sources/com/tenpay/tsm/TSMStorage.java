package com.tenpay.tsm;

/* loaded from: classes16.dex */
public class TSMStorage {
    public static boolean checkSM2PriKey(java.lang.String str) {
        int TSMStorageCheckSM2PriKey = com.tenpay.utils.SMUtilsV2.TSMStorageCheckSM2PriKey(str);
        if (TSMStorageCheckSM2PriKey == 0) {
            return TSMStorageCheckSM2PriKey == 0;
        }
        if (TSMStorageCheckSM2PriKey == -60012) {
            return false;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageCheckSM2PriKey);
    }

    public static boolean checkSM2PubKey(java.lang.String str) {
        int TSMStorageCheckSM2PubKey = com.tenpay.utils.SMUtilsV2.TSMStorageCheckSM2PubKey(str);
        if (TSMStorageCheckSM2PubKey == 0) {
            return TSMStorageCheckSM2PubKey == 0;
        }
        if (TSMStorageCheckSM2PubKey == -60012) {
            return false;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageCheckSM2PubKey);
    }

    public static boolean checkSM4Key(java.lang.String str) {
        int TSMStorageCheckSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageCheckSM4Key(str);
        if (TSMStorageCheckSM4Key == 0) {
            return TSMStorageCheckSM4Key == 0;
        }
        if (TSMStorageCheckSM4Key == -60012) {
            return false;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageCheckSM4Key);
    }

    public static void deleteSM2PriKey(java.lang.String str) {
        int TSMStorageDeleteSM2PriKey = com.tenpay.utils.SMUtilsV2.TSMStorageDeleteSM2PriKey(str);
        if (TSMStorageDeleteSM2PriKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageDeleteSM2PriKey);
        }
    }

    public static void deleteSM2PubKey(java.lang.String str) {
        int TSMStorageDeleteSM2PubKey = com.tenpay.utils.SMUtilsV2.TSMStorageDeleteSM2PubKey(str);
        if (TSMStorageDeleteSM2PubKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageDeleteSM2PubKey);
        }
    }

    public static void deleteSM4Key(java.lang.String str) {
        int TSMStorageDeleteSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageDeleteSM4Key(str);
        if (TSMStorageDeleteSM4Key != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageDeleteSM4Key);
        }
    }

    public static java.lang.String[] exportSM2PriKey(java.lang.String str, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String[] strArr2 = new java.lang.String[1];
        int TSMStorageExportSM2PriKey = com.tenpay.utils.SMUtilsV2.TSMStorageExportSM2PriKey(str, tSMStorageSM2KeyFormat.ordinal(), strArr, strArr2);
        if (TSMStorageExportSM2PriKey == 0) {
            return new java.lang.String[]{strArr[0], strArr2[0]};
        }
        if (TSMStorageExportSM2PriKey == -60012) {
            return null;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageExportSM2PriKey);
    }

    public static java.lang.String exportSM2PubKey(java.lang.String str, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        java.lang.String[] strArr = new java.lang.String[1];
        int TSMStorageExportSM2PubKey = com.tenpay.utils.SMUtilsV2.TSMStorageExportSM2PubKey(str, tSMStorageSM2KeyFormat.ordinal(), strArr);
        if (TSMStorageExportSM2PubKey == 0) {
            return strArr[0];
        }
        if (TSMStorageExportSM2PubKey == -60012) {
            return null;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageExportSM2PubKey);
    }

    public static byte[] exportSM4Key(java.lang.String str) {
        byte[][] bArr = new byte[1];
        int TSMStorageExportSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageExportSM4Key(str, bArr);
        if (TSMStorageExportSM4Key == 0) {
            return bArr[0];
        }
        if (TSMStorageExportSM4Key == -60012) {
            return null;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageExportSM4Key);
    }

    public static boolean generateSM2KeyPair(java.lang.String str) {
        int TSMStorageGenerateSM2KeyPair = com.tenpay.utils.SMUtilsV2.TSMStorageGenerateSM2KeyPair(str);
        if (TSMStorageGenerateSM2KeyPair == 0) {
            return true;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageGenerateSM2KeyPair);
    }

    public static boolean generateSM4Key(java.lang.String str) {
        int TSMStorageGenerateSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageGenerateSM4Key(str);
        if (TSMStorageGenerateSM4Key == 0) {
            return true;
        }
        throw new com.tenpay.tsm.TSMException(TSMStorageGenerateSM4Key);
    }

    public static void importSM2PriKey(java.lang.String str, java.lang.String str2, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageImportSM2PriKey = com.tenpay.utils.SMUtilsV2.TSMStorageImportSM2PriKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageImportSM2PriKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageImportSM2PriKey);
        }
    }

    public static void importSM2PubKey(java.lang.String str, java.lang.String str2, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageImportSM2PubKey = com.tenpay.utils.SMUtilsV2.TSMStorageImportSM2PubKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageImportSM2PubKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageImportSM2PubKey);
        }
    }

    public static void importSM4Key(java.lang.String str, byte[] bArr) {
        int TSMStorageImportSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageImportSM4Key(str, bArr);
        if (TSMStorageImportSM4Key != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageImportSM4Key);
        }
    }

    public static void init(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int TSMStorageInit = com.tenpay.utils.SMUtilsV2.TSMStorageInit(str, str2, str3);
        if (TSMStorageInit != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageInit);
        }
    }

    public static void updateSM2PriKey(java.lang.String str, java.lang.String str2, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageUpdateSM2PriKey = com.tenpay.utils.SMUtilsV2.TSMStorageUpdateSM2PriKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageUpdateSM2PriKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageUpdateSM2PriKey);
        }
    }

    public static void updateSM2PubKey(java.lang.String str, java.lang.String str2, com.tenpay.tsm.TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageUpdateSM2PubKey = com.tenpay.utils.SMUtilsV2.TSMStorageUpdateSM2PubKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageUpdateSM2PubKey != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageUpdateSM2PubKey);
        }
    }

    public static void updateSM4Key(java.lang.String str, byte[] bArr) {
        int TSMStorageUpdateSM4Key = com.tenpay.utils.SMUtilsV2.TSMStorageUpdateSM4Key(str, bArr);
        if (TSMStorageUpdateSM4Key != 0) {
            throw new com.tenpay.tsm.TSMException(TSMStorageUpdateSM4Key);
        }
    }
}
