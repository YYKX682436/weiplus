package xh1;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        xh1.j jVar;
        kotlin.jvm.internal.o.g(source, "source");
        boolean z17 = source.readByte() > 0;
        xh1.i iVar = xh1.j.f454515e;
        int readInt = source.readInt();
        iVar.getClass();
        xh1.j[] values = xh1.j.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                jVar = null;
                break;
            }
            jVar = values[i17];
            if (jVar.f454519d == readInt) {
                break;
            }
            i17++;
        }
        if (jVar == null) {
            jVar = xh1.j.f454517g;
        }
        return new com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode(z17, jVar);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode[i17];
    }
}
