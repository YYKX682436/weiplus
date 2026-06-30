package qm1;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm1.f f364683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f364684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364685f;

    public c(qm1.f fVar, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, yz5.l lVar) {
        this.f364683d = fVar;
        this.f364684e = finderCommentInfo;
        this.f364685f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.modelavatar.r0 n07;
        java.lang.String c17;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/BizCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qm1.f fVar = this.f364683d;
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = fVar.f364696d;
        com.tencent.mm.ui.widget.MMEditText editText = bizCommentFooter != null ? bizCommentFooter.getEditText() : null;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/BizCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.lang.String username = hc2.t.c(com.tencent.mm.sdk.platformtools.x2.f193071a, fVar.f364699g);
        java.lang.String b17 = hc2.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, fVar.f364699g);
        long c18 = c01.id.c();
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f364684e;
        java.lang.Long valueOf = java.lang.Long.valueOf(finderCommentInfo != null ? finderCommentInfo.getCommentId() : 0L);
        java.lang.String username2 = finderCommentInfo != null ? finderCommentInfo.getUsername() : null;
        java.lang.String nickname = finderCommentInfo != null ? finderCommentInfo.getNickname() : null;
        int i17 = fVar.f364699g;
        boolean a17 = hc2.c0.a(finderCommentInfo != null ? finderCommentInfo.getDisplayFlag() : 0);
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
        finderCommentInfo2.setCommentId(0L);
        finderCommentInfo2.setDisplayid(0L);
        if (i17 == 1) {
            finderCommentInfo2.setUsername(username);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.b2 b18 = ya2.h.f460484a.b(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a));
            finderCommentInfo2.setHeadUrl(b18 != null ? b18.getAvatarUrl() : "");
        } else {
            finderCommentInfo2.setUsername(c01.z1.r());
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
            if (Ni != null && (n07 = Ni.n0(finderCommentInfo2.getUsername())) != null) {
                java.lang.String c19 = n07.c();
                if (!(c19 == null || c19.length() == 0) ? (c17 = n07.c()) == null : (c17 = n07.d()) == null) {
                    c17 = "";
                }
                finderCommentInfo2.setHeadUrl(c17);
            }
        }
        finderCommentInfo2.setContent(str);
        finderCommentInfo2.setNickname(b17);
        finderCommentInfo2.setCreatetime(c01.id.a() / 1000);
        finderCommentInfo2.setDisplayFlag(i17 == 1 ? 8 : 0);
        if (valueOf != null) {
            valueOf.longValue();
            finderCommentInfo2.setReplyCommentId(valueOf.longValue());
            finderCommentInfo2.setReply_username(username2 == null ? "" : username2);
            finderCommentInfo2.setReplyNickname(nickname == null ? "" : nickname);
            if (a17) {
                finderCommentInfo2.setDisplayFlag(finderCommentInfo2.getDisplayFlag() | 16);
            }
        }
        finderCommentInfo2.setClient_id(java.lang.String.valueOf(c18));
        finderCommentInfo2.setExtFlag(1);
        long j17 = fVar.f364699g == 2 ? 2L : 3L;
        byte[] byteArray = finderCommentInfo2.toByteArray();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        kotlin.jvm.internal.o.d(byteArray);
        this.f364685f.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.CommentInputResult(str, valueOf2, byteArray))));
        qm1.f.b(fVar);
        yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/BizCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
