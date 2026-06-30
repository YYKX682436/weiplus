package com.tencent.mm.ui.chatting.component.appbrand;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.appbrand.d f198666d;

    public c(com.tencent.mm.ui.chatting.component.appbrand.d dVar) {
        this.f198666d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.appbrand.d dVar = this.f198666d;
        com.tencent.mm.ui.chatting.component.appbrand.f fVar = dVar.f198667e;
        fVar.f198682t.f2989e = fVar.f198685d.x();
        com.tencent.mm.ui.chatting.component.appbrand.f fVar2 = dVar.f198667e;
        ab5.z zVar = fVar2.f198682t;
        zVar.f2993i = false;
        int i17 = fVar2.f198670e;
        zVar.f2992h = i17;
        zVar.f2991g = fVar2.f198673h;
        zVar.f2988d = fVar2.f198672g;
        if (i17 == 2 || i17 == 3) {
            if (fVar2.f198679q) {
                zVar.e(1);
                return;
            } else {
                zVar.e(2);
                return;
            }
        }
        zVar.f2990f = fVar2.b();
        com.tencent.mm.ui.chatting.component.appbrand.f fVar3 = dVar.f198667e;
        if (fVar3.f198679q) {
            fVar3.f198682t.e(5);
        } else {
            fVar3.f198682t.e(6);
        }
    }
}
