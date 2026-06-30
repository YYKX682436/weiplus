package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class g2 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f206717a;

    public g2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f206717a = contactRemarkInfoModUI;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "cdn download finish!! succeed:%s remarkImageDownloadCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f206717a.R1));
        r1.R1--;
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.f2(this, i17));
        }
    }
}
