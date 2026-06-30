package zm5;

/* loaded from: classes4.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.w0 f474274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(zm5.w0 w0Var) {
        super(1);
        this.f474274d = w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r3 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r15 = r0.getActivity();
        r1 = new android.content.Intent(r0.getContext(), (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryGalleryUI.class);
        r1.putExtra("KEY_IMAGE_CURRENT_INDEX", r3);
        r1.putParcelableArrayListExtra("KEY_IMAGE_DATA", r0.f474283h);
        r0 = new java.util.ArrayList();
        r0.add(r1);
        java.util.Collections.reverse(r0);
        yj0.a.d(r15, r0.toArray(), "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r15.startActivity((android.content.Intent) r0.get(0));
        yj0.a.f(r15, "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        return jz5.f0.f302826a;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r15, r0)
            zm5.w0 r0 = r14.f474274d
            java.util.ArrayList r1 = r0.f474283h
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L12:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L33
            java.lang.Object r4 = r1.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L2e
            com.tencent.mm.api.QueryImageData r4 = (com.tencent.mm.api.QueryImageData) r4
            java.lang.String r4 = r4.f53205f
            boolean r4 = kotlin.jvm.internal.o.b(r4, r15)
            if (r4 == 0) goto L2c
            goto L34
        L2c:
            r3 = r6
            goto L12
        L2e:
            kz5.c0.p()
            r15 = 0
            throw r15
        L33:
            r3 = r5
        L34:
            if (r3 == r5) goto L8a
            androidx.appcompat.app.AppCompatActivity r15 = r0.getActivity()
            android.content.Intent r1 = new android.content.Intent
            android.app.Activity r4 = r0.getContext()
            java.lang.Class<com.tencent.mm.view.activity.ImageQueryGalleryUI> r5 = com.tencent.mm.view.activity.ImageQueryGalleryUI.class
            r1.<init>(r4, r5)
            java.lang.String r4 = "KEY_IMAGE_CURRENT_INDEX"
            r1.putExtra(r4, r3)
            java.util.ArrayList r0 = r0.f474283h
            java.lang.String r3 = "KEY_IMAGE_DATA"
            r1.putParcelableArrayListExtra(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r7 = r0.toArray()
            java.lang.String r8 = "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2"
            java.lang.String r9 = "invoke"
            java.lang.String r10 = "(Ljava/lang/String;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r15
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r0.get(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r15.startActivity(r0)
            java.lang.String r7 = "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2"
            java.lang.String r8 = "invoke"
            java.lang.String r9 = "(Ljava/lang/String;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
        L8a:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: zm5.u0.invoke(java.lang.Object):java.lang.Object");
    }
}
