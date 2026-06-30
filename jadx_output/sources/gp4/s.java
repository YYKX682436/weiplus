package gp4;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(0);
        this.f274435d = timeEditorItemContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup deleteViewGroup;
        gp4.m timeEditIcon;
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274435d;
        deleteViewGroup = timeEditorItemContainer.getDeleteViewGroup();
        deleteViewGroup.setVisibility(8);
        timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.I);
        timeEditIcon = timeEditorItemContainer.getTimeEditIcon();
        timeEditIcon.setVisibility(4);
        yz5.l showCaptionDialogListener = timeEditorItemContainer.getShowCaptionDialogListener();
        if (showCaptionDialogListener != null) {
            android.view.View view = timeEditorItemContainer.f175964y;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.CaptionItemView");
            showCaptionDialogListener.invoke((wu3.h) view);
        }
        return jz5.f0.f302826a;
    }
}
