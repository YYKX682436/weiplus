package tk4;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f419997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q11.b f419998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, bw5.d2 d2Var, q11.b bVar) {
        super(0);
        this.f419996d = tingAudioPushConfigLogic;
        this.f419997e = d2Var;
        this.f419998f = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        q11.b bVar = this.f419998f;
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f359534d : null;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419996d;
        long j17 = tingAudioPushConfigLogic.f174647i;
        bw5.d2 d2Var = this.f419997e;
        tingAudioPushConfigLogic.i(d2Var, j17);
        if (tingAudioPushConfigLogic.c()) {
            tingAudioPushConfigLogic.i(d2Var, tingAudioPushConfigLogic.f174650l);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map j18 = tingAudioPushConfigLogic.j(d2Var);
            ((java.util.HashMap) j18).put("view_id", "tyt_push_bubble");
            ((cy1.a) rVar).yj("view_exp", null, j18, 5, false);
            java.lang.Object value = ((jz5.n) tingAudioPushConfigLogic.f174658t).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.content.Context context = (android.content.Context) value;
            bw5.e2 e2Var = d2Var.f26287n[7] ? d2Var.f26286m : new bw5.e2();
            kotlin.jvm.internal.o.f(e2Var, "getShowInfo(...)");
            tk4.c0 c0Var = tingAudioPushConfigLogic.f174659u;
            tk4.k kVar = new tk4.k(tingAudioPushConfigLogic, d2Var, c0Var);
            tk4.l lVar = new tk4.l(tingAudioPushConfigLogic, d2Var, c0Var);
            c0Var.getClass();
            if (c0Var.f419963a == null) {
                java.lang.Object systemService = context.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                c0Var.f419963a = new cl5.a((android.view.WindowManager) systemService);
            }
            if (c0Var.f419964b == null) {
                c0Var.f419966d = new android.view.GestureDetector(context, c0Var.f419971i);
                c0Var.f419964b = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.doq, (android.view.ViewGroup) null, false);
            }
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
            layoutParams.flags = 2621992;
            layoutParams.format = -3;
            layoutParams.packageName = context.getPackageName();
            layoutParams.gravity = 49;
            layoutParams.width = -2;
            layoutParams.height = -2;
            android.view.View view = c0Var.f419964b;
            if (view != null) {
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487322r52);
                android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487320r50);
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.rbf);
                android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                }
                android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
                if (paint2 != null) {
                    paint2.setStrokeWidth(0.8f);
                }
                boolean[] zArr = e2Var.f26693g;
                textView.setText(zArr[1] ? e2Var.f26690d : "");
                textView2.setText(zArr[2] ? e2Var.f26691e : "");
                imageView.setImageBitmap(bitmap);
                view.setOnTouchListener(new tk4.v(c0Var, view));
                view.setOnClickListener(new tk4.w(lVar));
                ((android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f487321r51)).setOnClickListener(new tk4.x(kVar));
            }
            android.view.View view2 = c0Var.f419964b;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager", "show", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/AudioPushShowInfo;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager", "show", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/AudioPushShowInfo;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewManager viewManager = c0Var.f419963a;
                if (viewManager != null) {
                    viewManager.addView(view2, layoutParams);
                }
                view2.post(new tk4.a0(c0Var, view2));
            }
            new tk4.b0(c0Var).sendEmptyMessageDelayed(0, 8000L);
        } else {
            tingAudioPushConfigLogic.i(d2Var, tingAudioPushConfigLogic.f174649k);
            com.tencent.mars.xlog.Log.w(tingAudioPushConfigLogic.f174639a, "tryShowPushTips fail, isFeatureAvailable = false");
        }
        return jz5.f0.f302826a;
    }
}
