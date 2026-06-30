package zd5;

/* loaded from: classes9.dex */
public final class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f471699d;

    /* renamed from: e, reason: collision with root package name */
    public final zd5.q f471700e;

    /* renamed from: f, reason: collision with root package name */
    public final zd5.p f471701f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471702g;

    public n(android.content.Context context, zd5.q resultDetail, zd5.p itemClickListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(resultDetail, "resultDetail");
        kotlin.jvm.internal.o.g(itemClickListener, "itemClickListener");
        this.f471699d = context;
        this.f471700e = resultDetail;
        this.f471701f = itemClickListener;
        this.f471702g = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f471700e.getCount();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return this.f471700e.getItem(i17).f4398b;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 baseHolder, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(baseHolder, "baseHolder");
        int itemViewType = getItemViewType(i17);
        zd5.q qVar = this.f471700e;
        ae5.g item = qVar.getItem(i17);
        android.content.Context context = this.f471699d;
        if (itemViewType == 1) {
            if (i17 == getItemCount() - 1) {
                ((zd5.h) baseHolder).f471687d.setVisibility(8);
                return;
            }
            if (com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(qVar.getItem(i17 + 1).f4397a)) != com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(item.f4397a))) {
                ((zd5.h) baseHolder).f471687d.setVisibility(8);
                return;
            }
            android.widget.TextView textView = ((zd5.h) baseHolder).f471687d;
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(item.f4397a), context));
            return;
        }
        zd5.k kVar = (zd5.k) baseHolder;
        kVar.f471691d.setTag(java.lang.Integer.valueOf(i17));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(kVar.f471692e, item.f4401e, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f471702g);
        java.lang.String str2 = item.f4404h;
        java.lang.String str3 = item.f4403g;
        if (K0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = item.f4402f;
                }
            }
            str2 = str3;
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    kotlin.jvm.internal.o.d(str2);
                    if (r26.n0.B(str2, this.f471702g, false)) {
                        str = str3 + '(' + str2 + ')';
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(item.f4402f)) {
                    java.lang.String str4 = item.f4402f;
                    kotlin.jvm.internal.o.d(str4);
                    if (r26.n0.B(str4, this.f471702g, false)) {
                        str = str3 + '(' + item.f4402f + ')';
                    }
                }
                str2 = str3;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str = item.f4402f;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(item.f4402f)) {
                java.lang.String str5 = item.f4402f;
                kotlin.jvm.internal.o.d(str5);
                if (r26.n0.B(str5, this.f471702g, false)) {
                    str = str2 + '(' + item.f4402f + ')';
                }
            }
            str2 = str;
        }
        android.widget.TextView textView2 = kVar.f471693f;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
        kVar.f471694g.setText(k35.m1.f(context, item.f4397a, true, false));
        java.lang.String str6 = item.f4399c;
        android.widget.TextView textView3 = kVar.f471695h;
        textView3.setText(str6);
        qVar.H3(kVar, i17, itemViewType);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f471702g)) {
            return;
        }
        kVar.i(textView2, this.f471702g);
        kVar.i(textView3, this.f471702g);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bcs, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new zd5.h(inflate, this.f471699d);
        }
        androidx.recyclerview.widget.k3 c17 = this.f471700e.c(parent, i17);
        c17.itemView.setOnLongClickListener(new zd5.l(this));
        c17.itemView.setOnClickListener(new zd5.m(this));
        return c17;
    }
}
