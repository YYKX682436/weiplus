package r45;

/* loaded from: classes10.dex */
public enum vg7 implements com.tencent.mm.protobuf.h {
    emFinderGetCommentListSortType_Latest(1),
    emFinderGetCommentListSortType_Default(0),
    emFinderGetCommentListSortType_TopLike(2),
    emFinderGetCommentListSortType_MostInteractions(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f388228d;

    vg7(int i17) {
        this.f388228d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f388228d;
    }
}
