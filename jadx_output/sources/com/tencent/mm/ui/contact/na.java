package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f207043d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f207044e;

    public na(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.util.ArrayList arrayList, com.tencent.mm.ui.contact.SelectContactUI.AnonymousClass1 anonymousClass1) {
        this.f207043d = new java.lang.ref.WeakReference(selectContactUI);
        this.f207044e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = (com.tencent.mm.ui.contact.SelectContactUI) this.f207043d.get();
        if (selectContactUI == null) {
            return;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.ArrayList<java.lang.String> arrayList = this.f207044e;
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            i17 += com.tencent.mm.storage.z3.R4(next) ? 1 : 0;
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            java.lang.String stringExtra = selectContactUI.getIntent().getStringExtra("shareImagePath");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String str2 = r17 == null ? "" : r17;
            if (next == null) {
                next = "";
            }
            r70.g gVar = new r70.g(str, 0, str2, next, i0Var);
            gVar.f393108j = "select_contact_ui_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        }
        selectContactUI.C.dismiss();
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("Select_Contact", arrayList);
        selectContactUI.setResult(-1, intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11048, 1, java.lang.Integer.valueOf(arrayList.size() - i17), java.lang.Integer.valueOf(i17));
        selectContactUI.finish();
    }
}
