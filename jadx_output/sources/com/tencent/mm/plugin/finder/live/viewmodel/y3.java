package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class y3 extends com.tencent.mm.plugin.finder.live.viewmodel.m3 {

    /* renamed from: p, reason: collision with root package name */
    public r45.v11 f117541p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f117542q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117542q = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.tencent.mm.plugin.finder.live.viewmodel.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T6(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.y3.T6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.tencent.mm.plugin.finder.live.viewmodel.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U6(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.mm.plugin.finder.live.viewmodel.x3
            if (r0 == 0) goto L13
            r0 = r6
            com.tencent.mm.plugin.finder.live.viewmodel.x3 r0 = (com.tencent.mm.plugin.finder.live.viewmodel.x3) r0
            int r1 = r0.f117526g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117526g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.live.viewmodel.x3 r0 = new com.tencent.mm.plugin.finder.live.viewmodel.x3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f117524e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f117526g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f117523d
            com.tencent.mm.plugin.finder.live.viewmodel.y3 r0 = (com.tencent.mm.plugin.finder.live.viewmodel.y3) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L65
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r45.y32 r6 = new r45.y32
            r6.<init>()
            java.lang.String r2 = r5.f117240d
            r4 = 3
            r6.set(r4, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            java.lang.String r2 = xy2.c.e(r2)
            r4 = 6
            r6.set(r4, r2)
            r2 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r4)
            com.tencent.mm.modelbase.i r6 = r6.d()
            r0.f117523d = r5
            r0.f117526g = r3
            java.lang.Object r6 = rm0.h.b(r6, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            r0 = r5
        L65:
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6
            boolean r1 = r6.b()
            if (r1 == 0) goto L88
            com.tencent.mm.protobuf.f r6 = r6.f70618d
            r45.z32 r6 = (r45.z32) r6
            r1 = 0
            if (r6 == 0) goto L79
            java.lang.String r6 = r6.getString(r3)
            goto L7a
        L79:
            r6 = r1
        L7a:
            if (r6 != 0) goto L7e
            java.lang.String r6 = ""
        L7e:
            r0.f117542q = r6
            jz5.l r6 = new jz5.l
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.<init>(r0, r1)
            return r6
        L88:
            jz5.l r0 = new jz5.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r6 = r6.f70617c
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.y3.U6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.viewmodel.m3, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.gs2 gs2Var;
        super.onCreate(bundle);
        r45.v11 v11Var = new r45.v11();
        byte[] byteArrayExtra = getActivity().getIntent().getByteArrayExtra("FinderLiveCashOutMuliAuth.KEY_MULTI_AUTH_DATA");
        if (byteArrayExtra != null) {
            try {
                v11Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        this.f117541p = v11Var;
        java.lang.Object value = ((jz5.n) this.f117244h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        r45.v11 v11Var2 = this.f117541p;
        textView.setText(v11Var2 != null && (gs2Var = (r45.gs2) v11Var2.getCustom(5)) != null && gs2Var.getInteger(8) == 2 ? getActivity().getString(com.tencent.mm.R.string.opf) : getActivity().getString(com.tencent.mm.R.string.opg));
    }
}
