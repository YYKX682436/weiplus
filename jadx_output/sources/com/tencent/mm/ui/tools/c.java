package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class c implements al5.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.e f210307a;

    public c(com.tencent.mm.ui.tools.e eVar) {
        this.f210307a = eVar;
    }

    @Override // al5.p4
    public boolean a(android.app.Activity activity, android.view.MenuItem menuItem) {
        this.f210307a.getClass();
        if (activity == null) {
            return false;
        }
        activity.onOptionsItemSelected(menuItem);
        return true;
    }
}
