package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class lo implements com.tencent.mm.plugin.finder.view.vb {
    @Override // com.tencent.mm.plugin.finder.view.vb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        if (!((comment.getDisplayFlag() & 65536) != 0) || hc2.c0.a(comment.getDisplayFlag())) {
            return false;
        }
        tagView.setText(tagView.getContext().getString(com.tencent.mm.R.string.cox));
        return true;
    }
}
