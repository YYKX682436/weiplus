package rn4;

/* loaded from: classes8.dex */
public class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f397968d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f397969e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f397970f = null;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f397968d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        rn4.c cVar = (rn4.c) k3Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f397968d;
        java.lang.String str = ((rn4.b) arrayList.get(i17)).f397964a;
        int i18 = ((rn4.b) arrayList.get(i17)).f397965b;
        cVar.f397966d.setText(str);
        int i19 = this.f397969e;
        android.widget.ImageView imageView = cVar.f397967e;
        if (i19 == i18) {
            imageView.setVisibility(0);
            this.f397970f = imageView;
        } else {
            imageView.setVisibility(8);
        }
        cVar.itemView.setOnClickListener(new rn4.a(this, cVar, i18));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new rn4.c(this, android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.c7v, null));
    }
}
