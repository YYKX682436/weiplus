package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.m f155435d;

    public l(com.tencent.mm.plugin.record.ui.m mVar) {
        this.f155435d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.record.ui.m mVar = this.f155435d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mVar.f155449d.f155455d.getContext(), "", mVar.f155449d.f155455d.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 12;
        z9Var.f8547t = 20;
        z9Var.f8532e = mVar.f155449d.f155455d.f155258v;
        z9Var.f8537j = new com.tencent.mm.plugin.record.ui.k(this, Q);
        favoriteOperationEvent.e();
    }
}
