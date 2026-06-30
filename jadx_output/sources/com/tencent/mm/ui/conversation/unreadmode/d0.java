package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class d0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f208117e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.unreadmode.g0 f208118f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f208119g;

    /* renamed from: h, reason: collision with root package name */
    public int f208120h;

    /* renamed from: i, reason: collision with root package name */
    public yf5.g0 f208121i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.b3 f208122m;

    /* renamed from: n, reason: collision with root package name */
    public xm3.t0 f208123n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f208124o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f208125p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f208126q;

    public d0(android.app.Activity activity, com.tencent.mm.ui.conversation.unreadmode.g0 g0Var) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f208117e = activity;
        this.f208118f = g0Var;
        this.f208122m = new com.tencent.mm.ui.conversation.b3();
        this.f208124o = new java.util.LinkedHashMap();
        this.f208125p = jz5.h.b(new com.tencent.mm.ui.conversation.unreadmode.c0(this));
        this.f208126q = jz5.h.b(new com.tencent.mm.ui.conversation.unreadmode.b0(this));
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        yf5.d dVar;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.content.Context context = recyclerView.getContext();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.conversation.unreadmode.e0.f208129a;
        android.view.View a17 = (weakReference == null || (dVar = (yf5.d) weakReference.get()) == null) ? null : dVar.a();
        if (a17 == null) {
            a17 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488689e40, (android.view.ViewGroup) null, false);
        }
        android.view.View view = a17;
        kotlin.jvm.internal.o.d(context);
        va5.a aVar = new va5.a(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479649bo);
        va5.c cVar = new va5.c(context);
        cVar.f434404a = com.tencent.mm.R.id.vkf;
        cVar.f434407d = new android.graphics.drawable.ColorDrawable(context.getColor(com.tencent.mm.R.color.Indigo_100));
        cVar.f434410g = dimensionPixelOffset;
        cVar.f434405b = context.getString(com.tencent.mm.R.string.pjc);
        cVar.f434409f = i65.a.f(context, com.tencent.mm.R.dimen.f479930ja);
        cVar.f434408e = -1;
        cVar.f434406c = (android.graphics.drawable.Drawable) ((jz5.n) this.f208126q).getValue();
        ((java.util.ArrayList) aVar.f434403b).add(cVar);
        va5.v vVar = new va5.v(aVar);
        int i17 = this.f208120h;
        kotlin.jvm.internal.o.d(view);
        va5.p pVar = new va5.p(view, vVar, java.lang.Integer.valueOf(i17), null, null);
        pVar.setAutoCloseMode(true);
        pVar.addOnLayoutChangeListener(new com.tencent.mm.ui.conversation.unreadmode.v(vVar, dimensionPixelOffset));
        pVar.setOnSwipeThresholdListener(new com.tencent.mm.ui.conversation.unreadmode.w(pVar, this));
        pVar.setOnMenuStateChangeListener(new com.tencent.mm.ui.conversation.unreadmode.y(this));
        return pVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488689e40;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f208119g = context;
        this.f208120h = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.f479896i9) + 0.5f);
        android.content.Context context2 = this.f208119g;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        this.f208121i = new yf5.g0(context2);
        this.f208123n = adapter instanceof xm3.t0 ? (xm3.t0) adapter : null;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.storage.l4 l4Var;
        java.lang.String h17;
        java.lang.String string;
        android.widget.ImageView imageView;
        int color;
        yf5.x item = (yf5.x) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.lang.Object tag = itemView.getTag();
        yf5.n nVar = tag instanceof yf5.n ? (yf5.n) tag : null;
        if (nVar == null || (l4Var = item.f461995d) == null || (h17 = l4Var.h1()) == null) {
            return;
        }
        yf5.g0 g0Var = this.f208121i;
        if (g0Var == null) {
            kotlin.jvm.internal.o.o("itemBuilder");
            throw null;
        }
        g0Var.a(i17, nVar, item, l4Var);
        boolean z18 = itemView instanceof va5.p;
        va5.p pVar = z18 ? (va5.p) itemView : null;
        if (pVar != null) {
            pVar.setPosition(i17);
        }
        va5.p pVar2 = z18 ? (va5.p) itemView : null;
        if (pVar2 != null) {
            pVar2.setSwipeEnable(true);
        }
        va5.p pVar3 = z18 ? (va5.p) itemView : null;
        if (pVar3 != null) {
            if (nVar.f461927n) {
                android.content.Context context = this.f208119g;
                if (context == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                color = context.getColor(com.tencent.mm.R.color.f479315vv);
            } else {
                android.content.Context context2 = this.f208119g;
                if (context2 == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                color = context2.getColor(com.tencent.mm.R.color.f478491c);
            }
            pVar3.setBackgroundColor(color);
        }
        va5.p pVar4 = z18 ? (va5.p) itemView : null;
        if (pVar4 != null) {
            boolean z19 = l4Var.d1() > 0;
            if (z19) {
                android.content.Context context3 = this.f208119g;
                if (context3 == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                string = context3.getString(com.tencent.mm.R.string.pjc);
            } else {
                android.content.Context context4 = this.f208119g;
                if (context4 == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                string = context4.getString(com.tencent.mm.R.string.pjd);
            }
            kotlin.jvm.internal.o.d(string);
            android.graphics.drawable.Drawable drawable = z19 ? (android.graphics.drawable.Drawable) ((jz5.n) this.f208125p).getValue() : (android.graphics.drawable.Drawable) ((jz5.n) this.f208126q).getValue();
            va5.v vVar = pVar4.f434426h;
            vVar.a(string, com.tencent.mm.R.id.vkf);
            kotlin.jvm.internal.o.d(drawable);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) vVar.findViewById(com.tencent.mm.R.id.vkf);
            if (linearLayout != null && (imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.vb_)) != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        nVar.f461931r.setOnClickListener(new com.tencent.mm.ui.conversation.unreadmode.z(this, h17, nVar, holder, item, i17));
        this.f208122m.c(nVar);
        holder.itemView.setTag(com.tencent.mm.R.id.cip, item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.view.View itemView;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View view = holder.itemView;
        va5.p pVar = view instanceof va5.p ? (va5.p) view : null;
        if (pVar == null || (itemView = pVar.getContentView()) == null) {
            itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
        }
        yf5.n nVar = new yf5.n();
        yf5.g0 g0Var = this.f208121i;
        if (g0Var == null) {
            kotlin.jvm.internal.o.o("itemBuilder");
            throw null;
        }
        g0Var.b(nVar, itemView);
        holder.itemView.setTag(nVar);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
