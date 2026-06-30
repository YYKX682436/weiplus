package ns4;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns4.d f339460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns4.a f339461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ns4.s sVar, ns4.d dVar, ns4.a aVar) {
        super(0);
        this.f339459d = sVar;
        this.f339460e = dVar;
        this.f339461f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ns4.s sVar = this.f339459d;
        int b17 = i65.a.b(sVar.f339636a, 12) * 2;
        ns4.a aVar = this.f339461f;
        this.f339460e.f339489e = aVar.itemView.getWidth();
        android.view.View view = sVar.f339644i;
        if (view == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        aVar.itemView.getLayoutParams().width = ((view.getWidth() - i65.a.b(sVar.f339636a, 32)) - b17) / 3;
        aVar.itemView.requestLayout();
        return jz5.f0.f302826a;
    }
}
