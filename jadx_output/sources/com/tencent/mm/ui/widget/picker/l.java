package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f212287d;

    public l(com.tencent.mm.ui.widget.picker.o oVar) {
        this.f212287d = oVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.picker.o oVar = this.f212287d;
        com.tencent.mm.ui.widget.picker.n nVar = oVar.f212307n;
        if (nVar != null) {
            nVar.onResult(false, 0, 0, 0);
        }
        oVar.b();
    }
}
