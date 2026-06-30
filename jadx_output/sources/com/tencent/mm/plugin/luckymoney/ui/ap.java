package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ap extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f146725e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f146726f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f146727g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f146728h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f146729i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f146724d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f146730m = 1;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.yo f146731n = null;

    public ap(android.content.Context context) {
        this.f146727g = context;
        this.f146728h = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f146724d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.luckymoney.model.h5) this.f146724d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.luckymoney.ui.zo zoVar;
        android.content.Context context = this.f146727g;
        if (view == null) {
            view = this.f146728h.inflate(com.tencent.mm.R.layout.bv7, viewGroup, false);
            zoVar = new com.tencent.mm.plugin.luckymoney.ui.zo(this);
            zoVar.f147797a = view.findViewById(com.tencent.mm.R.id.m7g);
            zoVar.f147798b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j6l);
            zoVar.f147799c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6p);
            zoVar.f147800d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6q);
            zoVar.f147801e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6j);
            zoVar.f147802f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6k);
            zoVar.f147803g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6r);
            zoVar.f147804h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j6m);
            zoVar.f147805i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6n);
            if (this.f146731n != null) {
                int color = context.getResources().getColor(com.tencent.mm.R.color.f479345x0);
                int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479346x1);
                int color3 = context.getResources().getColor(com.tencent.mm.R.color.f479356xa);
                zoVar.f147797a.setBackgroundResource(com.tencent.mm.R.color.a9e);
                zoVar.f147797a.setPadding(0, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479884hx), 0, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479884hx));
                zoVar.f147799c.setTextColor(color);
                zoVar.f147800d.setTextColor(color2);
                zoVar.f147801e.setTextColor(color);
                zoVar.f147802f.setTextColor(color);
                zoVar.f147803g.setTextColor(color3);
            }
            view.setTag(zoVar);
        } else {
            zoVar = (com.tencent.mm.plugin.luckymoney.ui.zo) view.getTag();
        }
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) this.f146724d.get(i17);
        com.tencent.mm.plugin.luckymoney.model.m5.b(zoVar.f147798b, h5Var.f145313e, h5Var.f145319n);
        java.lang.String str = h5Var.f145317i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f146725e) && this.f146726f) {
            zoVar.f147803g.setOnClickListener(this.f146729i);
            zoVar.f147803g.setVisibility(0);
            zoVar.f147802f.setVisibility(8);
            zoVar.f147800d.setVisibility(8);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145316h)) {
                zoVar.f147802f.setVisibility(8);
            } else {
                com.tencent.mm.plugin.luckymoney.model.m5.E(context, zoVar.f147802f, h5Var.f145316h);
                zoVar.f147802f.setVisibility(0);
            }
            zoVar.f147800d.setText(com.tencent.mm.plugin.luckymoney.model.m5.f(context, com.tencent.mm.sdk.platformtools.t8.V(h5Var.f145315g, 0L) * 1000));
            zoVar.f147800d.setVisibility(0);
            zoVar.f147803g.setVisibility(8);
        }
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, zoVar.f147799c, h5Var.f145312d);
        zoVar.f147801e.setText(context.getString(com.tencent.mm.R.string.gna, com.tencent.mm.wallet_core.ui.r1.o(h5Var.f145314f / 100.0d)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145318m)) {
            zoVar.f147804h.setVisibility(8);
            zoVar.f147805i.setVisibility(8);
        } else {
            zoVar.f147805i.setText(h5Var.f145318m);
            if (this.f146730m == 2) {
                zoVar.f147804h.setImageResource(com.tencent.mm.R.drawable.c_a);
            } else {
                zoVar.f147804h.setImageResource(com.tencent.mm.R.drawable.c99);
            }
            zoVar.f147804h.setVisibility(0);
            zoVar.f147805i.setVisibility(0);
        }
        return view;
    }
}
