package hr3;

/* loaded from: classes8.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f284131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f284131d = contactMoreInfoUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r6 != null) goto L24;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            pr3.c r5 = (pr3.c) r5
            com.tencent.mm.storage.z3 r6 = (com.tencent.mm.storage.z3) r6
            java.lang.String r0 = "$this$item"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "contact"
            kotlin.jvm.internal.o.g(r6, r0)
            int r0 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI r0 = r4.f284131d
            r0.getClass()
            java.lang.String r1 = c01.z1.r()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r6.d1()     // Catch: java.lang.Throwable -> L4c
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L2c
            c01.fb r6 = c01.fb.b()     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L48
            java.lang.String r6 = r6.f37191e     // Catch: java.lang.Throwable -> L4c
            goto L49
        L2c:
            android.content.Intent r1 = r0.getIntent()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "Contact_Signature"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L48
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 == 0) goto L46
            java.lang.String r6 = r6.V     // Catch: java.lang.Throwable -> L4c
            goto L49
        L46:
            r6 = r1
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 != 0) goto L7a
            goto L78
        L4c:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getMessage()
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            java.lang.Throwable r3 = r6.getCause()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r6 = jz5.a.b(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "MicroMsg.ContactMoreInfoUI"
            com.tencent.mars.xlog.Log.i(r1, r6)
        L78:
            java.lang.String r6 = ""
        L7a:
            java.lang.CharSequence r6 = r26.n0.u0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Class<le0.x> r1 = le0.x.class
            i95.m r1 = i95.n0.c(r1)
            le0.x r1 = (le0.x) r1
            ke0.e r1 = (ke0.e) r1
            r1.getClass()
            android.text.SpannableString r6 = com.tencent.mm.pluginsdk.ui.span.c0.i(r0, r6)
            r5.f357956g = r6
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.w2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
