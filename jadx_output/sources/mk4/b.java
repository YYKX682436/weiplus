package mk4;

/* loaded from: classes15.dex */
public interface b {
    void a(int i17, int i18);

    android.graphics.Bitmap getBitmap();

    int getScaleType();

    android.view.Surface getSurface();

    int getVideoHeight();

    int getVideoWidth();

    void reset();

    void setCropRect(android.graphics.Rect rect);

    void setOpaqueInfo(boolean z17);

    void setScaleType(int i17);

    void setSurfaceListener(mk4.a aVar);

    void setTagPrefix(java.lang.String str);
}
