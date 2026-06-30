package sm3;

/* loaded from: classes.dex */
public final class g extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f409861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.ViewGroup parent) {
        super(new android.view.View(parent.getContext()));
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f409861d = parent;
        android.view.View view = this.itemView;
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(view.getContext(), com.tencent.mm.R.drawable.ary);
        kotlin.jvm.internal.o.d(drawable);
        view.setBackground(drawable);
    }
}
