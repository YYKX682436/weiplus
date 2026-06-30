package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e1 f151040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk4.a f151041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.mv.ui.uic.e1 e1Var, dk4.a aVar, com.tencent.mm.plugin.mv.ui.uic.c1 c1Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f151040d = e1Var;
        this.f151041e = aVar;
        this.f151042f = appCompatActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013 A[SYNTHETIC] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r12 = this;
            com.tencent.mm.plugin.mv.ui.uic.e1 r0 = r12.f151040d
            java.util.HashMap r1 = r0.f151111i
            java.util.Collection r1 = r1.values()
            java.lang.String r2 = "<get-values>(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            jz5.f0 r3 = jz5.f0.f302826a
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L13
            dk4.a r4 = r12.f151041e
            java.lang.Object r4 = r4.f234480q
            boolean r5 = r4 instanceof com.tencent.mm.protocal.protobuf.FinderObject
            r6 = 8
            if (r5 == 0) goto Lca
            r5 = r4
            com.tencent.mm.protocal.protobuf.FinderObject r5 = (com.tencent.mm.protocal.protobuf.FinderObject) r5
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r5.getContact()
            r8 = 0
            if (r7 == 0) goto Lc2
            java.lang.String r7 = r7.getNickname()
            if (r7 == 0) goto Lc2
            int r9 = r7.length()
            r10 = 0
            if (r9 <= 0) goto L4c
            r9 = 1
            goto L4d
        L4c:
            r9 = r10
        L4d:
            if (r9 == 0) goto L50
            goto L51
        L50:
            r7 = r8
        L51:
            if (r7 == 0) goto Lc2
            java.lang.Object r9 = r2.getTag()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.getContact()
            if (r5 == 0) goto L61
            java.lang.String r8 = r5.getUsername()
        L61:
            boolean r5 = kotlin.jvm.internal.o.b(r9, r8)
            if (r5 != 0) goto Lbe
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.Class<le0.x> r8 = le0.x.class
            i95.m r8 = i95.n0.c(r8)
            le0.x r8 = (le0.x) r8
            ke0.e r8 = (ke0.e) r8
            r8.getClass()
            androidx.appcompat.app.AppCompatActivity r8 = r12.f151042f
            android.text.SpannableString r9 = com.tencent.mm.pluginsdk.ui.span.c0.i(r8, r7)
            r5.<init>(r9)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            java.lang.String r11 = "#FF7D90A9"
            int r11 = android.graphics.Color.parseColor(r11)
            r9.<init>(r11)
            int r7 = r7.length()
            r11 = 33
            r5.setSpan(r9, r10, r7, r11)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r9 = 2131772210(0x7f104332, float:1.9175773E38)
            java.lang.String r9 = r8.getString(r9)
            r7.append(r9)
            r7.append(r5)
            r5 = 2131772209(0x7f104331, float:1.917577E38)
            java.lang.String r5 = r8.getString(r5)
            r7.append(r5)
            r2.setText(r7)
            r2.setVisibility(r10)
            com.tencent.mm.plugin.mv.ui.uic.a1 r5 = new com.tencent.mm.plugin.mv.ui.uic.a1
            r5.<init>(r4, r0)
            r2.setOnClickListener(r5)
            goto Lc3
        Lbe:
            r2.setVisibility(r6)
            goto Lc3
        Lc2:
            r3 = r8
        Lc3:
            if (r3 != 0) goto L13
            r2.setVisibility(r6)
            goto L13
        Lca:
            r2.setVisibility(r6)
            goto L13
        Lcf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.b1.invoke():java.lang.Object");
    }
}
