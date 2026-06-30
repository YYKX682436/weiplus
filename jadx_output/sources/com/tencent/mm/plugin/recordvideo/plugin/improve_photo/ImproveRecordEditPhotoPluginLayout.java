package com.tencent.mm.plugin.recordvideo.plugin.improve_photo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveBaseEditPhotoLayout;", "Landroid/view/View;", "w", "Ljz5/g;", "getTopLayout", "()Landroid/view/View;", "topLayout", "x", "getFuncBottomParent", "funcBottomParent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImproveRecordEditPhotoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout {
    public final float A;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g topLayout;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g funcBottomParent;

    /* renamed from: y, reason: collision with root package name */
    public int f155766y;

    /* renamed from: z, reason: collision with root package name */
    public int f155767z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveRecordEditPhotoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.topLayout = jz5.h.b(new du3.l4(this));
        this.funcBottomParent = jz5.h.b(new du3.i4(this));
        this.f155766y = -1;
        this.f155767z = -1;
        this.A = 0.8f;
        android.view.View funcBottomParent = getFuncBottomParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        funcBottomParent.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View topLayout = getTopLayout();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(topLayout, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        topLayout.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(topLayout, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getFuncBottomParent() {
        java.lang.Object value = ((jz5.n) this.funcBottomParent).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getTopLayout() {
        java.lang.Object value = ((jz5.n) this.topLayout).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        android.os.Bundle bundle = configProvider != null ? configProvider.M : null;
        if (bundle != null) {
            int i17 = bundle.getInt("key_preview_location_type", -1);
            int i18 = bundle.getInt("key_preview_margin_top", -1);
            int i19 = bundle.getInt("key_back_margin_top", -1);
            int i27 = bundle.getInt("key_edit_control_margin_bottom", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordEditPhotoPluginLayout", "changeUILocation >> previewLocationType: " + i17 + ", previewMarginTop: " + i18 + ", closeMarginTop: " + i19 + ", editControlMarginBottom: " + i27);
            if (i17 != -1 && i18 != -1 && i19 != -1 && i27 != -1) {
                android.view.ViewGroup.LayoutParams layoutParams = getTopLayout().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                if (i19 > 0) {
                    layoutParams2.topMargin = i19;
                    getTopLayout().setLayoutParams(layoutParams2);
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = getFuncBottomParent().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                int a17 = i27 - com.tencent.mm.ui.zk.a(getContext(), 9);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordEditPhotoPluginLayout", "changeEditControlLocation >> " + i27 + ", " + a17);
                if (a17 > 0) {
                    layoutParams4.bottomMargin = a17;
                    getFuncBottomParent().setLayoutParams(layoutParams4);
                }
                if (i17 != 2) {
                    this.f155766y = i17;
                    this.f155767z = i18;
                } else {
                    this.f155766y = i17;
                    this.f155767z = -1;
                }
            }
        }
        getFuncBottomParent().post(new du3.j4(this));
        getTopLayout().post(new du3.k4(this));
        if (this.f155766y != -1) {
            getPreviewPlugin().f243732v = this.f155767z;
        }
        getPreviewPlugin().f243731u = this.A;
        super.r(bVar);
    }
}
