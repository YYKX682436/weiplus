package fa;

/* loaded from: classes13.dex */
public class e extends fa.d {
    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        android.graphics.Rect rect = this.f260581b;
        copyBounds(rect);
        outline.setOval(rect);
    }
}
