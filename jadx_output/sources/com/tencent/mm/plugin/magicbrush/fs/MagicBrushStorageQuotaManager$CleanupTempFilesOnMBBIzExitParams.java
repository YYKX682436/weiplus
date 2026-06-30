package com.tencent.mm.plugin.magicbrush.fs;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/fs/MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams", "Landroid/os/Parcelable;", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final /* data */ class MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams> CREATOR = new com.tencent.mm.plugin.magicbrush.fs.u();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147939d;

    /* renamed from: e, reason: collision with root package name */
    public final long f147940e;

    /* renamed from: f, reason: collision with root package name */
    public final long f147941f;

    /* renamed from: g, reason: collision with root package name */
    public final long f147942g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f147943h;

    public MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams(java.lang.String bizName, long j17, long j18, long j19, java.util.HashMap storageKey2Path) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(storageKey2Path, "storageKey2Path");
        this.f147939d = bizName;
        this.f147940e = j17;
        this.f147941f = j18;
        this.f147942g = j19;
        this.f147943h = storageKey2Path;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams = (com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams) obj;
        return kotlin.jvm.internal.o.b(this.f147939d, magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams.f147939d) && this.f147940e == magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams.f147940e && this.f147941f == magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams.f147941f && this.f147942g == magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams.f147942g && kotlin.jvm.internal.o.b(this.f147943h, magicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams.f147943h);
    }

    public int hashCode() {
        return (((((((this.f147939d.hashCode() * 31) + java.lang.Long.hashCode(this.f147940e)) * 31) + java.lang.Long.hashCode(this.f147941f)) * 31) + java.lang.Long.hashCode(this.f147942g)) * 31) + this.f147943h.hashCode();
    }

    public java.lang.String toString() {
        return "CleanupTempFilesOnMBBIzExitParams(bizName=" + this.f147939d + ", minTempSize=" + this.f147940e + ", maxTempSize=" + this.f147941f + ", maxTotalTempSize=" + this.f147942g + ", storageKey2Path=" + this.f147943h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f147939d);
        out.writeLong(this.f147940e);
        out.writeLong(this.f147941f);
        out.writeLong(this.f147942g);
        java.util.HashMap hashMap = this.f147943h;
        out.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
    }
}
