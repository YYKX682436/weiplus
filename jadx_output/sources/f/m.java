package f;

/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f257989a = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static void a(androidx.activity.ComponentActivity componentActivity, n0.g1 g1Var, yz5.p content, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            g1Var = null;
        }
        kotlin.jvm.internal.o.g(componentActivity, "<this>");
        kotlin.jvm.internal.o.g(content, "content");
        android.view.View childAt = ((android.view.ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView = childAt instanceof androidx.compose.ui.platform.ComposeView ? (androidx.compose.ui.platform.ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(g1Var);
            composeView.setContent(content);
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(g1Var);
        composeView2.setContent(content);
        android.view.View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "window.decorView");
        if (androidx.lifecycle.n1.a(decorView) == null) {
            decorView.setTag(com.tencent.mm.R.id.p28, componentActivity);
        }
        if (androidx.lifecycle.o1.a(decorView) == null) {
            decorView.setTag(com.tencent.mm.R.id.p2_, componentActivity);
        }
        if (o4.j.a(decorView) == null) {
            o4.j.b(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, f257989a);
    }
}
