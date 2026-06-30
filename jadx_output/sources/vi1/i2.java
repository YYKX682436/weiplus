package vi1;

/* loaded from: classes7.dex */
public final class i2 implements vi1.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vi1.h0 f437331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437332b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f437333c;

    /* renamed from: d, reason: collision with root package name */
    public final vi1.y f437334d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f437335e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f437336f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f437337g;

    public i2(android.content.Context mContext, vi1.h0 h0Var) {
        android.text.SpannableString spannableString;
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f437331a = h0Var;
        this.f437332b = 3;
        android.view.View inflate = android.view.View.inflate(mContext, com.tencent.mm.R.layout.f488063fu, null);
        this.f437333c = inflate;
        androidx.recyclerview.widget.RecyclerView recyclerView = inflate != null ? (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.kut) : null;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mContext));
        }
        vi1.y yVar = new vi1.y(mContext, new java.util.ArrayList(), new vi1.g2(this));
        this.f437334d = yVar;
        if (recyclerView != null) {
            recyclerView.setAdapter(yVar);
        }
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kuk) : null;
        this.f437335e = textView;
        if (textView != null) {
            textView.setOnClickListener(new vi1.h2(this));
        }
        this.f437336f = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.kus) : null;
        android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kur) : null;
        if (textView2 != null) {
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (textView2 != null) {
            if (h0Var != null) {
                vi1.b2 b2Var = (vi1.b2) h0Var;
                spannableString = vi1.l1.f437399a.a().ka(b2Var.f437277a, b2Var.f437278b, b2Var.f437279c);
            } else {
                spannableString = null;
            }
            textView2.setText(spannableString);
        }
        this.f437337g = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kul) : null;
    }

    public void a(boolean z17, java.util.List phoneItems) {
        kotlin.jvm.internal.o.g(phoneItems, "phoneItems");
        vi1.y yVar = this.f437334d;
        if (yVar != null) {
            yVar.f437505g = z17;
        }
        if (yVar != null) {
            yVar.notifyDataSetChanged();
        }
        if (yVar != null) {
            yVar.f437505g = z17;
            yVar.f437503e = (java.util.ArrayList) phoneItems;
            yVar.notifyDataSetChanged();
        }
        android.view.View view = this.f437336f;
        int i17 = this.f437332b;
        android.widget.TextView textView = this.f437335e;
        if (z17 || phoneItems.size() >= i17) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView2 = this.f437337g;
        if (z17) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        } else if (phoneItems.size() >= i17) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
        } else {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        }
    }
}
