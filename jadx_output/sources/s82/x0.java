package s82;

/* loaded from: classes9.dex */
public class x0 extends s82.c {
    public static boolean l(android.content.Context context, r45.qp0 qp0Var, r45.gp0 gp0Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVideoListItem", "handleMpVideoItem %s/%s", qp0Var.f384169n, qp0Var.f384168m);
        ot0.m1 m1Var = new ot0.m1();
        m1Var.f373348p = qp0Var.f384169n;
        m1Var.f373349q = qp0Var.f384170o;
        m1Var.f373339d = qp0Var.f384174s;
        m1Var.f373340e = qp0Var.f384175t;
        m1Var.f373341f = qp0Var.f384168m;
        m1Var.f373342g = gp0Var.f375404d;
        m1Var.f373343h = qp0Var.f384173r;
        m1Var.f373345m = qp0Var.f384164f;
        m1Var.f373346n = qp0Var.f384165g;
        m1Var.f373344i = qp0Var.f384167i;
        m1Var.f373347o = gp0Var.A;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVideoListItem", "[ImageGalleryUI] showImgGallery");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", qp0Var.f384169n);
        intent.putExtra("img_gallery_chatroom_name", false);
        r45.rp0 rp0Var = qp0Var.f384172q;
        if (rp0Var != null) {
            intent.putExtra("img_gallery_width", rp0Var.f385072f).putExtra("img_gallery_height", qp0Var.f384172q.f385073g).putExtra("img_gallery_left", qp0Var.f384172q.f385070d).putExtra("img_gallery_top", qp0Var.f384172q.f385071e);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 0);
        intent.putExtra("img_gallery_path", gp0Var.T);
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 24);
        intent.putExtra("img_preview_only", z17);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", m1Var.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavVideoListItem", "handleMpVideoItem toByteArray ex %s", e17.getMessage());
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.w0 w0Var;
        b(viewGroup);
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            w0Var = new s82.w0();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abj, null);
            a(view2, w0Var, r2Var);
            w0Var.f404850q = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.duu);
            w0Var.f404851r = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dx7);
        } else {
            view2 = view;
            w0Var = (s82.w0) view.getTag();
        }
        w0Var.f404851r.setVisibility(0);
        java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
        if (linkedList.size() <= 0 || ((r45.gp0) linkedList.getFirst()).f375448y <= 0) {
            w0Var.f404851r.setText("");
        } else {
            w0Var.f404851r.setText(com.tencent.mm.plugin.fav.ui.w6.b(context, ((r45.gp0) linkedList.getFirst()).f375448y));
        }
        g(w0Var, r2Var);
        s82.c.j(w0Var.f404850q, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        k(w0Var.f404850q);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView = w0Var.f404850q;
        int i17 = this.f404737a;
        raVar.c(imageView, J2, r2Var, com.tencent.mm.R.raw.app_attach_file_icon_video, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.hp0 hp0Var;
        s82.w0 w0Var = (s82.w0) view.getTag();
        android.content.Context context = view.getContext();
        r45.gp0 J2 = o72.x1.J(w0Var.f404774a);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.duu);
        if (J2 != null && (hp0Var = J2.J1) != null && hp0Var.f376370x != null) {
            int[] iArr = new int[2];
            if (findViewById != null) {
                int width = findViewById.getWidth();
                int height = findViewById.getHeight();
                findViewById.getLocationInWindow(iArr);
                r45.qp0 qp0Var = J2.J1.f376370x;
                r45.rp0 rp0Var = new r45.rp0();
                qp0Var.f384172q = rp0Var;
                rp0Var.f385070d = iArr[0];
                rp0Var.f385071e = iArr[1];
                rp0Var.f385072f = width;
                rp0Var.f385073g = height;
            }
        }
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, w0Var.f404774a, dq0Var);
    }
}
