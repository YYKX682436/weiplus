package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class t1 implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        tagView.setVisibility(8);
        iconView.setVisibility(8);
        return true;
    }
}
