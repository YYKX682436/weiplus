package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public short f176538a;

    /* renamed from: b, reason: collision with root package name */
    public byte f176539b;

    /* renamed from: c, reason: collision with root package name */
    public byte f176540c;

    /* renamed from: d, reason: collision with root package name */
    public byte f176541d;

    /* renamed from: e, reason: collision with root package name */
    public byte f176542e;

    /* renamed from: f, reason: collision with root package name */
    public byte f176543f;

    /* renamed from: g, reason: collision with root package name */
    public byte f176544g;

    /* renamed from: h, reason: collision with root package name */
    public byte f176545h;

    /* renamed from: i, reason: collision with root package name */
    public byte f176546i;

    /* renamed from: j, reason: collision with root package name */
    public byte f176547j;

    /* renamed from: k, reason: collision with root package name */
    public byte f176548k;

    /* renamed from: l, reason: collision with root package name */
    public byte f176549l;

    /* renamed from: m, reason: collision with root package name */
    public byte f176550m;

    /* renamed from: n, reason: collision with root package name */
    public short f176551n;

    /* renamed from: o, reason: collision with root package name */
    public short f176552o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f176553p = new byte[18];

    public h(com.tencent.mm.plugin.voip.model.i iVar) {
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "raw S2P:" + this.f176553p);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvcEncoder", "-S2P- iKbps:" + ((int) this.f176538a) + ", fps:" + ((int) this.f176539b) + ", IP:" + (this.f176540c & 255) + ", RS:" + ((int) this.f176541d) + ", QPMin:" + ((int) this.f176542e) + ", QPMax:" + ((int) this.f176543f) + ", HPP:" + ((int) this.f176544g) + ", SWitch:" + ((int) this.f176545h) + ", Reso:" + ((int) this.f176546i) + ", Rsvd1:" + ((int) this.f176547j) + ", Rsvd2:" + ((int) this.f176548k) + ", Skip:" + ((int) this.f176549l) + ", IReq:" + ((int) this.f176550m) + ", iEncW:" + ((int) this.f176551n) + ", iEncH:" + ((int) this.f176552o));
    }
}
