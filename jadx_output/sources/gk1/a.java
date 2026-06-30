package gk1;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof gk1.b;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        if (parcel == null) {
            return null;
        }
        gk1.b bVar = new gk1.b();
        bVar.field_appId = parcel.readString();
        bVar.field_versionType = parcel.readInt();
        bVar.field_appVersion = parcel.readInt();
        bVar.field_isDarkMode = parcel.readByte() > 0;
        bVar.field_screenshotFilePath = parcel.readString();
        return bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object o17, android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(o17, "o");
        gk1.b bVar = (gk1.b) o17;
        if (parcel == null) {
            return;
        }
        parcel.writeString(bVar.field_appId);
        parcel.writeInt(bVar.field_versionType);
        parcel.writeInt(bVar.field_appVersion);
        parcel.writeByte(bVar.field_isDarkMode ? (byte) 1 : (byte) 0);
        parcel.writeString(bVar.field_screenshotFilePath);
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return gk1.a.class.getName();
    }
}
