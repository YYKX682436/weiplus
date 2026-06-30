package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.z0 f159109d = new com.tencent.mm.plugin.scanner.model.z0();

    public z0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        try {
            i17 = com.tencent.mm.plugin.scanner.model.d1.f158852j.nativeFocusEngineVersion();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "focusEngineVersion " + i17);
        } catch (java.lang.Throwable th6) {
            i17 = 0;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", th6, "getFocusEngineVersion exception", new java.lang.Object[0]);
        }
        return java.lang.Integer.valueOf(i17);
    }
}
