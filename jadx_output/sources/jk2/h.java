package jk2;

/* loaded from: classes3.dex */
public final class h implements android.os.Parcelable.Creator {
    public h(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject visitorGuideLogic$MMKVObject = new com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject();
        visitorGuideLogic$MMKVObject.f111741d = parcel.readLong();
        visitorGuideLogic$MMKVObject.f111742e = parcel.readInt();
        return visitorGuideLogic$MMKVObject;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject[i17];
    }
}
