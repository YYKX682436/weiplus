package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f113406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113408f;

    public lk(bm2.a4 a4Var, java.lang.String str, java.lang.String str2) {
        this.f113406d = a4Var;
        this.f113407e = str;
        this.f113408f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.n3 n3Var;
        bm2.a4 a4Var = this.f113406d;
        a4Var.getClass();
        java.lang.String giftId = this.f113407e;
        kotlin.jvm.internal.o.g(giftId, "curGiftId");
        java.util.ArrayList arrayList = a4Var.f21767g;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                n3Var = null;
                break;
            }
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ce2.i iVar = (ce2.i) obj;
            androidx.recyclerview.widget.k3 p07 = a4Var.f21765e.p0(i17);
            n3Var = p07 instanceof bm2.n3 ? (bm2.n3) p07 : null;
            if (n3Var != null && kotlin.jvm.internal.o.b(iVar.field_rewardProductId, giftId)) {
                break;
            } else {
                i17++;
            }
        }
        if (n3Var != null) {
            android.view.View view = n3Var.f22220d;
            if (view != null) {
                view.performClick();
            }
            java.lang.String str = this.f113408f;
            if (str != null) {
                java.lang.String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    kotlin.jvm.internal.o.g(giftId, "giftId");
                    n3Var.i(giftId, 2);
                    n3Var.f22137q.setUnLockContent(str2);
                }
            }
        }
    }
}
