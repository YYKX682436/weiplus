package ts3;

/* loaded from: classes9.dex */
public class t implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421699d;

    public t(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421699d = readerAppUI;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421699d;
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = readerAppUI.f155056d;
        android.view.View childAt = v3Var.getChildAt(v3Var.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= readerAppUI.f155056d.getHeight() && readerAppUI.f155056d.getLastVisiblePosition() == readerAppUI.f155056d.s().getCount() - 1;
    }
}
