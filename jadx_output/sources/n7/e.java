package n7;

/* loaded from: classes13.dex */
public abstract class e extends n7.k {

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Animatable f335230f;

    public e(android.widget.ImageView imageView) {
        super(imageView);
    }

    @Override // n7.h
    public void b(android.graphics.drawable.Drawable drawable) {
        n7.j jVar = this.f335237e;
        android.view.ViewTreeObserver viewTreeObserver = jVar.f335233a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(jVar.f335235c);
        }
        jVar.f335235c = null;
        ((java.util.ArrayList) jVar.f335234b).clear();
        android.graphics.drawable.Animatable animatable = this.f335230f;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f335230f = null;
        ((android.widget.ImageView) this.f335236d).setImageDrawable(drawable);
    }

    @Override // n7.h
    public void c(java.lang.Object obj, o7.c cVar) {
        i(obj);
        if (!(obj instanceof android.graphics.drawable.Animatable)) {
            this.f335230f = null;
            return;
        }
        android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) obj;
        this.f335230f = animatable;
        animatable.start();
    }

    @Override // n7.h
    public void g(android.graphics.drawable.Drawable drawable) {
        i(null);
        this.f335230f = null;
        ((android.widget.ImageView) this.f335236d).setImageDrawable(drawable);
    }

    @Override // n7.h
    public void h(android.graphics.drawable.Drawable drawable) {
        i(null);
        this.f335230f = null;
        ((android.widget.ImageView) this.f335236d).setImageDrawable(drawable);
    }

    public abstract void i(java.lang.Object obj);

    @Override // j7.k
    public void onStart() {
        android.graphics.drawable.Animatable animatable = this.f335230f;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // j7.k
    public void onStop() {
        android.graphics.drawable.Animatable animatable = this.f335230f;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
