package hr3;

/* loaded from: classes11.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283534d;

    public f(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283534d = addDescriptionUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f283534d;
        addDescriptionUI.f153641t.clear();
        addDescriptionUI.f153641t.addAll(addDescriptionUI.f153640s);
        addDescriptionUI.Z6();
        addDescriptionUI.finish();
    }
}
