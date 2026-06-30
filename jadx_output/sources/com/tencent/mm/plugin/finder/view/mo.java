package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class mo implements com.tencent.mm.plugin.finder.view.wb {
    @Override // com.tencent.mm.plugin.finder.view.wb
    public boolean a(com.tencent.mm.protocal.protobuf.FinderCommentInfo comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(tagView, "tagView");
        kotlin.jvm.internal.o.g(iconView, "iconView");
        r45.k60 friend_recommend_list = comment.getFriend_recommend_list();
        java.util.LinkedList list = friend_recommend_list != null ? friend_recommend_list.getList(0) : null;
        if (list == null || list.isEmpty()) {
            return false;
        }
        r45.h60 h60Var = (r45.h60) kz5.n0.k0(list);
        java.lang.String string = h60Var != null ? h60Var.getString(0) : null;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(string, true);
        i95.m c17 = i95.n0.c(tg3.v0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String f17 = c01.a2.f(string, n17.P0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(f17);
        sb6.append(hc2.x0.f(f17, 6));
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        android.content.Context context = tagView.getContext();
        iconView.setVisibility(8);
        tagView.setVisibility(0);
        tagView.setTextColor(context.getColor(com.tencent.mm.R.color.Brand_100));
        int textSize = (int) tagView.getTextSize();
        java.lang.String string2 = list.size() == 1 ? tagView.getResources().getString(com.tencent.mm.R.string.d1r) : tagView.getContext().getString(com.tencent.mm.R.string.f492037f10, com.tencent.mm.plugin.finder.assist.w2.h(list.size()));
        kotlin.jvm.internal.o.d(string2);
        tagView.setText(new android.text.SpannableStringBuilder().append((java.lang.CharSequence) sb7).append(hc2.x0.k(string2, context, '#', com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.Brand_100, textSize, textSize, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null)));
        return true;
    }
}
