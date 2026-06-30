package r45;

/* loaded from: classes.dex */
public class l91 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l91() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(3, "sub_title"), com.tencent.mm.protobuf.i.s(4, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(5, "last_buffer"), com.tencent.mm.protobuf.i.i(6, "continue_flag"), com.tencent.mm.protobuf.i.i(7, "fav_status"));
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
