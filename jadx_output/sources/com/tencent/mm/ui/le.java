package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class le implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.se f209078d;

    public le(com.tencent.mm.ui.se seVar) {
        this.f209078d = seVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        if (sharedPreferences.getInt("RedDotBottomTab", 0) == 1) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.ke(this));
        }
    }
}
