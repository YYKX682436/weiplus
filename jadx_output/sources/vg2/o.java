package vg2;

/* loaded from: classes3.dex */
public final class o extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f436545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView f436546e;

    public o(com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView, java.util.List itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f436546e = finderRandomAnimTextView;
        this.f436545d = itemList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f436545d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setText("x" + ((java.lang.String) this.f436545d.get(i17)));
            com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = this.f436546e;
            textView.setTextSize(1, finderRandomAnimTextView.f111657f2);
            textView.setTextColor(-1);
            textView.setIncludeFontPadding(false);
            try {
                textView.setTypeface(android.graphics.Typeface.createFromAsset(finderRandomAnimTextView.getContext().getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f436546e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vg2.n(new com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView(context));
    }
}
