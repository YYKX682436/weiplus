package com.tencent.mm.plugin.xlabeffect;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/xlabeffect/XEffectConfig;", "Landroid/os/Parcelable;", "xeffect-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class XEffectConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.xlabeffect.XEffectConfig> CREATOR = new p05.n4();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: d, reason: collision with root package name */
    public int f188596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f188597e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f188598f;

    /* renamed from: g, reason: collision with root package name */
    public int f188599g;

    /* renamed from: h, reason: collision with root package name */
    public int f188600h;

    /* renamed from: i, reason: collision with root package name */
    public int f188601i;

    /* renamed from: m, reason: collision with root package name */
    public int f188602m;

    /* renamed from: n, reason: collision with root package name */
    public int f188603n;

    /* renamed from: o, reason: collision with root package name */
    public int f188604o;

    /* renamed from: p, reason: collision with root package name */
    public int f188605p;

    /* renamed from: q, reason: collision with root package name */
    public int f188606q;

    /* renamed from: r, reason: collision with root package name */
    public int f188607r;

    /* renamed from: s, reason: collision with root package name */
    public int f188608s;

    /* renamed from: t, reason: collision with root package name */
    public int f188609t;

    /* renamed from: u, reason: collision with root package name */
    public int f188610u;

    /* renamed from: v, reason: collision with root package name */
    public int f188611v;

    /* renamed from: w, reason: collision with root package name */
    public int f188612w;

    /* renamed from: x, reason: collision with root package name */
    public int f188613x;

    /* renamed from: y, reason: collision with root package name */
    public int f188614y;

    /* renamed from: z, reason: collision with root package name */
    public int f188615z;

    public XEffectConfig(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        this.f188599g = json.optInt("skinSmooth");
        this.f188600h = json.optInt("eyeMorph");
        this.f188601i = json.optInt("faceMorph");
        this.f188602m = json.optInt("skinBright");
        this.f188603n = json.optInt("eyeBright");
        this.f188604o = json.optInt("rosy");
        this.f188605p = json.optInt("eyePouch");
        this.f188606q = json.optInt("smileFolds");
        this.f188607r = json.optInt("sharpen");
        this.f188608s = json.optInt("teethBright");
        this.f188609t = json.optInt("smallHead");
        this.f188610u = json.optInt("cheekBone");
        this.f188611v = json.optInt("lowerJawbone");
        this.f188612w = json.optInt("wingOfNose");
        this.f188613x = json.optInt("chinShort");
        this.f188614y = json.optInt("chinLong");
        this.f188615z = json.optInt("hairLineHigh");
        this.A = json.optInt("hairLineLow");
        this.B = json.optInt("bigEye");
        this.C = json.optInt("boySlim");
        this.D = json.optInt("girlSlim");
        this.E = json.optInt("mouthMorph");
        this.F = json.optInt("zhaiLian");
        this.G = json.optInt("contour");
        this.H = json.optInt("filterRate");
    }

    public final java.lang.String a() {
        return r26.b0.b("\n               enableBeautify:" + this.f188597e + "\n               enableFilter:" + this.f188598f + "\n               skinSmooth:" + this.f188599g + "\n               eyeMorph:" + this.f188600h + "\n               faceMorph:" + this.f188601i + "\n               skinBright:" + this.f188602m + "\n               eyeBright:" + this.f188603n + "\n               rosy:" + this.f188604o + "\n               eyePouch:" + this.f188605p + "\n               smileFolds:" + this.f188606q + "\n               sharpen" + this.f188607r + "\n               teethBright" + this.f188608s + "\n               smallHead:" + this.f188609t + "\n               cheekBone:" + this.f188610u + "\n               lowerJawbone:" + this.f188611v + "\n               wingOfNose:" + this.f188612w + "\n               chinShort:" + this.f188613x + "\n               hairLineHigh:" + this.f188615z + "\n               hairLineLow:" + this.A + "\n               bigEye:" + this.B + "\n               boySlim:" + this.C + "\n               girlSlim:" + this.D + "\n               mouthMorph:" + this.E + "\n               zhaiLian:" + this.F + "\n               contour:" + this.G + "\n               filterRate:" + this.H + "\n               ");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f188596d);
        dest.writeByte(this.f188597e ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f188598f ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f188599g);
        dest.writeInt(this.f188600h);
        dest.writeInt(this.f188601i);
        dest.writeInt(this.f188602m);
        dest.writeInt(this.f188603n);
        dest.writeInt(this.f188604o);
        dest.writeInt(this.f188605p);
        dest.writeInt(this.f188606q);
        dest.writeInt(this.f188607r);
        dest.writeInt(this.f188608s);
        dest.writeInt(this.f188609t);
        dest.writeInt(this.f188610u);
        dest.writeInt(this.f188611v);
        dest.writeInt(this.f188612w);
        dest.writeInt(this.f188613x);
        dest.writeInt(this.f188614y);
        dest.writeInt(this.f188615z);
        dest.writeInt(this.A);
        dest.writeInt(this.B);
        dest.writeInt(this.C);
        dest.writeInt(this.D);
        dest.writeInt(this.E);
        dest.writeInt(this.H);
        dest.writeString(this.I);
    }

    public XEffectConfig(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f188596d = in6.readInt();
        this.f188597e = in6.readByte() != 0;
        this.f188598f = in6.readByte() != 0;
        this.f188599g = in6.readInt();
        this.f188600h = in6.readInt();
        this.f188601i = in6.readInt();
        this.f188602m = in6.readInt();
        this.f188603n = in6.readInt();
        this.f188604o = in6.readInt();
        this.f188605p = in6.readInt();
        this.f188606q = in6.readInt();
        this.f188607r = in6.readInt();
        this.f188608s = in6.readInt();
        this.f188609t = in6.readInt();
        this.f188610u = in6.readInt();
        this.f188611v = in6.readInt();
        this.f188612w = in6.readInt();
        this.f188613x = in6.readInt();
        this.f188614y = in6.readInt();
        this.f188615z = in6.readInt();
        this.A = in6.readInt();
        this.B = in6.readInt();
        this.C = in6.readInt();
        this.D = in6.readInt();
        this.E = in6.readInt();
        this.H = in6.readInt();
        this.I = in6.readString();
    }
}
