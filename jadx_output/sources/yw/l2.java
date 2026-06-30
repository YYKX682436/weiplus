package yw;

/* loaded from: classes9.dex */
public final class l2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466392d;

    public l2(com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        this.f466392d = bizShareInfo;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.h(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m));
        java.lang.Long shareType = this.f466392d.getShareType();
        if (shareType != null && ((int) shareType.longValue()) == com.tencent.pigeon.biz.BizShareInfoType.TYPE_IMAGE.ordinal()) {
            return;
        }
        g4Var.h(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
    }
}
