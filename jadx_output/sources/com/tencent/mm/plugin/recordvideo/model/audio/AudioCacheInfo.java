package com.tencent.mm.plugin.recordvideo.model.audio;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "Landroid/os/Parcelable;", "Lwt3/h0;", "wt3/g", "wt3/h", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AudioCacheInfo implements android.os.Parcelable, wt3.h0 {
    public r45.pg4 A;
    public java.lang.String D;
    public long E;
    public long F;
    public java.lang.Long G;
    public java.lang.Long H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f155709J;
    public boolean K;
    public boolean L;

    /* renamed from: e, reason: collision with root package name */
    public int f155711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155712f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f155713g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155715i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f155716m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155717n;

    /* renamed from: o, reason: collision with root package name */
    public int f155718o;

    /* renamed from: p, reason: collision with root package name */
    public int f155719p;

    /* renamed from: q, reason: collision with root package name */
    public int f155720q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f155722s;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f155728y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155729z;
    public static final wt3.g M = new wt3.g(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> CREATOR = new wt3.f();

    /* renamed from: d, reason: collision with root package name */
    public r45.mh4 f155710d = new r45.mh4();

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f155714h = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f155721r = true;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f155723t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f155724u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f155725v = "";

    /* renamed from: w, reason: collision with root package name */
    public int f155726w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f155727x = -1;
    public boolean B = true;
    public java.lang.String C = "";
    public int I = 0;

    public final java.lang.String a() {
        return java.lang.String.valueOf(this.f155711e);
    }

    public final long b() {
        int i17;
        if (g()) {
            java.lang.Long l17 = this.H;
            if (l17 != null) {
                return l17.longValue();
            }
            i17 = this.f155720q;
        } else {
            i17 = this.f155720q;
        }
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c() {
        /*
            r7 = this;
            boolean r0 = r7.g()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.Long r0 = r7.G
            if (r0 == 0) goto L27
            long r1 = r0.longValue()
            goto L27
        L11:
            long r3 = r7.E
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L23
            long r5 = r7.F
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L27
            r1 = r3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.c():long");
    }

    public final java.lang.String d() {
        r45.pg4 pg4Var = this.A;
        java.lang.String str = pg4Var != null ? pg4Var.f383018d : null;
        return str == null ? java.lang.String.valueOf(this.f155711e) : str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r4 = this;
            r45.pg4 r0 = r4.A
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.f383018d
            goto L8
        L7:
            r0 = 0
        L8:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            int r3 = r0.length()
            if (r3 <= 0) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = r2
        L15:
            if (r3 != r1) goto L19
            r3 = r1
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 == 0) goto L1d
            goto L3d
        L1d:
            r45.mh4 r0 = r4.f155710d
            int r0 = r0.f380508d
            if (r0 == 0) goto L28
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L3d
        L28:
            java.lang.String r0 = r4.C
            int r0 = r0.length()
            if (r0 <= 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L37
            java.lang.String r0 = r4.C
            goto L3d
        L37:
            int r0 = r4.f155711e
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.e():java.lang.String");
    }

    public final java.lang.Integer f() {
        return java.lang.Integer.valueOf(this.f155718o);
    }

    public final boolean g() {
        java.lang.Long l17 = this.G;
        if (l17 == null) {
            return false;
        }
        long longValue = l17.longValue();
        java.lang.Long l18 = this.H;
        if (l18 != null) {
            return longValue >= 0 && l18.longValue() > 0;
        }
        return false;
    }

    public final void h() {
        java.lang.String str = this.f155710d.f380516o;
        if (str == null) {
            str = "";
        }
        this.f155725v = str;
    }

    public java.lang.String toString() {
        return "AudioCacheInfo(musicId=" + this.f155711e + ", itemType=" + this.I + " musicUrl=" + this.f155712f + ", source=" + this.f155719p + ", lyricsList=" + this.f155713g + ", cachePath=" + this.f155715i + ", cached=" + this.f155716m + ", failed=" + this.f155717n + ", type=" + this.f155718o + ", songName='" + this.f155723t + "', position=" + this.f155726w + ", request_id=" + this.f155727x + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f155711e);
        parcel.writeString(this.f155712f);
        parcel.writeString(this.f155715i);
        parcel.writeByte(this.f155716m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f155717n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f155726w);
        parcel.writeLong(this.f155727x);
        parcel.writeInt(this.f155718o);
        parcel.writeString(this.f155723t);
        parcel.writeString(this.f155724u);
        parcel.writeString(this.f155725v);
        parcel.writeByteArray(this.f155710d.toByteArray());
        java.lang.Long l17 = this.G;
        java.lang.Long l18 = this.H;
        if (l17 == null || l18 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(l17.longValue());
        parcel.writeLong(l18.longValue());
    }
}
