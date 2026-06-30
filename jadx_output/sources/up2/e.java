package up2;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final java.util.ArrayList I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(in5.s r1, java.util.ArrayList r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "itemConvertFactory"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "dataList"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.I = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: up2.e.<init>(in5.s, java.util.ArrayList, boolean, int, kotlin.jvm.internal.i):void");
    }

    public final int F0(int i17) {
        int size = this.I.size();
        if (size == 0) {
            return i17;
        }
        int i18 = i17 % size;
        return i18 >= size ? size - 1 : i18;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: n0 */
    public void B(in5.s0 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        super.B(holder, F0(i17), info);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: o0 */
    public void E(in5.s0 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        super.E(holder, F0(i17), info);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.I(holder, F0(i17));
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.J(holder, F0(i17), payloads);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        return this.I.size() > 0 ? Integer.MAX_VALUE : 0;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public long y(int i17) {
        return super.y(F0(i17));
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int z(int i17) {
        return super.z(F0(i17));
    }
}
