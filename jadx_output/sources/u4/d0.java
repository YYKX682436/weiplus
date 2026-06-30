package u4;

/* loaded from: classes13.dex */
public class d0 implements u4.e0 {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Class f424457b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f424458c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f424459d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f424460e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Method f424461f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f424462g;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f424463a;

    public d0(android.view.View view) {
        this.f424463a = view;
    }

    @Override // u4.e0
    public void setVisibility(int i17) {
        android.view.View view = this.f424463a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/transition/GhostViewApi21", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/transition/GhostViewApi21", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
