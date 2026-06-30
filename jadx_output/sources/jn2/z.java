package jn2;

/* loaded from: classes5.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f300760d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f300761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300762f;

    public z(android.content.Context context, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f300760d = onItemClick;
        this.f300761e = new java.util.ArrayList();
        this.f300762f = "";
        context.getResources().getColor(com.tencent.mm.R.color.f479206su);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f300761e).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1.length() == 0) != false) goto L14;
     */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r6, int r7) {
        /*
            r5 = this;
            jn2.x r6 = (jn2.x) r6
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r6, r0)
            java.util.List r0 = r5.f300761e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r7 = r0.get(r7)
            r45.hy1 r7 = (r45.hy1) r7
            java.lang.String r0 = r7.f376553f
            java.lang.String r1 = r5.f300762f
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            int r4 = r0.length()
            if (r4 != 0) goto L20
            goto L22
        L20:
            r4 = r2
            goto L23
        L22:
            r4 = r3
        L23:
            if (r4 != 0) goto L2e
            int r1 = r1.length()
            if (r1 != 0) goto L2c
            r2 = r3
        L2c:
            if (r2 == 0) goto L33
        L2e:
            if (r0 == 0) goto L31
            goto L33
        L31:
            java.lang.String r0 = ""
        L33:
            android.widget.TextView r1 = r6.f300744d
            r1.setText(r0)
            android.view.View r6 = r6.itemView
            jn2.y r0 = new jn2.y
            r0.<init>(r7, r5)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.z.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.e8i, null);
        kotlin.jvm.internal.o.d(inflate);
        return new jn2.x(inflate);
    }
}
