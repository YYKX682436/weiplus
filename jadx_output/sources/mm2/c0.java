package mm2;

/* loaded from: classes3.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm2.c f328771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f328772b;

    public c0(lm2.c cVar, mm2.e0 e0Var) {
        this.f328771a = cVar;
        this.f328772b = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r0.getBoolean(1) == true) goto L18;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r7) {
        /*
            r6 = this;
            com.tencent.mm.modelbase.f r7 = (com.tencent.mm.modelbase.f) r7
            int r0 = r7.f70615a
            jz5.f0 r1 = jz5.f0.f302826a
            mm2.e0 r2 = r6.f328772b
            if (r0 != 0) goto L25
            int r0 = r7.f70616b
            if (r0 != 0) goto L25
            com.tencent.mm.protobuf.f r7 = r7.f70618d
            if (r7 == 0) goto L22
            lm2.c r0 = r6.f328771a
            if (r0 == 0) goto L22
            r45.tp2 r7 = (r45.tp2) r7
            mm2.b0 r3 = new mm2.b0
            r3.<init>(r0, r7, r2)
            pm0.v.X(r3)
            goto Lad
        L22:
            r1 = 0
            goto Lad
        L25:
            com.tencent.mm.protobuf.f r0 = r7.f70618d
            r45.tp2 r0 = (r45.tp2) r0
            r3 = 7
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.zm6 r0 = (r45.zm6) r0
            r4 = 0
            if (r0 == 0) goto L3b
            r5 = 1
            boolean r0 = r0.getBoolean(r5)
            if (r0 != r5) goto L3b
            goto L3c
        L3b:
            r5 = r4
        L3c:
            r0 = 2131765942(0x7f102ab6, float:1.916306E38)
            if (r5 == 0) goto L6a
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            zl2.q4 r2 = zl2.q4.f473933a
            com.tencent.mm.protobuf.f r5 = r7.f70618d
            r45.tp2 r5 = (r45.tp2) r5
            com.tencent.mm.protobuf.f r3 = r5.getCustom(r3)
            r45.zm6 r3 = (r45.zm6) r3
            if (r3 == 0) goto L66
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L65
            goto L66
        L65:
            r0 = r3
        L66:
            r2.P(r0)
            goto L84
        L6a:
            int r3 = r7.f70616b
            r5 = -200014(0xfffffffffffcf2b2, float:NaN)
            if (r3 != r5) goto L84
            r2.f328969i = r4
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r3 = r2.getResources()
            java.lang.String r0 = r3.getString(r0)
            android.widget.Toast r0 = db5.t7.makeText(r2, r0, r4)
            r0.show()
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "postMsg error errType: "
            r0.<init>(r2)
            int r2 = r7.f70615a
            r0.append(r2)
            java.lang.String r2 = " errCode: "
            r0.append(r2)
            int r2 = r7.f70616b
            r0.append(r2)
            java.lang.String r2 = " errMsg: "
            r0.append(r2)
            java.lang.String r7 = r7.f70617c
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "Finder.LiveBoxSlice"
            com.tencent.mars.xlog.Log.e(r0, r7)
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.c0.call(java.lang.Object):java.lang.Object");
    }
}
