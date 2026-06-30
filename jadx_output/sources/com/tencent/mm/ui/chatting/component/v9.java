package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class v9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.w9 f200123f;

    public v9(int i17, java.lang.String str, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.component.w9 w9Var) {
        this.f200121d = str;
        this.f200122e = f9Var;
        this.f200123f = w9Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("framesetname:");
            java.lang.String str = this.f200121d;
            sb6.append(str);
            sb6.append(", msg id:");
            com.tencent.mm.storage.f9 f9Var = this.f200122e;
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", sb6.toString());
            if (f9Var != null) {
                com.tencent.mm.ui.chatting.component.w9 w9Var = this.f200123f;
                db5.e1.B(w9Var.f198580d.g(), w9Var.f198580d.g().getString(com.tencent.mm.R.string.bav), "", w9Var.f198580d.g().getString(com.tencent.mm.R.string.boo), w9Var.f198580d.g().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.component.u9(f9Var, w9Var, str), null, com.tencent.mm.R.color.f478622ch);
            }
        }
    }
}
