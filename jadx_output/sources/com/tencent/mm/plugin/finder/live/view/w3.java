package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.c4 f116767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.i23 f116768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(int i17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.live.view.c4 c4Var, r45.i23 i23Var, java.lang.String str3) {
        super(0);
        this.f116764d = i17;
        this.f116765e = str;
        this.f116766f = str2;
        this.f116767g = c4Var;
        this.f116768h = i23Var;
        this.f116769i = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.live.view.c4 r0 = r7.f116767g
            int r1 = r7.f116764d
            if (r1 != 0) goto L21
            java.lang.String r1 = r7.f116765e
            java.lang.String r2 = r7.f116766f
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
            if (r1 == 0) goto La1
            yz5.q r1 = r0.P
            if (r1 == 0) goto La1
            int r0 = r0.M
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r45.i23 r3 = r7.f116768h
            r1.invoke(r0, r2, r3)
            goto La1
        L21:
            r2 = -4054(0xfffffffffffff02a, float:NaN)
            r3 = 2131100100(0x7f0601c4, float:1.7812572E38)
            r4 = 2131765695(0x7f1029bf, float:1.9162559E38)
            r5 = 0
            r6 = 0
            if (r1 != r2) goto L75
            java.lang.String r1 = r7.f116769i
            if (r1 == 0) goto L41
            int r2 = r1.length()
            if (r2 <= 0) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = r6
        L3a:
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r1 = r5
        L3e:
            if (r1 == 0) goto L41
            goto L4c
        L41:
            android.content.Context r1 = r0.f118183e
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
        L4c:
            android.widget.TextView r2 = r0.L
            if (r2 != 0) goto L51
            goto L54
        L51:
            r2.setText(r1)
        L54:
            android.widget.TextView r1 = r0.L
            if (r1 == 0) goto L65
            android.content.Context r2 = r0.f118183e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L65:
            android.widget.TextView r1 = r0.L
            if (r1 == 0) goto L6c
            r1.setOnClickListener(r5)
        L6c:
            android.widget.TextView r0 = r0.L
            if (r0 != 0) goto L71
            goto La1
        L71:
            r0.setVisibility(r6)
            goto La1
        L75:
            android.widget.TextView r1 = r0.L
            android.content.Context r2 = r0.f118183e
            if (r1 != 0) goto L7c
            goto L83
        L7c:
            java.lang.String r4 = r2.getString(r4)
            r1.setText(r4)
        L83:
            android.widget.TextView r1 = r0.L
            if (r1 == 0) goto L92
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L92:
            android.widget.TextView r1 = r0.L
            if (r1 == 0) goto L99
            r1.setOnClickListener(r5)
        L99:
            android.widget.TextView r0 = r0.L
            if (r0 != 0) goto L9e
            goto La1
        L9e:
            r0.setVisibility(r6)
        La1:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.w3.invoke():java.lang.Object");
    }
}
