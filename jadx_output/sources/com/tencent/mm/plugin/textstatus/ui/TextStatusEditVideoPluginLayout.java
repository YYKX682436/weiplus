package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "", "getLayoutId", "Landroid/widget/RelativeLayout;", "D", "Ljz5/g;", "getSinghtBtnContainer", "()Landroid/widget/RelativeLayout;", "singhtBtnContainer", "Landroid/view/View;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "getRevertBtn", "()Landroid/view/View;", "revertBtn", "F", "getSendBtn", "sendBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextStatusEditVideoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew {
    public static final /* synthetic */ int G = 0;

    /* renamed from: D, reason: from kotlin metadata */
    public final jz5.g singhtBtnContainer;

    /* renamed from: E, reason: from kotlin metadata */
    public final jz5.g revertBtn;

    /* renamed from: F, reason: from kotlin metadata */
    public final jz5.g sendBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusEditVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.singhtBtnContainer = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ub(this));
        this.revertBtn = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.sb(this));
        this.sendBtn = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.tb(this));
    }

    private final android.view.View getRevertBtn() {
        java.lang.Object value = ((jz5.n) this.revertBtn).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getSendBtn() {
        java.lang.Object value = ((jz5.n) this.sendBtn).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.RelativeLayout getSinghtBtnContainer() {
        java.lang.Object value = ((jz5.n) this.singhtBtnContainer).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.RelativeLayout) value;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d0i;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onAttach() {
        super.onAttach();
        android.view.View view = getEditFinishPlugin().f465657d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        getReMuxPlugin().f465653n = new com.tencent.mm.plugin.textstatus.ui.rb(bVar, this);
        getAddEmojiPlugin().setVisibility(4);
        getAddTextPlugin().setVisibility(4);
        getAddMusicPlugin().setVisibility(4);
        getCropVideoPlugin().f14113f.setVisibility(4);
        android.view.View view = getEditFinishPlugin().f465657d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "setInvisiblePlugin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "setInvisiblePlugin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBackToRecordPlugin().setVisibility(4);
        super.r(bVar);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 63) {
            super.w(ju3.c0.B1, bundle);
            return;
        }
        if (ordinal != 66) {
            super.w(status, bundle);
            return;
        }
        super.w(status, bundle);
        if (!((bundle == null || bundle.getBoolean("PARAM_VIDEO_NEED_CROP")) ? false : true)) {
            getSinghtBtnContainer().setVisibility(4);
            return;
        }
        getSinghtBtnContainer().setVisibility(0);
        getRevertBtn().setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.vb(this));
        getSendBtn().setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.wb(this));
    }
}
