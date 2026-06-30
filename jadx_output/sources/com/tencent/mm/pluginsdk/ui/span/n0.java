package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class n0 implements db5.r4 {
    @Override // db5.r4
    public void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        java.lang.String str = itemId != 1 ? itemId != 2 ? itemId != 3 ? "" : "email_actionsheet_copy_link" : "email_actionsheet_send_using_default_mail" : "email_actionsheet_send_using_qq_mail";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 8, 28603);
    }
}
