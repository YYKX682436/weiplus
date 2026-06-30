package com.tencent.mm.plugin.vlog.ui.video.improve;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\r\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Landroid/view/View;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Ljz5/g;", "getCloseView", "()Landroid/view/View;", "closeView", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "getCancelRemuxView", "cancelRemuxView", "U", "getFuncBottomParent", "funcBottomParent", "Landroid/widget/Button;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class ImproveEditorVideoCompositionPluginLayout extends com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout {

    /* renamed from: S, reason: from kotlin metadata */
    public final jz5.g closeView;

    /* renamed from: T, reason: from kotlin metadata */
    public final jz5.g cancelRemuxView;

    /* renamed from: U, reason: from kotlin metadata */
    public final jz5.g funcBottomParent;

    /* renamed from: V, reason: from kotlin metadata */
    public final jz5.g finishBtn;
    public boolean W;

    /* renamed from: p0, reason: collision with root package name */
    public int f176107p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveEditorVideoCompositionPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.closeView = jz5.h.b(new tp4.c(this));
        this.cancelRemuxView = jz5.h.b(new tp4.b(this));
        this.funcBottomParent = jz5.h.b(new tp4.e(this));
        this.finishBtn = jz5.h.b(new tp4.d(this));
        this.f176107p0 = -1;
        android.view.View funcBottomParent = getFuncBottomParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        funcBottomParent.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View closeView = getCloseView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(closeView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        closeView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(closeView, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        setOnClickListener(new tp4.a(this));
    }

    public static final void G(com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
        if (improveEditorVideoCompositionPluginLayout.getFuncBottomParent().getVisibility() == 0 && improveEditorVideoCompositionPluginLayout.getCloseView().getVisibility() == 0) {
            android.view.View funcBottomParent = improveEditorVideoCompositionPluginLayout.getFuncBottomParent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View closeView = improveEditorVideoCompositionPluginLayout.getCloseView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(closeView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(closeView, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditorVideoCompositionPluginLayout.W = true;
            return;
        }
        if (improveEditorVideoCompositionPluginLayout.W) {
            android.view.View funcBottomParent2 = improveEditorVideoCompositionPluginLayout.getFuncBottomParent();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(funcBottomParent2, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(funcBottomParent2, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View closeView2 = improveEditorVideoCompositionPluginLayout.getCloseView();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(closeView2, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(closeView2, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditorVideoCompositionPluginLayout.W = false;
        }
    }

    private final android.view.View getCancelRemuxView() {
        return (android.view.View) ((jz5.n) this.cancelRemuxView).getValue();
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

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout
    public void B(java.util.ArrayList editItems, java.util.ArrayList editData) {
        kotlin.jvm.internal.o.g(editItems, "editItems");
        kotlin.jvm.internal.o.g(editData, "editData");
        if (this.f176107p0 != 2) {
            lt3.n nVar = lt3.n.f321260a;
            int centerY = lt3.n.f321263d.centerY();
            int i17 = vt3.q.f440037a;
            float f17 = (vt3.q.f440038b / 2.0f) - centerY;
            java.util.Iterator it = editItems.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).f14211a.postTranslate(0.0f, f17);
            }
            java.util.Iterator it6 = editData.iterator();
            while (it6.hasNext()) {
                ((zu3.a) it6.next()).f475763f.postTranslate(0.0f, f17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        android.os.Bundle bundle = configProvider != null ? configProvider.M : null;
        if (bundle != null) {
            this.f176107p0 = bundle.getInt("key_preview_location_type", -1);
            int i17 = bundle.getInt("key_preview_margin_top", -1);
            int i18 = bundle.getInt("key_back_margin_top", -1);
            int i19 = bundle.getInt("key_edit_control_margin_bottom", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditorVideoCompositionPluginLayout", "changeUILocation >> previewLocationType: " + this.f176107p0 + ", previewMarginTop: " + i17 + ", closeMarginTop: " + i18 + ", editControlMarginBottom: " + i19);
            if (this.f176107p0 != -1 && i17 != -1 && i18 != -1 && i19 != -1) {
                android.view.ViewGroup.LayoutParams layoutParams = getCloseView().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                android.view.View cancelRemuxView = getCancelRemuxView();
                android.view.ViewGroup.LayoutParams layoutParams3 = cancelRemuxView != null ? cancelRemuxView.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
                int a17 = i18 - com.tencent.mm.ui.zk.a(getContext(), 6);
                if (a17 > 0) {
                    layoutParams2.topMargin = a17;
                    getCloseView().setLayoutParams(layoutParams2);
                }
                if (i18 > 0 && layoutParams4 != null) {
                    layoutParams4.topMargin = i18;
                    android.view.View cancelRemuxView2 = getCancelRemuxView();
                    if (cancelRemuxView2 != null) {
                        cancelRemuxView2.setLayoutParams(layoutParams4);
                    }
                }
                android.view.ViewGroup.LayoutParams layoutParams5 = getFuncBottomParent().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
                int c17 = com.tencent.mm.ui.bl.c(getFuncBottomParent().getContext());
                int a18 = (i19 - com.tencent.mm.ui.zk.a(getContext(), 40)) - c17;
                int a19 = a18 - com.tencent.mm.ui.zk.a(getContext(), 6);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditorVideoCompositionPluginLayout", "changeEditControlLocation >> " + a18 + ", " + a19 + ", " + c17);
                if (a19 > 0) {
                    layoutParams6.bottomMargin = a19;
                    getFuncBottomParent().setLayoutParams(layoutParams6);
                }
                int i27 = this.f176107p0;
                rp4.x mediaModel = getMediaModel();
                mediaModel.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaModel", "setPreviewLocationOffset >> previewType: " + i27 + ", topMargin: " + i17);
                mediaModel.f398707l = i17;
                mediaModel.f398708m = i27;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = getFinishBtn().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
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
        layoutParams8.width = (int) mVar.a(context2, dimension2);
        android.content.Context context3 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        layoutParams8.height = (int) mVar.a(context3, dimension);
        android.content.Context context4 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        layoutParams8.leftMargin = (int) mVar.a(context4, dimension4);
        android.content.Context context5 = getFinishBtn().getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        layoutParams8.rightMargin = (int) mVar.a(context5, dimension5);
        getFinishBtn().setLayoutParams(layoutParams8);
        int dimension6 = (int) getResources().getDimension(com.tencent.mm.R.dimen.a2g);
        int dimension7 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480330ur);
        int dimension8 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480589a91);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d7b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        mVar.c(findViewById, dimension6, dimension7, dimension8);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        mVar.c(findViewById2, dimension6, dimension7, dimension8);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d7p);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        mVar.c(findViewById3, dimension6, dimension7, dimension8);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f484169d81);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        mVar.c(findViewById4, dimension6, dimension7, dimension8);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f484177rj4);
        if (findViewById5 != null) {
            mVar.c(findViewById5, dimension6, dimension7, dimension8);
        }
        getFuncBottomParent().post(new tp4.f(this));
        getCloseView().post(new tp4.g(this));
        super.r(bVar);
        if (this.W) {
            android.view.View funcBottomParent = getFuncBottomParent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View closeView = getCloseView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(closeView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(closeView, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.W = false;
        }
    }
}
