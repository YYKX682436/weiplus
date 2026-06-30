package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class m4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204557h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204558i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204561o;

    public m4(com.tencent.mm.ui.chatting.viewitems.o4 o4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, yb5.d dVar) {
        this.f204553d = str;
        this.f204554e = str2;
        this.f204555f = str3;
        this.f204556g = str4;
        this.f204557h = str5;
        this.f204558i = str6;
        this.f204559m = str7;
        this.f204560n = str8;
        this.f204561o = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_receiver", this.f204553d);
        intent.putExtra("key_receivertitle", this.f204554e);
        intent.putExtra("key_sendertitle", this.f204555f);
        intent.putExtra("key_sender_des", this.f204556g);
        intent.putExtra("key_receiver_des", this.f204557h);
        intent.putExtra("key_url", this.f204558i);
        intent.putExtra("key_templateid", this.f204559m);
        intent.putExtra("key_sceneid", this.f204560n);
        j45.l.j(this.f204561o.g(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, null);
    }
}
