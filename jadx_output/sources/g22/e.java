package g22;

/* loaded from: classes12.dex */
public final class e extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f267802d;

    /* renamed from: e, reason: collision with root package name */
    public final g22.a f267803e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f267804f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ri0 f267805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View itemView, g22.a aVar) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f267802d = itemView;
        this.f267803e = aVar;
        this.f267804f = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.dav);
        itemView.setOnClickListener(new g22.d(this));
    }
}
