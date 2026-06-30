package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class h extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188209d;

    public h(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188209d = noteEditorUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            android.widget.PopupWindow popupWindow = nz4.y.h().f341660r;
            nz4.y.h().A(popupWindow != null && popupWindow.isShowing());
            android.widget.PopupWindow popupWindow2 = nz4.y.h().f341663u;
            nz4.y.h().C(popupWindow2 != null && popupWindow2.isShowing());
            nz4.y.h().I(false, 50L);
        } else if (i17 == 1) {
            nz4.y.h().n();
            nz4.y.h().p();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (i18 > 30) {
            nz4.y.h().n();
            nz4.y.h().p();
        }
        nz4.h l17 = nz4.y.h().l();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188209d;
        if ((noteEditorUI.N || ((frameLayout = noteEditorUI.f188150p) != null && frameLayout.getVisibility() == 0)) && l17.a() == 2 && nz4.z.b(recyclerView, l17.f341619a) == null) {
            noteEditorUI.b5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$14", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
