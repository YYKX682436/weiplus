package com.tencent.mm.sdk.platformtools;

/* loaded from: classes9.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f192747a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f192748b;

    public i8(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f192747a;
        if (arrayList == null) {
            this.f192747a = new java.util.ArrayList();
            this.f192748b = new java.util.ArrayList();
        } else {
            arrayList.clear();
            this.f192748b.clear();
        }
        a(null);
    }

    public void a(java.lang.String str) {
        this.f192747a.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.f192748b.add(str);
    }

    public void b() {
        ((java.lang.Long) this.f192747a.get(0)).longValue();
        for (int i17 = 1; i17 < this.f192747a.size(); i17++) {
            ((java.lang.Long) this.f192747a.get(i17)).longValue();
            ((java.lang.Long) this.f192747a.get(i17 - 1)).longValue();
        }
    }
}
