package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class p1 extends com.tencent.mm.xcompat.recyclerview.widget.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214608a;

    public p1(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214608a = recyclerView;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.w0
    public void a() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214608a;
        recyclerView.i(null);
        recyclerView.F1.f214651f = true;
        recyclerView.T(true);
        if (recyclerView.f214401h.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        if (r4.size() == 1) goto L9;
     */
    @Override // com.tencent.mm.xcompat.recyclerview.widget.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r6, int r7) {
        /*
            r5 = this;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r0 = r5.f214608a
            r1 = 0
            r0.i(r1)
            com.tencent.mm.xcompat.recyclerview.widget.c r2 = r0.f214401h
            r3 = 1
            if (r7 >= r3) goto Lf
            r2.getClass()
            goto L24
        Lf:
            java.util.ArrayList r4 = r2.f214469b
            com.tencent.mm.xcompat.recyclerview.widget.b r6 = r2.h(r3, r6, r7, r1)
            r4.add(r6)
            int r6 = r2.f214473f
            r6 = r6 | r3
            r2.f214473f = r6
            int r6 = r4.size()
            if (r6 != r3) goto L24
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L3e
            boolean r6 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214391d2
            if (r6 == 0) goto L3b
            boolean r6 = r0.f214423z
            if (r6 == 0) goto L3b
            boolean r6 = r0.f214420y
            if (r6 == 0) goto L3b
            java.lang.Runnable r6 = r0.f214406o
            java.util.WeakHashMap r7 = n3.l1.f334362a
            n3.u0.m(r0, r6)
            goto L3e
        L3b:
            r0.requestLayout()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.p1.b(int, int):void");
    }
}
