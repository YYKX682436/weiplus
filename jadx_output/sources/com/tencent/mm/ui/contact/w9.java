package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class w9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f207236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207237e;

    public w9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.util.LinkedList linkedList) {
        this.f207237e = selectContactUI;
        this.f207236d = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.ui.contact.SelectContactUI.f206536m2;
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207237e;
        selectContactUI.getClass();
        java.util.LinkedList linkedList = this.f207236d;
        iz5.a.g(null, linkedList.size() > 0);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            linkedList2.add(3);
        }
        new r35.e4(selectContactUI, new com.tencent.mm.ui.contact.x9(selectContactUI)).f(linkedList, linkedList2, null);
    }
}
