package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class j2 implements i21.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f206955a;

    public j2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f206955a = contactRemarkInfoModUI;
    }

    @Override // i21.o
    public void a(boolean z17, java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "upload cdn finish, succeed:%s", java.lang.Boolean.valueOf(z17));
        this.f206955a.F = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.i2(this, linkedList));
    }
}
