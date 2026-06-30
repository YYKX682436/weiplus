package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class q implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        if (!hc2.c0.c(comment.getDisplayFlag())) {
            return false;
        }
        tagView.setVisibility(0);
        tagView.setText(tagView.getContext().getString(com.tencent.mm.R.string.o8a));
        tagView.setTextColor(b3.l.getColor(tagView.getContext(), com.tencent.mm.R.color.Brand_100));
        iconView.setVisibility(8);
        return true;
    }
}
