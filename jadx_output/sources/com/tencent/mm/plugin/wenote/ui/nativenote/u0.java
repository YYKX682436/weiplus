package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188278e;

    public u0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, android.content.Context context) {
        this.f188278e = noteEditorUI;
        this.f188277d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188278e;
        int D = noteEditorUI.J1.D();
        int childCount = noteEditorUI.f188148n.getChildCount();
        if (D == childCount) {
            float f17 = 0.0f;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = noteEditorUI.f188148n.getChildAt(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                float translationY = childAt.getTranslationY();
                if (f17 <= childAt.getBottom() + translationY) {
                    f17 = childAt.getBottom() + translationY;
                }
            }
            if (f17 < com.tencent.mm.sdk.platformtools.d2.f(this.f188277d)[1] && f17 > 0.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) noteEditorUI.f188154r.getLayoutParams();
                layoutParams.height = (int) f17;
                noteEditorUI.f188154r.setLayoutParams(layoutParams);
            }
        }
        noteEditorUI.f188154r.setVisibility(0);
        mz4.a0 a0Var = noteEditorUI.f188155s;
        if (a0Var != null) {
            int[] iArr = {0, 0};
            android.view.View view = a0Var.f333221b;
            view.getLocationOnScreen(iArr);
            a0Var.f333220a.showAtLocation(view, 49, 0, iArr[1] + 50);
        }
    }
}
