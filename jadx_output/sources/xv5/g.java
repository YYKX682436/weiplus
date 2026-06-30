package xv5;

/* loaded from: classes11.dex */
public enum g implements com.tencent.mm.protobuf.h {
    CBTStreamTextHeadingLevel_None(0),
    CBTStreamTextHeadingLevel_H1(1),
    CBTStreamTextHeadingLevel_H2(2),
    CBTStreamTextHeadingLevel_H3(3),
    CBTStreamTextHeadingLevel_H4(4),
    CBTStreamTextHeadingLevel_H5(5),
    CBTStreamTextHeadingLevel_H6(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f457480d;

    g(int i17) {
        this.f457480d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f457480d;
    }
}
