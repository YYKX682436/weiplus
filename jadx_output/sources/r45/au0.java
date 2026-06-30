package r45;

/* loaded from: classes2.dex */
public class au0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public au0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.u(3, "first_page_md5"), com.tencent.mm.protobuf.i.r(4, "finder_user_info", r45.p13.class), com.tencent.mm.protobuf.i.r(5, "contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(6, "feeds_count"), com.tencent.mm.protobuf.i.i(7, "continueFlag"), com.tencent.mm.protobuf.i.r(8, "verify_info", r45.nk2.class), com.tencent.mm.protobuf.i.i(9, "fans_count"), com.tencent.mm.protobuf.i.a(10, "lastBuffer"), com.tencent.mm.protobuf.i.i(11, "friend_follow_count"), com.tencent.mm.protobuf.i.w(12, "user_tags"), com.tencent.mm.protobuf.i.i(13, "original_entrance_flag"), com.tencent.mm.protobuf.i.r(14, "entrance_info", r45.r25.class), com.tencent.mm.protobuf.i.r(15, "preload_info", r45.sq2.class), com.tencent.mm.protobuf.i.s(16, "live_objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.i(17, "privateLock"), com.tencent.mm.protobuf.i.u(18, "relatedStreamWording"));
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
