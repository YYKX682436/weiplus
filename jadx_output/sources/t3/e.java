package t3;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.drawerlayout.widget.b f415356d;

    public e(androidx.drawerlayout.widget.b bVar) {
        this.f415356d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View d17;
        int width;
        androidx.drawerlayout.widget.b bVar = this.f415356d;
        int i17 = bVar.f11172b.f11134o;
        int i18 = bVar.f11171a;
        boolean z17 = i18 == 3;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = bVar.f11174d;
        if (z17) {
            d17 = drawerLayout.d(3);
            width = (d17 != null ? -d17.getWidth() : 0) + i17;
        } else {
            d17 = drawerLayout.d(5);
            width = drawerLayout.getWidth() - i17;
        }
        if (d17 != null) {
            if (((!z17 || d17.getLeft() >= width) && (z17 || d17.getLeft() <= width)) || drawerLayout.g(d17) != 0) {
                return;
            }
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) d17.getLayoutParams();
            bVar.f11172b.u(d17, width, d17.getTop());
            layoutParams.f11164c = true;
            drawerLayout.invalidate();
            android.view.View d18 = drawerLayout.d(i18 == 3 ? 5 : 3);
            if (d18 != null) {
                drawerLayout.b(d18);
            }
            if (drawerLayout.f11158w) {
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = drawerLayout.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                drawerLayout.getChildAt(i19).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            drawerLayout.f11158w = true;
        }
    }
}
