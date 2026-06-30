package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f158905f;

    public f2(int i17, java.lang.String str, boolean z17) {
        this.f158903d = i17;
        this.f158904e = str;
        this.f158905f = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
        java.lang.String str = this.f158904e;
        if ((str == null || str.length() == 0) == true) {
            return;
        }
        java.util.HashMap hashMap = com.tencent.mm.plugin.scanner.model.h2.f158924e;
        int i17 = this.f158903d;
        java.lang.String str2 = (java.lang.String) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str3 = (java.lang.String) com.tencent.mm.plugin.scanner.model.h2.f158923d.get(java.lang.Integer.valueOf(i17));
        if ((str2 == null || str2.length() == 0) == true) {
            return;
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18731, str2, str3, java.lang.Integer.valueOf(this.f158905f ? 1 : 0), str);
    }
}
