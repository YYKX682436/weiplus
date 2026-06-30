package ze0;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ze0.a f471753a = new ze0.a();

    public final boolean a(android.widget.TextView textView, java.lang.String username, bi4.c iconScene, bi4.d iconType, xe0.u0 u0Var, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        kotlin.jvm.internal.o.g(iconType, "iconType");
        if (!di4.i.d()) {
            return false;
        }
        ze0.f.f471758a.b(textView, username, iconScene, iconType, false, 0, u0Var, onClickListener);
        return true;
    }

    public final boolean b(bi4.c scene, java.lang.String str) {
        kotlin.jvm.internal.o.g(scene, "scene");
        boolean z17 = false;
        switch (scene) {
            case DEFAULT:
                return bi4.v1.g();
            case CONVERSATION_LIST:
                return bi4.v1.g();
            case CONTACT_LIST:
                return bi4.v1.g();
            case GROUP_CHAT:
                return bi4.v1.g();
            case SNS_FEED:
                if (bi4.v1.g()) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_icon_timeline_feed_fu_and, bm5.h0.RepairerConfig_TextStatus_SnsFeedFuIcon_Int, 0) == 1) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    return bi4.v1.g();
                }
                mj4.h M = ai4.m0.f5173a.M(str);
                return kotlin.jvm.internal.o.b(M != null ? ((mj4.k) M).h() : null, "2021");
            case SNS_COMMENT:
                return bi4.v1.h();
            case SNS_NOTIFICATION:
                return bi4.v1.g();
            case PLANET:
                java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
                return false;
            case PATMSG_WITH_BG:
            case PATMSG_NO_BG:
            case PRIVATE_CONVERSATION_LIST:
            case CHATROOM_AT_SOMEONE:
                break;
            case SNS_TIMELINE_NICK:
            case SNS_TIMELINE_DETAIL:
                java.text.SimpleDateFormat simpleDateFormat2 = bi4.v1.f21093a;
                break;
            case CHATTING_DND_TIPS:
            default:
                return false;
        }
        return true;
    }

    public final android.text.style.ReplacementSpan c(android.view.View view, java.lang.String userName, bi4.c iconScene, float f17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        if (di4.i.d() && view != null) {
            ak4.d c17 = ak4.g.f5625a.c(view, userName, bi4.c.DEFAULT, ze0.h.f471763a.a((int) f17, iconScene), false, null, bi4.d.OUTLINED);
            if (c17 != null) {
                return new ak4.h(c17);
            }
        }
        return bk4.i.a().q(view instanceof android.widget.TextView ? (android.widget.TextView) view : null, userName, iconScene, (int) f17);
    }
}
