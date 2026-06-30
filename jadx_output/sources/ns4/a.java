package ns4;

/* loaded from: classes8.dex */
public final class a extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f339424d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f339425e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f339426f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f339427g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f339428h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f339429i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ns4.d f339430m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ns4.d dVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f339430m = dVar;
        itemView.setOnClickListener(this);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f486550ln3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f339426f = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        os4.h.m(textView, 24);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f486552ln5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f339427g = textView2;
        os4.h.m(textView2, 14);
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.m7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f339424d = findViewById3;
        if (dVar.f339493i.f339641f || com.tencent.mm.ui.bk.C()) {
            findViewById3.setBackground(dVar.f339493i.f339636a.getResources().getDrawable(com.tencent.mm.R.drawable.bb6, null));
        }
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.pkm);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f339428h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.of_);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f339425e = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.d0b);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f339429i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.d0m);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        ((android.widget.TextView) findViewById7).setTextSize(1, 10.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f339430m.f339492h;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, v17, getPosition(), getPosition());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
