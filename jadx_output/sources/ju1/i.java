package ju1;

/* loaded from: classes9.dex */
public final class i extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public int f301729d;

    /* renamed from: e, reason: collision with root package name */
    public int f301730e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f301731f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f301732g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f301733h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f301734i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f301735m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView f301736n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f301737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (i17 == 0) {
            android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.bag);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f301731f = (android.widget.TextView) findViewById;
            return;
        }
        if (i17 != 1) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.bvx);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                this.f301731f = (android.widget.TextView) findViewById2;
                android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.bvr);
                kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                this.f301732g = (android.widget.TextView) findViewById3;
                android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.bvv);
                kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                this.f301733h = (android.widget.LinearLayout) findViewById4;
                android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.buy);
                kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                this.f301734i = (android.widget.LinearLayout) findViewById5;
                android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.bvq);
                kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
                this.f301736n = (com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView) findViewById6;
                android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.bvp);
                kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
                this.f301737o = (android.widget.ImageView) findViewById7;
                android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.bvs);
                kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
                this.f301735m = (android.widget.ImageView) findViewById8;
                return;
            }
            if (i17 != 5) {
                return;
            }
        }
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.bvx);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f301731f = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.bvr);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f301732g = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.bvv);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f301733h = (android.widget.LinearLayout) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.buy);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f301734i = (android.widget.LinearLayout) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.tencent.mm.R.id.bvs);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f301735m = (android.widget.ImageView) findViewById13;
    }

    public final void i(java.util.List list, android.widget.LinearLayout linearLayout) {
        if (list == null || list.isEmpty()) {
            return;
        }
        linearLayout.setVisibility(0);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.st stVar = (r45.st) it.next();
            com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = new com.tencent.mm.plugin.card.widget.CardTagTextView(context);
            cardTagTextView.setMinHeight(i65.a.b(context, 18));
            cardTagTextView.setMinWidth(i65.a.b(context, 56));
            int b17 = i65.a.b(context, 8);
            int b18 = i65.a.b(context, 4);
            cardTagTextView.setPadding(b17, b18, b17, b18);
            cardTagTextView.setText(stVar.f385967d);
            cardTagTextView.setTextSize(1, 10.0f);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385968e)) {
                cardTagTextView.setTextColor(-1);
            } else {
                cardTagTextView.setTextColor(android.graphics.Color.parseColor(stVar.f385968e));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385969f)) {
                cardTagTextView.setFillColor(lu1.a0.a(-16777216, 26));
            } else {
                cardTagTextView.setFillColor(lu1.a0.b(stVar.f385969f, stVar.f385972i));
            }
            linearLayout.addView(cardTagTextView);
        }
    }

    public final void j(java.lang.String str, java.util.List list, android.widget.LinearLayout linearLayout, int i17) {
        if (str == null || str.length() == 0) {
            if (list == null || list.isEmpty()) {
                return;
            }
        }
        linearLayout.setVisibility(0);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context != null) {
            ju1.h hVar = new ju1.h(context, i17);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = ((r45.st) it.next()).f385967d;
                    if (str2 != null) {
                        android.widget.TextView textView = (android.widget.TextView) hVar.invoke();
                        textView.setText(str2);
                        textView.setTextSize(1, 12.0f);
                        linearLayout.addView(textView);
                    }
                }
            }
            if (str != null) {
                android.widget.TextView textView2 = (android.widget.TextView) hVar.invoke();
                textView2.setText(str);
                textView2.setTextSize(1, 10.0f);
                linearLayout.addView(textView2);
            }
        }
    }
}
