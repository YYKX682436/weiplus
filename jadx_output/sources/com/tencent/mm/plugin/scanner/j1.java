package com.tencent.mm.plugin.scanner;

/* loaded from: classes12.dex */
public abstract class j1 {
    public static int a(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        if ("EAN-13".equals(str) || "EAN_13".equals(str)) {
            return 4;
        }
        if ("EAN-8".equals(str) || "EAN_8".equals(str)) {
            return 3;
        }
        if ("EAN-2".equals(str)) {
            return 1;
        }
        if ("EAN-5".equals(str)) {
            return 2;
        }
        if ("UPC-A".equals(str) || "UPC_A".equals(str)) {
            return 5;
        }
        if ("UPC-E".equals(str) || "UPC_E".equals(str)) {
            return 6;
        }
        if ("CODE-39".equals(str) || "CODE_39".equals(str)) {
            return 9;
        }
        if ("CODE-93".equals(str) || "CODE_93".equals(str)) {
            return 10;
        }
        if ("CODE-128".equals(str) || "CODE_128".equals(str)) {
            return 11;
        }
        if ("COMPOSITE".equals(str)) {
            return 12;
        }
        if ("I/25".equals(str) || "ITF".equals(str)) {
            return 13;
        }
        if ("DATABAR".equals(str)) {
            return 7;
        }
        if ("DATABAR-EXP".equals(str)) {
            return 8;
        }
        if ("RSS_14".equals(str)) {
            return 15;
        }
        if ("RSS_EXPANDED".equals(str)) {
            return 16;
        }
        if ("MAXICODE".equals(str)) {
            return 18;
        }
        if ("PDF_417".equals(str)) {
            return 20;
        }
        if ("QR_CODE".equals(str)) {
            return 19;
        }
        if ("CODABAR".equals(str)) {
            return 17;
        }
        if ("ISBN10".equals(str)) {
            return 14;
        }
        if ("DATA_MATRIX".equals(str)) {
            return 21;
        }
        if ("WX_CODE".equals(str)) {
            return 22;
        }
        if ("VQR_CODE".equals(str)) {
            return 23;
        }
        return "SHOP_CODE".equals(str) ? 24 : 0;
    }

    public static boolean b(int i17) {
        return i17 == 19 || i17 == 22 || i17 == 23 || i17 == 24;
    }

    public static boolean c(java.lang.String str) {
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals("QR_CODE")) || str.equals("WX_CODE") || str.equals("VQR_CODE") || str.equals("SHOP_CODE");
    }
}
