package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.snackbar.i f212467a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f212468b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f212469c;

    /* renamed from: d, reason: collision with root package name */
    public int f212470d = 3500;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212471e;

    public f(android.app.Activity activity) {
        this.f212468b = activity.getApplicationContext();
        this.f212467a = new com.tencent.mm.ui.widget.snackbar.i(activity, 0);
    }

    public com.tencent.mm.ui.widget.snackbar.i a() {
        com.tencent.mm.ui.widget.snackbar.Snack snack = new com.tencent.mm.ui.widget.snackbar.Snack(this.f212469c, null, 0, null, this.f212470d, this.f212468b.getResources().getColor(com.tencent.mm.R.color.aaq), 0, this.f212471e);
        com.tencent.mm.ui.widget.snackbar.i iVar = this.f212467a;
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = iVar.f212472a;
        if (snackContainer != null) {
            android.view.View view = iVar.f212473b;
            com.tencent.mm.ui.widget.snackbar.h hVar = iVar.f212474c;
            if (view.getParent() != null && view.getParent() != snackContainer) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            com.tencent.mm.ui.widget.snackbar.n nVar = new com.tencent.mm.ui.widget.snackbar.n(snack, view, hVar, null);
            java.util.LinkedList linkedList = (java.util.LinkedList) snackContainer.f212459d;
            linkedList.offer(nVar);
            if (linkedList.size() == 1) {
                snackContainer.b(nVar, false);
            }
        }
        return iVar;
    }

    public f(android.content.Context context, android.view.View view) {
        this.f212468b = context;
        this.f212467a = new com.tencent.mm.ui.widget.snackbar.i(context, view, 0);
    }
}
