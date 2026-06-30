package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class z90 extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f128441a;

    public z90(int i17, java.lang.String authorFinderUsername) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f128441a = authorFinderUsername;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderMemberPreviewCollectionConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                if (type == com.tencent.mm.plugin.finder.playlist.e.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.io(com.tencent.mm.plugin.finder.storage.z90.this.f128441a);
                }
                yz5.l lVar2 = lVar;
                return (lVar2 == null || (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) == null) ? new com.tencent.mm.plugin.finder.convert.z2() : rVar;
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new dx2.b(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478489a)), (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479642bh));
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }
}
