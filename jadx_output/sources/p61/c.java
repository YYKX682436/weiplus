package p61;

/* loaded from: classes3.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.e f352224d;

    public c(p61.e eVar) {
        this.f352224d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI = this.f352224d.f352236d;
        bindGoogleContactIntroUI.f72924n = new r61.c1(r61.b1.MM_BIND_GCONTACT_OPCODE_UNBIND, bindGoogleContactIntroUI.f72922i, 1);
        gm0.j1.d().g(bindGoogleContactIntroUI.f72924n);
        bindGoogleContactIntroUI.f72923m = db5.e1.Q(bindGoogleContactIntroUI, bindGoogleContactIntroUI.getString(com.tencent.mm.R.string.f490573yv), bindGoogleContactIntroUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new p61.g(bindGoogleContactIntroUI));
    }
}
