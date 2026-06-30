package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f135869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f135870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db0 f135874i;

    public s8(com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var, android.view.View view, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var) {
        this.f135869d = finderCommentInfo;
        this.f135870e = e9Var;
        this.f135871f = view;
        this.f135872g = s0Var;
        this.f135873h = baseFinderFeed;
        this.f135874i = db0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.api.IEmojiInfo emojiInfo;
        java.lang.String str;
        java.util.LinkedList list;
        r45.j60 j60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$beforeShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f135869d;
        if (finderCommentInfo.getContent_type() == 2) {
            r45.e60 content_info = finderCommentInfo.getContent_info();
            if (content_info == null || (list = content_info.getList(1)) == null || (j60Var = (r45.j60) kz5.n0.Z(list)) == null) {
                str = null;
            } else {
                java.lang.String string = j60Var.getString(7);
                if (string == null || string.length() == 0) {
                    java.lang.String string2 = j60Var.getString(0);
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String string3 = j60Var.getString(1);
                    str = string2.concat(string3 != null ? string3 : "");
                } else {
                    java.lang.String string4 = j60Var.getString(7);
                    if (string4 == null) {
                        string4 = "";
                    }
                    java.lang.String string5 = j60Var.getString(8);
                    str = string4.concat(string5 != null ? string5 : "");
                }
            }
            com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = this.f135870e;
            long j17 = e9Var.f134221h;
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = e9Var.f134223m;
            e9Var.i7("image_popular_comment", "view_clk", j17, finderCommentInfo2 != null ? finderCommentInfo2.getCommentId() : 0L, kz5.c1.l(new jz5.l("media_url", str)));
        } else if (finderCommentInfo.getContent_type() == 1) {
            com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var2 = this.f135870e;
            long j18 = e9Var2.f134221h;
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo3 = e9Var2.f134223m;
            long commentId = finderCommentInfo3 != null ? finderCommentInfo3.getCommentId() : 0L;
            jz5.l[] lVarArr = new jz5.l[1];
            com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = (com.tencent.mm.plugin.finder.view.FinderEmojiView) this.f135871f.findViewById(com.tencent.mm.R.id.det);
            java.lang.String md52 = (finderEmojiView == null || (emojiInfo = finderEmojiView.getEmojiInfo()) == null) ? null : emojiInfo.getMd5();
            lVarArr[0] = new jz5.l("emoticon_md5", md52 != null ? md52 : "");
            e9Var2.i7("play_finish_big_sticker_bubble", "view_clk", j18, commentId, kz5.c1.l(lVarArr));
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135873h;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo4 = this.f135870e.f134223m;
        long commentId2 = finderCommentInfo4 != null ? finderCommentInfo4.getCommentId() : 0L;
        in5.s0 s0Var = this.f135872g;
        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        java.lang.Object w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
        com.tencent.mm.plugin.finder.convert.qe qeVar = w07 instanceof com.tencent.mm.plugin.finder.convert.qe ? (com.tencent.mm.plugin.finder.convert.qe) w07 : null;
        com.tencent.mars.xlog.Log.i("Finder.DescCommentContentUIC", "jumpFinderComment commentId=" + pm0.v.u(commentId2) + ",fullConvert=" + qeVar);
        if (qeVar != null) {
            com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, s0Var, baseFinderFeed, false, commentId2, null, 0, 5, false, 1500L, 0, 2, 692, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.mb0.T6(this.f135870e, this.f135872g, this.f135874i, 0, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$beforeShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
