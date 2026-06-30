package o00;

/* loaded from: classes9.dex */
public final class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI f341853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341854e;

    public a(com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI ecsGiftExclusiveSelectContactUI, java.lang.String str) {
        this.f341853d = ecsGiftExclusiveSelectContactUI;
        this.f341854e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.feature.ecs.gift.ui.EcsGiftExclusiveSelectContactUI.F;
        this.f341853d.w7(this.f341854e);
    }
}
