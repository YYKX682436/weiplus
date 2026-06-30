package dw3;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f244177d;

    public a(android.view.View view) {
        this.f244177d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw3.b bVar = dw3.b.f244179a;
        android.view.View view = this.f244177d;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int a17 = (int) bVar.a(context, view.getPaddingLeft());
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        int a18 = (int) bVar.a(context2, view.getPaddingRight());
        android.content.Context context3 = view.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        int a19 = (int) bVar.a(context3, view.getPaddingTop());
        android.content.Context context4 = view.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        view.setPadding(a17, a19, a18, (int) bVar.a(context4, view.getPaddingBottom()));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width > 0) {
            android.content.Context context5 = view.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            layoutParams.width = (int) bVar.a(context5, layoutParams.width);
        }
        if (layoutParams.height > 0) {
            android.content.Context context6 = view.getContext();
            kotlin.jvm.internal.o.f(context6, "getContext(...)");
            layoutParams.height = (int) bVar.a(context6, layoutParams.height);
        }
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context7 = view.getContext();
            kotlin.jvm.internal.o.f(context7, "getContext(...)");
            layoutParams2.leftMargin = (int) bVar.a(context7, layoutParams2.leftMargin);
            android.content.Context context8 = view.getContext();
            kotlin.jvm.internal.o.f(context8, "getContext(...)");
            layoutParams2.rightMargin = (int) bVar.a(context8, layoutParams2.rightMargin);
            android.content.Context context9 = view.getContext();
            kotlin.jvm.internal.o.f(context9, "getContext(...)");
            layoutParams2.topMargin = (int) bVar.a(context9, layoutParams2.topMargin);
            android.content.Context context10 = view.getContext();
            kotlin.jvm.internal.o.f(context10, "getContext(...)");
            layoutParams2.bottomMargin = (int) bVar.a(context10, layoutParams2.bottomMargin);
        }
        view.setLayoutParams(layoutParams);
    }
}
