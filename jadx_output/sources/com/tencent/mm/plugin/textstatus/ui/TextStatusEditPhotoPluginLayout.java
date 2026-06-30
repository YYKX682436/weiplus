package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljz5/f0;", "setOutputSize", "", "getLayoutId", "Landroid/widget/RelativeLayout;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljz5/g;", "getSinghtBtnContainer", "()Landroid/widget/RelativeLayout;", "singhtBtnContainer", "Landroid/view/View;", "F", "getRevertBtn", "()Landroid/view/View;", "revertBtn", "G", "getSendBtn", "sendBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextStatusEditPhotoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout {
    public static final /* synthetic */ int H = 0;

    /* renamed from: E, reason: from kotlin metadata */
    public final jz5.g singhtBtnContainer;

    /* renamed from: F, reason: from kotlin metadata */
    public final jz5.g revertBtn;

    /* renamed from: G, reason: from kotlin metadata */
    public final jz5.g sendBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusEditPhotoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.singhtBtnContainer = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.qb(this));
        this.revertBtn = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ob(this));
        this.sendBtn = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.pb(this));
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

    private final void setOutputSize(java.lang.String str) {
        int i17;
        int i18;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_image_size, 1920);
        int i19 = options.outWidth;
        int i27 = options.outHeight;
        if (i19 > i27) {
            i18 = (i27 * Ni) / i19;
            i17 = Ni;
        } else {
            i17 = (i19 * Ni) / i27;
            i18 = Ni;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditPhotoPluginLayout", "setOutputSize config[" + Ni + "] origin[" + options.outWidth + ',' + options.outHeight + "] target[" + i17 + ',' + i18 + ']');
        l45.q qVar = getEditPhotoWrapper().f465587o;
        if (qVar != null) {
            ((l45.n) qVar).x(i17, i18);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czz;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onAttach() {
        super.onAttach();
        android.view.View view = getEditFinishPlugin().f465657d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        getEditPencilPlugin().f465698g.setVisibility(4);
        getAddEmojiPlugin().setVisibility(4);
        getEditAddTextPlugin().setVisibility(4);
        getEditCropPhotoPlugin().f465686d.setVisibility(4);
        getBackToRecordPlugin().setVisibility(4);
        getSinghtBtnContainer().setVisibility(0);
        getRevertBtn().setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.mb(this));
        getSendBtn().setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.nb(this));
        super.r(bVar);
        kotlin.jvm.internal.o.d(bVar);
        setOutputSize(bVar.f222213j);
    }
}
