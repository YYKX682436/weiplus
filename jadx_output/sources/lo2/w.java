package lo2;

/* loaded from: classes8.dex */
public final class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320174d;

    public w(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI) {
        this.f320174d = finderMemberQAVideoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        new android.content.Intent().putExtra("key_is_delete", true);
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI = this.f320174d;
        finderMemberQAVideoUI.setResult(-1, finderMemberQAVideoUI.getIntent());
        finderMemberQAVideoUI.finish();
    }
}
