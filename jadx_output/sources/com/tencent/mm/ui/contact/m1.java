package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class m1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.n1 f207022d;

    public m1(com.tencent.mm.ui.contact.n1 n1Var) {
        this.f207022d = n1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.contact.n1 n1Var = this.f207022d;
        if (itemId == 0) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = n1Var.f207036d;
            java.lang.String str = (java.lang.String) contactRemarkImagePreviewUI.f206363g.get(contactRemarkImagePreviewUI.f206360d.getSelectedItemPosition());
            com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI2 = n1Var.f207036d;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str, contactRemarkImagePreviewUI2, null);
            return;
        }
        if (itemId == 1) {
            com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI3 = n1Var.f207036d;
            int i19 = com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.f206359o;
            contactRemarkImagePreviewUI3.getClass();
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 6, (java.lang.String) contactRemarkImagePreviewUI3.f206363g.get(contactRemarkImagePreviewUI3.f206360d.getSelectedItemPosition()));
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = contactRemarkImagePreviewUI3;
            c4Var.f6327m = 46;
            doFavoriteEvent.e();
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI4 = n1Var.f207036d;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = contactRemarkImagePreviewUI4.f206360d;
        if (mMGestureGallery == null || contactRemarkImagePreviewUI4.f206367n == null) {
            i18 = -1;
        } else {
            contactRemarkImagePreviewUI4.f206366m = true;
            int selectedItemPosition = mMGestureGallery.getSelectedItemPosition();
            if (selectedItemPosition >= 0 && selectedItemPosition < contactRemarkImagePreviewUI4.f206360d.getCount()) {
                java.util.ArrayList arrayList = contactRemarkImagePreviewUI4.f206367n.f207126d;
                if (arrayList != null) {
                    arrayList.remove(selectedItemPosition);
                }
                contactRemarkImagePreviewUI4.f206367n.notifyDataSetChanged();
            }
            i18 = contactRemarkImagePreviewUI4.f206367n.getCount();
        }
        if (i18 == 0) {
            n1Var.f207036d.U6();
        }
    }
}
