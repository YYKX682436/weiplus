package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f198876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.f7 f198877g;

    public c7(com.tencent.mm.ui.chatting.component.f7 f7Var, java.lang.String str, java.lang.String str2, com.tencent.mm.storage.z3 z3Var) {
        this.f198877g = f7Var;
        this.f198874d = str;
        this.f198875e = str2;
        this.f198876f = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f198874d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int d17 = c01.h2.d(str, c01.e2.f37120d);
        com.tencent.mm.ui.chatting.component.f7 f7Var = this.f198877g;
        f7Var.f199027t = d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg:name:%s unRead:%s entryTime:%s(%s)", str, java.lang.Integer.valueOf(d17), new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(f7Var.f199025r)), java.lang.Long.valueOf(f7Var.f199025r));
        f7Var.f198580d.getClass();
        java.lang.String str2 = this.f198875e;
        if (com.tencent.mm.storage.z3.R4(str2) || com.tencent.mm.storage.z3.q4(str2)) {
            int i17 = this.f198876f.T;
        }
    }
}
