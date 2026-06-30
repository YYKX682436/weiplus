package com.tencent.mm.plugin.magicbrush.api;

/* loaded from: classes7.dex */
public class WxaMagicPkgInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo> CREATOR = new jc3.z0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f147858d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f147859e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f147860f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f147861g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f147862h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f147863i;

    /* renamed from: m, reason: collision with root package name */
    public int f147864m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f147865n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f147866o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f147867p;

    /* renamed from: q, reason: collision with root package name */
    public long f147868q;

    /* renamed from: r, reason: collision with root package name */
    public long f147869r;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaMagicPkgInfo{pkgId='" + this.f147858d + "', url='" + this.f147859e + "', md5='" + this.f147860f + "', pkgpath='" + this.f147861g + "', unzippath='" + this.f147862h + "', originalName='" + this.f147863i + "', pkgtype='" + this.f147864m + "', patchId='" + this.f147865n + "', version='" + this.f147866o + "', wxapath='" + this.f147867p + "', updateTime=" + this.f147868q + ", lastUseTime=" + this.f147869r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f147858d);
        parcel.writeString(this.f147859e);
        parcel.writeString(this.f147860f);
        parcel.writeString(this.f147861g);
        parcel.writeString(this.f147862h);
        parcel.writeString(this.f147863i);
        parcel.writeInt(this.f147864m);
        parcel.writeString(this.f147865n);
        parcel.writeString(this.f147866o);
        parcel.writeString(this.f147867p);
        parcel.writeLong(this.f147868q);
        parcel.writeLong(this.f147869r);
    }
}
