package mi1;

/* loaded from: classes7.dex */
public final class o implements al1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f326650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326651e;

    public o(mi1.v vVar) {
        this.f326651e = vVar;
        int d17 = ((kz5.b) mi1.n.f326631a).d();
        byte[] bArr = new byte[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            bArr[i17] = 0;
        }
        this.f326650d = bArr;
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f326650d[reason.ordinal()] = !z17 ? 1 : 0;
        byte[] bArr = this.f326650d;
        kotlin.jvm.internal.o.g(bArr, "<this>");
        int i17 = 0;
        for (byte b17 : bArr) {
            i17 += b17;
        }
        boolean z18 = i17 >= 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCapsuleVisibility(appId:");
        sb6.append(this.f326651e.f326702a.f74803n);
        sb6.append(", expected:");
        sb6.append(z17);
        sb6.append(", reason:");
        sb6.append(reason);
        sb6.append(") result:");
        boolean z19 = !z18;
        sb6.append(z19);
        com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", sb6.toString());
        return z19;
    }
}
