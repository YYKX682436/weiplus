package xk3;

/* loaded from: classes8.dex */
public abstract class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f455039e;

    /* renamed from: f, reason: collision with root package name */
    public final vk3.a f455040f;

    /* renamed from: g, reason: collision with root package name */
    public final yo0.i f455041g;

    /* renamed from: h, reason: collision with root package name */
    public final int f455042h;

    public i(int i17, vk3.a aVar) {
        this.f455039e = i17;
        this.f455040f = aVar;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f455041g = fVar.a();
        this.f455042h = 5;
    }

    @Override // in5.r
    public int e() {
        return this.f455039e;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenRoundCornerConvert", "onCreateViewHolder itemCount:" + itemCount + ", layoutPosition:" + holder.getLayoutPosition());
        if (itemCount < 2 || (findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.hhd)) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        zk3.h0 h0Var = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.C;
        layoutParams.height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L;
        findViewById.getLayoutParams().width = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.jvd);
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.getLayoutParams().height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q;
        }
        findViewById.requestLayout();
    }

    public java.lang.String n(android.content.Context context, uk3.a item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        return item.f428524d.v0().getString(0);
    }

    public final java.lang.String o(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void p(in5.s0 holder, uk3.a item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.jvm);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jvj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jvl);
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvo);
        com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout minusScreenRoundFrameLayout = (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.jva);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jvk);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.jvd);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvg);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.ui8);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.jvf);
        if (imageView != null) {
            imageView.setOnClickListener(new xk3.h(this, item, holder));
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(n(context, item));
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = item.f428524d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiTaskInfo.v0().getString(1))) {
            textView2.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = com.tencent.mm.ui.zk.a(context, 16);
            findViewById.setLayoutParams(marginLayoutParams);
        } else {
            textView2.setVisibility(0);
            textView2.setText(multiTaskInfo.v0().getString(1));
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = com.tencent.mm.ui.zk.a(context, 6);
            findViewById.setLayoutParams(marginLayoutParams2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiTaskInfo.v0().getString(8))) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(multiTaskInfo.v0().getString(8));
            textView3.setVisibility(0);
        }
        minusScreenRoundFrameLayout.setUseBottomGradient(this instanceof xk3.v);
        if (!(this instanceof xk3.o)) {
            if (multiTaskInfo.v0().getBoolean(7)) {
                weImageView.setVisibility(0);
                mMImageView.setVisibility(8);
                roundedCornerFrameLayout.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f479443zf));
                weImageView.setImageResource(wk3.a.f446957a.b(multiTaskInfo.field_type));
                com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
                java.lang.String str2 = multiTaskInfo.field_id;
                str = str2 != null ? str2 : "";
                java.lang.String b17 = u0Var.b(str);
                if (!com.tencent.mm.vfs.w6.j(b17)) {
                    b17 = com.tencent.mm.plugin.multitask.v0.f150612a + str;
                }
                n11.a.b().a(b17, mMImageView);
            } else {
                weImageView.setVisibility(8);
                mMImageView.setVisibility(0);
                roundedCornerFrameLayout.setBackground(null);
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = item.f428524d;
                com.tencent.mm.plugin.multitask.u0 u0Var2 = com.tencent.mm.plugin.multitask.u0.f150506a;
                java.lang.String str3 = multiTaskInfo2 != null ? multiTaskInfo2.field_id : null;
                str = str3 != null ? str3 : "";
                java.lang.String b18 = u0Var2.b(str);
                if (!com.tencent.mm.vfs.w6.j(b18)) {
                    b18 = com.tencent.mm.plugin.multitask.v0.f150612a + str;
                }
                java.lang.String str4 = b18;
                n11.a.b().j(str4, mMImageView, com.tencent.mm.plugin.multitask.u0.f150507b, new xk3.g(this, holder, str4, mMImageView, multiTaskInfo2, weImageView, roundedCornerFrameLayout));
            }
        }
        weImageView2.setImageResource(wk3.a.f446957a.a(multiTaskInfo.field_type));
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.jvf);
        if (imageView2 != null) {
            imageView2.setTag(com.tencent.mm.R.id.jxk, java.lang.Integer.valueOf(multiTaskInfo.field_type));
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.hhd);
        if (p17 != null) {
            p17.setTag(com.tencent.mm.R.id.jxl, java.lang.Integer.valueOf(multiTaskInfo.field_type));
        }
    }

    public void q(android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(imgView, "imgView");
    }
}
