package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class z implements com.tencent.mm.plugin.record.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final bt3.a3 f155587a = new bt3.a3();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.RecordVoiceBaseView f155588b;

    @Override // com.tencent.mm.plugin.record.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489385cd3, null);
        ((com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) inflate.findViewById(com.tencent.mm.R.id.p5y)).setVoiceHelper(this.f155587a);
        return inflate;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lp8);
        this.f155588b = (com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) view.findViewById(com.tencent.mm.R.id.p5y);
        r45.gp0 gp0Var = bVar.f256590a;
        if (gp0Var != null) {
            int i18 = gp0Var.f375448y;
            java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.f490600zm);
            ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
            textView.setText(java.lang.String.format("%s %s\"", string, java.lang.Integer.valueOf((int) w21.x0.m(i18))));
        } else {
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f490600zm));
        }
        int i19 = bVar.f256594e;
        if (i19 == 0) {
            this.f155588b.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        if (i19 == 1) {
            textView.setVisibility(8);
            this.f155588b.setVisibility(0);
            java.lang.String b17 = bt3.z0.b(bVar);
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 17;
            z9Var.f8533f = bVar.f256590a;
            favoriteOperationEvent.e();
            int i27 = favoriteOperationEvent.f54244h.f6134a;
            if (!com.tencent.mm.vfs.w6.j(b17)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f256590a.f375434s)) {
                    textView.setVisibility(0);
                    this.f155588b.setVisibility(8);
                } else {
                    long j17 = bVar.f256591b.field_localId;
                    java.lang.String str = bVar.f256590a.f375434s;
                    com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                    am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
                    z9Var2.f8528a = 16;
                    z9Var2.f8532e = bVar.f256591b.field_localId;
                    favoriteOperationEvent2.e();
                }
            }
            com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = this.f155588b;
            int i28 = bVar.f256590a.f375448y;
            recordVoiceBaseView.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            recordVoiceBaseView.f155338m = b17;
            recordVoiceBaseView.f155339n = i27;
            if (recordVoiceBaseView.f155337i != i28) {
                recordVoiceBaseView.f155337i = i28;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
                sb6.append((int) w21.x0.m(i28));
                sb6.append("''");
                recordVoiceBaseView.setText(sb6.toString());
            }
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void destroy() {
        bt3.a3 a3Var = this.f155587a;
        a3Var.c();
        com.tencent.mm.sdk.platformtools.SensorController sensorController = bt3.a3.f24195p;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = a3Var.f24201i;
        if (s7Var != null) {
            s7Var.b();
        }
        bt3.a3.f24195p = null;
        ((java.util.LinkedList) a3Var.f24204o).clear();
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void pause() {
        bt3.a3 a3Var = this.f155587a;
        if (a3Var != null) {
            java.util.List list = a3Var.f24204o;
            if (((java.util.LinkedList) list).size() > 0) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = (com.tencent.mm.plugin.record.ui.RecordVoiceBaseView) ((bt3.z2) it.next());
                    recordVoiceBaseView.c();
                    recordVoiceBaseView.f155336h.c();
                }
            }
        }
    }
}
