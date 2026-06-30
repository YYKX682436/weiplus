package m95;

/* loaded from: classes13.dex */
public class c extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Picture f325086a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f325087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f325088c;

    public c(android.graphics.Picture picture, int i17) {
        this.f325086a = picture;
        this.f325088c = i17;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        return new m95.d(this.f325086a, this.f325088c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return newDrawable();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        return newDrawable();
    }
}
