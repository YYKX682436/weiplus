package fl1;

/* loaded from: classes7.dex */
public class k extends fl1.b {
    public com.tencent.mm.ui.base.AuthorizeItemListView X;
    public android.widget.LinearLayout Y;

    public k(android.content.Context context, java.util.List list, java.lang.String str, java.lang.String str2, fl1.f fVar) {
        super(context, com.tencent.mm.R.style.f494793wf);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        str = str == null ? "" : str;
        java.util.ArrayList arrayList = list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList(list);
        if (arrayList == null || arrayList.size() <= 0) {
            throw new java.lang.IllegalArgumentException("scopeInfoList is empty or null");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488007e9, (android.view.ViewGroup) null);
        setContentView(viewGroup);
        l01.d0.f314761a.a((android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.a17), str2, com.tencent.mm.R.drawable.cbh, l01.q0.f314787d);
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.a1p)).setText(context.getString(com.tencent.mm.R.string.ghf, str));
        this.X = (com.tencent.mm.ui.base.AuthorizeItemListView) viewGroup.findViewById(com.tencent.mm.R.id.f483295a81);
        this.X.setAdapter((android.widget.ListAdapter) new fl1.i(arrayList));
        if (arrayList.size() > 5) {
            this.X.f197232d = arrayList.size();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.a8b);
            this.Y = linearLayout;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4b);
            this.Y.setLayoutParams(layoutParams);
        }
        ((android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.ioc)).setOnClickListener(new fl1.c(this, arrayList, fVar, this));
        ((android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.ipb)).setOnClickListener(new fl1.d(this, arrayList, fVar, this));
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new fl1.e(this, fVar));
    }
}
