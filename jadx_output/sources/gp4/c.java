package gp4;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp4.j f274394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f274395e;

    public c(gp4.j jVar, ju3.d0 d0Var) {
        this.f274394d = jVar;
        this.f274395e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view instanceof zu3.b0;
        gp4.j jVar = this.f274394d;
        ju3.d0 d0Var = this.f274395e;
        if (z17) {
            zu3.b0 b0Var = (zu3.b0) view;
            b0Var.setEnableNotify(false);
            b0Var.setVisibility(4);
            zu3.a editorData = b0Var.getEditorData();
            kotlin.jvm.internal.o.e(editorData, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
            zu3.a0 a0Var = (zu3.a0) editorData;
            jVar.f274413g = a0Var;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", a0Var.f475764g);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR", a0Var.f475765h);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", a0Var.f475766i);
            bundle.putString("PARAM_EDIT_TEXT_FONT", a0Var.f475768k);
            d0Var.w(ju3.c0.P, bundle);
        } else if (view instanceof wu3.h) {
            wu3.h hVar = (wu3.h) view;
            hVar.setVisibility(4);
            r45.is currentCaption = hVar.getCurrentCaption();
            zu3.a editorData2 = hVar.getEditorData();
            kotlin.jvm.internal.o.e(editorData2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.CaptionItem");
            zu3.d dVar = (zu3.d) editorData2;
            if (currentCaption != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putByteArray("PARAM_1_BYTEARRAY", currentCaption.toByteArray());
                bundle2.putInt("PARAM_EDIT_TEXT_COLOR", dVar.f475793h);
                bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", dVar.f475794i);
                bundle2.putString("PARAM_EDIT_TEXT_FONT", dVar.f475795j);
                d0Var.w(ju3.c0.f301902s2, bundle2);
            }
        } else if (view instanceof zu3.x) {
            zu3.x xVar = (zu3.x) view;
            xVar.setVisibility(4);
            zu3.a editorData3 = xVar.getEditorData();
            kotlin.jvm.internal.o.e(editorData3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.PagStickerItem");
            jVar.f274413g = xVar.getEditorData();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putCharSequence("PARAM_EDIT_TEXT_CONTENT", ((zu3.y) editorData3).f475867i);
            d0Var.w(ju3.c0.f301918y2, bundle3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
