package lj2;

/* loaded from: classes10.dex */
public abstract class j extends com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    public pm2.a f318874e;

    /* renamed from: f, reason: collision with root package name */
    public km2.q f318875f;

    /* renamed from: g, reason: collision with root package name */
    public xh2.a f318876g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318877h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f318874e = pm2.a.f356853f;
    }

    public final km2.q getBindLinkMicUser() {
        return this.f318875f;
    }

    public final xh2.a getBindMicData() {
        return this.f318876g;
    }

    public final pm2.a getCurWidgetMode() {
        return this.f318874e;
    }

    public final xh2.a getFinderLiveMicCoverData() {
        return this.f318876g;
    }

    public final java.lang.String getTAG() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getTagString());
        sb6.append('_');
        sb6.append(this.f318874e);
        sb6.append('_');
        sb6.append(hashCode());
        sb6.append('_');
        km2.q qVar = this.f318875f;
        sb6.append(qVar != null ? qVar.f309173d : null);
        return sb6.toString();
    }

    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        return getContext().getResources().getDrawable(com.tencent.mm.R.color.f479103q2);
    }

    public abstract java.lang.String getTagString();

    public java.lang.String getTagText() {
        return "";
    }

    public int getTagTextColor() {
        return getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4);
    }

    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        this.f318874e = widgetMode;
        this.f318876g = data;
        this.f318875f = data.f454520a;
    }

    public boolean m() {
        xh2.i iVar;
        xh2.a aVar = this.f318876g;
        return ((aVar == null || (iVar = aVar.f454521b) == null) ? 0.0f : iVar.f282609a) <= 0.1f;
    }

    public boolean n() {
        return p();
    }

    public final boolean o() {
        km2.q qVar;
        xh2.i iVar;
        xh2.i iVar2;
        xh2.a aVar = this.f318876g;
        boolean z17 = false;
        r1 = 0;
        int i17 = 0;
        z17 = false;
        if (((aVar == null || (iVar2 = aVar.f454521b) == null) ? 0 : iVar2.f454558j) != 0) {
            if (aVar != null && (iVar = aVar.f454521b) != null) {
                i17 = iVar.f454558j;
            }
            return !pm0.v.z(i17, 1);
        }
        if (aVar != null && (qVar = aVar.f454520a) != null) {
            z17 = kotlin.jvm.internal.o.b(qVar.f309189t, java.lang.Boolean.TRUE);
        }
        return !z17;
    }

    public final boolean p() {
        xh2.i iVar;
        xh2.a aVar = this.f318876g;
        java.lang.Integer valueOf = (aVar == null || (iVar = aVar.f454521b) == null) ? null : java.lang.Integer.valueOf(iVar.f454553e);
        return (((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) || (valueOf != null && valueOf.intValue() == 6)) || (valueOf != null && valueOf.intValue() == 7);
    }

    public final void q(android.widget.ImageView imageView) {
        km2.q qVar = this.f318875f;
        if (qVar == null || imageView == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "showAudioBackground: " + qVar + " bgView: " + imageView);
        java.lang.String str = qVar.f309171b;
        if (str == null || str.length() == 0) {
            ((ku5.t0) ku5.t0.f312615d).g(new po0.d(bp.b.decodeResource(getContext().getResources(), com.tencent.mm.R.raw.default_avatar, null), new lj2.e(imageView), (4 & 4) != 0 ? 20.0f : 0.0f, (4 & 2) == 0 ? getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4) : 0));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.c().b(new mn2.e0(qVar.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329957h));
        lj2.f fVar = new lj2.f(this);
        b17.getClass();
        b17.f447877h = fVar;
        b17.f447876g = new lj2.g(this);
        b17.f447875f = new lj2.h(this);
        b17.c(imageView);
    }

    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        if (view == null || textView == null || viewGroup == null) {
            return;
        }
        viewGroup.setBackgroundDrawable(getTagLayoutBackgroundDrawable());
        textView.setTextColor(getTagTextColor());
        textView.setText(getTagText());
        if (viewGroup.getTranslationY() == 0.0f) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new lj2.i(viewGroup));
        }
    }

    public void s(android.widget.TextView textView) {
        jz5.f0 f0Var;
        java.lang.String tagText = getTagText();
        if (textView == null || tagText == null) {
            f0Var = null;
        } else {
            if (tagText.length() > 0) {
                textView.setText(tagText);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void setAnchorAudioMode(boolean z17) {
        this.f318877h = z17;
    }

    public final void setAnchorShareMode(boolean z17) {
    }

    public final void setBindLinkMicUser(km2.q qVar) {
        this.f318875f = qVar;
    }

    public final void setBindMicData(xh2.a aVar) {
        this.f318876g = aVar;
    }

    public final void setCurWidgetMode(pm2.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f318874e = aVar;
    }

    public final void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(android.widget.ImageView imageView) {
        km2.q qVar = this.f318875f;
        if (qVar == null || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        boolean S3 = com.tencent.mm.storage.z3.S3(qVar.f309172c);
        int i17 = 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        com.tencent.mm.plugin.finder.storage.y90 y90Var = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (S3) {
            g1Var.a().c(new mn2.n(qVar.f309171b, y90Var, i17, objArr3 == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f329957h));
        } else {
            g1Var.l().c(new mn2.n(qVar.f309171b, objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f329961o));
        }
    }

    public final void u(android.widget.TextView textView) {
        km2.q qVar = this.f318875f;
        if (qVar == null || textView == null) {
            return;
        }
        textView.setText(zl2.r4.D0(zl2.r4.f473950a, qVar.f309172c, qVar.f309173d, false, 4, null));
    }
}
