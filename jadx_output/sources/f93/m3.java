package f93;

/* loaded from: classes3.dex */
public class m3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260389d;

    public m3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260389d = contactLabelSelectUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260389d;
        g4Var.d(0, contactLabelSelectUI.getResources().getColor(com.tencent.mm.R.color.f479291v7), contactLabelSelectUI.getString(com.tencent.mm.R.string.g8u));
    }
}
