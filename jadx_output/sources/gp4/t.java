package gp4;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(0);
        this.f274436d = timeEditorItemContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup deleteViewGroup;
        gp4.m timeEditIcon;
        yz5.l readTextListener;
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274436d;
        deleteViewGroup = timeEditorItemContainer.getDeleteViewGroup();
        deleteViewGroup.setVisibility(8);
        timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.I);
        timeEditIcon = timeEditorItemContainer.getTimeEditIcon();
        timeEditIcon.setVisibility(4);
        android.view.KeyEvent.Callback callback = timeEditorItemContainer.f175964y;
        cw3.s sVar = callback instanceof cw3.s ? (cw3.s) callback : null;
        if (sVar != null && (readTextListener = timeEditorItemContainer.getReadTextListener()) != null) {
            readTextListener.invoke(sVar.getEditorData());
        }
        return jz5.f0.f302826a;
    }
}
