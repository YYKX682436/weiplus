package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f212291d;

    public m(com.tencent.mm.ui.widget.picker.o oVar) {
        this.f212291d = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.picker.o oVar = this.f212291d;
        oVar.f212300d = null;
        com.tencent.mm.ui.widget.picker.n nVar = oVar.f212307n;
        if (nVar != null) {
            nVar.onResult(false, 0, 0, 0);
        }
    }
}
