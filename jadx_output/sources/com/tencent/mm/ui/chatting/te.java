package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class te implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f202721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f202723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ue f202724i;

    public te(com.tencent.mm.ui.chatting.ue ueVar, java.lang.String str, java.lang.String str2, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str3, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f202724i = ueVar;
        this.f202719d = str;
        this.f202720e = str2;
        this.f202721f = wXMediaMessage;
        this.f202722g = str3;
        this.f202723h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f202719d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            str = zo3.p.Ui().d(this.f202720e);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.ui.chatting.ue ueVar = this.f202724i;
        android.content.Context context = ueVar.f202745a;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req c17 = com.tencent.mm.pluginsdk.model.app.w.c(context, this.f202721f, str);
        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context2 = ueVar.f202745a;
        java.lang.String str2 = this.f202722g;
        java.lang.String str3 = this.f202720e;
        com.tencent.mm.ui.chatting.se seVar = new com.tencent.mm.ui.chatting.se(this, c17);
        ((kt.c) i0Var2).getClass();
        com.tencent.mm.pluginsdk.model.app.w.x(context2, str2, str3, c17, 0, seVar, null);
    }
}
