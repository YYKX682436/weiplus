package eg3;

/* loaded from: classes3.dex */
public class g extends mf3.e implements eg3.b {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f252660o;

    /* renamed from: p, reason: collision with root package name */
    public em.q1 f252661p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f252662q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, null, 2, null);
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f252660o = apiCenter;
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f252660o;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejo, (android.view.ViewGroup) null);
        this.f252661p = new em.q1(inflate);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) inflate;
    }

    public final void S() {
        android.animation.ValueAnimator valueAnimator = this.f252662q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "stopAndHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "stopAndHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void T() {
        mf3.k kVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        eg3.i c17 = kVar.c();
        if (c17 == null) {
            P("no valid translate param", new java.lang.Object[0]);
            return;
        }
        eg3.a aVar = (eg3.a) H(eg3.a.class);
        if (aVar != null) {
            eg3.f fVar = new eg3.f(this);
            com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent baseTranslationDataComponent = (com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent) aVar;
            baseTranslationDataComponent.f209134e = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            java.lang.String str = c17.f252663a;
            baseTranslationDataComponent.f209135f = str;
            baseTranslationDataComponent.f209133d = fVar;
            if ((gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) ? false : true) {
                com.tencent.mars.xlog.Log.e("MediaGallery.DefaultTranslateDataComponent", "network is not active");
                eg3.h hVar = baseTranslationDataComponent.f209133d;
                if (hVar != null) {
                    eg3.g gVar = ((eg3.f) hVar).f252659a;
                    gVar.S();
                    db5.e1.s(gVar.K(), gVar.K().getString(com.tencent.mm.R.string.f490500wu), "");
                    return;
                }
                return;
            }
            eg3.h hVar2 = baseTranslationDataComponent.f209133d;
            if (hVar2 != null) {
                eg3.g gVar2 = ((eg3.f) hVar2).f252659a;
                android.view.View M = gVar2.M();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "onTranslationStartInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(M, "com/tencent/mm/plugin/media/menu/translate/LangTranslateLayer", "onTranslationStartInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                em.q1 q1Var = gVar2.f252661p;
                if (q1Var == null) {
                    kotlin.jvm.internal.o.o("rootVB");
                    throw null;
                }
                if (q1Var.f254719c == null) {
                    q1Var.f254719c = (android.widget.ImageView) q1Var.f254717a.findViewById(com.tencent.mm.R.id.ma_);
                }
                android.widget.ImageView imageView = q1Var.f254719c;
                kotlin.jvm.internal.o.f(imageView, "getScanTranslateLine(...)");
                int k17 = i65.a.k(gVar2.K());
                android.animation.ValueAnimator valueAnimator = gVar2.f252662q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(5000L);
                ofFloat.addListener(new eg3.d(imageView));
                ofFloat.addUpdateListener(new eg3.e(imageView, k17));
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
                gVar2.f252662q = ofFloat;
            }
            com.tencent.mars.xlog.Log.i("MediaGallery.DefaultTranslateDataComponent", "start scan impl");
            dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(str);
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.m2.c(baseTranslationDataComponent.getActivity());
            kotlin.jvm.internal.o.f(c18, "getActualTranslateLanguageIso(...)");
            if (bj6 == null || !android.text.TextUtils.equals(bj6.field_toLang, c18) || !com.tencent.mm.vfs.w6.j(bj6.field_resultFile)) {
                com.tencent.mars.xlog.Log.i("MediaGallery.DefaultTranslateDataComponent", "try to translate img %s, sessionId %d", str, java.lang.Integer.valueOf(baseTranslationDataComponent.f209134e));
                com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
                am.bt btVar = scanTranslationEvent.f54738g;
                btVar.f6282a = 2;
                btVar.f6284c = str;
                btVar.f6283b = baseTranslationDataComponent.f209134e;
                baseTranslationDataComponent.f209135f = str;
                scanTranslationEvent.e();
                return;
            }
            com.tencent.mars.xlog.Log.i("MediaGallery.DefaultTranslateDataComponent", "result already exist: raw: " + str + " translated: " + bj6.field_resultFile + ", sessionId " + baseTranslationDataComponent.f209134e);
            java.util.Map map = baseTranslationDataComponent.f209136g;
            java.lang.String field_resultFile = bj6.field_resultFile;
            kotlin.jvm.internal.o.f(field_resultFile, "field_resultFile");
            ((java.util.HashMap) map).put(str, field_resultFile);
            eg3.h hVar3 = baseTranslationDataComponent.f209133d;
            if (hVar3 != null) {
                java.lang.String field_resultFile2 = bj6.field_resultFile;
                kotlin.jvm.internal.o.f(field_resultFile2, "field_resultFile");
                ((eg3.f) hVar3).a(field_resultFile2);
            }
        }
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.q1 q1Var = this.f252661p;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (q1Var.f254720d == null) {
            q1Var.f254720d = (android.widget.ImageView) q1Var.f254717a.findViewById(com.tencent.mm.R.id.ma7);
        }
        q1Var.f254720d.setOnClickListener(new eg3.c(this));
        em.q1 q1Var2 = this.f252661p;
        if (q1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (q1Var2.f254718b == null) {
            q1Var2.f254718b = (android.widget.FrameLayout) q1Var2.f254717a.findViewById(com.tencent.mm.R.id.m_d);
        }
        android.widget.FrameLayout frameLayout = q1Var2.f254718b;
        kotlin.jvm.internal.o.f(frameLayout, "getScanContainer(...)");
        android.content.Context context = frameLayout.getContext();
        int e17 = com.tencent.mm.ui.bl.e(context);
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
        i65.a.f(context, com.tencent.mm.R.dimen.f479688cn);
        i65.a.f(context, com.tencent.mm.R.dimen.f479688cn);
        i65.a.f(context, com.tencent.mm.R.dimen.f479672c9);
        i65.a.f(context, com.tencent.mm.R.dimen.f479693cs);
        int i17 = (f17 * 2) + e17;
        int i18 = com.tencent.mm.ui.bl.i(context, 0);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        }
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.topMargin = i18;
        marginLayoutParams.bottomMargin = i17;
        frameLayout.setLayoutParams(marginLayoutParams);
    }
}
