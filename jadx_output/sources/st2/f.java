package st2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f412284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(az2.f fVar, st2.h1 h1Var) {
        super(3);
        this.f412284d = fVar;
        this.f412285e = h1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    @Override // yz5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = (java.lang.String) r8
            r45.o12 r9 = (r45.o12) r9
            java.lang.String r0 = "errMsg"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "resp"
            kotlin.jvm.internal.o.g(r9, r0)
            az2.f r0 = r6.f412284d
            r0.b()
            st2.h1 r0 = r6.f412285e
            if (r7 == 0) goto Ld8
            r7 = 1
            com.tencent.mm.protobuf.f r8 = r9.getCustom(r7)
            r45.ix0 r8 = (r45.ix0) r8
            r1 = 0
            if (r8 == 0) goto L2f
            int r8 = r8.getInteger(r7)
            if (r8 != 0) goto L2f
            r8 = r7
            goto L30
        L2f:
            r8 = r1
        L30:
            r2 = 0
            if (r8 != 0) goto Ld4
            r45.k11 r8 = new r45.k11
            r8.<init>()
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r7)
            r45.ix0 r9 = (r45.ix0) r9
            if (r9 == 0) goto L4c
            r3 = 3
            com.tencent.mm.protobuf.g r9 = r9.getByteString(r3)
            if (r9 == 0) goto L4c
            byte[] r9 = r9.g()
            goto L4d
        L4c:
            r9 = r2
        L4d:
            if (r9 != 0) goto L50
            goto L60
        L50:
            r8.parseFrom(r9)     // Catch: java.lang.Exception -> L54
            goto L61
        L54:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r9, r3, r8)
        L60:
            r8 = r2
        L61:
            if (r8 == 0) goto L68
            java.lang.String r9 = r8.getString(r1)
            goto L69
        L68:
            r9 = r2
        L69:
            if (r8 == 0) goto L70
            java.lang.String r7 = r8.getString(r7)
            goto L71
        L70:
            r7 = r2
        L71:
            if (r9 == 0) goto Le1
            if (r7 == 0) goto Le1
            r0.u()
            com.tencent.mm.ui.widget.dialog.y1 r8 = new com.tencent.mm.ui.widget.dialog.y1
            android.view.ViewGroup r1 = r0.f412333d
            android.content.Context r3 = r1.getContext()
            r8.<init>(r3)
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131496152(0x7f0c0cd8, float:1.861586E38)
            android.view.View r1 = r1.inflate(r3, r2)
            java.lang.String r2 = "inflate(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r2 = 2131322954(0x7f09684a, float:1.8264574E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131321926(0x7f096446, float:1.8262488E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131301466(0x7f09145a, float:1.822099E38)
            android.view.View r4 = r1.findViewById(r4)
            r5 = 2131318794(0x7f09580a, float:1.8256136E38)
            android.view.View r5 = r1.findViewById(r5)
            r2.setText(r9)
            r3.setText(r7)
            st2.u0 r7 = new st2.u0
            r7.<init>(r0, r8)
            r4.setOnClickListener(r7)
            st2.v0 r7 = new st2.v0
            r7.<init>(r0, r8)
            r5.setOnClickListener(r7)
            r8.k(r1)
            r8.s()
            goto Le1
        Ld4:
            r0.D(r2)
            goto Le1
        Ld8:
            android.view.ViewGroup r7 = r0.f412333d
            android.content.Context r7 = r7.getContext()
            db5.t7.g(r7, r8)
        Le1:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.f.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
