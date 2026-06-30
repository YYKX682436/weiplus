package vi1;

/* loaded from: classes7.dex */
public final class l0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f437397d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f437398e;

    public l0(java.lang.String appId, android.content.Context context, java.util.ArrayList phoneItems) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(phoneItems, "phoneItems");
        this.f437397d = context;
        this.f437398e = phoneItems;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f437398e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        boolean z17;
        vi1.j0 holder = (vi1.j0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f437398e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) obj;
        android.widget.TextView textView = holder.f437341e;
        textView.setText(phoneItem.f87400e);
        java.lang.String str = phoneItem.f87399d;
        int length = str.length();
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z17 = true;
                break;
            } else {
                if (!java.lang.Character.isDigit(str.charAt(i18))) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length2 = str.length() - 1;
            for (int i19 = 0; i19 < length2; i19++) {
                sb6.append(str.charAt(i19));
                sb6.append(' ');
            }
            sb6.append(str.charAt(length2));
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            textView.setContentDescription(sb7);
        }
        boolean z18 = phoneItem.f87406n;
        vi1.l0 l0Var = holder.f437340d;
        android.widget.TextView textView2 = holder.f437342f;
        if (z18) {
            textView2.setText(l0Var.f437397d.getString(com.tencent.mm.R.string.a3x));
        } else {
            textView2.setText("");
        }
        int i27 = phoneItem.f87407o ? 0 : 8;
        android.widget.ImageView imageView = holder.f437343g;
        imageView.setVisibility(i27);
        if (phoneItem.f87407o) {
            imageView.setContentDescription(l0Var.f437397d.getString(com.tencent.mm.R.string.g6m));
        }
        if (phoneItem.f87407o) {
            return;
        }
        holder.itemView.setOnClickListener(new vi1.k0(this, phoneItem));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488062ft, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new vi1.j0(this, inflate);
    }
}
