package er4;

/* loaded from: classes6.dex */
public enum b implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    CONF_NOTIFY_FROM_UNKNOWN(0),
    CONF_NOTIFY_FROM_DATA_NOTIFY(1),
    CONF_NOTIFY_FROM_NEW_SYNC(2),
    /* JADX INFO: Fake field, exist only in values array */
    CONF_NOTIFY_FROM_PUSHKIT(3),
    CONF_NOTIFY_FROM_BYPASS(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f256058d;

    b(int i17) {
        this.f256058d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256058d;
    }
}
