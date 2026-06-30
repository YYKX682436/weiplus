package gx0;

/* loaded from: classes5.dex */
public final class w0 implements android.os.Parcelable.Creator {
    public w0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        if (r5 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig a(android.content.Intent r37) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w0.a(android.content.Intent):com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String str = readString;
        android.os.Parcelable.Creator<com.tencent.mm.maas_api.MJMediaItem> creator = com.tencent.mm.maas_api.MJMediaItem.CREATOR;
        java.util.List createTypedArrayList = parcel.createTypedArrayList(creator);
        java.util.List list = kz5.p0.f313996d;
        if (createTypedArrayList == null) {
            createTypedArrayList = list;
        }
        com.tencent.mm.maas_api.MovieComposingOption movieComposingOption = (com.tencent.mm.maas_api.MovieComposingOption) parcel.readParcelable(com.tencent.mm.maas_api.MovieComposingOption.class.getClassLoader());
        if (movieComposingOption == null) {
            movieComposingOption = new com.tencent.mm.maas_api.MovieComposingOption(false, false);
        }
        gx0.i1 i1Var = (gx0.i1) ((rz5.c) gx0.i1.f276521h).get(parcel.readInt());
        java.util.List createTypedArrayList2 = parcel.createTypedArrayList(creator);
        if (createTypedArrayList2 == null) {
            createTypedArrayList2 = list;
        }
        return new com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig(str, createTypedArrayList, movieComposingOption, i1Var, createTypedArrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig[i17];
    }
}
