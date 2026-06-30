package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f188890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f188891b;

    public f3(java.lang.String str, int i17) {
        this.f188890a = str;
        this.f188891b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.pluginsdk.model.app.f3)) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.f3 f3Var = (com.tencent.mm.pluginsdk.model.app.f3) obj;
        return f3Var.f188890a.equals(this.f188890a) && f3Var.f188891b == this.f188891b;
    }

    public java.lang.String toString() {
        return this.f188890a + this.f188891b;
    }
}
