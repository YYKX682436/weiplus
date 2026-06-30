package lo2;

/* loaded from: classes2.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI f320166d;

    public r(com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI finderMemberPreviewUI) {
        this.f320166d = finderMemberPreviewUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI context = this.f320166d;
        if (itemId == 10002) {
            int i18 = com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI.f121397v;
            context.getClass();
            ya2.b2 b17 = ya2.h.f460484a.b(context.f121398t);
            if (b17 != null) {
                kotlin.jvm.internal.o.g(context, "context");
                if (hz2.d.f286313a.a(ya.a.SHARE)) {
                    return;
                }
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.assist.q6(b17, context, null), 3, null);
                return;
            }
            return;
        }
        if (itemId != 10004) {
            return;
        }
        java.lang.String username = context.f121398t;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&user_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{87, username}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
