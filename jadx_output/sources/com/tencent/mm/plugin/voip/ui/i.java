package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.j f176959d;

    public i(com.tencent.mm.plugin.voip.ui.j jVar) {
        this.f176959d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f176959d.f176964g.finish();
    }
}
