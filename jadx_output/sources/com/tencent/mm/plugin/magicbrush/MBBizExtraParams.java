package com.tencent.mm.plugin.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBBizExtraParams;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBBizExtraParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.MBBizExtraParams> CREATOR = new com.tencent.mm.plugin.magicbrush.w4();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147816d;

    public MBBizExtraParams(java.lang.String str) {
        this.f147816d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.magicbrush.MBBizExtraParams) && kotlin.jvm.internal.o.b(this.f147816d, ((com.tencent.mm.plugin.magicbrush.MBBizExtraParams) obj).f147816d);
    }

    public int hashCode() {
        java.lang.String str = this.f147816d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "MBBizExtraParams(projectId=" + this.f147816d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f147816d);
    }
}
