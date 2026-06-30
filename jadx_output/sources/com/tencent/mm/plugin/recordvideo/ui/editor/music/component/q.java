package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 f156303d;

    public q(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var) {
        this.f156303d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initLyrics$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = this.f156303d;
        boolean z17 = !e0Var.s(3);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.B(e0Var, z17, false, true, 2, null);
        if (z17 && !e0Var.s(1)) {
            e0Var.y();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initLyrics$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
