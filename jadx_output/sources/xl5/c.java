package xl5;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static yz5.a f455134f = xl5.a.f455132d;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f455135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f455136b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.PopupWindow f455137c;

    /* renamed from: d, reason: collision with root package name */
    public xl5.d f455138d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f455139e;

    public c(xl5.f scene, android.view.View mHostView, boolean z17, android.widget.PopupWindow popupWindow) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(mHostView, "mHostView");
        this.f455135a = mHostView;
        this.f455136b = z17;
        this.f455137c = popupWindow;
        this.f455138d = new xl5.e();
        this.f455139e = jz5.h.b(new xl5.b(this));
    }

    public final void a() {
        jz5.f0 f0Var;
        if (android.os.Build.VERSION.SDK_INT >= 28 && this.f455135a.isAttachedToWindow()) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nl5.l lVar = (nl5.l) ((jz5.n) this.f455139e).getValue();
                if (lVar != null) {
                    lVar.f338317a.dismiss();
                    lVar.f338318b.cancel();
                    lVar.f338319c = false;
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        android.widget.PopupWindow popupWindow = this.f455137c;
        android.view.View contentView = popupWindow != null ? popupWindow.getContentView() : null;
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        android.view.View view = contentView;
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "dismissMagnifier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "dismissMagnifier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r11, int r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xl5.c.b(android.view.MotionEvent, int):void");
    }

    public final void c(nl5.l lVar, android.graphics.Rect rect) {
        android.view.View contentView;
        android.graphics.Point point;
        android.widget.PopupWindow popupWindow = this.f455137c;
        if (popupWindow == null || (contentView = popupWindow.getContentView()) == null) {
            return;
        }
        if (rect == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            point = lVar.f338317a.getPosition();
        } else {
            java.lang.Object obj = null;
            if (i17 == 28) {
                android.widget.Magnifier magnifier = lVar.f338317a;
                java.lang.Class<?>[] clsArr = new java.lang.Class[0];
                java.lang.reflect.Method method = null;
                for (java.lang.Class<?> cls = magnifier.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
                    try {
                        method = cls.getDeclaredMethod("getWindowCoords", clsArr);
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (method == null) {
                    new java.lang.Throwable("MB getWindowCoords");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                try {
                    method.setAccessible(true);
                    obj = method.invoke(magnifier, objArr);
                } catch (java.lang.Throwable unused2) {
                }
                point = (android.graphics.Point) obj;
            } else {
                point = null;
            }
        }
        if (point == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i18 = point.x;
        int i19 = android.graphics.Rect.intersects(rect, new android.graphics.Rect(i18, point.y, lVar.f338317a.getWidth() + i18, point.y + lVar.f338317a.getHeight())) ^ true ? 0 : 4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(contentView, arrayList3.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
