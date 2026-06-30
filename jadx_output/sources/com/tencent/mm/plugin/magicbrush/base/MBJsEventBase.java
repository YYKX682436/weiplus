package com.tencent.mm.plugin.magicbrush.base;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/base/MBJsEventBase;", "Landroid/os/Parcelable;", "mb-commons_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class MBJsEventBase implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.base.MBJsEventBase> CREATOR = new lc3.e0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f147882e;

    public MBJsEventBase(java.lang.String name, java.lang.String data) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(data, "data");
        this.f147881d = name;
        this.f147882e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f147881d);
        out.writeString(this.f147882e);
    }

    public /* synthetic */ MBJsEventBase(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2);
    }
}
