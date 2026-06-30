package dd5;

/* loaded from: classes12.dex */
public final class c3 extends uc5.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final dd5.c3 f229108q = new dd5.c3();

    public c3() {
        super(dd5.f3.f229141b.f426539a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(com.tencent.mm.storage.f9 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dd5.a3
            if (r0 == 0) goto L13
            r0 = r11
            dd5.a3 r0 = (dd5.a3) r0
            int r1 = r0.f229088g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229088g = r1
            goto L18
        L13:
            dd5.a3 r0 = new dd5.a3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f229086e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f229088g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r10 = r0.f229085d
            com.tencent.mm.storage.f9 r10 = (com.tencent.mm.storage.f9) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L49
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.p0 r11 = kotlinx.coroutines.q1.f310570c
            dd5.b3 r2 = new dd5.b3
            r4 = 0
            r2.<init>(r10, r4)
            r0.f229085d = r10
            r0.f229088g = r3
            java.lang.Object r11 = kotlinx.coroutines.l.g(r11, r2, r0)
            if (r11 != r1) goto L49
            return r1
        L49:
            jz5.l r11 = (jz5.l) r11
            java.lang.Object r0 = r11.f302833d
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.f302834e
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            dd5.e3 r0 = new dd5.e3
            long r2 = r10.getMsgId()
            java.lang.String r4 = r10.Q0()
            java.lang.String r1 = "getTalker(...)"
            kotlin.jvm.internal.o.f(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r7 = r10.getMsgId()
            r1.append(r7)
            r5 = 95
            r1.append(r5)
            java.lang.String r7 = r10.Q0()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r10 = r10.z0()
            r1.append(r10)
            java.lang.String r5 = r1.toString()
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.t8.u(r11)
            java.lang.String r10 = "formatSecToMin(...)"
            kotlin.jvm.internal.o.f(r7, r10)
            r1 = r0
            r1.<init>(r2, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.c3.A(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.y1 binding = (em.y1) obj;
        dd5.e3 e3Var = (dd5.e3) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (e3Var == null) {
            return;
        }
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        binding.b().setText(e3Var.f229129e);
        zc5.o oVar = context instanceof zc5.o ? (zc5.o) context : null;
        if (oVar == null) {
            return;
        }
        android.widget.ImageView a17 = binding.a();
        kotlin.jvm.internal.o.f(a17, "getContentIv(...)");
        int width = a17.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        int i17 = layoutParams != null ? layoutParams.width : 0;
        if (width < i17) {
            width = i17;
        }
        if (width < 200) {
            width = 200;
        }
        int height = a17.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams2 = a17.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        if (height < i18) {
            height = i18;
        }
        int i19 = height >= 200 ? height : 200;
        java.lang.Object tag = a17.getTag(com.tencent.mm.R.id.h9z);
        f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
        java.lang.String str = bVar != null ? bVar.f260077h : null;
        java.lang.String key = e3Var.f229127c;
        if (kotlin.jvm.internal.o.b(str, key)) {
            return;
        }
        if (bVar != null) {
            oVar.d3().d(bVar.id());
        }
        a17.setTag(com.tencent.mm.R.id.h9z, null);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) m11.b1.Di().f322738e).i(key);
        if (bitmap != null) {
            a17.setImageBitmap(bitmap);
            return;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = f80.b.f260076o;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(a17);
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String thumbPath = e3Var.f229128d;
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        f80.b bVar2 = new f80.b(key, new f80.e(thumbPath, width, i19), weakReference, null);
        a17.setTag(com.tencent.mm.R.id.h9z, bVar2);
        oVar.d3().k(bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        long[] jArr;
        em.y1 binding = (em.y1) obj;
        dd5.e3 e3Var = (dd5.e3) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (e3Var == null) {
            return;
        }
        zc5.p pVar = context instanceof zc5.p ? (zc5.p) context : null;
        if (pVar == null || (jArr = pVar.G()) == null) {
            jArr = new long[]{e3Var.f229125a};
        }
        xc5.c2.f453406f.a(context, e3Var.f229126b, jArr, e3Var.f229125a);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        if (!f9Var.M2()) {
            if (f9Var.isVideo() || f9Var.Y2() || f9Var.getType() == 44) {
                java.lang.Object A = A(f9Var, continuation);
                return A == pz5.a.f359186d ? A : (dd5.e3) A;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideo", "prepareViewModel: unhandled type=" + f9Var.getType());
            return null;
        }
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1, true);
        int i17 = bVar.f432315e;
        java.lang.String string = bVar.getString(i17 + 14);
        java.lang.String b17 = tv.a.b(string);
        long msgId = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        java.lang.String str = f9Var.getMsgId() + '_' + f9Var.Q0() + '_' + string;
        kotlin.jvm.internal.o.d(b17);
        a15.a aVar = (a15.a) bVar.getCustom(i17 + 35);
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.t8.u(aVar != null ? (int) aVar.j() : 0);
        kotlin.jvm.internal.o.f(u17, "formatSecToMin(...)");
        return new dd5.e3(msgId, Q0, str, b17, u17);
    }
}
