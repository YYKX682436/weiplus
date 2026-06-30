package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class c4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203693i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203696o;

    public c4(com.tencent.mm.ui.chatting.viewitems.e4 e4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, yb5.d dVar) {
        this.f203688d = str;
        this.f203689e = str2;
        this.f203690f = str3;
        this.f203691g = str4;
        this.f203692h = str5;
        this.f203693i = str6;
        this.f203694m = str7;
        this.f203695n = str8;
        this.f203696o = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_receiver", this.f203688d);
        intent.putExtra("key_receivertitle", this.f203689e);
        intent.putExtra("key_sendertitle", this.f203690f);
        intent.putExtra("key_sender_des", this.f203691g);
        intent.putExtra("key_receiver_des", this.f203692h);
        intent.putExtra("key_url", this.f203693i);
        intent.putExtra("key_templateid", this.f203694m);
        intent.putExtra("key_sceneid", this.f203695n);
        j45.l.j(this.f203696o.g(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, null);
    }
}
