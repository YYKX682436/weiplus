package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156320d;

    public w0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156320d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f156320d.o(false);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
