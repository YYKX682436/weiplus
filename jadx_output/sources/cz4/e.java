package cz4;

/* loaded from: classes8.dex */
public class e extends dp1.a {
    public e(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        super(noteEditorUI);
    }

    @Override // dp1.u, dp1.x
    public android.app.Activity getActivity() {
        android.app.Activity activity = super.getActivity();
        java.util.Objects.requireNonNull(activity);
        return activity;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public void q(boolean z17) {
        android.app.Activity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) activity).m7(1);
            super.q(z17);
        }
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return super.t();
    }
}
