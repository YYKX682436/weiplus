package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class r0 implements com.tencent.mm.plugin.finder.view.vb {
    @Override // com.tencent.mm.plugin.finder.view.vb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        tagView.setText(tagView.getContext().getString(com.tencent.mm.R.string.cox));
        return true;
    }
}
