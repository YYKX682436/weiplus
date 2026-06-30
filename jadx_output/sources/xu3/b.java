package xu3;

/* loaded from: classes5.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f457251d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f457252e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f457253f;

    public b(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        this.f457251d = finderObject;
        this.f457252e = z17;
        this.f457253f = z18;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f457251d.getId();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
