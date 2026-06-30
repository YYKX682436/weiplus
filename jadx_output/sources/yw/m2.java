package yw;

/* loaded from: classes9.dex */
public final class m2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466400d;

    public m2(com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        this.f466400d = bizShareInfo;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.h(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i89), com.tencent.mm.R.raw.icons_outlined_download, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
        if (kotlin.jvm.internal.o.b(this.f466400d.isSingleImage(), java.lang.Boolean.FALSE)) {
            g4Var.h(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o1j), com.tencent.mm.R.raw.bubble_medium, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
    }
}
