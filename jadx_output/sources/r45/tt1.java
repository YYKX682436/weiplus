package r45;

/* loaded from: classes.dex */
public class tt1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public tt1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "song_list_info", r45.b32.class), com.tencent.mm.protobuf.i.n(3, "song_list_version"));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
