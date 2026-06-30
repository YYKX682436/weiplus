package ox1;

/* loaded from: classes12.dex */
public class s implements ox1.a {

    /* renamed from: J, reason: collision with root package name */
    public static volatile ox1.s f349614J;
    public static boolean K;

    /* renamed from: a, reason: collision with root package name */
    public boolean f349615a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f349616b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f349617c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f349618d = 14;

    /* renamed from: e, reason: collision with root package name */
    public int f349619e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f349620f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f349621g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f349622h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f349623i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f349624j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f349625k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f349626l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f349627m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int[] f349628n = null;

    /* renamed from: o, reason: collision with root package name */
    public int[] f349629o = null;

    /* renamed from: p, reason: collision with root package name */
    public int[] f349630p = null;

    /* renamed from: q, reason: collision with root package name */
    public int[] f349631q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.PopupWindow f349632r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.PopupWindow f349633s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.PopupWindow f349634t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.PopupWindow f349635u = null;

    /* renamed from: v, reason: collision with root package name */
    public mx1.a f349636v = null;

    /* renamed from: w, reason: collision with root package name */
    public ox1.e f349637w = null;

    /* renamed from: x, reason: collision with root package name */
    public ox1.c f349638x = null;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f349639y = null;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f349640z = null;
    public com.tencent.mm.sdk.platformtools.n3 A = null;
    public android.widget.TextView B = null;
    public android.widget.TextView C = null;
    public android.widget.TextView D = null;
    public android.widget.TextView E = null;
    public android.widget.TextView F = null;
    public android.widget.TextView G = null;
    public android.widget.TextView H = null;
    public android.widget.TextView I = null;

    public s() {
        K = false;
    }

