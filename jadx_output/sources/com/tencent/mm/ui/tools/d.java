package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class d implements al5.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.e f210336a;

    public d(com.tencent.mm.ui.tools.e eVar) {
        this.f210336a = eVar;
    }

    @Override // al5.p4
    public boolean a(android.app.Activity activity, android.view.MenuItem menuItem) {
        this.f210336a.getClass();
        if (activity == null) {
            return false;
        }
        activity.onOptionsItemSelected(menuItem);
        return true;
    }
}
