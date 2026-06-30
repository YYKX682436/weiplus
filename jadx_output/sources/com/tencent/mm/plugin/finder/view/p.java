package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class p implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        if ((comment.getDisplayFlag() & 512) != 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Bc).getValue()).r()).intValue() != 0) {
                tagView.setVisibility(0);
                tagView.setText(tagView.getResources().getString(com.tencent.mm.R.string.lt_));
                tagView.setTextColor(b3.l.getColor(tagView.getContext(), com.tencent.mm.R.color.Brand_100));
                iconView.setVisibility(8);
                return true;
            }
        }
        return false;
    }
}
