package ud4;

/* loaded from: classes4.dex */
public abstract class t implements com.tencent.mm.plugin.sns.ui.v4 {

    /* renamed from: a */
    public final android.content.Context f426732a;

    /* renamed from: b */
    public final ud4.h f426733b;

    /* renamed from: c */
    public final com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426734c;

    /* renamed from: e */
    public final com.tencent.mm.plugin.sns.ui.u4 f426736e;

    /* renamed from: f */
    public float f426737f;

    /* renamed from: g */
    public final android.view.View f426738g;

    /* renamed from: h */
    public final android.widget.ImageView f426739h;

    /* renamed from: i */
    public final android.widget.TextView f426740i;

    /* renamed from: j */
    public final android.view.View f426741j;

    /* renamed from: k */
    public final android.view.View f426742k;

    /* renamed from: l */
    public final android.view.View f426743l;

    /* renamed from: m */
    public int f426744m;

    /* renamed from: n */
    public boolean f426745n = false;

    /* renamed from: d */
    public final com.tencent.mm.sdk.platformtools.n3 f426735d = new com.tencent.mm.sdk.platformtools.n3();

    public t(android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.content.Context context, java.util.List list, int i17, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, com.tencent.mm.plugin.sns.ui.u4 u4Var, ud4.d dVar, boolean z17) {
        this.f426732a = context;
        this.f426736e = u4Var;
        this.f426738g = view2;
        this.f426741j = view3;
        this.f426734c = dynamicGridView;
        this.f426743l = view4;
        this.f426739h = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f484035cs4);
        this.f426740i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.csd);
        this.f426742k = view;
        dynamicGridView.setWobbleInEditMode(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        android.content.Context context2 = ((ud4.k) this).f426732a;
        kotlin.jvm.internal.o.f(context2, "context");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        int z18 = ((com.tencent.mm.plugin.sns.model.l4.Hj().z1() - (context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480609ab1) * 4)) - (context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479870hj) * 2)) / 3;
        int i18 = com.tencent.mm.plugin.sns.model.l4.f164406y0;
        z18 = z18 > i18 ? i18 : z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        this.f426744m = z18;
        dynamicGridView.setColumnWidth(z18 + (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480609ab1) * 2));
        dynamicGridView.setNumColumns(3);
        dynamicGridView.setOverScrollMode(2);
        dynamicGridView.setStretchMode(0);
        dynamicGridView.setClipChildren(false);
        dynamicGridView.setClipToPadding(false);
        dynamicGridView.setSelector(new android.graphics.drawable.ColorDrawable(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        ud4.h hVar = new ud4.h(context, list, 3, i17, z17, false, dVar);
        this.f426733b = hVar;
        int i19 = this.f426744m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        hVar.f426711s = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        f();
        dynamicGridView.setAdapter2((android.widget.ListAdapter) hVar);
        dynamicGridView.setOnDragListener(new ud4.l(this, dynamicGridView, view3));
        dynamicGridView.setOnItemLongClickListener(new ud4.m(this));
        dynamicGridView.setOnItemClickListener(new ud4.n(this));
        dynamicGridView.setOnDropListener(new ud4.o(this, dynamicGridView, view));
        dynamicGridView.getViewTreeObserver().addOnPreDrawListener(new ud4.p(this, dynamicGridView, list));
        if (com.tencent.mm.plugin.sns.model.l4.Hj().z1() == 0) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new ud4.q(this, list), 50L);
        }
    }

    public static void a(ud4.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        android.view.View view = tVar.f426738g;
        if (view.getBackground() != null) {
            view.getBackground().clearColorFilter();
        }
        android.content.Context context = tVar.f426732a;
        view.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.Red_100));
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(context, com.tencent.mm.R.raw.trash_on_filled);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        tVar.f426739h.setImageDrawable(drawable);
        tVar.f426740i.setText(com.tencent.mm.R.string.j_a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public static /* synthetic */ android.view.View b(ud4.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        android.view.View view = tVar.f426738g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return view;
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426734c;
        if (dynamicGridView != null && dynamicGridView.getAdapter() != null) {
            ud4.h hVar = (ud4.h) dynamicGridView.getAdapter();
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            hVar.f426708p = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f426735d;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public abstract void d(int i17);

    public void e(java.util.ArrayList arrayList, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.h hVar = this.f426733b;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("DynamicGrid", "setList: count:%d, maxLimit:%d", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i17));
            hVar.c(arrayList);
            f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.h hVar = this.f426733b;
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int count = (hVar.getCount() - hVar.j()) - (hVar.f426707o ? 1 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        boolean z17 = com.tencent.mm.sdk.platformtools.x2.d().getBoolean("key_show_tips", true) && count > 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mm.sdk.platformtools.x2.d().edit().putBoolean("key_show_tips", false).commit();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mars.xlog.Log.i("DynamicGrid", "setupTipsView: show = true");
            android.view.View view = this.f426741j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f426735d.postDelayed(new ud4.r(this), 5000L);
        } else {
            com.tencent.mars.xlog.Log.i("DynamicGrid", "setupTipsView: show = false");
            android.view.View view2 = this.f426741j;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }
}
