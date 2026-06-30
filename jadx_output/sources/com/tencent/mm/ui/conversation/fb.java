package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class fb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.gb f207685f;

    public fb(com.tencent.mm.ui.conversation.gb gbVar, java.lang.String str, com.tencent.mm.storage.l4 l4Var) {
        this.f207685f = gbVar;
        this.f207683d = str;
        this.f207684e = l4Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.ui.conversation.t1.c(this.f207683d, this.f207685f.f207709d, this.f207684e, true, new com.tencent.mm.ui.conversation.eb(this), null, false, true);
        }
    }
}
