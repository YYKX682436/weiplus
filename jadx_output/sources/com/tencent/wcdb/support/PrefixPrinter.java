package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public class PrefixPrinter implements android.util.Printer {
    private final java.lang.String mPrefix;
    private final android.util.Printer mPrinter;

    private PrefixPrinter(android.util.Printer printer, java.lang.String str) {
        this.mPrinter = printer;
        this.mPrefix = str;
    }

    public static android.util.Printer create(android.util.Printer printer, java.lang.String str) {
        return (str == null || str.equals("")) ? printer : new com.tencent.wcdb.support.PrefixPrinter(printer, str);
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        this.mPrinter.println(this.mPrefix + str);
    }
}
