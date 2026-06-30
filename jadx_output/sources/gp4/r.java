package gp4;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(0);
        this.f274434d = timeEditorItemContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp4.m timeEditIcon;
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274434d;
        android.view.View.OnClickListener clickListener = timeEditorItemContainer.getClickListener();
        if (clickListener != null) {
            clickListener.onClick(timeEditorItemContainer.f175964y);
        }
        timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.I);
        android.view.View view = timeEditorItemContainer.f175964y;
        if (view != null) {
            view.setActivated(false);
        }
        timeEditorItemContainer.f175964y = null;
        timeEditIcon = timeEditorItemContainer.getTimeEditIcon();
        timeEditIcon.setVisibility(4);
        return jz5.f0.f302826a;
    }
}
