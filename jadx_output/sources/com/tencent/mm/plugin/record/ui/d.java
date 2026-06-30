package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f155366d;

    public d(com.tencent.mm.plugin.record.ui.e eVar, o72.e2 e2Var) {
        this.f155366d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = com.tencent.mm.plugin.record.ui.viewWrappers.s.f155566c;
        o72.e2 e2Var = this.f155366d;
        android.view.View view = (android.view.View) ((java.util.HashMap) map).get(e2Var.field_dataId);
        if (view == null) {
            return;
        }
        et3.b bVar = (et3.b) view.getTag();
        java.lang.String b17 = bt3.z0.b(bVar);
        if (bVar.f256590a.T.equals(e2Var.field_dataId)) {
            int i17 = e2Var.field_status;
            java.lang.String str = e2Var.field_dataId;
            e2Var.v0();
            e2Var.w0();
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhn);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.lbi);
            com.tencent.mm.plugin.sight.decode.model.a aVar = (com.tencent.mm.plugin.sight.decode.model.a) view.findViewById(com.tencent.mm.R.id.h88);
            imageView.setVisibility(8);
            mMPinProgressBtn.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordAdapter", "setVideoPath " + b17);
            aVar.setCanPlay(true);
            aVar.d(b17, false, 0);
        }
    }
}
