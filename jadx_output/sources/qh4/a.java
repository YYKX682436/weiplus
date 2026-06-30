package qh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // ph4.j
    public int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        return com.tencent.mm.R.drawable.f482160cg1;
    }

    @Override // ph4.j
    public java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490323rs);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.parseFrom(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) viewModel.f318724d).get(i17)).field_data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TaskBarSectionOtherViewVideoHelper", "MegaVideoFloatBallInfo parse fail", th6);
        }
        if (yj4Var.getList(6).isEmpty()) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) yj4Var.getList(6).get(0);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        java.lang.CharSequence nickname = contact != null ? contact.getNickname() : null;
        if (nickname == null) {
            nickname = new android.text.SpannableString("");
        }
        if (nickname.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = ((java.lang.Object) nickname) + i65.a.r(context, com.tencent.mm.R.string.f490324rt);
            ((ke0.e) xVar).getClass();
            nickname = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
        }
        viewHolder.f354463f.setText(nickname);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        java.lang.String coverUrl = finderMedia != null ? finderMedia.getCoverUrl() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (coverUrl == null) {
            coverUrl = "";
        }
        java.lang.String cover_url_token = finderMedia != null ? finderMedia.getCover_url_token() : null;
        if (cover_url_token == null) {
            cover_url_token = "";
        }
        java.lang.String concat = coverUrl.concat(cover_url_token);
        java.lang.String thumbUrl = finderMedia != null ? finderMedia.getThumbUrl() : null;
        if (thumbUrl == null) {
            thumbUrl = "";
        }
        java.lang.String thumb_url_token = finderMedia != null ? finderMedia.getThumb_url_token() : null;
        java.lang.String concat2 = thumbUrl.concat(thumb_url_token != null ? thumb_url_token : "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            concat = concat2;
        }
        android.widget.ImageView imageView = viewHolder.f354462e;
        imageView.setImageBitmap(null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c a17 = e17.a(ya2.l.f460502a.e(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e));
        a17.f447874e = new ap0.g(null, null, 3, null);
        a17.g(g1Var.h(mn2.f1.f329953d));
        a17.c(imageView);
        viewHolder.f354468n.setVisibility(0);
    }
}
