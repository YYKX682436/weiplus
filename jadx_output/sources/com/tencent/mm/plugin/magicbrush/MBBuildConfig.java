package com.tencent.mm.plugin.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBBuildConfig;", "Llc3/e;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class MBBuildConfig<T extends lc3.e> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.MBBuildConfig<?>> CREATOR = new com.tencent.mm.plugin.magicbrush.x4();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f147817d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f147818e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f147819f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f147820g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f147821h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f147822i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f147823m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Parcelable f147824n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f147825o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f147826p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f147827q;

    /* renamed from: r, reason: collision with root package name */
    public jc3.g0 f147828r;

    /* renamed from: s, reason: collision with root package name */
    public jc3.r f147829s;

    /* renamed from: t, reason: collision with root package name */
    public jc3.p f147830t;

    /* renamed from: u, reason: collision with root package name */
    public jc3.f0 f147831u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f147832v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f147833w;

    /* renamed from: x, reason: collision with root package name */
    public lc3.e f147834x;

    public MBBuildConfig(java.util.HashSet jsapiNameSet, java.util.HashSet extSet, java.lang.String sessionId, java.lang.String process, boolean z17, boolean z18, boolean z19, android.os.Parcelable parcelable, boolean z27, java.lang.String customEnvParams) {
        kotlin.jvm.internal.o.g(jsapiNameSet, "jsapiNameSet");
        kotlin.jvm.internal.o.g(extSet, "extSet");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(process, "process");
        kotlin.jvm.internal.o.g(customEnvParams, "customEnvParams");
        this.f147817d = jsapiNameSet;
        this.f147818e = extSet;
        this.f147819f = sessionId;
        this.f147820g = process;
        this.f147821h = z17;
        this.f147822i = z18;
        this.f147823m = z19;
        this.f147824n = parcelable;
        this.f147825o = z27;
        this.f147826p = customEnvParams;
        this.f147827q = new java.util.HashMap();
        this.f147832v = true;
        this.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
    }

    public final com.tencent.mm.plugin.magicbrush.MBBuildConfig a(java.util.Collection jsapi) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        java.util.Iterator it = jsapi.iterator();
        while (it.hasNext()) {
            lc3.c0 c0Var = (lc3.c0) it.next();
            this.f147817d.add(new jz5.l(c0Var.f(), java.lang.Boolean.valueOf(c0Var.g())));
            this.f147827q.put(c0Var.f(), c0Var);
        }
        return this;
    }

    public final lc3.e b() {
        lc3.e eVar = this.f147834x;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.o.o("bizContext");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.MBBuildConfig)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = (com.tencent.mm.plugin.magicbrush.MBBuildConfig) obj;
        return kotlin.jvm.internal.o.b(this.f147817d, mBBuildConfig.f147817d) && kotlin.jvm.internal.o.b(this.f147818e, mBBuildConfig.f147818e) && kotlin.jvm.internal.o.b(this.f147819f, mBBuildConfig.f147819f) && kotlin.jvm.internal.o.b(this.f147820g, mBBuildConfig.f147820g) && this.f147821h == mBBuildConfig.f147821h && this.f147822i == mBBuildConfig.f147822i && this.f147823m == mBBuildConfig.f147823m && kotlin.jvm.internal.o.b(this.f147824n, mBBuildConfig.f147824n) && this.f147825o == mBBuildConfig.f147825o && kotlin.jvm.internal.o.b(this.f147826p, mBBuildConfig.f147826p);
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f147817d.hashCode() * 31) + this.f147818e.hashCode()) * 31) + this.f147819f.hashCode()) * 31) + this.f147820g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f147821h)) * 31) + java.lang.Boolean.hashCode(this.f147822i)) * 31) + java.lang.Boolean.hashCode(this.f147823m)) * 31;
        android.os.Parcelable parcelable = this.f147824n;
        return ((((hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f147825o)) * 31) + this.f147826p.hashCode();
    }

    public java.lang.String toString() {
        return "MBBuildConfig(jsapiNameSet=" + this.f147817d + ", extSet=" + this.f147818e + ", sessionId=" + this.f147819f + ", process=" + this.f147820g + ", enableInspector=" + this.f147821h + ", enableRenderEngine=" + this.f147822i + ", enableBindingJsContextInterface=" + this.f147823m + ", bizExtraParams=" + this.f147824n + ", enableWindowRefactor=" + this.f147825o + ", customEnvParams=" + this.f147826p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.HashSet hashSet = this.f147817d;
        out.writeInt(hashSet.size());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            out.writeSerializable((java.io.Serializable) it.next());
        }
        java.util.HashSet hashSet2 = this.f147818e;
        out.writeInt(hashSet2.size());
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            out.writeString((java.lang.String) it6.next());
        }
        out.writeString(this.f147819f);
        out.writeString(this.f147820g);
        out.writeInt(this.f147821h ? 1 : 0);
        out.writeInt(this.f147822i ? 1 : 0);
        out.writeInt(this.f147823m ? 1 : 0);
        out.writeParcelable(this.f147824n, i17);
        out.writeInt(this.f147825o ? 1 : 0);
        out.writeString(this.f147826p);
    }

    public /* synthetic */ MBBuildConfig(java.util.HashSet hashSet, java.util.HashSet hashSet2, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, android.os.Parcelable parcelable, boolean z27, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? new java.util.HashSet() : hashSet, (i17 & 2) != 0 ? new java.util.HashSet() : hashSet2, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? "" : str2, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? true : z18, (i17 & 64) != 0 ? false : z19, (i17 & 128) != 0 ? null : parcelable, (i17 & 256) == 0 ? z27 : false, (i17 & 512) == 0 ? str3 : "");
    }
}
