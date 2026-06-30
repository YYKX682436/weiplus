package com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingMultiCoverViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/f;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingMultiCoverViewNew extends com.tencent.mm.mvvm.MvvmView<c11.f> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f204888h = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.v f204889f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204890g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingMultiCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e27, (android.view.ViewGroup) this, false);
        em.v vVar = new em.v(inflate);
        this.f204889f = vVar;
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f204890g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (vVar.f254856d == null) {
            vVar.f254856d = (android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.v_2);
        }
        android.view.ViewStub viewStub = vVar.f254856d;
        kotlin.jvm.internal.o.f(viewStub, "getSourceLineViewStub(...)");
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204890g;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("sourceView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        try {
            android.view.ViewParent parent = viewStub.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("DSLComponents", "inflateWithView exp=" + e17);
        }
        if (indexOfChild >= 0) {
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(viewStub);
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                if (viewGroup != null) {
                    viewGroup.addView(mvvmView, indexOfChild, layoutParams);
                }
            } else if (viewGroup != null) {
                viewGroup.addView(mvvmView, indexOfChild);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.view.View view = vVar.f254853a;
            kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
            return view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.view.View view2 = vVar.f254853a;
        kotlin.jvm.internal.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x04cb, code lost:
    
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065e  */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r28, q31.p r29) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew.e(q31.p, q31.p):void");
    }

    public /* synthetic */ ChattingMultiCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingMultiCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
