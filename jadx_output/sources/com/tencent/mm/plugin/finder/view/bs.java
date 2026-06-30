package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class bs implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        int expandCommentCount = comment.getExpandCommentCount();
        if (expandCommentCount <= 0) {
            return false;
        }
        tagView.setVisibility(0);
        tagView.setText(tagView.getResources().getString(com.tencent.mm.R.string.d0r, com.tencent.mm.plugin.finder.assist.w2.o(java.lang.Math.abs(expandCommentCount), false)));
        tagView.setTextColor(b3.l.getColor(tagView.getContext(), com.tencent.mm.R.color.adi));
        iconView.setVisibility(8);
        return true;
    }
}
