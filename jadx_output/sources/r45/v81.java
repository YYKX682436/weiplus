package r45;

/* loaded from: classes.dex */
public class v81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public v81() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "native_drama_info", r45.qj2.class), com.tencent.mm.protobuf.i.s(3, "episode_range_list", r45.pj2.class), com.tencent.mm.protobuf.i.r(4, "current_episode_range", r45.ft4.class), com.tencent.mm.protobuf.i.r(5, "author_info", r45.nj2.class));
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
