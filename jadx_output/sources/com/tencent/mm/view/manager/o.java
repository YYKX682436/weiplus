package com.tencent.mm.view.manager;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.SmileyPanelManager$9 f213670e;

    public o(com.tencent.mm.view.manager.SmileyPanelManager$9 smileyPanelManager$9, java.lang.String str) {
        this.f213670e = smileyPanelManager$9;
        this.f213669d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f213670e.f213610d.d(this.f213669d);
    }
}
