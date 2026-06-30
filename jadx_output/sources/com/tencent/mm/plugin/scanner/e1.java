package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic f158721e;

    public e1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, java.lang.String str) {
        this.f158721e = scanCodeSheetItemLogic;
        this.f158720d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.scanner.d1(this));
    }
}
