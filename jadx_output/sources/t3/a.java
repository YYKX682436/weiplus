package t3;

/* loaded from: classes14.dex */
public class a implements android.view.View.OnApplyWindowInsetsListener {
    public a(androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) view;
        boolean z17 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.B = windowInsets;
        drawerLayout.C = z17;
        drawerLayout.setWillNotDraw(!z17 && drawerLayout.getBackground() == null);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
