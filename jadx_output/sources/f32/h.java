package f32;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f259295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259296e;

    public h(android.content.Context context, com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView) {
        this.f259295d = context;
        this.f259296e = stickerPreviewView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f259295d;
        y9.i iVar = new y9.i(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode stickerPreviewChangeMode = new com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode(context, null);
        stickerPreviewChangeMode.setBackgroundResource(com.tencent.mm.R.drawable.emoji_capture_sticker_panel_bg);
        stickerPreviewChangeMode.setOnModeSelected(new f32.g(this.f259296e, iVar));
        iVar.setContentView(stickerPreviewChangeMode);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
