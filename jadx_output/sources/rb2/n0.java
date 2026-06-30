package rb2;

/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final rb2.n0 f393695a = new rb2.n0();

    public final int a(android.content.Context context, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        return z17 ? z18 ? context.getResources().getColor(com.tencent.mm.R.color.BW_90, null) : context.getResources().getColor(com.tencent.mm.R.color.Red_100, null) : z18 ? context.getResources().getColor(com.tencent.mm.R.color.BW_90, null) : context.getResources().getColor(com.tencent.mm.R.color.aju, null);
    }

    public final void b(android.content.Context context, so2.y0 item, android.widget.ImageView authView, android.widget.ImageView imageView) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        r45.ub1 wxuser_finder_identity_info;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(authView, "authView");
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = item.f410703d.u0().getAuthor_contact();
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = author_contact != null ? author_contact.getAuthInfo() : null;
        if (authInfo == null && kotlin.jvm.internal.o.b(item.f410703d.Z0(), xy2.c.e(context))) {
            ya2.b2 b17 = ya2.h.f460484a.b(item.f410703d.Z0());
            finderAuthInfo = b17 != null ? b17.field_authInfo : null;
        } else {
            finderAuthInfo = authInfo;
        }
        int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
        if (authIconType == 1 || authIconType == 2) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f460511a, authView, finderAuthInfo, 0, 4, null);
            authView.setVisibility(0);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        authView.setVisibility(8);
        if (imageView != null) {
            com.tencent.mm.protocal.protobuf.FinderContact author_contact2 = item.f410703d.u0().getAuthor_contact();
            boolean z17 = (author_contact2 == null || (wxuser_finder_identity_info = author_contact2.getWxuser_finder_identity_info()) == null || wxuser_finder_identity_info.getInteger(0) != 1) ? false : true;
            if (!item.f410703d.e1() && (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue() || !z17)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_finder_icon, i65.a.d(context, com.tencent.mm.R.color.f478526a7)));
            }
        }
    }

    public final void c(android.content.Context context, com.tencent.mm.ui.widget.imageview.WeImageView awesomeIv, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(awesomeIv, "awesomeIv");
        int a17 = a(context, z17, z18);
        awesomeIv.setImageResource(z17 ? com.tencent.mm.R.raw.icons_filled_good : com.tencent.mm.R.raw.icons_outlined_star_new);
        awesomeIv.setIconColor(a17);
    }

    public final void d(android.content.Context context, android.widget.TextView awesomeTv, boolean z17, int i17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(awesomeTv, "awesomeTv");
        if (i17 > 0) {
            awesomeTv.setVisibility(0);
            awesomeTv.setText(com.tencent.mm.plugin.finder.assist.w2.d(i17));
        } else {
            awesomeTv.setVisibility(8);
            awesomeTv.setText("");
        }
        if (z18) {
            awesomeTv.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_90, null));
        } else if (z17) {
            awesomeTv.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.Red_100, null));
        } else {
            awesomeTv.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1, null));
        }
    }
}
