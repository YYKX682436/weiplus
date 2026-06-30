package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class nb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsLabelContactListUI.ReturnSnsObjectDetailEventListener f207045d;

    public nb(com.tencent.mm.ui.contact.SnsLabelContactListUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener) {
        this.f207045d = returnSnsObjectDetailEventListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.contact.SnsLabelContactListUI.this.finish();
    }
}
