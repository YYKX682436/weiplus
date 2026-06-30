package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class i extends mo2.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.member.question.c cVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, appCompatActivity, authorFinderUsername, z17, i17);
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout = (com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout) holder.p(com.tencent.mm.R.id.f485882r83);
        int i17 = 0;
        finderMultiPhotoLayout.setVisibility(0);
        finderMultiPhotoLayout.b(item.getFeedObject().getMediaList().size());
        java.util.List<android.view.View> childList = finderMultiPhotoLayout.getChildList();
        com.tencent.mm.plugin.finder.member.convert.h hVar = new com.tencent.mm.plugin.finder.member.convert.h(this, holder, item);
        for (java.lang.Object obj : item.getFeedObject().getMediaList()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.mb4 mb4Var = (r45.mb4) obj;
            android.view.View view = childList.get(i17);
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
            com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) view;
            java.util.List<android.view.View> list = childList;
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null))).c(mMImageView);
            boolean z17 = this.f330391h;
            if (!z17) {
                mMImageView.setOnLongClickListener(hVar);
            }
            mMImageView.setOnClickListener(new com.tencent.mm.plugin.finder.member.convert.g(mb4Var, item, holder));
            if (!z17) {
                holder.p(com.tencent.mm.R.id.pzw).setOnLongClickListener(hVar);
            }
            i17 = i18;
            childList = list;
        }
    }
}
