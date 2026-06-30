package com.tencent.mm.plugin.magicbrush.core.event;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/core/event/MagicBrushServerEvent$RequestTypeForAppBrand", "Landroid/os/Parcelable;", "mb-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MagicBrushServerEvent$RequestTypeForAppBrand implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand> CREATOR = new com.tencent.mm.plugin.magicbrush.core.event.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147893d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f147894e;

    public MagicBrushServerEvent$RequestTypeForAppBrand(java.lang.String eventName, java.lang.String data) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        this.f147893d = eventName;
        this.f147894e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand magicBrushServerEvent$RequestTypeForAppBrand = (com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand) obj;
        return kotlin.jvm.internal.o.b(this.f147893d, magicBrushServerEvent$RequestTypeForAppBrand.f147893d) && kotlin.jvm.internal.o.b(this.f147894e, magicBrushServerEvent$RequestTypeForAppBrand.f147894e);
    }

    public int hashCode() {
        return (this.f147893d.hashCode() * 31) + this.f147894e.hashCode();
    }

    public java.lang.String toString() {
        return "RequestTypeForAppBrand(eventName=" + this.f147893d + ", data=" + this.f147894e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f147893d);
        out.writeString(this.f147894e);
    }
}
