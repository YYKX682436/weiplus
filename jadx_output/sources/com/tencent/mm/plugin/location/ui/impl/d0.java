package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f144775a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f144776b;

    /* renamed from: c, reason: collision with root package name */
    public double f144777c;

    /* renamed from: d, reason: collision with root package name */
    public double f144778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144780f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144782h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144783i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.modelgeo.Addr f144784j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f144785k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f144786l;

    /* renamed from: m, reason: collision with root package name */
    public int f144787m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f144788n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f144789o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f144790p;

    /* renamed from: q, reason: collision with root package name */
    public int f144791q = -1;

    public d0() {
    }

    public boolean a(com.tencent.mm.modelgeo.Addr addr) {
        this.f144784j = addr;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71211d)) {
            this.f144775a = addr.f71211d;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71216i)) {
            this.f144776b = addr.f71216i;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71217m)) {
            this.f144776b += addr.f71217m;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71218n)) {
            this.f144776b += addr.f71218n;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71219o)) {
            this.f144776b += addr.f71219o;
        }
        this.f144778d = addr.f71224t;
        this.f144777c = addr.f71225u;
        this.f144779e = "nearby_" + addr.B;
        this.f144780f = addr.f71213f;
        this.f144781g = addr.f71214g;
        this.f144782h = addr.f71216i;
        this.f144783i = addr.f71219o;
        this.f144786l = addr.f71223s;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f144775a) && com.tencent.mm.sdk.platformtools.t8.K0(this.f144776b)) {
            return false;
        }
        this.f144788n = addr.f71228x;
        return true;
    }

    public d0(r45.d35 d35Var, java.lang.String str) {
        this.f144775a = d35Var.f372034d;
        this.f144776b = d35Var.f372035e;
        this.f144777c = d35Var.f372036f;
        this.f144778d = d35Var.f372037g;
        this.f144779e = d35Var.f372038h;
        this.f144780f = d35Var.f372041n;
        this.f144781g = d35Var.f372042o;
        this.f144782h = d35Var.f372043p;
        this.f144783i = d35Var.f372045r;
        this.f144785k = str;
        this.f144789o = (com.tencent.mm.sdk.platformtools.t8.K0(d35Var.f372047t) || d35Var.f372047t.equals("0")) ? null : d35Var.f372047t;
        this.f144790p = d35Var.f372048u;
        com.tencent.mm.modelgeo.Addr addr = new com.tencent.mm.modelgeo.Addr();
        this.f144784j = addr;
        addr.f71211d = this.f144776b;
        java.lang.String str2 = this.f144781g;
        addr.f71214g = str2;
        addr.f71215h = str2;
        addr.f71216i = this.f144782h;
        addr.f71218n = this.f144783i;
        addr.f71222r = this.f144775a;
        addr.f71213f = this.f144780f;
        addr.f71225u = (float) d35Var.f372036f;
        addr.f71224t = (float) d35Var.f372037g;
        this.f144787m = 0;
    }
}
