package yc5;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final yc5.m f460914a = new yc5.m();

    public final void a(java.util.ArrayList snapshotList) {
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        int i17 = 0;
        while (i17 < snapshotList.size()) {
            java.lang.Object obj = snapshotList.get(i17);
            uc5.k0 k0Var = obj instanceof uc5.k0 ? (uc5.k0) obj : null;
            if (k0Var == null) {
                i17++;
            } else {
                int i18 = i17 + 1;
                int i19 = i18;
                while (i19 < snapshotList.size()) {
                    java.lang.Object obj2 = snapshotList.get(i19);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    uc5.l0 l0Var = (uc5.l0) obj2;
                    if (!(l0Var instanceof uc5.j0) || !kotlin.jvm.internal.o.b(((uc5.j0) l0Var).f426511d, k0Var.f426518e)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i19 < snapshotList.size() && (snapshotList.get(i19) instanceof uc5.h0)) {
                    i17 = i18;
                } else {
                    int i27 = i19 - 1;
                    if (i17 <= i27) {
                        while (true) {
                            snapshotList.remove(i27);
                            if (i27 != i17) {
                                i27--;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(android.view.Window window) {
        n3.h2.a(window, false);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.addFlags(512);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    public final void c(android.content.Context context, int i17, long j17, long j18, yz5.l onConfirm) {
        java.lang.String format;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ekd, (android.view.ViewGroup) null);
        em.v1 v1Var = new em.v1(inflate);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        if (v1Var.f254865e == null) {
            v1Var.f254865e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        }
        v1Var.f254865e.setText(context.getResources().getString(i17));
        if (j18 > j17) {
            android.widget.LinearLayout b17 = v1Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper", "showConfirmBottomSheet", "(Landroid/content/Context;IJJLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper", "showConfirmBottomSheet", "(Landroid/content/Context;IJJLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (v1Var.f254863c == null) {
                v1Var.f254863c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
            }
            android.widget.TextView textView = v1Var.f254863c;
            android.content.res.Resources resources = context.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (j18 < 1024) {
                format = j18 + " B";
            } else if (j18 < 1048576) {
                format = java.lang.String.format("%.2f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j18 / 1024.0d)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            } else if (j18 < 1073741824) {
                format = java.lang.String.format("%.2f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j18 / 1048576.0d)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            } else {
                format = java.lang.String.format("%.2f GB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j18 / 1.073741824E9d)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            }
            objArr[0] = format;
            textView.setText(resources.getString(com.tencent.mm.R.string.pbl, objArr));
            v1Var.a().setClickable(false);
            v1Var.a().setChecked(false);
            v1Var.b().setOnClickListener(new yc5.i(v1Var));
        } else {
            android.widget.LinearLayout b18 = v1Var.b();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b18, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b18, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper", "showConfirmBottomSheet", "(Landroid/content/Context;IJJLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper", "showConfirmBottomSheet", "(Landroid/content/Context;IJJLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (v1Var.f254867g == null) {
            v1Var.f254867g = (com.tencent.mm.ui.widget.button.WeButton) inflate.findViewById(com.tencent.mm.R.id.b5i);
        }
        v1Var.f254867g.setOnClickListener(new yc5.j(y1Var));
        if (v1Var.f254864d == null) {
            v1Var.f254864d = (com.tencent.mm.ui.widget.button.WeButton) inflate.findViewById(com.tencent.mm.R.id.c9z);
        }
        v1Var.f254864d.setOnClickListener(new yc5.k(onConfirm, v1Var, y1Var));
        y1Var.k(inflate);
        y1Var.s();
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        android.view.Window b19 = y1Var.b();
        if (b19 != null) {
            f460914a.b(b19);
            yc5.h hVar = new yc5.h(inflate.getPaddingBottom());
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(inflate, hVar);
            n3.y0.c(inflate);
        }
    }
}
