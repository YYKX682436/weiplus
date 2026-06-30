package xk3;

/* loaded from: classes8.dex */
public final class o extends xk3.i {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f455054i;

    public o(vk3.a aVar, boolean z17) {
        super(com.tencent.mm.R.layout.bxn, aVar);
        this.f455054i = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00db, code lost:
    
        if ((r12.length() > 0) == true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r8, in5.c r9, int r10, int r11, boolean r12, java.util.List r13) {
        /*
            r7 = this;
            uk3.a r9 = (uk3.a) r9
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            super.p(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r9 = r9.f428524d
            r45.lr4 r9 = r9.v0()
            r10 = 1
            r9.getString(r10)
            r11 = 5
            r9.getString(r11)
            r12 = 2
            r9.getString(r12)
            android.view.View r13 = r8.itemView
            r0 = 2131314919(0x7f0948e7, float:1.8248277E38)
            android.view.View r13 = r13.findViewById(r0)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131100297(0x7f060289, float:1.7812971E38)
            int r0 = r0.getColor(r1)
            r13.setBackgroundColor(r0)
            r0 = 2131314924(0x7f0948ec, float:1.8248287E38)
            android.view.View r0 = r8.p(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.mm.ui.widget.imageview.WeImageView) r0
            r2 = 2131691408(0x7f0f0790, float:1.9011887E38)
            r0.setImageResource(r2)
            android.content.Context r2 = r8.f293121e
            android.content.res.Resources r2 = r2.getResources()
            int r1 = r2.getColor(r1)
            r0.setIconColor(r1)
            r6 = 0
            r0.setVisibility(r6)
            r0 = 2131314931(0x7f0948f3, float:1.82483E38)
            android.view.View r0 = r8.p(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r9.getString(r10)
            r0.setText(r1)
            r0 = 2131314929(0x7f0948f1, float:1.8248297E38)
            android.view.View r0 = r8.p(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r9.getString(r6)
            r0.setText(r1)
            java.lang.String r4 = r9.getString(r12)
            android.view.View r12 = r8.itemView
            r0 = 2131314936(0x7f0948f8, float:1.8248311E38)
            android.view.View r12 = r12.findViewById(r0)
            r2 = r12
            com.tencent.mm.ui.MMImageView r2 = (com.tencent.mm.ui.MMImageView) r2
            android.view.View r12 = r8.itemView
            r0 = 2131314926(0x7f0948ee, float:1.824829E38)
            android.view.View r12 = r12.findViewById(r0)
            r3 = r12
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.mm.ui.widget.imageview.WeImageView) r3
            if (r4 == 0) goto Lac
            int r12 = r4.length()
            if (r12 <= 0) goto La7
            r12 = r10
            goto La8
        La7:
            r12 = r6
        La8:
            if (r12 != r10) goto Lac
            r12 = r10
            goto Lad
        Lac:
            r12 = r6
        Lad:
            if (r12 == 0) goto Lbb
            xk3.l r12 = new xk3.l
            r0 = r12
            r1 = r13
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r13.post(r12)
            goto Lc3
        Lbb:
            xk3.m r12 = new xk3.m
            r12.<init>(r3, r2, r7)
            r13.post(r12)
        Lc3:
            r12 = 2131314920(0x7f0948e8, float:1.8248279E38)
            android.view.View r8 = r8.p(r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            java.lang.String r12 = r9.getString(r11)
            if (r12 == 0) goto Lde
            int r12 = r12.length()
            if (r12 <= 0) goto Lda
            r12 = r10
            goto Ldb
        Lda:
            r12 = r6
        Ldb:
            if (r12 != r10) goto Lde
            goto Ldf
        Lde:
            r10 = r6
        Ldf:
            if (r10 == 0) goto Lec
            n11.a r10 = n11.a.b()
            java.lang.String r9 = r9.getString(r11)
            r10.g(r9, r8)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk3.o.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // xk3.i, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
