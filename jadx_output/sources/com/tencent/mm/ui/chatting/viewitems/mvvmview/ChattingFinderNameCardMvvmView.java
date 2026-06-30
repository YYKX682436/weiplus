package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderNameCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/p;", "Lem/n;", "f", "Lem/n;", "getHolder", "()Lem/n;", "setHolder", "(Lem/n;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingFinderNameCardMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.p> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.n holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0x, (android.view.ViewGroup) this, false);
        setHolder(new em.n(inflate));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        x05.c cVar;
        z01.p pVar3 = (z01.p) pVar2;
        if (pVar3 == null || (cVar = pVar3.f469136d) == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        mn2.h3 e17 = lVar.e(cVar.l(), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        em.n holder = getHolder();
        if (holder.f254619b == null) {
            holder.f254619b = (android.widget.ImageView) holder.f254618a.findViewById(com.tencent.mm.R.id.e_f);
        }
        android.widget.ImageView imageView = holder.f254619b;
        kotlin.jvm.internal.o.f(imageView, "getFinderAvatarIv(...)");
        a17.c(e17, imageView, g1Var.h(mn2.f1.f329962p));
        em.n holder2 = getHolder();
        if (holder2.f254623f == null) {
            holder2.f254623f = (android.widget.TextView) holder2.f254618a.findViewById(com.tencent.mm.R.id.fux);
        }
        android.widget.TextView textView = holder2.f254623f;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String nickname = cVar.getNickname();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
        int j17 = cVar.j();
        if (j17 > 0) {
            getHolder().a().setVisibility(0);
            if (j17 == 1) {
                java.lang.String authIconUrl = cVar.getAuthIconUrl();
                if (authIconUrl == null || authIconUrl.length() == 0) {
                    getHolder().a().setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_star_identify, getContext().getResources().getColor(com.tencent.mm.R.color.f478526a7)));
                } else {
                    vo0.d e18 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    mn2.h3 e19 = lVar.e(cVar.getAuthIconUrl(), com.tencent.mm.plugin.finder.storage.y90.f128355e);
                    android.widget.ImageView a18 = getHolder().a();
                    kotlin.jvm.internal.o.f(a18, "getFinderJobIcon(...)");
                    e18.c(e19, a18, g1Var.h(mn2.f1.B));
                }
            } else if (j17 == 2) {
                getHolder().a().setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise);
            } else if (j17 == 100) {
                getHolder().a().setVisibility(8);
            }
        } else {
            getHolder().a().setVisibility(8);
        }
        if (j17 != 1 || com.tencent.mm.sdk.platformtools.t8.K0(cVar.k())) {
            getHolder().b().setVisibility(8);
        } else {
            getHolder().b().setVisibility(0);
            getHolder().b().setText(cVar.k());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(pVar3.f469137e);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            em.n holder3 = getHolder();
            if (holder3.f254620c == null) {
                holder3.f254620c = (android.widget.LinearLayout) holder3.f254618a.findViewById(com.tencent.mm.R.id.cgi);
            }
            holder3.f254620c.setBackgroundResource(intValue);
        }
        android.view.View.OnClickListener onClickListener = pVar3.f469138f;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
    }

    public final em.n getHolder() {
        em.n nVar = this.holder;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final void setHolder(em.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<set-?>");
        this.holder = nVar;
    }

    public /* synthetic */ ChattingFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
