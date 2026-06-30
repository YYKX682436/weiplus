package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f116200a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f116201b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f116202c;

    public b2(int i17, byte[] bArr, java.lang.String str) {
        this.f116200a = i17;
        this.f116201b = bArr;
        this.f116202c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.view.b2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.view.b2 b2Var = (com.tencent.mm.plugin.finder.live.view.b2) obj;
        return this.f116200a == b2Var.f116200a && kotlin.jvm.internal.o.b(this.f116201b, b2Var.f116201b) && kotlin.jvm.internal.o.b(this.f116202c, b2Var.f116202c);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f116200a) * 31;
        byte[] bArr = this.f116201b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f116202c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AnchorMicData(applyScene=" + this.f116200a + ", sceneBuffer=" + java.util.Arrays.toString(this.f116201b) + ", candidateRequestId=" + this.f116202c + ')';
    }
}
