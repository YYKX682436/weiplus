package um2;

/* loaded from: classes3.dex */
public abstract class h6 {
    public static final void a(um2.x5 x5Var, java.lang.String source, android.view.ViewGroup root, android.view.ViewGroup shoppingListRoot) {
        kotlin.jvm.internal.o.g(x5Var, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(shoppingListRoot, "shoppingListRoot");
        fm2.c cVar = x5Var.f19606c;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i(x5Var.f429032f, source + " attachShoppingListPlugin shoppingListPlugin:" + x5Var.f429021J + '!');
            pm0.v.X(new um2.e6(x5Var, root, shoppingListRoot, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(um2.x5 r13, android.app.Activity r14, android.view.ViewGroup r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r14, r0)
            fm2.c r0 = r13.f19606c
            if (r0 == 0) goto L65
            com.tencent.mm.plugin.finder.live.plugin.ga0 r0 = r13.f429021J
            if (r0 != 0) goto L65
            fh5.e r0 = r13.L
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            fh5.b r0 = r0.f262724c
            kotlin.jvm.internal.o.d(r0)
            boolean r0 = r0.f262719e
            if (r0 != r1) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L65
            fh5.e r0 = r13.L
            if (r0 == 0) goto L34
            java.util.concurrent.Future r0 = r0.f262725d
            kotlin.jvm.internal.o.d(r0)
            xn5.d1 r0 = (xn5.d1) r0
            r0.cancel(r1)
        L34:
            if (r15 != 0) goto L4e
            xy2.b r3 = xy2.b.f458155b
            java.lang.String r4 = "liveInitContentViewError"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r12 = 0
            pm0.z.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = "syncInflateShoppingPlugin root is empty!"
            java.lang.String r13 = r13.f429032f
            com.tencent.mars.xlog.Log.e(r13, r14)
            goto L65
        L4e:
            android.view.LayoutInflater r14 = r14.getLayoutInflater()
            r0 = 2131496169(0x7f0c0ce9, float:1.8615895E38)
            android.view.View r14 = r14.inflate(r0, r15, r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.o.e(r14, r0)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            java.lang.String r0 = "syncInflateShoppingPlugin"
            a(r13, r0, r15, r14)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.h6.b(um2.x5, android.app.Activity, android.view.ViewGroup):void");
    }
}
