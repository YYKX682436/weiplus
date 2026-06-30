package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class kc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.oc f199360d;

    public kc(com.tencent.mm.ui.chatting.component.oc ocVar) {
        this.f199360d = ocVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yb5.d dVar = this.f199360d.f198580d;
        if (dVar != null) {
            dVar.J();
        }
    }
}
