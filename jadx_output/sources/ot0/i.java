package ot0;

/* loaded from: classes9.dex */
public final class i extends ot0.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f348510e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f348511f;

    /* renamed from: g, reason: collision with root package name */
    public double f348512g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348507b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348508c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348509d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348513h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348514i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348515j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f348516k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f348517l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348518m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348519n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f348520o = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.i iVar = new ot0.i();
        iVar.f348507b = this.f348507b;
        iVar.f348508c = this.f348508c;
        iVar.f348509d = this.f348509d;
        iVar.f348510e = this.f348510e;
        iVar.f348511f = this.f348511f;
        iVar.f348512g = this.f348512g;
        iVar.f348513h = this.f348513h;
        iVar.f348514i = this.f348514i;
        iVar.f348515j = this.f348515j;
        iVar.f348516k = this.f348516k;
        iVar.f348519n = this.f348519n;
        return iVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar == null || sb6 == null || qVar.f348666i != 110) {
            return;
        }
        sb6.append("<pocketmoney>");
        java.lang.StringBuilder j17 = j(j(i(i(i(sb6, "appid", this.f348507b, false), "apppath", this.f348508c, true), "appquery", this.f348509d, true), "ishalfscreen", this.f348510e), com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, this.f348511f);
        double d17 = this.f348512g;
        if (!(d17 == 0.0d)) {
            j17.append("<heightpercent>");
            j17.append(d17);
            j17.append("</heightpercent>");
        }
        i(i(i(i(i(i(i(i(j17, "minversion", this.f348513h, false), "animin", this.f348514i, false), "animout", this.f348515j, false), "extradata", this.f348516k, true), "senderdigest", this.f348517l, false), "receiverdigest", this.f348518m, false), "sourceicon", this.f348519n, true), "paymsgid", this.f348520o, false).append("</pocketmoney>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.pocketmoney.appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f348507b = str;
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.apppath");
        if (str2 == null) {
            str2 = "";
        }
        this.f348508c = str2;
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.appquery");
        if (str3 == null) {
            str3 = "";
        }
        this.f348509d = str3;
        this.f348510e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.pocketmoney.ishalfscreen"), 0) == 1;
        this.f348511f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.pocketmoney.transparent"), 0) == 1;
        this.f348512g = com.tencent.mm.sdk.platformtools.t8.A1((java.lang.String) map.get(".msg.appmsg.pocketmoney.heightpercent"));
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.minversion");
        if (str4 == null) {
            str4 = "";
        }
        this.f348513h = str4;
        java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.animin");
        if (str5 == null) {
            str5 = "";
        }
        this.f348514i = str5;
        java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.animout");
        if (str6 == null) {
            str6 = "";
        }
        this.f348515j = str6;
        java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.extradata");
        if (str7 == null) {
            str7 = "";
        }
        this.f348516k = str7;
        java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.senderdigest");
        if (str8 == null) {
            str8 = "";
        }
        this.f348517l = str8;
        java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.receiverdigest");
        if (str9 == null) {
            str9 = "";
        }
        this.f348518m = str9;
        java.lang.String str10 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.sourceicon");
        if (str10 == null) {
            str10 = "";
        }
        this.f348519n = str10;
        java.lang.String str11 = (java.lang.String) map.get(".msg.appmsg.pocketmoney.paymsgid");
        this.f348520o = str11 != null ? str11 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppContentPocketMoneyPiece", toString());
    }

    public final java.lang.String f() {
        return this.f348520o;
    }

    public final java.lang.String g() {
        return this.f348518m;
    }

    public final java.lang.String h() {
        return this.f348517l;
    }

    public final java.lang.StringBuilder i(java.lang.StringBuilder sb6, java.lang.String str, java.lang.String str2, boolean z17) {
        if (str2.length() == 0) {
            return sb6;
        }
        sb6.append("<" + str + '>');
        if (z17) {
            str2 = ot0.q.g(str2);
        }
        sb6.append(str2);
        sb6.append("</" + str + '>');
        return sb6;
    }

    public final java.lang.StringBuilder j(java.lang.StringBuilder sb6, java.lang.String str, boolean z17) {
        if (!z17) {
            return sb6;
        }
        sb6.append("<" + str + ">1</" + str + '>');
        return sb6;
    }

    public java.lang.String toString() {
        return "AppContentPocketMoney,appId=" + this.f348507b + ",appPath=" + this.f348508c + ",appQuery=" + this.f348509d + ",payMsgId=" + this.f348520o;
    }
}
