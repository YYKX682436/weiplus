package mh2;

/* loaded from: classes10.dex */
public final class u1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final mh2.y f326468c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f326469d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326470e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f326471f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f326472g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f326473h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f326474i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Boolean f326475j;

    /* renamed from: k, reason: collision with root package name */
    public om2.d0 f326476k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f326477l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context, mh2.y service, boolean z17) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        this.f326468c = service;
        this.f326469d = z17;
        this.f326470e = "KtvOutPreviewWidget_" + hashCode();
        this.f326471f = (android.widget.ImageView) this.f326292b.findViewById(com.tencent.mm.R.id.qrn);
        this.f326472g = (android.widget.TextView) this.f326292b.findViewById(com.tencent.mm.R.id.s7a);
        this.f326473h = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f326292b.findViewById(com.tencent.mm.R.id.nh8);
        this.f326474i = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) this.f326292b.findViewById(com.tencent.mm.R.id.qxy);
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.dri;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        kotlin.jvm.internal.o.g(singState, "singState");
        this.f326476k = singState;
        mh2.y yVar = this.f326468c;
        this.f326474i.b(yVar.a());
        yVar.b(new mh2.s1(this));
        if (this.f326469d) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.view.View view = this.f326292b;
            kotlin.jvm.internal.o.f(view, "<get-view>(...)");
            r4Var.k(view, yVar.c());
        }
        boolean z17 = singState instanceof om2.v;
        android.content.Context context = this.f326291a;
        android.widget.TextView textView = this.f326472g;
        if (z17) {
            h(false);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.mjj));
            i(null);
            return;
        }
        if (singState instanceof om2.x) {
            h(true);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.mjl));
            om2.o oVar = ((om2.x) singState).f346388a;
            g(oVar.f346361b);
            i(oVar.f346360a);
            return;
        }
        if (singState instanceof om2.e0) {
            h(true);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.mjl));
            om2.o oVar2 = ((om2.e0) singState).f346299a;
            g(oVar2.f346361b);
            i(oVar2.f346360a);
            return;
        }
        if (singState instanceof om2.c0) {
            h(true);
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.mjk));
            om2.o oVar3 = ((om2.c0) singState).f346280a;
            g(oVar3.f346361b);
            i(oVar3.f346360a);
        }
    }

    public final void f(boolean z17) {
        if (this.f326476k instanceof om2.v) {
            return;
        }
        if (kotlin.jvm.internal.o.b(this.f326475j, java.lang.Boolean.valueOf(z17)) && this.f326474i.c() == z17) {
            return;
        }
        pm0.v.X(new mh2.t1(this, z17));
    }

    public final void g(r45.xn1 xn1Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return;
        }
        android.widget.ImageView avatar = this.f326471f;
        kotlin.jvm.internal.o.f(avatar, "avatar");
        b(avatar, finderContact);
        boolean S3 = com.tencent.mm.storage.z3.S3(finderContact.getUsername());
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f326474i;
        if (S3) {
            if (ripperAnimateView != null) {
                ripperAnimateView.setAnimateMode(jj2.e.f299979d);
            }
        } else if (ripperAnimateView != null) {
            ripperAnimateView.setAnimateMode(jj2.e.f299980e);
        }
    }

    public final void h(boolean z17) {
        android.widget.ImageView imageView = this.f326471f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f326473h;
        if (z17) {
            imageView.setVisibility(0);
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
            imageView.setVisibility(8);
            this.f326474i.setVisibility(8);
        }
    }

    public final void i(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(this.f326477l, str)) {
            return;
        }
        this.f326477l = str;
        com.tencent.mars.xlog.Log.i(this.f326470e, "currSingerUserId: " + str);
    }
}
