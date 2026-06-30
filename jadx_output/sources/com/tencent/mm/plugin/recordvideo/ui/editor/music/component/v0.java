package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156318d;

    public v0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156318d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156318d;
        fv3.c.a(b1Var.f266982d, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156246f, null, 2, null);
        ev3.e eVar = b1Var.B;
        if (eVar != null) {
            android.view.View view2 = b1Var.f156172m;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e) eVar).f156194a.f156222o;
            if (aVar != null) {
                aVar.l(view2);
            }
        }
        android.view.View view3 = b1Var.f156172m;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.EditText editText = b1Var.f156174o;
        if (editText != null) {
            editText.requestFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
