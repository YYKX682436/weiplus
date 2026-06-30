package uj3;

/* loaded from: classes14.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428316a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f428317b;

    /* renamed from: c, reason: collision with root package name */
    public final uj3.k f428318c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f428319d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout f428320e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428321f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout f428322g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout f428323h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Toast f428324i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f428325j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f428326k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428327l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f428328m;

    public l0(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428316a = context;
        this.f428317b = statusManager;
        this.f428318c = kVar;
        this.f428325j = kVar != null ? kVar.f428301a.contains(3) : false;
        this.f428326k = kVar != null ? kVar.f428301a.contains(1) : false;
        if (kVar != null) {
            kVar.f428301a.contains(2);
        }
    }

    public final void a() {
        boolean z17 = this.f428326k;
        android.content.Context context = this.f428316a;
        uj3.b bVar = this.f428317b;
        if (z17) {
            android.view.View view = this.f428319d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.bz_) : null;
            this.f428321f = weImageView;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_close, -1));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428321f;
            if (weImageView2 != null) {
                weImageView2.setIconColor(-1);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f428321f;
            if (weImageView3 != null) {
                weImageView3.setOnClickListener(new uj3.c0(this));
            }
            android.view.View view2 = this.f428319d;
            this.f428320e = view2 != null ? (com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout) view2.findViewById(com.tencent.mm.R.id.d2e) : null;
            if (bVar.c()) {
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = this.f428320e;
                if (multiTalkSmallControlIconLayout != null) {
                    multiTalkSmallControlIconLayout.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f428321f;
                if (weImageView4 != null) {
                    weImageView4.setVisibility(0);
                }
            } else {
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = this.f428320e;
                if (multiTalkSmallControlIconLayout2 != null) {
                    multiTalkSmallControlIconLayout2.setVisibility(0);
                }
            }
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = this.f428320e;
            if (multiTalkSmallControlIconLayout3 != null) {
                multiTalkSmallControlIconLayout3.setChecked(bVar.c());
            }
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout4 = this.f428320e;
            if (multiTalkSmallControlIconLayout4 != null) {
                multiTalkSmallControlIconLayout4.setOnClickListener(new uj3.d0(this));
            }
        }
        android.view.View view3 = this.f428319d;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout5 = view3 != null ? (com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout) view3.findViewById(com.tencent.mm.R.id.jj7) : null;
        this.f428322g = multiTalkSmallControlIconLayout5;
        if (multiTalkSmallControlIconLayout5 != null) {
            multiTalkSmallControlIconLayout5.setChecked(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150162e);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout6 = this.f428322g;
        kotlin.jvm.internal.o.d(multiTalkSmallControlIconLayout6);
        if (multiTalkSmallControlIconLayout6.isChceked) {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout7 = this.f428322g;
            if (multiTalkSmallControlIconLayout7 != null) {
                multiTalkSmallControlIconLayout7.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492590h24));
            }
        } else {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout8 = this.f428322g;
            if (multiTalkSmallControlIconLayout8 != null) {
                multiTalkSmallControlIconLayout8.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492591h25));
            }
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout9 = this.f428322g;
        if (multiTalkSmallControlIconLayout9 != null) {
            multiTalkSmallControlIconLayout9.setVisibility(bVar.c() ? 4 : 0);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout10 = this.f428322g;
        if (multiTalkSmallControlIconLayout10 != null) {
            multiTalkSmallControlIconLayout10.setOnClickListener(new uj3.f0(this));
        }
        android.view.View view4 = this.f428319d;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout11 = view4 != null ? (com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout) view4.findViewById(com.tencent.mm.R.id.nel) : null;
        this.f428323h = multiTalkSmallControlIconLayout11;
        if (multiTalkSmallControlIconLayout11 != null) {
            multiTalkSmallControlIconLayout11.setChecked(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout12 = this.f428323h;
        kotlin.jvm.internal.o.d(multiTalkSmallControlIconLayout12);
        if (multiTalkSmallControlIconLayout12.isChceked) {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout13 = this.f428323h;
            if (multiTalkSmallControlIconLayout13 != null) {
                multiTalkSmallControlIconLayout13.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.h28));
            }
        } else {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout14 = this.f428323h;
            if (multiTalkSmallControlIconLayout14 != null) {
                multiTalkSmallControlIconLayout14.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.h29));
            }
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout15 = this.f428323h;
        if (multiTalkSmallControlIconLayout15 != null) {
            multiTalkSmallControlIconLayout15.setOnClickListener(new uj3.h0(this));
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout16 = this.f428323h;
        if (multiTalkSmallControlIconLayout16 != null) {
            multiTalkSmallControlIconLayout16.setVisibility(bVar.c() ? 4 : 0);
        }
        if (this.f428325j) {
            android.view.View view5 = this.f428319d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = view5 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view5.findViewById(com.tencent.mm.R.id.jrb) : null;
            this.f428327l = weImageView5;
            if (weImageView5 != null) {
                weImageView5.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_more, context.getResources().getColor(com.tencent.mm.R.color.aaw)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f428327l;
            if (weImageView6 != null) {
                weImageView6.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f428327l;
            if (weImageView7 != null) {
                weImageView7.setVisibility(bVar.c() ? 4 : 0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = this.f428327l;
            if (weImageView8 != null) {
                weImageView8.setOnClickListener(new uj3.i0(this));
            }
        }
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.Toast toast = this.f428324i;
        if (toast != null) {
            toast.cancel();
        }
        this.f428324i = android.widget.Toast.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c3w, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) findViewById).setText(str);
        android.widget.Toast toast2 = this.f428324i;
        if (toast2 != null) {
            toast2.setGravity(17, 0, 0);
        }
        android.widget.Toast toast3 = this.f428324i;
        if (toast3 != null) {
            toast3.setView(inflate);
        }
        android.widget.Toast toast4 = this.f428324i;
        if (toast4 != null) {
            toast4.show();
        }
    }
}
