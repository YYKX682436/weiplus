package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/view/View;", "w", "Ljz5/g;", "getCloseView", "()Landroid/view/View;", "closeView", "x", "getFuncBottomParent", "funcBottomParent", "Landroid/widget/Button;", "y", "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RecordEditPhotoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout {
    public int A;
    public final float B;
    public boolean C;
    public final android.view.GestureDetector D;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g closeView;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g funcBottomParent;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g finishBtn;

    /* renamed from: z, reason: collision with root package name */
    public int f155833z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordEditPhotoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.closeView = jz5.h.b(new ju3.i1(this));
        this.funcBottomParent = jz5.h.b(new ju3.k1(this));
        this.finishBtn = jz5.h.b(new ju3.j1(this));
        this.f155833z = -1;
        this.A = -1;
        this.B = 0.8f;
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new ju3.o1(this));
        this.D = gestureDetector;
        android.view.View funcBottomParent = getFuncBottomParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        funcBottomParent.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View closeView = getCloseView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(closeView, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        closeView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(closeView, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        gestureDetector.setIsLongpressEnabled(false);
    }

    public static final void A(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout recordEditPhotoPluginLayout) {
        if (recordEditPhotoPluginLayout.getFuncBottomParent().getVisibility() == 0 && recordEditPhotoPluginLayout.getCloseView().getVisibility() == 0) {
            android.view.View funcBottomParent = recordEditPhotoPluginLayout.getFuncBottomParent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View closeView = recordEditPhotoPluginLayout.getCloseView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(closeView, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(closeView, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordEditPhotoPluginLayout.C = true;
            return;
        }
        if (recordEditPhotoPluginLayout.C) {
            android.view.View funcBottomParent2 = recordEditPhotoPluginLayout.getFuncBottomParent();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(funcBottomParent2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(funcBottomParent2, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View closeView2 = recordEditPhotoPluginLayout.getCloseView();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(closeView2, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(closeView2, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordEditPhotoPluginLayout.C = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getCloseView() {
        java.lang.Object value = ((jz5.n) this.closeView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.Button getFinishBtn() {
        java.lang.Object value = ((jz5.n) this.finishBtn).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.Button) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getFuncBottomParent() {
        java.lang.Object value = ((jz5.n) this.funcBottomParent).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        android.os.Bundle bundle = configProvider != null ? configProvider.M : null;
        if (bundle != null) {
            int i17 = bundle.getInt("key_preview_location_type", -1);
            int i18 = bundle.getInt("key_preview_margin_top", -1);
            int i19 = bundle.getInt("key_back_margin_top", -1);
            int i27 = bundle.getInt("key_edit_control_margin_bottom", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPluginLayout", "changeUILocation >> previewLocationType: " + i17 + ", previewMarginTop: " + i18 + ", closeMarginTop: " + i19 + ", editControlMarginBottom: " + i27);
            if (i17 != -1 && i18 != -1 && i19 != -1 && i27 != -1) {
                android.view.ViewGroup.LayoutParams layoutParams = getCloseView().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                int a17 = i19 - com.tencent.mm.ui.zk.a(getContext(), 6);
                if (a17 > 0) {
                    layoutParams2.topMargin = a17;
                    getCloseView().setLayoutParams(layoutParams2);
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = getFuncBottomParent().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                int c17 = com.tencent.mm.ui.bl.c(getFuncBottomParent().getContext());
                int a18 = (i27 - com.tencent.mm.ui.zk.a(getContext(), 40)) - c17;
                int a19 = a18 - com.tencent.mm.ui.zk.a(getContext(), 6);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPluginLayout", "changeEditControlLocation >> " + i27 + ", " + a18 + ", " + a19 + ", " + c17);
                if (a19 > 0) {
                    layoutParams4.bottomMargin = a19;
                    getFuncBottomParent().setLayoutParams(layoutParams4);
                }
                if (i17 != 2) {
                    this.f155833z = i17;
                    this.A = i18;
                } else {
                    this.f155833z = i17;
                    this.A = -1;
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = getFinishBtn().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        float dimension = getResources().getDimension(com.tencent.mm.R.dimen.f480589a91);
        float dimension2 = getResources().getDimension(com.tencent.mm.R.dimen.f479649bo);
        float dimension3 = getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        ht3.m mVar = ht3.m.f284954a;
        android.content.Context context = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int a27 = (int) mVar.a(context, dimension3);
        float dimension4 = getResources().getDimension(com.tencent.mm.R.dimen.f480328up);
        float dimension5 = getResources().getDimension(com.tencent.mm.R.dimen.f480329uq);
        getFinishBtn().setPadding(a27, 0, a27, 0);
        getFinishBtn().setTextSize(0, i65.a.f(getFinishBtn().getContext(), com.tencent.mm.R.dimen.f479897ia));
        android.content.Context context2 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        layoutParams6.width = (int) mVar.a(context2, dimension2);
        android.content.Context context3 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        layoutParams6.height = (int) mVar.a(context3, dimension);
        android.content.Context context4 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        layoutParams6.leftMargin = (int) mVar.a(context4, dimension4);
        android.content.Context context5 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        layoutParams6.rightMargin = (int) mVar.a(context5, dimension5);
        getFinishBtn().setLayoutParams(layoutParams6);
        int dimension6 = (int) getResources().getDimension(com.tencent.mm.R.dimen.a2g);
        int dimension7 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480330ur);
        int dimension8 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480589a91);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d7o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        mVar.c(findViewById, dimension6, dimension7, dimension8);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        mVar.c(findViewById2, dimension6, dimension7, dimension8);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d7p);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        mVar.c(findViewById3, dimension6, dimension7, dimension8);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.d8r);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        mVar.c(findViewById4, dimension6, dimension7, dimension8);
        getFuncBottomParent().post(new ju3.l1(this));
        getCloseView().post(new ju3.m1(this));
        this.C = false;
        if (this.f155833z != -1) {
            getEditPhotoWrapper().f465593u = this.A;
        }
        getEditPhotoWrapper().f465594v = this.B;
        super.r(bVar);
        yt3.p0 editPhotoWrapper = getEditPhotoWrapper();
        ju3.n1 n1Var = new ju3.n1(this);
        editPhotoWrapper.getClass();
        l45.q qVar = editPhotoWrapper.f465587o;
        if (qVar != null) {
            ((l45.n) qVar).f316474o = n1Var;
        }
    }
}
