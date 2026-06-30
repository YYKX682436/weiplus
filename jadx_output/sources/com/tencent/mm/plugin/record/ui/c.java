package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.plugin.record.ui.f0 {
    public c(android.content.Context context) {
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = new com.tencent.mm.autogen.events.FavImageServiceEvent();
        am.s9 s9Var = favImageServiceEvent.f54236g;
        s9Var.f7878a = 3;
        s9Var.f7886i = context;
        favImageServiceEvent.e();
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap a(com.tencent.mm.plugin.record.ui.e0 e0Var) {
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = new com.tencent.mm.autogen.events.FavImageServiceEvent();
        am.s9 s9Var = favImageServiceEvent.f54236g;
        s9Var.f7878a = 0;
        s9Var.f7879b = e0Var.f155380a;
        s9Var.f7880c = e0Var.f155381b;
        favImageServiceEvent.e();
        return favImageServiceEvent.f54237h.f7992a;
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public android.graphics.Bitmap b(com.tencent.mm.plugin.record.ui.d0 d0Var) {
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = new com.tencent.mm.autogen.events.FavImageServiceEvent();
        am.s9 s9Var = favImageServiceEvent.f54236g;
        s9Var.f7878a = 2;
        s9Var.f7888k = false;
        boolean z17 = d0Var.f155371e;
        if (z17) {
            s9Var.f7879b = d0Var.f155367a;
            s9Var.f7887j = z17;
        } else {
            s9Var.f7879b = d0Var.f155367a;
            s9Var.f7880c = d0Var.f155368b;
            s9Var.f7881d = d0Var.f155370d;
            s9Var.getClass();
        }
        favImageServiceEvent.e();
        java.lang.String str = d0Var.f155367a.T;
        am.t9 t9Var = favImageServiceEvent.f54237h;
        android.graphics.Bitmap bitmap = t9Var.f7992a;
        boolean z18 = s9Var.f7887j;
        return t9Var.f7992a;
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public void c(com.tencent.mm.plugin.record.ui.c0 c0Var) {
        long j17 = c0Var.f155358c;
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = new com.tencent.mm.autogen.events.FavImageServiceEvent();
        am.s9 s9Var = favImageServiceEvent.f54236g;
        s9Var.f7878a = 1;
        s9Var.f7882e = c0Var.f155356a;
        s9Var.f7879b = c0Var.f155357b;
        s9Var.f7880c = c0Var.f155358c;
        s9Var.f7883f = c0Var.f155360e;
        s9Var.f7884g = c0Var.f155361f;
        s9Var.f7885h = c0Var.f155362g;
        favImageServiceEvent.e();
    }

    @Override // com.tencent.mm.plugin.record.ui.f0
    public void d() {
        com.tencent.mm.autogen.events.FavImageServiceEvent favImageServiceEvent = new com.tencent.mm.autogen.events.FavImageServiceEvent();
        favImageServiceEvent.f54236g.f7878a = 4;
        favImageServiceEvent.e();
    }
}
