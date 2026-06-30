package ww1;

/* loaded from: classes5.dex */
public class y extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener, android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f450354d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f450355e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f450356f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.w f450357g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextWatcher f450358h;

    public y(android.content.Context context, java.util.List list) {
        this.f450356f = context;
        this.f450354d = list;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f450358h.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f450358h.beforeTextChanged(charSequence, i17, i18, i19);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        boolean z17 = this.f450355e;
        java.util.List list = this.f450354d;
        return z17 ? list.size() + 1 : list.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ww1.x xVar = (ww1.x) k3Var;
        xVar.itemView.setTag(java.lang.Integer.valueOf(i17));
        java.util.List list = this.f450354d;
        int size = list.size();
        android.widget.LinearLayout linearLayout = xVar.f450328f;
        android.widget.TextView textView = xVar.f450329g;
        if (i17 == size) {
            textView.setText(com.tencent.mm.R.string.b_j);
            linearLayout.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdy, this.f450356f.getString(com.tencent.mm.R.string.b_j)));
        } else {
            textView.setText(((r45.hg5) list.get(i17)).f376139d);
            linearLayout.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdy, ((r45.hg5) list.get(i17)).f376139d));
        }
        if (i17 == 0) {
            android.view.View view = xVar.f450330h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xVar.f450327e.setVisibility(4);
        xVar.f450326d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ww1.w wVar = this.f450357g;
        if (wVar != null) {
            wVar.a(view, ((java.lang.Integer) view.getTag()).intValue());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f450356f).inflate(com.tencent.mm.R.layout.f488643zd, viewGroup, false);
        inflate.setOnClickListener(this);
        ((com.tencent.mm.ui.widget.edittext.PasterEditText) inflate.findViewById(com.tencent.mm.R.id.c3k)).addTextChangedListener(this);
        return new ww1.x(this, inflate);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f450358h.onTextChanged(charSequence, i17, i18, i19);
    }
}
