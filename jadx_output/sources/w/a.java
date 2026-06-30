package w;

/* loaded from: classes13.dex */
public class a implements w.c {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.Drawable f441809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.cardview.widget.CardView f441810b;

    public a(androidx.cardview.widget.CardView cardView) {
        this.f441810b = cardView;
    }

    public void a(int i17, int i18, int i19, int i27) {
        androidx.cardview.widget.CardView cardView = this.f441810b;
        cardView.f10387g.set(i17, i18, i19, i27);
        android.graphics.Rect rect = cardView.f10386f;
        super/*android.view.View*/.setPadding(i17 + rect.left, i18 + rect.top, i19 + rect.right, i27 + rect.bottom);
    }
}
