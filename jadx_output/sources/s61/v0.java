package s61;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f403395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f403396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 f403397f;

    public v0(com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 recoverAccountUI1, int i17, int i18) {
        this.f403397f = recoverAccountUI1;
        this.f403395d = i17;
        this.f403396e = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f403395d != 4) {
            com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct import_old_account_contactsstruct = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct();
            import_old_account_contactsstruct.f63116d = 2;
            import_old_account_contactsstruct.f63120h = 1;
            import_old_account_contactsstruct.k();
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct import_old_account_contactsstruct2 = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct();
        import_old_account_contactsstruct2.f63116d = 2;
        import_old_account_contactsstruct2.f63120h = this.f403396e;
        import_old_account_contactsstruct2.k();
        this.f403397f.finish();
    }
}
