package com.tencent.mm.plugin.webview.ui.tools.media;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/media/r0", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MpVideoDataParcelable implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.media.r0 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.media.r0(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f185729d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f185730e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f185731f;

    /* renamed from: g, reason: collision with root package name */
    public int f185732g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ee f185733h;

    public MpVideoDataParcelable(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f185729d = parcel.readString();
        this.f185731f = parcel.readString();
        int readInt = parcel.readInt();
        this.f185732g = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            ot0.m1 m1Var = new ot0.m1();
            m1Var.parseFrom(bArr);
            this.f185733h = m1Var;
        }
        this.f185730e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f185729d);
        dest.writeString(this.f185731f);
        r45.ee eeVar = this.f185733h;
        byte[] byteArray = eeVar != null ? eeVar.toByteArray() : null;
        if (byteArray != null) {
            if (!(byteArray.length == 0)) {
                int length = byteArray.length;
                this.f185732g = length;
                dest.writeInt(length);
                dest.writeByteArray(byteArray);
                dest.writeString(this.f185730e);
            }
        }
        dest.writeInt(this.f185732g);
        dest.writeString(this.f185730e);
    }
}
