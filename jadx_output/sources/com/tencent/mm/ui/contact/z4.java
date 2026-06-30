package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.MMBaseSelectContactUI f207271d;

    public z4(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f207271d = mMBaseSelectContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f207271d.f206464y = ((b93.b) c93.a.a()).d();
        this.f207271d.f206463x = true;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.contact.y4(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|updateLabelList";
    }
}
