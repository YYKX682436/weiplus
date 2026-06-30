package p05;

/* loaded from: classes5.dex */
public final class n4 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        return new com.tencent.mm.plugin.xlabeffect.XEffectConfig(in6);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.xlabeffect.XEffectConfig[i17];
    }
}
