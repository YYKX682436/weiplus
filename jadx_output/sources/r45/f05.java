package r45;

/* loaded from: classes.dex */
public enum f05 implements com.tencent.mm.protobuf.h {
    OPENIM_ENTERPRISE_AUTHORIZATION_STATUS_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPENIM_ENTERPRISE_AUTHORIZATION_STATUS_UNAUTHORIZED(1),
    /* JADX INFO: Fake field, exist only in values array */
    OPENIM_ENTERPRISE_AUTHORIZATION_STATUS_AUTHORIZED(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f373913d;

    f05(int i17) {
        this.f373913d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f373913d;
    }
}
