package com.tencent.mm.plugin.licence.model;

/* loaded from: classes13.dex */
public final class LibCardRecog {
    private byte _hellAccFlag_;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("IDCardRecog");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int recognizeBankCardGetVersion();

    public static native int recognizeBankCardInit(int i17, int i18, boolean z17);

    public static native int recognizeBankCardProcess(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, com.tencent.mm.plugin.licence.model.BankCardInfo bankCardInfo, boolean[] zArr);

    public static native int recognizeBankCardRelease();

    public static native java.lang.String recognizeBankCardSegmentNumber(java.lang.String str, int i17, int[] iArr);

    public static native int recognizeCardInit(int i17, int i18, int i19);

    public static native int recognizeCardProcess(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, com.tencent.mm.plugin.licence.model.CardInfo cardInfo, boolean[] zArr);

    public static native int recognizeCardRelease();
}
