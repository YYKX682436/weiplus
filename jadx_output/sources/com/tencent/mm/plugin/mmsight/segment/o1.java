package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.p1 f149064d;

    public o1(com.tencent.mm.plugin.mmsight.segment.p1 p1Var) {
        this.f149064d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f149064d.f149072d.f148962g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
