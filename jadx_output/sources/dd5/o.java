package dd5;

/* loaded from: classes9.dex */
public final class o extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.o f229233p = new dd5.o();

    public o() {
        super(dd5.r.f229267b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.q qVar = (dd5.q) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (qVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, qVar.f229251a);
        com.tencent.mm.ui.widget.imageview.WeImageView a17 = binding.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeContact$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeContact$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeContact$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeContact$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, qVar.f229254d);
        java.util.Set set = c01.e2.f37117a;
        boolean D3 = com.tencent.mm.storage.z3.D3(qVar.f229253c);
        java.lang.String str = qVar.f229252b;
        if (D3) {
            com.tencent.mm.ui.chatting.viewitems.a0.U(binding.c(), str);
        } else {
            binding.c().setBackgroundResource(com.tencent.mm.R.drawable.bhm);
            com.tencent.mm.ui.chatting.viewitems.a0.T(binding.c(), str, null);
        }
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.q qVar = (dd5.q) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (qVar == null) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = qVar.f229255e;
        com.tencent.mm.ui.chatting.viewitems.wg.a(context, f9Var.Q0(), f9Var.j(), com.tencent.mm.storage.z3.R4(f9Var.Q0()), f9Var.A0() == 0, f9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    @Override // uc5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(android.content.Context r13, com.tencent.mm.storage.f9 r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            java.lang.String r15 = r14.U1()
            r0 = 0
            r1 = 1
            if (r15 == 0) goto L11
            boolean r2 = r26.n0.N(r15)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = r0
            goto L12
        L11:
            r2 = r1
        L12:
            r2 = r2 ^ r1
            r3 = 0
            if (r2 == 0) goto L17
            goto L18
        L17:
            r15 = r3
        L18:
            if (r15 != 0) goto L1b
            return r3
        L1b:
            c01.f r2 = c01.d9.b()
            xg3.m0 r2 = r2.u()
            com.tencent.mm.storage.g9 r2 = (com.tencent.mm.storage.g9) r2
            com.tencent.mm.storage.y8 r2 = r2.D3(r15)
            java.lang.String r4 = r2.f196358a
            if (r4 == 0) goto L36
            int r4 = r4.length()
            if (r4 != 0) goto L34
            goto L36
        L34:
            r4 = r0
            goto L37
        L36:
            r4 = r1
        L37:
            if (r4 == 0) goto L3a
            return r3
        L3a:
            java.lang.String r4 = r2.f196358a
            java.lang.String r5 = ""
            if (r4 != 0) goto L42
            r8 = r5
            goto L43
        L42:
            r8 = r4
        L43:
            int r4 = r2.f196374q
            java.util.Set r6 = c01.e2.f37117a
            boolean r4 = com.tencent.mm.storage.z3.D3(r4)
            boolean r6 = com.tencent.mm.storage.z3.m4(r8)
            m15.a r7 = new m15.a
            r7.<init>()
            r7.fromXml(r15)
            java.lang.String r15 = r7.s()
            r7 = 2131758515(0x7f100db3, float:1.9147996E38)
            if (r6 == 0) goto L8c
            java.lang.Class<j41.b0> r4 = j41.b0.class
            i95.m r4 = i95.n0.c(r4)
            j41.b0 r4 = (j41.b0) r4
            j41.a0 r6 = j41.a0.TYPE_WORDING
            l41.q2 r4 = (l41.q2) r4
            java.lang.String r9 = "openim_card_type_name"
            java.lang.String r15 = r4.Ni(r15, r9, r6)
            if (r15 == 0) goto L7a
            boolean r4 = r26.n0.N(r15)
            if (r4 == 0) goto L7b
        L7a:
            r0 = r1
        L7b:
            if (r0 == 0) goto L8a
            android.content.res.Resources r13 = r13.getResources()
            java.lang.Object[] r15 = new java.lang.Object[]{r3}
            java.lang.String r13 = r13.getString(r7, r15)
            goto Lc3
        L8a:
            r10 = r15
            goto Lc4
        L8c:
            if (r4 == 0) goto Lbf
            java.lang.String r15 = r14.j()
            if (r15 == 0) goto Lad
            c01.f r0 = c01.d9.b()
            xg3.m0 r0 = r0.u()
            com.tencent.mm.storage.g9 r0 = (com.tencent.mm.storage.g9) r0
            com.tencent.mm.storage.y8 r15 = r0.D3(r15)
            int r15 = r15.f196377t
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r15)
            int r1 = r0.intValue()
        Lad:
            if (r1 != 0) goto Lb7
            r15 = 2131758311(0x7f100ce7, float:1.9147582E38)
            java.lang.String r13 = r13.getString(r15)
            goto Lc3
        Lb7:
            r15 = 2131758323(0x7f100cf3, float:1.9147607E38)
            java.lang.String r13 = r13.getString(r15)
            goto Lc3
        Lbf:
            java.lang.String r13 = r13.getString(r7)
        Lc3:
            r10 = r13
        Lc4:
            kotlin.jvm.internal.o.d(r10)
            dd5.q r13 = new dd5.q
            java.lang.String r15 = r2.f196359b
            if (r15 != 0) goto Lcf
            r7 = r5
            goto Ld0
        Lcf:
            r7 = r15
        Ld0:
            int r9 = r2.f196374q
            r6 = r13
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.o.w(android.content.Context, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // uc5.b0, uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlin.jvm.internal.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f426527n;
        eVar.a();
        int color = resources.getColor(com.tencent.mm.R.color.f478502m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        kotlin.jvm.internal.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }
}
