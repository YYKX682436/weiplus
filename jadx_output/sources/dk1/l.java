package dk1;

/* loaded from: classes4.dex */
public final class l extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f233155d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f233156e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f233157f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f233158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup parent) {
        super(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488076g7, parent, false));
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f233155d = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.mal);
        this.f233156e = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.ky6);
        this.f233157f = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.f487302o81);
        this.f233158g = this.itemView.findViewById(com.tencent.mm.R.id.au_);
    }
}
