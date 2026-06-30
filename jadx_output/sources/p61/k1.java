package p61;

/* loaded from: classes5.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352301d;

    public k1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352301d = bindMContactIntroUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352301d;
        java.lang.String str = bindMContactIntroUI.f72969o;
        if (str == null || str.equals("")) {
            return;
        }
        gm0.j1.d().g(new r61.f1(2));
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI2 = this.f352301d;
        bindMContactIntroUI2.f72970p = db5.e1.Q(bindMContactIntroUI2, bindMContactIntroUI2.getString(com.tencent.mm.R.string.f490573yv), bindMContactIntroUI.getString(com.tencent.mm.R.string.f490468vx), true, true, new p61.j1(this));
    }
}
