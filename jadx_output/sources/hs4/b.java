package hs4;

/* loaded from: classes9.dex */
public class b extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f284606d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f284607e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f284608f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f284609g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f284610h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f284611i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hs4.c f284612m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hs4.c cVar, android.view.View view, int i17) {
        super(view);
        this.f284612m = cVar;
        view.setOnClickListener(this);
        this.f284606d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f284608f = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.h5n);
        this.f284611i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m7g);
        this.f284607e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.lhs);
        this.f284609g = weImageView;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d0v);
        this.f284610h = imageView;
        if (i17 == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            imageView.setLayoutParams(layoutParams);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
            weImageView.setIconColor(cVar.f284615f.f284617b.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f284612m.f284613d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, view, getPosition(), getPosition());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
