package com.tencent.mm.plugin.ting.membership.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog;", "Lcom/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingMembershipInfoDialog extends com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog {

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f174704s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f174705t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f174706u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f174707v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f174708w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f174709x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f174710y;

    /* renamed from: z, reason: collision with root package name */
    public hl4.b f174711z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingMembershipInfoDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dcu, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog, hg5.d
    public void G() {
        super.G();
        android.view.View view = this.f281403i;
        this.f174704s = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cg7) : null;
        android.view.View view2 = this.f281403i;
        this.f174705t = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.obc) : null;
        android.view.View view3 = this.f281403i;
        this.f174706u = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
        android.view.View view4 = this.f281403i;
        this.f174707v = view4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.bz6) : null;
        android.view.View view5 = this.f281403i;
        this.f174708w = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.khs) : null;
        android.view.View view6 = this.f281403i;
        this.f174709x = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.q1n) : null;
        android.widget.TextView textView = this.f174705t;
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.TextView textView2 = this.f174708w;
        if (textView2 != null) {
            textView2.setOnClickListener(new hl4.c(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f174707v;
        if (weImageView != null) {
            weImageView.setOnClickListener(new hl4.d(this));
        }
        android.widget.TextView textView3 = this.f174709x;
        if (textView3 != null) {
            textView3.setOnClickListener(new hl4.e(this));
        }
        L(this.f174711z);
    }

    @Override // com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog
    public int K() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479711d5);
    }

    public final void L(hl4.b bVar) {
        android.widget.TextView textView;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (bVar == null) {
            return;
        }
        android.widget.TextView textView2 = this.f174705t;
        if (textView2 != null) {
            textView2.setText(bVar.f282104a);
        }
        android.widget.TextView textView3 = this.f174706u;
        if (textView3 != null) {
            textView3.setText(bVar.f282105b);
        }
        android.widget.TextView textView4 = this.f174708w;
        if (textView4 != null) {
            textView4.setText(bVar.f282106c);
        }
        hl4.a aVar = bVar.f282107d;
        if (aVar == hl4.a.f282101d) {
            android.widget.TextView textView5 = this.f174708w;
            if (textView5 != null) {
                textView5.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
                textView5.setTextColor(b3.l.getColorStateList(textView5.getContext(), com.tencent.mm.R.color.f478838io));
            }
        } else if (aVar == hl4.a.f282102e && (textView = this.f174708w) != null) {
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
            textView.setTextColor(b3.l.getColorStateList(textView.getContext(), com.tencent.mm.R.color.aax));
        }
        android.widget.TextView textView6 = this.f174708w;
        if (textView6 != null) {
            if (textView6 == null || (layoutParams = textView6.getLayoutParams()) == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f282110g;
            }
            textView6.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView7 = this.f174709x;
        if (textView7 != null) {
            textView7.setVisibility(bVar.f282111h ? 0 : 8);
        }
        android.widget.TextView textView8 = this.f174709x;
        if (textView8 != null) {
            textView8.setText(bVar.f282112i);
        }
        if (this.f174704s != null) {
            android.widget.ImageView imageView = bVar.f282114k;
            if (kotlin.jvm.internal.o.b(this.f174710y, imageView)) {
                return;
            }
            android.widget.ImageView imageView2 = this.f174710y;
            if (imageView2 != null && (viewGroup = this.f174704s) != null) {
                viewGroup.removeView(imageView2);
            }
            if (imageView != null) {
                android.view.ViewParent parent = imageView.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(imageView);
                }
                this.f174710y = imageView;
                android.view.ViewGroup viewGroup3 = this.f174704s;
                if (viewGroup3 != null) {
                    viewGroup3.addView(imageView, 1);
                }
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingMembershipInfoDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
