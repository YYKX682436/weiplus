package cw5;

/* loaded from: classes6.dex */
public enum b implements com.tencent.mm.protobuf.h {
    BOX_TYPE_LASTED_MSG(1),
    BOX_TYPE_SERVER_ASSIGN(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f224330d;

    b(int i17) {
        this.f224330d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f224330d;
    }
}
