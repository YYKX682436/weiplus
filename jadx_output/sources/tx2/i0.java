package tx2;

/* loaded from: classes3.dex */
public final class i0 extends com.tencent.mm.plugin.finder.live.widget.g {
    public yz5.a A;
    public boolean B;
    public r45.h32 C;
    public java.lang.String D;
    public yz5.a E;
    public yz5.l F;
    public com.tencent.mm.protocal.protobuf.FinderContact G;

    /* renamed from: h, reason: collision with root package name */
    public final int f422582h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f422583i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f422584m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f422585n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f422586o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f422587p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f422588q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f422589r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f422590s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f422591t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f422592u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView f422593v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f422594w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f422595x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f422596y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f422597z;

    public /* synthetic */ i0(android.content.Context context, zl2.u4 u4Var, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? zl2.u4.f473988d : u4Var, (i18 & 4) != 0 ? -1 : i17);
    }

    public final void A(yz5.a aVar) {
        this.E = aVar;
        com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView bigGreenNoticeStatusView = this.f422593v;
        if (bigGreenNoticeStatusView == null) {
            return;
        }
        bigGreenNoticeStatusView.setProgressDoneAndNextAction(new tx2.t(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.c8g;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f474017a;
        android.content.Context context = this.f118381d;
        return w4Var.b(com.tencent.mm.R.layout.c8g, root, false, uiMode, context, com.tencent.mm.ui.id.b(context));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f422583i = rootView.findViewById(com.tencent.mm.R.id.q3s);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.hkj);
        if (findViewById != null) {
            findViewById.setOnClickListener(new tx2.v(this));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            findViewById = null;
        }
        this.f422584m = findViewById;
        this.f422585n = rootView.findViewById(com.tencent.mm.R.id.ihr);
        this.f422586o = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.fdo);
        this.f422587p = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fed);
        this.f422588q = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.rms);
        this.f422589r = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.fdn);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.tmx);
        this.f422590s = textView;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        this.f422591t = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.tmy);
        this.f422592u = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.tmz);
        this.f422593v = (com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView) rootView.findViewById(com.tencent.mm.R.id.evp);
        this.f422594w = rootView.findViewById(com.tencent.mm.R.id.f484598ev0);
        this.f422595x = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.euz);
        this.f422596y = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f484599ev1);
        this.f422597z = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.r1g);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x041f  */
    /* JADX WARN: Type inference failed for: r1v38, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v44, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 2306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.i0.y():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r23, r45.h32 r24, yz5.a r25) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.i0.z(java.lang.String, r45.h32, yz5.a):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, zl2.u4 uiMode, int i17) {
        super(context, false, uiMode, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f422582h = i17;
        this.f118384g.f444836c.b().setGravity(80);
        this.f118384g.f444836c.b().setWindowAnimations(com.tencent.mm.R.style.f494074dp);
    }
}
