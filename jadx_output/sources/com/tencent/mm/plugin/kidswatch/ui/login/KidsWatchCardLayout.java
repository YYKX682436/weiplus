package com.tencent.mm.plugin.kidswatch.ui.login;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchCardLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/kidswatch/model/KidsWatchAcctInfo;", "kidsAcctInfo", "Ljz5/f0;", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchCardLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f143102d;

    /* renamed from: e, reason: collision with root package name */
    public final o11.f f143103e;

    /* renamed from: f, reason: collision with root package name */
    public final w83.a f143104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KidsWatchCardLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        int a17 = com.tencent.mm.ui.zk.a(context, 16);
        o11.f fVar = new o11.f();
        this.f143103e = fVar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmt, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.tencent.mm.R.id.a9n;
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) x4.b.a(inflate, com.tencent.mm.R.id.a9n);
        if (roundCornerImageView != null) {
            i18 = com.tencent.mm.R.id.f483554b73;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f483554b73);
            if (linearLayout != null) {
                i18 = com.tencent.mm.R.id.cwt;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.cwt);
                if (textView != null) {
                    i18 = com.tencent.mm.R.id.io_;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.io_);
                    if (textView2 != null) {
                        i18 = com.tencent.mm.R.id.ioa;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.ioa);
                        if (textView3 != null) {
                            i18 = com.tencent.mm.R.id.kbg;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.kbg);
                            if (textView4 != null) {
                                this.f143104f = new w83.a((android.widget.LinearLayout) inflate, roundCornerImageView, linearLayout, textView, textView2, textView3, textView4);
                                setNestedScrollingEnabled(true);
                                roundCornerImageView.f211406f = a17;
                                roundCornerImageView.f211407g = a17;
                                fVar.f342091o = com.tencent.mm.R.drawable.bhm;
                                fVar.f342097u = a17;
                                fVar.f342096t = true;
                                a();
                                a93.a aVar = a93.a.f2429a;
                                android.content.Context context2 = getContext();
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                aVar.c(context2, linearLayout, null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void a() {
        boolean z17 = this.f143102d;
        w83.a aVar = this.f143104f;
        if (z17) {
            aVar.f443955e.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.aid));
            aVar.f443956f.setText(getContext().getString(com.tencent.mm.R.string.f492364g81));
        } else {
            aVar.f443955e.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.ai9));
            aVar.f443956f.setText(getContext().getString(com.tencent.mm.R.string.g7j));
        }
    }

    public final void setData(com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo kidsAcctInfo) {
        kotlin.jvm.internal.o.g(kidsAcctInfo, "kidsAcctInfo");
        n11.a b17 = n11.a.b();
        w83.a aVar = this.f143104f;
        b17.h(kidsAcctInfo.f143099f, aVar.f443952b, this.f143103e.a());
        aVar.f443957g.setText(kidsAcctInfo.f143098e);
        this.f143102d = kidsAcctInfo.f143097d == 1;
        aVar.f443954d.setText(kidsAcctInfo.f143101h);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KidsWatchCardLayout(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
