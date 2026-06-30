package na5;

/* loaded from: classes5.dex */
public final class d extends na5.f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.util.List r1, int r2, java.util.List r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            r2 = 9
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            java.lang.String r4 = "dataList"
            kotlin.jvm.internal.o.g(r1, r4)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: na5.d.<init>(java.util.List, int, java.util.List, int, kotlin.jvm.internal.i):void");
    }

    @Override // na5.f, androidx.recyclerview.widget.f2
    /* renamed from: x */
    public na5.i onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f487943c6, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new na5.i(inflate);
    }
}
