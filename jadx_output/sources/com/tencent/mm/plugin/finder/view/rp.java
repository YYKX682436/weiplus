package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rp implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        int likeCount = comment.getLikeCount();
        if (likeCount <= 0) {
            return false;
        }
        android.content.Context context = tagView.getContext();
        int textSize = (int) tagView.getTextSize();
        tagView.setVisibility(0);
        tagView.setTextColor(b3.l.getColor(tagView.getContext(), com.tencent.mm.R.color.adi));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        kotlin.jvm.internal.o.d(context);
        tagView.setText(spannableStringBuilder.append(hc2.x0.k("#", context, '#', com.tencent.mm.R.raw.icons_outlined_star_new, com.tencent.mm.R.color.adi, textSize, textSize, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null)).append((java.lang.CharSequence) com.tencent.mm.plugin.finder.assist.w2.o(java.lang.Math.abs(likeCount), false)));
        iconView.setVisibility(8);
        return true;
    }
}
