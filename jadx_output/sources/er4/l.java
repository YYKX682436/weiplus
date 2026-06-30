package er4;

/* loaded from: classes14.dex */
public enum l implements com.tencent.mm.protobuf.h {
    MAIN_UI_INVITING(1),
    MAIN_UI_TALKING(2),
    MAIN_UI_CALL_END(3),
    MAIN_UI_INVITED(4),
    MAIN_UI_CONNECTING(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f256120d;

    l(int i17) {
        this.f256120d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256120d;
    }
}
