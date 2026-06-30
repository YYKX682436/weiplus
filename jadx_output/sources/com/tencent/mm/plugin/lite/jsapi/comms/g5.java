package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class g5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i5 f143586d;

    public g5(com.tencent.mm.plugin.lite.jsapi.comms.i5 i5Var) {
        this.f143586d = i5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.p8 a17 = c01.n8.a();
        com.tencent.mm.plugin.lite.jsapi.comms.i5 i5Var = this.f143586d;
        ((c01.k7) a17).f(i5Var.f143611e);
        i5Var.f143614h.f143443f.a("cancel");
    }
}
