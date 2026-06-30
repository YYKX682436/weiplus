package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188246d;

    public o(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188246d = noteEditorUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188246d;
        if (action == 0) {
            noteEditorUI.S1 = motionEvent.getX();
            noteEditorUI.T1 = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 && noteEditorUI.f188148n.k0(motionEvent.getX(), motionEvent.getY()) == null) {
            float abs = java.lang.Math.abs(noteEditorUI.S1 - motionEvent.getX());
            float abs2 = java.lang.Math.abs(noteEditorUI.T1 - motionEvent.getY());
            if (abs < 30.0f && abs2 < 30.0f) {
                if (noteEditorUI.f188154r.getVisibility() != 8) {
                    mz4.a0 a0Var = noteEditorUI.f188155s;
                    if (a0Var != null) {
                        a0Var.f333220a.dismiss();
                    }
                    noteEditorUI.f188154r.setVisibility(8);
                } else {
                    mz4.d dVar = noteEditorUI.J1;
                    int D = dVar.D() - 1;
                    iz4.c l17 = dVar.l(D);
                    if (l17 != null) {
                        boolean z17 = l17.f296104b;
                        dVar.h();
                        l17.f296104b = true;
                        l17.f296110h = false;
                        l17.f296105c = -1;
                        if (D < noteEditorUI.f188149o.getItemCount()) {
                            noteEditorUI.f188149o.notifyItemChanged(D);
                        }
                        noteEditorUI.z7(true, 50L);
                        noteEditorUI.y7(1, 0L);
                        if (noteEditorUI.C1 && z17) {
                            noteEditorUI.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.n(this), 100L);
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float abs3 = java.lang.Math.abs(noteEditorUI.S1 - motionEvent.getX());
            float abs4 = java.lang.Math.abs(noteEditorUI.T1 - motionEvent.getY());
            if (abs3 > 120.0f || abs4 > 120.0f) {
                if (noteEditorUI.C1) {
                    if (nz4.y.h().m() == 1) {
                        noteEditorUI.b5();
                        nz4.y.h().c();
                    }
                } else if (!noteEditorUI.L) {
                    noteEditorUI.b5();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
