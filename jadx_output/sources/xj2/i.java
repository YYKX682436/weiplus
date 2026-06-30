package xj2;

/* loaded from: classes3.dex */
public class i extends xj2.n {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r1, lj2.x0 r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r1, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xj2.i.<init>(android.content.Context, lj2.x0, int, kotlin.jvm.internal.i):void");
    }

    @Override // xj2.n, lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        getViewBinding().f262030a.setBackground(o() ? getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cq6) : getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481802cq5));
    }
}
