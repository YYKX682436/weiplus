package zy2;

/* loaded from: classes9.dex */
public final class h extends ot0.h {

    /* renamed from: g, reason: collision with root package name */
    public int f477396g;

    /* renamed from: j, reason: collision with root package name */
    public int f477399j;

    /* renamed from: b, reason: collision with root package name */
    public r45.jv2 f477391b = new r45.jv2();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f477392c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f477393d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f477394e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f477395f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f477397h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f477398i = "";

    @Override // ot0.h
    public ot0.h a() {
        zy2.h hVar = new zy2.h();
        hVar.m(this.f477392c);
        hVar.j(this.f477393d);
        hVar.l(this.f477394e);
        hVar.i(this.f477395f);
        hVar.h(this.f477396g);
        hVar.f477397h = this.f477397h;
        hVar.f477391b = this.f477391b;
        hVar.k(this.f477399j);
        return hVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append("<findernamecard>");
        sb6.append("<username>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f477392c));
        sb6.append("</username>");
        sb6.append("<avatar>");
        sb6.append(ot0.q.g(this.f477393d));
        sb6.append("</avatar>");
        sb6.append("<nickname>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f477394e));
        sb6.append("</nickname>");
        int i19 = this.f477399j;
        if (i19 == 0) {
            sb6.append("<auth_job>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f477395f));
            sb6.append("</auth_job>");
            sb6.append("<auth_icon>");
            sb6.append(this.f477396g);
            sb6.append("</auth_icon>");
            sb6.append("<auth_icon_url>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f477397h));
            sb6.append("</auth_icon_url>");
        } else if (i19 == 1) {
            sb6.append("<content_type>");
            sb6.append(this.f477399j);
            sb6.append("</content_type>");
        }
        sb6.append("<ecSource>");
        sb6.append(com.tencent.mm.sdk.platformtools.aa.a(this.f477398i));
        sb6.append("</ecSource>");
        sb6.append("<lastGMsgID>");
        sb6.append(com.tencent.mm.sdk.platformtools.aa.a(this.f477391b.getString(7)));
        sb6.append("</lastGMsgID>");
        sb6.append("</findernamecard>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q qVar) {
        kotlin.jvm.internal.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.findernamecard.username");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        m(str);
        java.lang.String str2 = (java.lang.String) values.get(".msg.appmsg.findernamecard.avatar");
        if (str2 == null) {
            str2 = "";
        }
        j(str2);
        java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.findernamecard.nickname");
        if (str3 == null) {
            str3 = "";
        }
        l(str3);
        java.lang.String str4 = (java.lang.String) values.get(".msg.appmsg.findernamecard.auth_job");
        if (str4 == null) {
            str4 = "";
        }
        i(str4);
        h(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".msg.appmsg.findernamecard.auth_icon"), 0));
        java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.findernamecard.auth_icon_url");
        if (str5 == null) {
            str5 = "";
        }
        this.f477397h = str5;
        java.lang.String str6 = (java.lang.String) values.get(".msg.appmsg.findernamecard.ecSource");
        if (str6 == null) {
            str6 = "";
        }
        this.f477398i = str6;
        k(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".msg.appmsg.findernamecard.content_type"), 0));
        this.f477391b.set(0, this.f477392c);
        this.f477391b.set(2, this.f477393d);
        this.f477391b.set(1, this.f477394e);
        this.f477391b.set(3, this.f477395f);
        this.f477391b.set(4, java.lang.Integer.valueOf(this.f477396g));
        this.f477391b.set(6, this.f477398i);
        r45.jv2 jv2Var = this.f477391b;
        java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.findernamecard.lastGMsgID");
        jv2Var.set(7, str7 != null ? str7 : "");
    }

    public final java.lang.String f() {
        return this.f477394e;
    }

    public final r45.jv2 g() {
        return this.f477391b;
    }

    public final void h(int i17) {
        this.f477391b.set(4, java.lang.Integer.valueOf(i17));
        this.f477396g = i17;
    }

    public final void i(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f477391b.set(3, value);
        this.f477395f = value;
    }

    public final void j(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f477391b.set(2, value);
        this.f477393d = value;
    }

    public final void k(int i17) {
        this.f477391b.set(8, java.lang.Integer.valueOf(i17));
        this.f477399j = i17;
    }

    public final void l(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f477391b.set(1, value);
        this.f477394e = value;
    }

    public final void m(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f477391b.set(0, value);
        this.f477392c = value;
    }
}
