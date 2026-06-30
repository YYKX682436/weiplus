package vi1;

/* loaded from: classes7.dex */
public final class y extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f437502d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f437503e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f437504f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f437505g;

    public y(android.content.Context context, java.util.ArrayList phoneItems, yz5.l onPhoneItemRemove) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(phoneItems, "phoneItems");
        kotlin.jvm.internal.o.g(onPhoneItemRemove, "onPhoneItemRemove");
        this.f437502d = context;
        this.f437503e = phoneItems;
        this.f437504f = onPhoneItemRemove;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f437503e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vi1.x holder = (vi1.x) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f437503e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) obj;
        holder.f437491f.setText(phoneItem.f87400e);
        boolean z17 = phoneItem.f87406n;
        vi1.y yVar = holder.f437489d;
        android.widget.TextView textView = holder.f437492g;
        if (z17) {
            textView.setText(yVar.f437502d.getString(com.tencent.mm.R.string.a3x));
        } else {
            textView.setText("");
        }
        boolean z18 = yVar.f437505g;
        android.widget.ImageView imageView = holder.f437490e;
        if (!z18 || phoneItem.f87406n) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new vi1.w(holder, phoneItem));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488062ft, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new vi1.x(this, inflate);
    }
}
