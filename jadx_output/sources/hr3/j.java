package hr3;

/* loaded from: classes.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283664d;

    public j(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283664d = addDescriptionUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f283664d;
        g4Var.f(1, addDescriptionUI.getString(com.tencent.mm.R.string.jo8));
        g4Var.f(2, addDescriptionUI.getString(com.tencent.mm.R.string.igh));
    }
}
