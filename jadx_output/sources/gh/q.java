package gh;

/* loaded from: classes14.dex */
public abstract class q {
    public static java.lang.Object a(gh.r rVar) {
        android.view.View thisView = rVar.getThisView();
        if (thisView == null) {
            return null;
        }
        if (thisView instanceof android.view.TextureView) {
            return ((android.view.TextureView) thisView).getSurfaceTexture();
        }
        if (thisView instanceof android.view.SurfaceView) {
            return ((android.view.SurfaceView) thisView).getHolder().getSurface();
        }
        return null;
    }
}
