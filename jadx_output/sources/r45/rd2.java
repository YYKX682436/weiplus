package r45;

/* loaded from: classes5.dex */
public class rd2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public rd2() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "new_add_song_info", r45.z22.class), com.tencent.mm.protobuf.i.n(3, "song_list_version"), com.tencent.mm.protobuf.i.r(4, "singing_song_info", r45.z22.class));
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
