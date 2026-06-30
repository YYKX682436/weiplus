package w03;

/* loaded from: classes5.dex */
public final class l extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity f441887d;

    public l(com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity) {
        this.f441887d = mMFlutterViewActivity;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity = this.f441887d;
        if (mMFlutterViewActivity.f137317r != 0) {
            return false;
        }
        mMFlutterViewActivity.f137317r = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(mMFlutterViewActivity.f137306d, "onFling, velocity:" + f17 + ", velocityY:" + f18 + " firstScrollMills:" + mMFlutterViewActivity.f137317r);
        return false;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity = this.f441887d;
        if (mMFlutterViewActivity.f137317r != 0) {
            return false;
        }
        mMFlutterViewActivity.f137317r = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(mMFlutterViewActivity.f137306d, "onScroll, distanceX:" + f17 + ", distanceY:" + f18 + ", firstScrollMills:" + mMFlutterViewActivity.f137317r);
        return false;
    }
}
