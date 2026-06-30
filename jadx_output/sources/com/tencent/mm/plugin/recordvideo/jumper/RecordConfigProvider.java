package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes10.dex */
public class RecordConfigProvider implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider> CREATOR = new ut3.h();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public java.util.ArrayList G;
    public final java.util.ArrayList H;
    public com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo I;

    /* renamed from: J, reason: collision with root package name */
    public long f155668J;
    public boolean K;
    public boolean L;
    public android.os.Bundle M;
    public boolean N;
    public final java.util.HashMap P;
    public final com.tencent.mm.plugin.xlabeffect.XEffectConfig Q;
    public java.lang.String R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public java.lang.String W;

    /* renamed from: d, reason: collision with root package name */
    public int f155669d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f155670e;

    /* renamed from: f, reason: collision with root package name */
    public int f155671f;

    /* renamed from: g, reason: collision with root package name */
    public final int f155672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f155673h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f155674i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Boolean f155675m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f155676n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.component.api.jumper.UICustomParam f155677o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.e1 f155678p;

    /* renamed from: q, reason: collision with root package name */
    public int f155679q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Boolean f155680r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f155681s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Boolean f155682t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f155683u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f155684v;

    /* renamed from: w, reason: collision with root package name */
    public int f155685w;

    /* renamed from: x, reason: collision with root package name */
    public int f155686x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f155687y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155688z;

    public RecordConfigProvider() {
        this.f155669d = 1;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f155670e = bool;
        this.f155671f = 1080;
        this.f155672g = 2;
        this.f155673h = 1;
        this.f155674i = bool;
        this.f155675m = bool;
        ((java.util.HashMap) new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null).f64779h).put("plugin_filter", java.lang.Boolean.TRUE);
        hp.b bVar = new hp.b();
        bVar.e(true);
        bVar.g(true);
        bVar.c(true);
        this.f155677o = bVar.f282904a;
        this.f155678p = com.tencent.mm.pluginsdk.ui.e1.DEFAULT;
        this.f155679q = 1;
        this.f155680r = bool;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.f155681s = bool2;
        this.f155682t = bool2;
        this.f155683u = bool2;
        this.f155684v = bool2;
        this.f155685w = 10000;
        this.f155686x = -1;
        this.f155687y = false;
        this.f155688z = true;
        this.f155668J = 259200000L;
        this.K = true;
        this.L = false;
        this.M = new android.os.Bundle();
        this.N = false;
        this.P = new java.util.HashMap();
        this.Q = new com.tencent.mm.plugin.xlabeffect.XEffectConfig();
        this.R = "";
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = "";
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.D = com.tencent.mm.vfs.w6.i(str, false);
        recordConfigProvider.E = com.tencent.mm.vfs.w6.i(str2, true);
        recordConfigProvider.f155687y = true;
        recordConfigProvider.f155679q = 3;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.A = com.tencent.mm.vfs.w6.i(str, false);
        recordConfigProvider.B = com.tencent.mm.vfs.w6.i(str2, true);
        recordConfigProvider.C = str3;
        if (!android.text.TextUtils.isEmpty(str3)) {
            recordConfigProvider.C = com.tencent.mm.vfs.w6.i(str3, true);
        }
        recordConfigProvider.f155687y = true;
        recordConfigProvider.f155679q = 4;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.B = com.tencent.mm.vfs.w6.i(str, true);
        recordConfigProvider.C = str2;
        if (!android.text.TextUtils.isEmpty(str2)) {
            recordConfigProvider.C = com.tencent.mm.vfs.w6.i(str2, true);
        }
        recordConfigProvider.f155687y = true;
        recordConfigProvider.f155679q = 4;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider e() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.f155681s = java.lang.Boolean.TRUE;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        recordConfigProvider.f155682t = bool;
        recordConfigProvider.f155684v = bool;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, int i17, int i18) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.f155676n = videoTransPara;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        recordConfigProvider.f155681s = bool;
        recordConfigProvider.f155683u = bool;
        recordConfigProvider.f155684v = java.lang.Boolean.FALSE;
        recordConfigProvider.f155685w = i17;
        recordConfigProvider.F = i18;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g(java.lang.String str, java.lang.String str2, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, int i17, int i18) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.f155676n = videoTransPara;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        recordConfigProvider.f155681s = bool;
        recordConfigProvider.f155683u = bool;
        recordConfigProvider.f155684v = java.lang.Boolean.FALSE;
        recordConfigProvider.f155685w = i17;
        recordConfigProvider.B = com.tencent.mm.vfs.w6.i(str, true);
        recordConfigProvider.C = str2;
        if (!android.text.TextUtils.isEmpty(str2)) {
            recordConfigProvider.C = com.tencent.mm.vfs.w6.i(str2, true);
        }
        recordConfigProvider.F = i18;
        return recordConfigProvider;
    }

    public static com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider h(int i17) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        recordConfigProvider.f155681s = bool;
        recordConfigProvider.f155683u = bool;
        recordConfigProvider.f155684v = java.lang.Boolean.FALSE;
        recordConfigProvider.F = i17;
        return recordConfigProvider;
    }

    public void a(int i17, java.lang.String str) {
        this.P.put(java.lang.Integer.valueOf(i17), str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "RecordConfigProvider{remuxType=" + this.f155669d + ", useCPUCrop=" + this.f155670e + ", resolutionLimit=" + this.f155671f + ", recordType=" + this.f155672g + ", recordLevel=" + this.f155673h + ", useCameraApi2=" + this.f155674i + ", useImageStream=" + this.f155675m + ", videoParam=" + this.f155676n + ", uiParam=" + this.f155677o + ", outputType=" + this.f155679q + ", previewForceFullScreen=" + this.f155680r + ", enablePicture=" + this.f155681s + ", enableVideo=" + this.f155682t + ", forceForegroundMix=" + this.f155683u + ", enableAlbum=" + this.f155684v + ", maxRecordTimeMs=" + this.f155685w + ", saveSourceMedia=" + this.f155687y + ", savaToSysAlbumIfMediaEdited=" + this.f155688z + ", inputVideoPath='" + this.A + "', outputVideoPath='" + this.B + "', thumbPath='" + this.C + "', inputPhotoPath='" + this.D + "', outputPhotoPath='" + this.E + "', scene=" + this.F + ", images=" + this.G + ", videos=" + this.H + ", reportInfo=" + this.I + ", expiredTimeMsIfMixInBackground=" + this.f155668J + ", supportCaptureLandscape=" + this.K + ", forcePortrait=" + this.L + ", autoAdjustFoldingScreen=" + this.N + ", router=" + this.P + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f155669d);
        parcel.writeValue(this.f155670e);
        parcel.writeInt(this.f155671f);
        parcel.writeInt(this.f155672g);
        parcel.writeInt(this.f155673h);
        parcel.writeValue(this.f155674i);
        parcel.writeValue(this.f155675m);
        parcel.writeParcelable(this.f155676n, i17);
        parcel.writeParcelable(this.f155677o, i17);
        com.tencent.mm.pluginsdk.ui.e1 e1Var = this.f155678p;
        parcel.writeInt(e1Var == null ? -1 : e1Var.ordinal());
        parcel.writeInt(this.f155679q);
        parcel.writeValue(this.f155680r);
        parcel.writeValue(this.f155681s);
        parcel.writeValue(this.f155682t);
        parcel.writeValue(this.f155683u);
        parcel.writeValue(this.f155684v);
        parcel.writeInt(this.f155685w);
        parcel.writeByte(this.f155687y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f155688z ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
        parcel.writeStringList(this.G);
        parcel.writeStringList(this.H);
        parcel.writeParcelable(this.I, i17);
        parcel.writeLong(this.f155668J);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.M);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.P);
        parcel.writeParcelable(this.Q, i17);
        parcel.writeInt(this.f155686x);
        parcel.writeString(this.R);
        parcel.writeByte(this.S ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeInt(this.U ? 1 : 0);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeString(this.W);
    }

    public RecordConfigProvider(android.os.Parcel parcel) {
        this.f155669d = 1;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f155670e = bool;
        this.f155671f = 1080;
        this.f155672g = 2;
        this.f155673h = 1;
        this.f155674i = bool;
        this.f155675m = bool;
        ((java.util.HashMap) new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null).f64779h).put("plugin_filter", java.lang.Boolean.TRUE);
        hp.b bVar = new hp.b();
        bVar.e(true);
        bVar.g(true);
        bVar.c(true);
        this.f155677o = bVar.f282904a;
        this.f155678p = com.tencent.mm.pluginsdk.ui.e1.DEFAULT;
        this.f155679q = 1;
        this.f155680r = bool;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.f155681s = bool2;
        this.f155682t = bool2;
        this.f155683u = bool2;
        this.f155684v = bool2;
        this.f155685w = 10000;
        this.f155686x = -1;
        this.f155687y = false;
        this.f155688z = true;
        this.f155668J = 259200000L;
        this.K = true;
        this.L = false;
        this.M = new android.os.Bundle();
        this.N = false;
        this.P = new java.util.HashMap();
        this.Q = new com.tencent.mm.plugin.xlabeffect.XEffectConfig();
        this.R = "";
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = "";
        this.f155669d = parcel.readInt();
        this.f155670e = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155671f = parcel.readInt();
        this.f155672g = parcel.readInt();
        this.f155673h = parcel.readInt();
        this.f155674i = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155675m = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155676n = (com.tencent.mm.modelcontrol.VideoTransPara) parcel.readParcelable(com.tencent.mm.modelcontrol.VideoTransPara.class.getClassLoader());
        this.f155677o = (com.tencent.mm.component.api.jumper.UICustomParam) parcel.readParcelable(com.tencent.mm.component.api.jumper.UICustomParam.class.getClassLoader());
        int readInt = parcel.readInt();
        this.f155678p = readInt != -1 ? com.tencent.mm.pluginsdk.ui.e1.values()[readInt] : null;
        this.f155679q = parcel.readInt();
        this.f155680r = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155681s = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155682t = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155683u = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155684v = (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader());
        this.f155685w = parcel.readInt();
        this.f155687y = parcel.readByte() != 0;
        this.f155688z = parcel.readByte() != 0;
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readInt();
        this.G = parcel.createStringArrayList();
        this.H = parcel.createStringArrayList();
        this.I = (com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo) parcel.readParcelable(com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo.class.getClassLoader());
        this.f155668J = parcel.readLong();
        this.K = parcel.readByte() != 0;
        this.L = parcel.readByte() != 0;
        this.M = parcel.readBundle();
        this.N = parcel.readByte() != 0;
        this.P = (java.util.HashMap) parcel.readSerializable();
        this.Q = (com.tencent.mm.plugin.xlabeffect.XEffectConfig) parcel.readParcelable(com.tencent.mm.plugin.xlabeffect.XEffectConfig.class.getClassLoader());
        this.f155686x = parcel.readInt();
        this.R = parcel.readString();
        this.S = parcel.readByte() != 0;
        this.T = parcel.readInt() == 1;
        this.U = parcel.readInt() == 1;
        this.V = parcel.readInt() == 1;
        this.W = parcel.readString();
    }
}
