package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f210489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f210490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210491h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f210492i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.core.widget.NestedScrollView f210493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f210494n;

    public i8(android.view.View view, android.view.View view2, android.content.Context context, int i17, android.view.View view3, float f17, androidx.core.widget.NestedScrollView nestedScrollView, boolean z17) {
        this.f210487d = view;
        this.f210488e = view2;
        this.f210489f = context;
        this.f210490g = i17;
        this.f210491h = view3;
        this.f210492i = f17;
        this.f210493m = nestedScrollView;
        this.f210494n = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3 = this.f210487d;
        if (view3 == null || (view = this.f210488e) == null) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.topMargin;
        int i18 = this.f210490g;
        android.content.Context context = this.f210489f;
        int b17 = i65.a.b(context, i18);
        if (view3.getMeasuredHeight() <= 0 || (view2 = this.f210491h) == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i17 == b17) {
                return;
            } else {
                marginLayoutParams.topMargin = b17;
            }
        } else {
            int height = (int) (((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight() - this.f210492i);
            int[] iArr = new int[2];
            if (view2.getTag(view2.getId()) == null) {
                view2.getLocationOnScreen(iArr);
                view2.setTag(view2.getId(), iArr);
            } else {
                iArr = (int[]) view2.getTag(view2.getId());
            }
            androidx.core.widget.NestedScrollView nestedScrollView = this.f210493m;
            if (nestedScrollView != null && height >= iArr[1] + view2.getMeasuredHeight() + b17 + view.getMeasuredHeight()) {
                int j17 = ((height - com.tencent.mm.ui.bl.j(context)) - (this.f210494n ? 0 : o25.n1.a(context))) - view.getMeasuredHeight();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (i17 == j17) {
                    return;
                }
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) nestedScrollView.getChildAt(0);
                if (com.tencent.mm.sdk.platformtools.t8.C0(view.getTag(), "no_first")) {
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    viewGroup.addView(view);
                } else {
                    nestedScrollView.removeView(viewGroup);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                    android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
                    relativeLayout.addView(viewGroup);
                    relativeLayout.setLayoutParams(layoutParams);
                    nestedScrollView.addView(relativeLayout);
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    relativeLayout.addView(view);
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin = j17;
                marginLayoutParams2.bottomMargin = 0;
                view.setLayoutParams(marginLayoutParams2);
                android.view.View view4 = this.f210488e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTag("no_first");
                nestedScrollView.requestLayout();
                return;
            }
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i17 == b17) {
                return;
            }
            android.view.ViewParent parent = view.getParent();
            ((android.view.ViewGroup) view.getParent()).removeView(view);
            ((android.view.ViewGroup) view2.getParent()).addView(view);
            if ((view2.getParent() instanceof android.widget.LinearLayout) && (parent instanceof android.widget.RelativeLayout)) {
                marginLayoutParams = new android.widget.LinearLayout.LayoutParams(marginLayoutParams);
            }
            marginLayoutParams.topMargin = b17;
        }
        android.view.View view5 = this.f210488e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }
}