    public static boolean a(ox1.s sVar) {
        if (sVar.m() != 3) {
            return false;
        }
        for (int i17 = sVar.f349637w.f349595a; i17 <= sVar.f349637w.f349597c; i17++) {
            ix1.a l17 = nx1.d.q().l(i17);
            if (l17 != null && l17.b() == 4 && ((ix1.n) l17).f295349w.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static ox1.s h() {
        if (f349614J == null) {
            synchronized (nx1.d.class) {
                if (f349614J == null) {
                    f349614J = new ox1.s();
                }
            }
        }
        return f349614J;
    }

    public void A(boolean z17, boolean z18, long j17) {
        if (K) {
            n();
            p();
            E(true, 50L);
            x(z17);
            this.A.postDelayed(new ox1.k(this, z18), j17);
        }
    }

    public final boolean B(int i17, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.PopupWindow popupWindow, int i18, int i19) {
        int i27;
        if (K && recyclerView != null && popupWindow != null && i19 >= k(recyclerView)) {
            int i28 = this.f349624j;
            mx1.a aVar = this.f349636v;
            if (aVar != null) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
                i27 = (editorUI.f96509s ? com.tencent.mm.sdk.platformtools.d2.a(editorUI) : 0) + ((com.tencent.mm.plugin.component.editor.EditorUI) this.f349636v).c7();
            } else {
                i27 = 0;
            }
            if (i19 <= i28 - i27) {
                if (popupWindow.isShowing()) {
                    popupWindow.update(i18, i19, -1, -1, false);
                    u(i17, i18, i19);
                } else {
                    popupWindow.showAtLocation(recyclerView, 0, i18, i19);
                    u(i17, i18, i19);
                }
                if (i17 != 2) {
                    return true;
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f349640z;
                if (b4Var == null) {
                    this.f349640z = new com.tencent.mm.sdk.platformtools.b4(new ox1.l(this), false);
                } else {
                    b4Var.d();
                }
                this.f349640z.c(3000L, 0L);
                return true;
            }
        }
        return false;
    }

    public final boolean C(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int i19;
        if (K && recyclerView != null && this.f349635u != null && i18 >= k(recyclerView)) {
            int i27 = this.f349624j;
            mx1.a aVar = this.f349636v;
            if (aVar != null) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
                i19 = (editorUI.f96509s ? com.tencent.mm.sdk.platformtools.d2.a(editorUI) : 0) + ((com.tencent.mm.plugin.component.editor.EditorUI) this.f349636v).c7();
            } else {
                i19 = 0;
            }
            if (i18 <= i27 - i19) {
                if (this.f349635u.isShowing()) {
                    this.f349635u.update(i17, i18, -1, -1, false);
                    return true;
                }
                this.f349635u.showAtLocation(recyclerView, 0, i17, i18);
                return true;
            }
        }
        return false;
    }

    public void D(android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        if (!K || view == null || view2 == null || view3 == null || this.f349637w == null) {
            return;
        }
        int g17 = g(i17);
        if (g17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 1) {
            ox1.e eVar = this.f349637w;
            if (eVar.f349596b == eVar.f349598d) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(4);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(4);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 2) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view2, arrayList9.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view3, arrayList10.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 3) {
            if (this.f349637w.f349598d == 0) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(4);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view2, arrayList12.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(4);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view3, arrayList13.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view, arrayList14.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(0);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view2, arrayList15.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(4);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view3, arrayList16.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 != 4) {
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view, arrayList17.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(4);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view2, arrayList18.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(4);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(view3, arrayList19.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f349637w.f349596b == 0) {
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList20.add(0);
            java.util.Collections.reverse(arrayList20);
            yj0.a.d(view, arrayList20.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            arrayList21.add(4);
            java.util.Collections.reverse(arrayList21);
            yj0.a.d(view2, arrayList21.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(0);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view3, arrayList22.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
        arrayList23.add(8);
        java.util.Collections.reverse(arrayList23);
        yj0.a.d(view, arrayList23.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(4);
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(view2, arrayList24.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList25 = new java.util.ArrayList();
        arrayList25.add(4);
        java.util.Collections.reverse(arrayList25);
        yj0.a.d(view3, arrayList25.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void E(boolean z17, long j17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (!K || (n3Var = this.A) == null) {
            return;
        }
        n3Var.postDelayed(new ox1.j(this, z17), j17);
    }

    public final int F(int i17, int i18, int i19) {
        boolean v17;
        int i27;
        int i28;
        if (!K) {
            return 0;
        }
        if (i17 == 2) {
            v17 = v(i18, i19, i18, i19);
        } else if (i17 == 3) {
            ox1.e eVar = this.f349637w;
            if (eVar == null || i18 > (i27 = eVar.f349597c) || (i18 == i27 && i19 >= eVar.f349598d)) {
                return 1;
            }
            v17 = v(i18, i19, i27, eVar.f349598d);
        } else {
            if (i17 != 4) {
                return 0;
            }
            ox1.e eVar2 = this.f349637w;
            if (eVar2 == null || i18 < (i28 = eVar2.f349595a) || (i18 == i28 && i19 <= eVar2.f349596b)) {
                return 1;
            }
            v17 = v(i28, eVar2.f349596b, i18, i19);
        }
        return v17 ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(boolean r19) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.G(boolean):void");
    }

    public final void b() {
        mx1.a aVar = this.f349636v;
        if (aVar != null) {
            aVar.b5();
        }
    }

    public void c() {
        if (K) {
            v(-1, -1, -1, -1);
            E(true, 0L);
            n();
            p();
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData");
        if (!K) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not init");
            return;
        }
        p();
        int m17 = m();
        if (m17 == 2) {
            f(true, null, "");
        } else if (m17 == 3) {
            e(true, null, "");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not in select");
            r();
        }
    }

    public final java.util.ArrayList e(boolean z17, java.util.ArrayList arrayList, java.lang.String str) {
        int i17;
        boolean z18;
        int i18;
        int i19;
        mx1.a aVar;
        ox1.e l17 = l();
        c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (l17.a() != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
            return null;
        }
        int i27 = l17.f349595a;
        int i28 = l17.f349597c;
        while (true) {
            i17 = 0;
            if (i28 < l17.f349595a) {
                break;
            }
            ix1.a l18 = nx1.d.q().l(i28);
            if (l18 != null) {
                if (i28 == l17.f349597c && l18.b() == 1) {
                    ix1.l lVar = (ix1.l) l18;
                    android.text.SpannableStringBuilder s17 = s(lVar, 0, l17.f349598d, false, z17, "", false);
                    if (!com.tencent.mm.sdk.platformtools.t8.J0(s17)) {
                        ix1.l lVar2 = new ix1.l();
                        lVar2.f295338s = lx1.c.a(s17);
                        lVar2.f295313c = -1;
                        lVar2.f295312b = false;
                        arrayList2.add(lVar2);
                    }
                    if (z17 && com.tencent.mm.sdk.platformtools.t8.K0(lVar.f295338s)) {
                        nx1.d.q().w(i28, true);
                    }
                } else if (i28 == l17.f349595a && l18.b() == 1) {
                    ix1.l lVar3 = (ix1.l) l18;
                    android.text.SpannableStringBuilder s18 = s(lVar3, l17.f349596b, 0, true, z17, "", false);
                    if (!com.tencent.mm.sdk.platformtools.t8.J0(s18)) {
                        ix1.l lVar4 = new ix1.l();
                        lVar4.f295338s = lx1.c.a(s18);
                        lVar4.f295313c = -1;
                        lVar4.f295312b = false;
                        arrayList2.add(lVar4);
                    }
                    if (z17 && com.tencent.mm.sdk.platformtools.t8.K0(lVar3.f295338s)) {
                        nx1.d.q().w(i28, true);
                    } else {
                        i27++;
                    }
                } else {
                    arrayList2.add(com.tencent.mm.plugin.component.editor.u1.a(l18));
                    if (z17) {
                        nx1.d.q().w(i28, true);
                    }
                }
            }
            i28--;
        }
        if (z17) {
            int i29 = i27 - 1;
            int i37 = i27 + 1;
            if (arrayList == null || arrayList.size() <= 0) {
                ix1.l lVar5 = new ix1.l();
                lVar5.f295338s = str != null ? str : "";
                lVar5.f295312b = false;
                lVar5.f295313c = -1;
                z18 = true;
                nx1.d.q().a(i27, lVar5, true);
            } else {
                nx1.d q17 = nx1.d.q();
                q17.getClass();
                if (arrayList.size() > 0) {
                    synchronized (q17) {
                        if (q17.f341282a != null) {
                            i18 = i27;
                            i19 = 0;
                            while (i17 < arrayList.size() && i18 >= 0 && i18 <= q17.f341282a.size()) {
                                ix1.a aVar2 = (ix1.a) arrayList.get(i17);
                                if (aVar2 != null) {
                                    q17.u(aVar2);
                                    q17.f341282a.add(i18, aVar2);
                                    i19++;
                                    i18++;
                                    q17.C(aVar2, true);
                                }
                                i17++;
                            }
                            i17 = 1;
                        } else {
                            i18 = i27;
                            i19 = 0;
                        }
                    }
                    if (i17 != 0 && (aVar = q17.f341283b) != null) {
                        aVar.i0(i18 - i19, i19);
                    }
                }
                i37 = i27 + arrayList.size();
                z18 = true;
            }
            nx1.d.q().d(i29, i37, z18);
        }
        java.util.Collections.reverse(arrayList2);
        return arrayList2;
    }

    public final android.text.SpannableStringBuilder f(boolean z17, java.util.ArrayList arrayList, java.lang.String str) {
        java.util.ArrayList arrayList2;
        ox1.e l17 = l();
        c();
        int a17 = l17.a();
        if (a17 != 1 && a17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
            return null;
        }
        ix1.a l18 = nx1.d.q().l(l17.f349595a);
        if (l18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (l18.b() == 1) {
            if (z17 && arrayList != null && arrayList.size() > 0) {
                android.text.SpannableStringBuilder s17 = s((ix1.l) l18, l17.f349596b, l17.f349598d, false, false, "", true);
                nx1.d.q().t(arrayList, 0, l17.f349595a, l17.f349596b, l17.f349598d, true, true);
                nx1.d q17 = nx1.d.q();
                int i17 = l17.f349595a;
                q17.d(i17, arrayList.size() + i17 + 1, true);
                return s17;
            }
            android.text.SpannableStringBuilder s18 = s((ix1.l) l18, l17.f349596b, l17.f349598d, false, z17, str, true);
            mx1.a aVar = this.f349636v;
            if (aVar != null) {
                aVar.j3(l17.f349595a, 0L);
            }
            if (!z17) {
                return s18;
            }
            nx1.d.q().v();
            return s18;
        }
        if (a17 != 1 || !z17) {
            return spannableStringBuilder;
        }
        int i18 = l17.f349596b == 0 ? 1 : 2;
        if (arrayList != null && arrayList.size() > 0) {
            arrayList2 = arrayList;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return spannableStringBuilder;
            }
            arrayList2 = new java.util.ArrayList();
            ix1.l lVar = new ix1.l();
            lVar.f295338s = str;
            lVar.f295312b = false;
            lVar.f295313c = -1;
            arrayList2.add(lVar);
        }
        nx1.d.q().t(arrayList2, i18, l17.f349595a, l17.f349596b, l17.f349598d, true, true);
        nx1.d q18 = nx1.d.q();
        int i19 = l17.f349595a;
        q18.d(i19 - 1, i19 + arrayList2.size() + 1, true);
        return spannableStringBuilder;
    }

    public int g(int i17) {
        ox1.e eVar;
        int i18;
        int i19;
        if (K && this.f349637w != null && m() != 0 && i17 >= (i18 = (eVar = this.f349637w).f349595a) && i17 <= (i19 = eVar.f349597c)) {
            if (i17 == i18 && i17 == i19) {
                return 1;
            }
            if (i17 > i18 && i17 < i19) {
                return 2;
            }
            if (i17 == i18 && i17 < i19) {
                return 4;
            }
            if (i17 > i18 && i17 == i19) {
                return 3;
            }
        }
        return 0;
    }

    public final androidx.recyclerview.widget.RecyclerView i() {
        mx1.a aVar = this.f349636v;
        if (aVar != null) {
            return ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).f96497d;
        }
        return null;
    }

    public final int j() {
        mx1.a aVar;
        mx1.a aVar2 = this.f349636v;
        int i17 = 0;
        if (aVar2 != null) {
            com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar2;
            if (editorUI.f96509s) {
                i17 = com.tencent.mm.sdk.platformtools.d2.a(editorUI);
            }
        }
        if (i17 == 0 && (aVar = this.f349636v) != null) {
            i17 = ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).c7();
        }
        if (i17 == 0) {
            i17 = 150;
        }
        return this.f349624j - i17;
    }

    public final int k(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.getLocationOnScreen(this.f349628n);
            if (q(this.f349628n)) {
                return this.f349628n[1];
            }
        }
        return 150;
    }

    public ox1.e l() {
        if (!K) {
            return new ox1.e();
        }
        if (this.f349637w == null) {
            this.f349637w = new ox1.e();
        }
        ox1.e eVar = this.f349637w;
        return new ox1.e(eVar.f349595a, eVar.f349596b, eVar.f349597c, eVar.f349598d);
    }

    public int m() {
        if (!K) {
            return 0;
        }
        if (this.f349637w == null) {
            this.f349637w = new ox1.e();
        }
        return this.f349637w.a();
    }

    public void n() {
        if (K) {
            o(2);
            o(3);
            o(4);
        }
    }

    public final boolean o(int i17) {
        android.widget.PopupWindow popupWindow;
        android.widget.PopupWindow popupWindow2;
        android.widget.PopupWindow popupWindow3;
        ox1.c cVar = this.f349638x;
        if (cVar != null && cVar.f349581a == i17 && cVar.a() == 1) {
            return false;
        }
        if (i17 == 2 && (popupWindow3 = this.f349632r) != null) {
            popupWindow3.dismiss();
            u(2, -1, -1);
        } else if (i17 == 3 && (popupWindow2 = this.f349633s) != null) {
            popupWindow2.dismiss();
            u(3, -1, -1);
        } else {
            if (i17 != 4 || (popupWindow = this.f349634t) == null) {
                return false;
            }
            popupWindow.dismiss();
            u(4, -1, -1);
        }
        return true;
    }

    public void p() {
        android.widget.PopupWindow popupWindow = this.f349635u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean q(int[] iArr) {
        return (!K || iArr == null || iArr.length != 2 || iArr[0] == -1 || iArr[1] == -1) ? false : true;
    }

    public final void r() {
        mx1.a aVar = this.f349636v;
        if (aVar != null) {
            com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
            dp.a.makeText(editorUI.getContext(), editorUI.getString(com.tencent.mm.R.string.hfp), 0).show();
        }
    }

    public final android.text.SpannableStringBuilder s(ix1.l lVar, int i17, int i18, boolean z17, boolean z18, java.lang.String str, boolean z19) {
        android.text.Spanned a17;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: textDataItem is null");
            return null;
        }
        android.text.Spanned a18 = lx1.a.a(lVar.f295338s);
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: spannedText is null");
            return null;
        }
        if (z17) {
            i18 = a18.length();
        }
        if (str == null) {
            str = "";
        }
        if (i17 < 0 || i17 > a18.length() || i18 < 0 || i18 > a18.length() || i17 > i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: incorrect offset");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) a18.subSequence(0, i17);
        android.text.SpannableStringBuilder spannableStringBuilder2 = (android.text.SpannableStringBuilder) a18.subSequence(i17, i18);
        android.text.SpannableStringBuilder spannableStringBuilder3 = (android.text.SpannableStringBuilder) a18.subSequence(i18, a18.length());
        if (z18) {
            i18 = spannableStringBuilder.length();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (a17 = lx1.a.a(str)) != null) {
                i18 += a17.length();
            }
            lVar.f295338s = lx1.c.a(spannableStringBuilder) + str + lx1.c.a(spannableStringBuilder3);
        }
        if (z19) {
            lVar.f295312b = true;
            lVar.f295313c = i18;
        } else {
            lVar.f295312b = false;
            lVar.f295313c = -1;
        }
        return spannableStringBuilder2;
    }

    public final boolean t(android.view.View view, boolean z17) {
        if (view == null) {
            return false;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    public final void u(int i17, int i18, int i19) {
        int[] iArr;
        if (K) {
            if (i17 == 2) {
                int[] iArr2 = this.f349629o;
                if (iArr2 == null || iArr2.length != 2) {
                    return;
                }
                iArr2[0] = i18;
                iArr2[1] = i19;
                return;
            }
            if (i17 != 3) {
                if (i17 == 4 && (iArr = this.f349631q) != null && iArr.length == 2) {
                    iArr[0] = i18;
                    iArr[1] = i19;
                    return;
                }
                return;
            }
            int[] iArr3 = this.f349630p;
            if (iArr3 == null || iArr3.length != 2) {
                return;
            }
            iArr3[0] = i18;
            iArr3[1] = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(int r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = ox1.s.K
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ox1.e r0 = r3.f349637w
            if (r0 != 0) goto L12
            ox1.e r0 = new ox1.e
            r0.<init>(r4, r5, r6, r7)
            r3.f349637w = r0
            goto L2a
        L12:
            int r2 = r0.f349595a
            if (r2 != r4) goto L22
            int r2 = r0.f349596b
            if (r2 != r5) goto L22
            int r2 = r0.f349597c
            if (r2 != r6) goto L22
            int r2 = r0.f349598d
            if (r2 == r7) goto L2b
        L22:
            r0.f349595a = r4
            r0.f349596b = r5
            r0.f349597c = r6
            r0.f349598d = r7
        L2a:
            r1 = 1
        L2b:
            if (r1 == 0) goto L37
            ox1.e r4 = r3.f349637w
            int r5 = r4.f349595a
            int r5 = r4.f349596b
            int r5 = r4.f349597c
            int r4 = r4.f349598d
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.v(int, int, int, int):boolean");
    }

    public final void w(android.widget.TextView textView, int i17) {
        if (textView != null) {
            textView.setTextSize(1, i17);
        }
    }

    public void x(boolean z17) {
        if (K) {
            androidx.recyclerview.widget.RecyclerView i17 = i();
            int m17 = m();
            if (i17 == null || m17 == 0 || (m17 == 1 && !z17)) {
                n();
                return;
            }
            android.view.View b17 = ox1.t.b(i17, this.f349637w.f349595a);
            android.view.View b18 = ox1.t.b(i17, this.f349637w.f349597c);
            if (m17 == 1) {
                o(3);
                o(4);
                y(2, i17, b17, this.f349637w.f349596b);
            } else {
                o(2);
                y(3, i17, b17, this.f349637w.f349596b);
                y(4, i17, b18, this.f349637w.f349598d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r10, androidx.recyclerview.widget.RecyclerView r11, android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.y(int, androidx.recyclerview.widget.RecyclerView, android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(boolean r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.z(boolean):void");
    }
}
