package lf2;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f318276d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f318277e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f318278f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f318279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View mItemView) {
        super(mItemView);
        kotlin.jvm.internal.o.g(mItemView, "mItemView");
        this.f318276d = mItemView;
        this.f318277e = mItemView.findViewById(com.tencent.mm.R.id.rt8);
        this.f318278f = (android.widget.ImageView) mItemView.findViewById(com.tencent.mm.R.id.f485465rt4);
        this.f318279g = (android.widget.TextView) mItemView.findViewById(com.tencent.mm.R.id.rt7);
    }
}
