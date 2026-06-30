package jw2;

/* loaded from: classes9.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f302313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView f302314e;

    public e(com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f302314e = recordTypeSelectView;
        this.f302313d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f302314e.f130792e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        android.view.View view = viewHolder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) view;
        com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView = this.f302314e;
        textView.setText((java.lang.CharSequence) recordTypeSelectView.f130792e.get(i17));
        float measureText = textView.getPaint().measureText((java.lang.String) recordTypeSelectView.f130792e.get(i17));
        android.content.Context context = this.f302313d;
        float h17 = measureText + i65.a.h(context, com.tencent.mm.R.dimen.f479714d7);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).setMarginStart(i17 == 0 ? (i65.a.B(context) - ((int) h17)) / 2 : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams2).setMarginEnd(i17 == getItemCount() + (-1) ? (i65.a.B(context) - ((int) h17)) / 2 : 0);
        textView.setAlpha(i17 == recordTypeSelectView.f130793f ? 1.0f : 0.5f);
        textView.setTag(java.lang.Integer.valueOf(i17));
        textView.setOnClickListener(new jw2.c(recordTypeSelectView, i17));
        if (recordTypeSelectView.f130798n) {
            if (i17 == recordTypeSelectView.f130793f) {
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            } else {
                textView.setTypeface(android.graphics.Typeface.DEFAULT);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new jw2.d(android.view.LayoutInflater.from(this.f302313d).inflate(com.tencent.mm.R.layout.f489083b82, parent, false));
    }
}
