package r45;

/* loaded from: classes2.dex */
public class fd1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public fd1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.r(5, "live_preload_info", r45.l42.class), com.tencent.mm.protobuf.i.r(6, "layout_info", r45.bx2.class), com.tencent.mm.protobuf.i.r(7, "jump_live_tab", r45.wc1.class), com.tencent.mm.protobuf.i.i(8, "prefech_min_interval"), com.tencent.mm.protobuf.i.a(9, "debug_message"), com.tencent.mm.protobuf.i.i(10, "refresh_interval"), com.tencent.mm.protobuf.i.c(11, "skip_feeds_report"), com.tencent.mm.protobuf.i.r(12, "style_info", r45.s92.class), com.tencent.mm.protobuf.i.r(13, "live_card_highlight_tag", r45.bn1.class), com.tencent.mm.protobuf.i.r(14, "async_load_info_config", r45.ha2.class), com.tencent.mm.protobuf.i.i(15, "live_card_auto_play_flag"));
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
