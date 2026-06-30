package tu;

/* loaded from: classes3.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appmsg.ui.RecordDetailUI f422061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f422062e;

    public e(com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI, com.tencent.mm.storage.f9 f9Var) {
        this.f422061d = recordDetailUI;
        this.f422062e = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.feature.appmsg.ui.RecordDetailUI.U6(this.f422061d, this.f422062e);
        dialogInterface.dismiss();
    }
}
