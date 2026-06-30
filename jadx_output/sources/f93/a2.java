package f93;

/* loaded from: classes.dex */
public class a2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260288d;

    public a2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260288d = contactLabelManagerUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260288d;
        g4Var.d(0, contactLabelManagerUI.getResources().getColor(com.tencent.mm.R.color.f479291v7), contactLabelManagerUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
