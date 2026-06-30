package rv3;

/* loaded from: classes5.dex */
public abstract class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f400384e;

    /* renamed from: f, reason: collision with root package name */
    public final ev3.b f400385f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f400386g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f400387h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f400388i = "MicroMsg.AbsMusicPickerListItemConvert";

    public e(yz5.p pVar, ev3.b bVar, boolean z17, boolean z18) {
        this.f400384e = pVar;
        this.f400385f = bVar;
        this.f400386g = z17;
        this.f400387h = z18;
    }

    public static void n(rv3.e eVar, android.view.View view, rv3.v musicState, java.util.List list, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeItemContentDescription");
        }
        if ((i17 & 4) != 0) {
            list = kz5.p0.f313996d;
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(musicState, "musicState");
        if (view != null) {
            view.setContentDescription((kotlin.jvm.internal.o.b(musicState, rv3.y.f400419a) ? i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.g6m) : "") + com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dbs;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    @Override // in5.r
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, rv3.h r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.e.h(in5.s0, rv3.h, int, int, boolean, java.util.List):void");
    }

    public void p(android.widget.TextView textView, java.util.ArrayList singers) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(singers, "singers");
        textView.setText(com.tencent.mm.sdk.platformtools.t8.c1(singers, ","));
    }

    public void q(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.FG_1));
    }

    public void r(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.FG_1));
    }

    public final void s(java.lang.String str, android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageDrawable(i65.a.i(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cld));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        e17.c(ya2.l.f460502a.e(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
    }

    public final void t(int i17, android.view.View backgroundView, com.tencent.mm.view.MMPAGView pagView, rv3.v musicState) {
        kotlin.jvm.internal.o.g(backgroundView, "backgroundView");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        kotlin.jvm.internal.o.g(musicState, "musicState");
        com.tencent.mars.xlog.Log.i(this.f400388i, "setPagViewState listenId:" + i17 + " state:" + musicState);
        if (kotlin.jvm.internal.o.b(musicState, rv3.w.f400417a) ? true : kotlin.jvm.internal.o.b(musicState, rv3.x.f400418a) ? true : musicState instanceof rv3.u) {
            if (pagView.f()) {
                pagView.n();
            }
            if (pagView.getVisibility() == 0) {
                pagView.setVisibility(8);
            }
            backgroundView.setBackground(backgroundView.getContext().getResources().getDrawable(com.tencent.mm.R.color.a9e));
            return;
        }
        if (kotlin.jvm.internal.o.b(musicState, rv3.y.f400419a)) {
            if (!pagView.f()) {
                pagView.g();
            }
            if (pagView.getVisibility() == 8) {
                pagView.setVisibility(0);
            }
            backgroundView.setBackground(backgroundView.getContext().getResources().getDrawable(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
        }
    }

    public void u(android.widget.TextView textView, java.lang.String str) {
        kotlin.jvm.internal.o.g(textView, "textView");
        textView.setText(str);
    }

    public void v(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.FG_0));
    }

    public final void w(android.widget.TextView textView, boolean z17) {
        if (textView == null) {
            return;
        }
        if (z17) {
            textView.setText(com.tencent.mm.R.string.p4w);
        } else {
            textView.setText(com.tencent.mm.R.string.p4v);
        }
    }
}
