package com.tencent.mm.plugin.shake.shakecard.ui;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f162070J = lp0.b.D() + "card";
    public boolean A;
    public int B;
    public f34.d C;
    public am.fu D;
    public java.lang.String E;
    public android.content.res.Resources F;
    public com.tencent.mm.plugin.shake.shakecard.ui.c G;
    public com.tencent.mm.plugin.shake.shakecard.ui.d H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f162071d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f162072e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f162073f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f162074g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f162075h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f162076i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f162077m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f162078n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f162079o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f162080p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f162081q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f162082r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f162083s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f162084t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f162085u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f162086v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f162087w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f162088x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f162089y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f162090z;

    public e(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494792we);
        this.f162090z = false;
        this.A = false;
        this.B = 0;
        this.E = "";
        this.G = com.tencent.mm.plugin.shake.shakecard.ui.c.PRE_ACCEPT;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShakeCardGiftedEvent>(a0Var) { // from class: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog$1
            {
                this.__eventId = 1298970405;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShakeCardGiftedEvent shakeCardGiftedEvent) {
                com.tencent.mm.plugin.shake.shakecard.ui.e eVar = com.tencent.mm.plugin.shake.shakecard.ui.e.this;
                eVar.dismiss();
                com.tencent.mm.plugin.shake.shakecard.ui.d dVar = eVar.H;
                if (dVar != null) {
                    dVar.a();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "gift event come, do close ShakeCardDialog");
                return false;
            }
        };
        com.tencent.mm.plugin.shake.shakecard.ui.a aVar = new com.tencent.mm.plugin.shake.shakecard.ui.a(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "init shake card dialog");
        this.F = context.getResources();
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cmf, null);
        this.f162071d = inflate;
        this.f162072e = inflate.findViewById(com.tencent.mm.R.id.mqk);
        this.f162074g = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.bco);
        this.f162075h = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.bc7);
        this.f162076i = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.b9e);
        this.f162073f = (android.widget.ImageView) this.f162071d.findViewById(com.tencent.mm.R.id.b8u);
        this.f162077m = (android.widget.Button) this.f162071d.findViewById(com.tencent.mm.R.id.b76);
        this.f162078n = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.b7b);
        this.f162079o = (android.widget.ProgressBar) this.f162071d.findViewById(com.tencent.mm.R.id.bbk);
        this.f162073f.setOnClickListener(aVar);
        this.f162077m.setOnClickListener(aVar);
        this.f162080p = this.f162071d.findViewById(com.tencent.mm.R.id.f483561b84);
        this.f162081q = this.f162071d.findViewById(com.tencent.mm.R.id.pm9);
        this.f162082r = this.f162071d.findViewById(com.tencent.mm.R.id.bcs);
        this.f162083s = (android.widget.ImageView) this.f162071d.findViewById(com.tencent.mm.R.id.bas);
        this.f162084t = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.bcg);
        this.f162085u = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.b8b);
        this.f162086v = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.bcd);
        this.f162087w = this.f162071d.findViewById(com.tencent.mm.R.id.bbq);
        this.f162088x = (android.widget.ImageView) this.f162071d.findViewById(com.tencent.mm.R.id.m1v);
        this.f162089y = (android.widget.TextView) this.f162071d.findViewById(com.tencent.mm.R.id.m1u);
        this.B = g34.a.c();
    }

    public static void c(com.tencent.mm.plugin.shake.shakecard.ui.e eVar) {
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept()");
        if (android.text.TextUtils.isEmpty(eVar.C.f259329b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardDialog", "card_tp_id is empty befor doNetSceneAccept");
            return;
        }
        com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = new com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent();
        shakeAcceptCouponCardEvent.f54771h = null;
        f34.d dVar = eVar.C;
        java.lang.String str = dVar.f259329b;
        am.eu euVar = shakeAcceptCouponCardEvent.f54770g;
        euVar.f6608a = str;
        euVar.f6609b = dVar.f259330c;
        euVar.f6610c = 15;
        shakeAcceptCouponCardEvent.f192364d = new com.tencent.mm.plugin.shake.shakecard.ui.b(eVar, shakeAcceptCouponCardEvent);
        shakeAcceptCouponCardEvent.b(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            com.tencent.mm.plugin.shake.shakecard.ui.d dVar = this.H;
            if (dVar != null) {
                dVar.a();
            }
            if (this.G != com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_SUCCES && !this.A) {
                this.A = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "ShakeCardDialog card is not cancel accepte");
                com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
                f34.d dVar2 = this.C;
                e17.g(new f34.a(dVar2.f259329b, dVar2.f259330c));
            }
            this.I.dead();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "dismiss ShakeCardDialog");
            super.dismiss();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardDialog", "dismiss exception, e = " + e18.getMessage());
        }
    }

    public final void e() {
        com.tencent.mm.plugin.shake.shakecard.ui.c cVar = this.G;
        if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.PRE_ACCEPT || cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_FAIL) {
            if (android.text.TextUtils.isEmpty(this.C.f259339l)) {
                this.f162077m.setText(com.tencent.mm.R.string.arj);
                return;
            } else {
                this.f162077m.setText(this.C.f259339l);
                return;
            }
        }
        if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTING) {
            this.f162077m.setText("");
        } else if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_SUCCES) {
            this.f162077m.setText(com.tencent.mm.R.string.f493111j24);
        }
    }

    public final void f() {
        float dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a9s);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        android.graphics.Paint paint = shapeDrawable.getPaint();
        java.lang.String str = this.C.f259334g;
        int rgb = android.graphics.Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", "string format error");
        } else {
            try {
                java.lang.String upperCase = str.substring(1).toUpperCase();
                rgb = android.graphics.Color.argb(255, java.lang.Integer.parseInt(upperCase.substring(0, 2), 16), java.lang.Integer.parseInt(upperCase.substring(2, 4), 16), java.lang.Integer.parseInt(upperCase.substring(4, 6), 16));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardUtil", e17.toString());
            }
        }
        paint.setColor(rgb);
        this.f162082r.setBackgroundDrawable(shapeDrawable);
        e();
        if (!android.text.TextUtils.isEmpty(this.C.f259337j)) {
            this.f162074g.setText(this.C.f259337j);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f259342o)) {
            this.f162075h.setText(this.C.f259342o);
            this.f162075h.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f259338k)) {
            this.f162076i.setText(this.C.f259338k);
            this.f162076i.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f259333f)) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9r);
            android.widget.ImageView imageView = this.f162083s;
            java.lang.String str2 = this.C.f259333f;
            if (imageView != null && !android.text.TextUtils.isEmpty(str2)) {
                if (android.text.TextUtils.isEmpty(str2)) {
                    imageView.setImageResource(com.tencent.mm.R.raw.shake_card_package_defaultlogo);
                } else {
                    o11.f fVar = new o11.f();
                    fVar.f342083g = lp0.b.D();
                    fVar.f342082f = java.lang.String.format("%s/%s", f162070J, kk.k.g(str2.getBytes()));
                    fVar.f342078b = true;
                    fVar.f342096t = true;
                    fVar.f342077a = true;
                    fVar.f342087k = dimensionPixelSize;
                    fVar.f342086j = dimensionPixelSize;
                    fVar.f342091o = com.tencent.mm.R.raw.shake_card_package_defaultlogo;
                    n11.a.b().h(str2, imageView, fVar.a());
                }
            }
        }
        if (!android.text.TextUtils.isEmpty(this.C.f259331d)) {
            this.f162084t.setText(this.C.f259331d);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f259332e)) {
            this.f162085u.setText(this.C.f259332e);
        }
        if (this.C.f259341n > 0) {
            android.widget.TextView textView = this.f162086v;
            android.content.Context context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            long j17 = this.C.f259341n * 1000;
            new java.util.GregorianCalendar().setTimeInMillis(j17);
            if (g34.a.f268176a == null) {
                g34.a.f268176a = new java.text.SimpleDateFormat("yyyy.MM.dd");
            }
            objArr[0] = g34.a.f268176a.format(new java.util.Date(j17));
            textView.setText(context.getString(com.tencent.mm.R.string.f490813aw5, objArr));
        }
        if (this.G == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_FAIL) {
            this.f162078n.setVisibility(0);
        } else {
            this.f162078n.setVisibility(8);
        }
    }

    public final void h() {
        com.tencent.mm.plugin.shake.shakecard.ui.c cVar = this.G;
        if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_SUCCES) {
            android.view.View view = this.f162080p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f162087w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.PRE_ACCEPT || cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTING || cVar == com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_FAIL) {
            android.view.View view3 = this.f162080p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f162087w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f162071d);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "back key in shake card dialog");
            dismiss();
            com.tencent.mm.plugin.shake.shakecard.ui.d dVar = this.H;
            if (dVar != null) {
                dVar.a();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
