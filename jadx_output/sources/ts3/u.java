package ts3;

/* loaded from: classes9.dex */
public class u implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421700d;

    public u(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421700d = readerAppUI;
    }

    @Override // db5.k5
    public boolean E0() {
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.f421700d.f155056d;
        android.view.View childAt = v3Var.getChildAt(v3Var.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() == 0;
    }
}
