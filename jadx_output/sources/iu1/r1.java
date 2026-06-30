package iu1;

/* loaded from: classes9.dex */
public final class r1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public int f294944d;

    /* renamed from: e, reason: collision with root package name */
    public int f294945e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f294946f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f294947g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f294948h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView f294949i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f294950m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f294951n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (i17 == 0) {
            android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.bag);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f294947g = (android.widget.TextView) findViewById;
            return;
        }
        if (i17 == 1) {
            android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.byp);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f294946f = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById2;
            android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.byr);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            this.f294947g = (android.widget.TextView) findViewById3;
            com.tencent.mm.ui.bk.r0(l().getPaint(), 0.8f);
            android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.byo);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            this.f294948h = (android.widget.TextView) findViewById4;
            k().setUseSdcardCache(true);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.byr);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            this.f294947g = (android.widget.TextView) findViewById5;
            com.tencent.mm.ui.bk.r0(l().getPaint(), 0.8f);
            android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.byo);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            this.f294948h = (android.widget.TextView) findViewById6;
            return;
        }
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.cno);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f294946f = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.cnq);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f294947g = (android.widget.TextView) findViewById8;
        com.tencent.mm.ui.bk.r0(l().getPaint(), 0.8f);
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.cnn);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f294948h = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.cnl);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f294949i = (com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.cnm);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f294951n = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.cnp);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f294950m = (android.widget.LinearLayout) findViewById12;
        k().setUseSdcardCache(true);
    }

    public final com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView i() {
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = this.f294949i;
        if (memberCardTopCropImageView != null) {
            return memberCardTopCropImageView;
        }
        kotlin.jvm.internal.o.o("bgIv");
        throw null;
    }

    public final android.widget.TextView j() {
        android.widget.TextView textView = this.f294948h;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("descTv");
        throw null;
    }

    public final com.tencent.mm.pluginsdk.ui.applet.CdnImageView k() {
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f294946f;
        if (cdnImageView != null) {
            return cdnImageView;
        }
        kotlin.jvm.internal.o.o("logoIv");
        throw null;
    }

    public final android.widget.TextView l() {
        android.widget.TextView textView = this.f294947g;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("titleTv");
        throw null;
    }
}
