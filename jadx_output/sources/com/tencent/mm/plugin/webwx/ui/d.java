package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.f f188000d;

    public d(com.tencent.mm.plugin.webwx.ui.f fVar) {
        this.f188000d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f188000d.f188005d.A.setChecked(!r1.isChecked());
    }
}
