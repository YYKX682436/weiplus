package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B%\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Landroid/view/View;", "getContentView", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getBrandWordingTv", "()Landroid/widget/TextView;", "brandWordingTv", "e", "getResultTv", "resultTv", "Landroid/graphics/drawable/Drawable;", "f", "getLoadingDrawable", "()Landroid/graphics/drawable/Drawable;", "loadingDrawable", "<set-?>", "g", "Landroid/view/View;", "getTranslateLayout", "()Landroid/view/View;", "translateLayout", "Luc4/z;", "i", "Luc4/z;", "getMenuHandler", "()Luc4/z;", "setMenuHandler", "(Luc4/z;)V", "menuHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class ImproveTranslateLayout extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int f169181n = android.graphics.Color.parseColor("#19000000");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g brandWordingTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resultTv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingDrawable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View translateLayout;

    /* renamed from: h, reason: collision with root package name */
    public bd4.f2 f169186h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public uc4.z menuHandler;

    /* renamed from: m, reason: collision with root package name */
    public boolean f169188m;

    public ImproveTranslateLayout(android.content.Context context) {
        super(context);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f19303d);
    }

    public static final /* synthetic */ android.widget.TextView c(com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout improveTranslateLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.widget.TextView resultTv = improveTranslateLayout.getResultTv();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return resultTv;
    }

    private final android.widget.TextView getBrandWordingTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object value = this.brandWordingTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    private final android.graphics.drawable.Drawable getLoadingDrawable() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object value = this.loadingDrawable.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return drawable;
    }

    private final android.widget.TextView getResultTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object value = this.resultTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        bd4.f2 f2Var = this.f169186h;
        if (f2Var != null) {
            f2Var.k();
        }
        this.f169186h = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public abstract android.view.View getContentView();

    public final uc4.z getMenuHandler() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        uc4.z zVar = this.menuHandler;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return zVar;
    }

    public final android.view.View getTranslateLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.view.View view = this.translateLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return view;
    }

    public void i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.model.r6 r6Var, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        getResultTv().setTextSize(1, 15 * i65.a.q(getContext()));
        if (i17 == 1) {
            getResultTv().setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a6m));
            getResultTv().setBackground(pc4.d.f353410a.b(false) ? null : i65.a.i(getContext(), com.tencent.mm.R.drawable.b2i));
        } else if (i17 == 2) {
            getResultTv().setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a6k));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            getResultTv().setText(com.tencent.mm.R.string.jgm);
            e();
        } else {
            getResultTv().setText(str);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(getResultTv(), 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            uc4.z zVar = this.menuHandler;
            if (pc4.d.f353410a.b(false)) {
                java.lang.CharSequence text = getResultTv().getText();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(text != null ? text.toString() : null) && zVar != null) {
                    e();
                    android.content.Context context = getContext();
                    android.widget.TextView resultTv = getResultTv();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
                    uc4.y yVar = zVar.f426467f;
                    com.tencent.mm.plugin.sns.ui.listener.c e17 = zVar.e();
                    kotlin.jvm.internal.o.d(context);
                    bd4.f2 f2Var = new bd4.f2(context, resultTv, snsInfo, yVar, e17, null, null, 0, null, 480, null);
                    this.f169186h = f2Var;
                    f2Var.j();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        }
        getResultTv().setCompoundDrawables(null, null, null, null);
        if (z17 && fp.h.c(11)) {
            com.tencent.mm.ui.tools.l5.b(getResultTv(), new bd4.e1(r6Var));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            getBrandWordingTv().setText(com.tencent.mm.R.string.b6e);
        } else {
            getBrandWordingTv().setText(str2);
        }
        getBrandWordingTv().setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        android.view.View view = this.translateLayout;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.view.View view = this.translateLayout;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f169188m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            return;
        }
        this.f169188m = true;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489183bl5, (android.view.ViewGroup) this, false);
        this.translateLayout = inflate;
        addView(inflate);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        k();
        getResultTv().setCompoundDrawables(getLoadingDrawable(), null, null, null);
        getResultTv().setCompoundDrawablePadding(i65.a.b(getContext(), 3));
        getResultTv().setText(com.tencent.mm.R.string.jgo);
        com.tencent.mm.ui.tools.l5.b(getResultTv(), null);
        getBrandWordingTv().setVisibility(4);
        getResultTv().setTextSize(0, getBrandWordingTv().getTextSize());
        getResultTv().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a6l));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void setMenuHandler(uc4.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        this.menuHandler = zVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public ImproveTranslateLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f19303d);
    }

    public ImproveTranslateLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f19303d);
    }
}
