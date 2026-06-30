package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingBizShareMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingBizShareMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.h> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204617f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingBizShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView u17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).u(context);
        this.f204617f = u17;
        return u17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        c11.d dVar;
        z01.h hVar = (z01.h) pVar2;
        if (hVar == null) {
            return;
        }
        c11.e eVar = new c11.e();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f469039d);
        r35.h0 h0Var = r35.h0.f369120d;
        if (ot0.f.f(valueOf != null ? valueOf.intValue() : 0)) {
            h0Var = r35.h0.f369121e;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String str = hVar.f469040e;
        ((ke0.e) xVar).getClass();
        eVar.f37828d = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
        if (hVar.f469043h <= 0 || hVar.f469044i <= 0) {
            eVar.f37831g = c11.d.f37826f;
        } else {
            double a17 = com.tencent.mm.ui.chatting.viewitems.qg.a(h0Var.ordinal(), hVar.f469043h, hVar.f469044i);
            if (a17 == 1.3333333333333333d) {
                dVar = c11.d.f37825e;
            } else {
                if (a17 == 0.75d) {
                    dVar = c11.d.f37824d;
                } else {
                    dVar = a17 == 1.0d ? c11.d.f37826f : c11.d.f37826f;
                }
            }
            eVar.f37831g = dVar;
        }
        java.lang.String str2 = hVar.f469042g;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String b17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.b(str2);
        java.lang.String str3 = hVar.f469042g;
        if (str3 == null) {
            str3 = java.lang.String.valueOf(hashCode());
        }
        c11.b bVar = new c11.b(str3);
        java.lang.String str4 = hVar.f469042g;
        bVar.f37811b = str4 != null ? str4 : "";
        kotlin.jvm.internal.o.g(b17, "<set-?>");
        bVar.f37814e = b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (h0Var == r35.h0.f369121e) {
            int i17 = hVar.f469045m;
            if (i17 > 0) {
                java.lang.String d17 = ot0.g0.d(i17);
                i95.m c17 = i95.n0.c(q31.r.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                r31.m wi6 = ((q31.t) ((q31.r) c17)).wi();
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.mvvm.MvvmView c18 = ((ko.a) wi6).c(context2);
                a11.a aVar = new a11.a();
                aVar.f495d = d17;
                aVar.f499h = a84.d0.a(40);
                aVar.f497f = a84.d0.a(8);
                aVar.f498g = a84.d0.a(8);
                aVar.f496e = a84.d0.a(12);
                c18.setViewModel(aVar);
                arrayList.add(c18);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            addView(imageView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            int f17 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479714d7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(f17, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = f17;
                imageView.setLayoutParams(layoutParams);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            int f18 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479714d7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, f18));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.height = f18;
                imageView.setLayoutParams(layoutParams2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSrc", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            imageView.setImageResource(com.tencent.mm.R.drawable.bxo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSrc", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_gravity", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.gravity = 17;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_gravity", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            arrayList.add(imageView);
        }
        eVar.f37832h = new c11.c(b17, bVar, arrayList);
        a11.b bVar2 = new a11.b();
        bVar2.f503g = new af5.v(this, hVar);
        eVar.f37834m = bVar2;
        android.view.View.OnClickListener onClickListener = hVar.f469046n;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204617f;
        if (mvvmView != null) {
            mvvmView.setViewModel(eVar);
        } else {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
    }

    public /* synthetic */ ChattingBizShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingBizShareMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
